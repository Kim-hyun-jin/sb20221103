package com.oracle.sb20221103.khj.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.oracle.sb20221103.khj.domain.AttachFileDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UploadController {

	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		String str = sdf.format(date);
		return str.replace("-", File.separator);
	}
	
	private boolean checkImgType(File file) {
		try {
			String contentType = Files.probeContentType(file.toPath());
			return contentType.startsWith("image");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	@GetMapping("/uploadForm")
	public String uploadForm() {
		return "customerService/cusNotice/uploadForm";
	}
	
	@GetMapping("/uploadAjax")
	public String uploadAjax() {
		return "customerService/cusNotice/uploadAjax";
	}

	@PostMapping("/uploadFormAction")
	public void uploadFormPoat(MultipartFile[] uploadFile, Model model) {
		
		String uploadFolder = "C:\\upload";
		for (MultipartFile multipartFile: uploadFile) {
			log.info("================================");
			log.info("Upload File Name: "+ multipartFile.getOriginalFilename());
			log.info("Upload File Size: "+ multipartFile.getSize());
			
			File saveFile = new File(uploadFolder,multipartFile.getOriginalFilename());
			
			try {
				multipartFile.transferTo(saveFile);
			} 
			catch (Exception e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		}		
	}
	
	
	@PostMapping(value =  "/uploadAjaxAction", produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
	@ResponseBody
	public ResponseEntity<List<AttachFileDTO>> uploadAjaxAction(MultipartFile[] uploadFile) {
		
		System.out.println("uploadAjaxAction start");
		
		List<AttachFileDTO> list = new ArrayList<AttachFileDTO>();
		
		String uploadFolder = "C:\\upload";
		String uploadFolderPath = getFolder();
		
		//make folder-----------
		File uploadPath = new File(uploadFolder, getFolder());
		log.info("upload path: "+ uploadPath);
		
		if(uploadPath.exists() == false) {
			uploadPath.mkdirs();
		}
			
		
		for (MultipartFile multipartFile: uploadFile) {
			
			AttachFileDTO attachDTO = new AttachFileDTO();
			log.info("================================");
			log.info("Upload File Name: "+ multipartFile.getOriginalFilename());
			log.info("Upload File Size: "+ multipartFile.getSize());
			
			String uploadFileName = multipartFile.getOriginalFilename();
			
			attachDTO.setFileName(uploadFileName);
			
			UUID uuid = UUID.randomUUID();
			uploadFileName = uuid.toString()+ "_"+ uploadFileName;
			
			//File saveFile = new File(uploadFolder,multipartFile.getOriginalFilename());
			File saveFile = new File(uploadPath,uploadFileName);
			
			try {
				multipartFile.transferTo(saveFile);
				
				//attachDTO setting
				attachDTO.setUuid(uuid.toString());
				attachDTO.setUploadPath(uploadFolderPath);
				
				
				//check image type file && 썸네일
				if(checkImgType(saveFile)) {
					attachDTO.setImage(true);
				}
				
				
				list.add(attachDTO);
			} 
			catch (Exception e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
			
		}//end for
		
		return new ResponseEntity<List<AttachFileDTO>>(list, HttpStatus.OK);
		
	}
	
	
	@GetMapping("/display")
	@ResponseBody
	public ResponseEntity<byte[]> getFile(String fileName){
		log.info("fileName: "+ fileName);
		
		File file = new File("c:\\upload\\"+ fileName);
		
		log.info("file: "+ file);
		
		ResponseEntity<byte[]> result = null;
		
		HttpHeaders header = new HttpHeaders();
		try {
			header.add("Content-Type", Files.probeContentType(file.toPath()));
			result = new ResponseEntity<byte[]>(
					FileCopyUtils.copyToByteArray(file), header, HttpStatus.OK );
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return result;
	}
}

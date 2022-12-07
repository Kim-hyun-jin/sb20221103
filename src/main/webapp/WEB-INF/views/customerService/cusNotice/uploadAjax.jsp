<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
/* 	.uploadResult ul li img{
		width: 20px;
	} */
	.attach {
		width: 20px;
	}
	.img {
		width: 50px;
	}
</style>

</head>
<body>
<p>Upload with Ajax</p>

	<div class='uploadDiv'>
		<input type="file" name="uploadFile" enctype="multipart/form-data" multiple>
	</div>
	
	<div class="uploadResult">
		<ul>
		</ul>
	</div>
	
	<!-- <button id="uploadBtn">upload</button> -->

	<button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
		파일업로드
	</button>
	
	<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="staticBackdropLabel ">파일 업로드</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
				</div>
			<div class="modal-body">
				첨부파일을 업로드 하시겠습니까?
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-outline-warning" data-bs-dismiss="modal">닫기</button>
				<button type="submit" class="btn btn-warning" id="uploadBtn">업로드</button>
				</div>
			</div>
		</div>
	</div>
	
<script type="text/javascript">


	$(document).ready(function(){
		
	 	//파일용량체크
		var maxSize = 5242880; //5MB
		function checkSize(fileSize){
			if(fileSize >= maxSize){
				alert("파일 사이즈 초과");
				return false;
			}
		}
	
		//업로드후 보여줄 html 미리 복사
		var cloneObj = $(".uploadDiv").clone();
		//upload 결과 보여주는 부분
		var uploadResult = $(".uploadResult ul");
		
		var fileCallPath ="";
		
		function showUploadedFile(uploadResultArr){
			var str = "";
			
			$(uploadResultArr).each(function(i, obj){
				
				if(!obj.image){
					
					str += "<li><img class='attach' src='/resources/img/attachIcon.png'>"+ obj.fileName+ "</li>";
				}
				else {
					//str += "<li>"+ obj.fileName+ "</li>";
					var fileCallPath = encodeURIComponent( 
							obj.uploadPath+ "/" + obj.uuid + '_' + obj.fileName);
					
					str += "<li><img class='img' src='/display?fileName="+fileCallPath+"'><li>";				
				}
				
			});
			uploadResult.append(str);
		}
		
		
		
		$('#uploadBtn').on("click", function(e){
			
			//선택한 파일이 없을 경우
/* 			if(document.getElementsByClassName("input").length == 0){
				alert('업로드할 파일을 선택해 주세요');
			} */
			alert('파일 업로드 시작');
			
			var formData = new FormData();
			var inputFile = $("input[name='uploadFile']");
			var files = inputFile[0].files;
			console.log(files);
			
			//add File Data to formData
			for (var i = 0; i < files.length; i++){
/* 				if(!checkSize(files[i])){
					return false;
				} */
				formData.append("uploadFile", files[i]);
			}
			
			
		$.ajax({
				url: '/uploadAjaxAction',
				processData: false,
				contentType: false,
				data: formData,
				type: "POST",
					dataType: 'json',
					success: function(result){
						console.log(result);
						alert("파일 업로드 완료");
						showUploadedFile(result);
						$(".uploadDiv").html(cloneObj.html());
					}//$.ajax
			});
		
		});
		
		
		

	});
	
	



</script>
</body>
</html>
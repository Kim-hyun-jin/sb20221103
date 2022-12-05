<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body>
<p>Upload with Ajax</p>

	<div class='uploadDiv'>
		<input type="file" name="uploadFile" enctype="multipart/form-data" multiple="multiple">
	</div>
	<div class="uploadResult">
		<ul>
		</ul>
	</div>
	
	<button id="uploadBtn">upload</button>

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
		var uploadResult = $(".uploadResult ul");
		
		function showUploadedFile(uploadResultArr){
			var str = "";
			
			$(uploadResultArr).each(function(i. obj){
				str += "<li>"+ obj.fileName+ "</li>";
			});
			uploadResult.append(str);
		}
		
		
		$('#uploadBtn').on("click", function(e){
			alert('uploadBtn clicked');
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
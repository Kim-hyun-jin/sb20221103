<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="main">
	<div class="container">
		<form action="/customerService/cusNotice/write" method="post">
			
				<div class="mb-3">
				  <label for="title" class="form-label">제목</label>
				  <input type="text" class="form-control" id="title" name="title" placeholder="제목을 입력하세요">
				</div>
				<div class="mb-3">
				  <label for="content" class="form-label">내용</label>
				  <textarea class="form-control" id="content" name="content" rows="3"></textarea>
				</div>
				
				<div class="mb-3">
				  <label for="formFileMultiple" class="form-label">첨부파일</label>
				  <input class="form-control" type="file" id="formFileMultiple" multiple>
				</div>
				
				<!-- 연결만, 나중에 redirect처리 -->
				
				<button type="submit" class="btn btn-outline-secondary">완료</button>
				
			
		</form>
	</div>
</div>
	
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
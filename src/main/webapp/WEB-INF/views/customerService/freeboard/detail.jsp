<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%-- <link href="<%=context %>/common/css/bootstrap.min.css" rel="stylesheet">
<script src="<%=context %>/common/js/bootstrap.min.js" type="text/javascript"></script>
<script src="<%=context %>/common/js" type="text/javascript"></script>
<script src="https://unpkg.com/@popperjs/core@2" type="text/javascript"></script>
<!-- cdn 방식 제이쿼리 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> --%>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" 
integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" 
integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<body>

<div id="main">
	<div class="container">
		<form action="#" method="post">
			
				<div class="mb-3">
				  <label for="exampleFormControlInput1" class="form-label">제목</label>
				  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="제목을 입력하세요" readonly="readonly"
				  value="자유게시판 이용안내">
				</div>
				<div class="mb-3">
				  <label for="exampleFormControlTextarea1" class="form-label">내용</label>
				  <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" readonly="readonly"></textarea>
				</div>
				
				<div class="mb-3">
				  <label for="formFileMultiple" class="form-label">첨부파일</label>
				  <input class="form-control" type="file" id="formFileMultiple" multiple>
				</div>
				
				<a href="/customerService/cusNotice/modify">
				<button type="button" class="btn btn-outline-secondary">수정하기</button>
				</a>
				
				<a href="/customerService/cusNotice/main">
				<button type="button" class="btn btn-outline-secondary">목록으로</button>
				</a>
			
		</form>
	</div>
</div>
    
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<%@ include file="/WEB-INF/views/include/sidebar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

	#mydogList {
		margin-left: 400px;
	
	}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div id="mydogList">
	<h1>나의반려견</h1>
	<table border="1">
	<tr><th>반려견명</th><td>${dog.dogName }</td></tr>
	<tr><th>견종명</th><td>${dog.dogKind }</td></tr>
	<tr><th>성별</th><td>${dog.dogGender }</td></tr>
	<tr><th>나이</th><td>${dog.dogAge }</td></tr>
	<tr><th>몸무게</th><td>${dog.dogWeight }</td></tr>
	<tr><th>중성화여부</th><td>${dog.deSexibng }</td></tr>
	<tr><th>유치원등록일</th><td>${dog.scStartdate }~${dog.scEnddate }</td></tr>
	
	
	
	</table>

  </div>
 

<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
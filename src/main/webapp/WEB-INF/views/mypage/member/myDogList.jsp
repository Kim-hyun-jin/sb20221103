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
  <p>나의 강아지 페이지확인</p>
  <table border="1">
  	<tr><th >번호</th><th>반려견명</th></tr>
  	<c:forEach var="dog" items="${myDogList}">
  	<tr><td>${dog.dogNo}</td>
  	<td><a href="/mypage/member/myDogInfo?dog_no=${dog.dogNo}">${dog.dogName}</a></td></tr>
  	</c:forEach>
  </table>
  </div>
 





<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
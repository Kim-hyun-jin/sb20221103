<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<% String context2 = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/WEB-INF/views/include/sidebar.jsp" %>
<h1>회원 관리</h1>
	<table border="1">
		<tr><th>회원번호</th><th>이름</th><th>회원아이디</th><th>주소</th><th>이메일</th><th>회원등급</th></tr>
		<c:forEach var="member" items="${selMemberDogList}">
			<tr><td>${member.id }</td>
				<td><a href="detailMemberDog?id=${member.id}">${member.memberName }</a></td>
				<td>${member.username }</td><td>${member.memberAddress }</td>
				<td>${member.memberEmail }</td><td>${member.role }</td></tr>
		</c:forEach>
	</table>


<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
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
<h1>회원 정보</h1>
	<table border="1">
		<tr><th>이름</th><th>연락처</th><th>주소</th><th>반려견명</th><th>성별</th><th>나이</th>
			<th>견종명</th><th>회원등급</th><th>서비스만료일</th><th>메모(특이사항)</th></tr>
			<%-- <input type="hidden" value="${selMemberDogList.id}"> --%>
		<c:forEach var="memDog" items="${selMemberDogList}">
			<input type="hidden" value="${memDog.id}">
			<tr><td>${memDog.memberName }</td><td>${memDog.memberCall }</td><td>${memDog.memberAddress }</td><td>${memDog.dogName }</td>
				<td>${memDog.dogGender }</td><td>${memDog.dogAge }</td><td>${memDog.dogKind }</td>
				<td>${memDog.role }</td><td>${memDog.scEnddate }</td><td>${memDog.dogMemo }</td></tr>
		</c:forEach>
	</table>


<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
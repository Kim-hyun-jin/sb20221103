<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hotel reservation main</title>
<link href="/css/hotel/reservation.css" rel="styleSheet" type="text/css">
</head>
<body class="d-flex flex-column min-vh-100">
	<h1>호텔 예약하기</h1>
	<div id="container" class="container">
		<div id="content" class="content">
 			<form action="/hotel/reservation/info">
				<c:forEach var="room" items="${roomList }">
				 <input type="radio" name="roomType" value="${room.roomType }">${room.roomType }
				</c:forEach>
				 <input type="submit" value="다음으로">
			</form>
		</div>
	</div>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
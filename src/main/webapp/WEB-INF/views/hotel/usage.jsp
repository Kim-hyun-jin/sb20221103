<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>usage</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap"
	rel="stylesheet">
<link href="/css/hotel/hotel.css" rel="styleSheet" type="text/css">
</head>
<body class="d-flex flex-column min-vh-100">
	<ul class="nav nav-pills" style="position: fixed; top: 50px;">
		<li class="nav-item"><a class="nav-link" href="#scrollspyHeading1">이용안내</a></li>
		<li class="nav-item"><a class="nav-link" href="#scrollspyHeading2">유의사항</a></li>
		<li class="nav-item"><a class="nav-link" href="#scrollspyHeading3">뭔가</a></li>
	</ul>
	<div data-bs-spy="scroll" data-bs-target="#navbar-example2" data-bs-root-margin="0px 0px -40%" data-bs-smooth-scroll="true"	class="scrollspy-example bg-light p-3 rounded-2" tabindex="0">
		<h4 id="scrollspyHeading1"><div class="hotel_title">호텔 이용 안내</div></h4>
		<div class="hotel_use_ment">
			<div class="title">365일 연중무휴!</div>
			<div class="ment">갑작스러운 날도 언제든 OK</div>
			
			<div class="title">예약 방법</div>
			<div class="ment">어쩌구 저쩌구~</div>
			
			<div class="title">이용 조건</div>
			<div class="ment">대 / 중 / 소 구분 대 제한 몸무게 초과 반려견은 받지 않음 ~~~ + 어쩌구저쩌구~</div>
			
			<div class="title">기본 옵션</div>
			<div class="ment">1일 1산책 /</div>
			
			<div class="title">오시는 길</div>
			<div class="ment">사진? 약도느낌</div>
		</div>
		<h4 id="scrollspyHeading2"><div class="hotel_title">호텔 유의 사항</div></h4>
		<div class="hotel_use_ment">
			<div class="title">반려견 크기에 따른 주의사항</div>
			<div class="ment">안전을 위해 상황에 따라 분리 보호</div>
			
			<div class="title">이용제한</div>
			<div class="ment">무는 녀석, 입질이 있는?</div>
			
			<div class="title">뭔가어떤</div>
			<div class="ment">어쩌규ㅜ 저쩌구</div>
		</div>
		<h4 id="scrollspyHeading3"><div class="hotel_title">호텔 유의 사항</div></h4>
		<div class="hotel_use_ment">
			<div class="title">반려견 크기에 따른 주의사항</div>
			<div class="ment">안전을 위해 상황에 따라 분리 보호</div>
			
			<div class="title">이용제한</div>
			<div class="ment">무는 녀석, 입질이 있는?</div>
			
			<div class="title">뭔가어떤</div>
			<div class="ment">어쩌규ㅜ 저쩌구</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
</body>
</html>
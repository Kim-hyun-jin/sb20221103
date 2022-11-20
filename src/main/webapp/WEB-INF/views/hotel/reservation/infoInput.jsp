<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 정보 입력</title>
</head>
<body class="d-flex flex-column min-vh-100">
	<h1>예약 정보 입력</h1>

	<table border="1">
		<thead>
			<tr>
				<th>선택한 방</th>
				<th>선택한 날짜</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>방 타입 불러오기</td>
				<td>날짜 불러오기</td>
			</tr>
		</tbody>
	</table>
	<form action="">
		<input type="hidden">
		<!-- 아이디 -->
		<table>
			<tr>
				<th>보호자명</th>
				<td><input class="form-control" type="text" placeholder="Default input" aria-label="default input example"></td>
			</tr>
			<tr>
				<th>보호자 연락처</th>
				<td><input class="form-control" type="text" placeholder="Default input" aria-label="default input example"></td>
			</tr>
			<tr>
				<th>애견 명</th>
				<td><input class="form-control" type="text" placeholder="Default input" aria-label="default input example"></td>
			</tr>
			<tr>
				<th>애견 사이즈</th>
				<td>        <!-- primary 파랑 / secondary 회색 / success 초록 / danger 빨강 -->
					<input type="radio" class="btn-check" name="size" id="option1" value="" autocomplete="off">
					<label class="btn btn-outline-secondary" for="option1">대형</label>
					<input type="radio" class="btn-check" name="size" id="option2" value="" autocomplete="off">
					<label class="btn btn-outline-secondary" for="option2">중형</label>
					<input type="radio" class="btn-check" name="size" id="option3" value="" autocomplete="off">
					<label class="btn btn-outline-secondary" for="option3">소형</label></td>
			</tr>
			<tr>
				<th>중성화 여부</th>
				<td>
					<input type="radio" class="btn-check" name="gen" id="success-outlined" autocomplete="off">
					<label class="btn btn-outline-secondary" for="success-outlined">O</label>
					
					<input type="radio" class="btn-check" name="gen" id="danger-outlined" autocomplete="off">
					<label class="btn btn-outline-secondary" for="danger-outlined">X</label>
				</td>
			</tr>

		</table>
		<button type="submit" class="btn btn-outline-primary">결제하기</button>
	</form>
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
</body>
</html>
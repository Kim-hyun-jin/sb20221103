<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<div id="main">
		<div class="container">
			<form action="/" method="post">
				
					<div class="mb-3">
					  <label for="title" class="form-label">제목</label>
					  <input type="text" class="form-control" id="title" placeholder="제목을 입력하세요" readonly="readonly"
					  value="${notice.title }">
					</div>
					<div class="mb-3">
					  <label for="content" class="form-label">내용</label>
					  <textarea class="form-control" id="content" rows="3" readonly="readonly">${notice.content}</textarea>
					</div>
					
					<div class="mb-3">
					  <label for="formFileMultiple" class="form-label">첨부파일</label>
					  <input class="form-control" type="file" id="formFileMultiple" multiple>
					</div>
					
					<a href="/customerService/cusNotice/modify">
						<button type="button" class="btn btn-outline-secondary" >수정하기</button>
					</a>
					
					<a href="/customerService/cusNotice/main">
						<button type="button" class="btn btn-outline-secondary">목록으로</button>
					</a>
				
			</form>
		</div>
	</div>
</body>
</html>
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
			
				<input hidden="${freeboard.freeboardNo }" name="freeboardNo">
				
				<div class="mb-3">
				  <label for="title" class="form-label">제목</label>
				  <input type="text" class="form-control" id="title" readonly="readonly"
				  value="${freeboard.title}" name="title">
				</div>
				
				<div class="mb-3">
				  <label for="writer" class="form-label">작성자</label>
				  <input class="form-control" id="writer" rows="3" readonly="readonly" name="writer"
				  value="임시처리">
				</div>
				
				<div class="mb-3">
				  <label for="category" class="form-label">카테고리</label>
				  <input class="form-control" id="category" rows="3" readonly="readonly" name="category"
				  value="${freeboard.category }">
				</div>
				<div class="mb-3">
				  <label for="recommand" class="form-label">추천수</label>
				  <input class="form-control" id="recommand" rows="3" readonly="readonly" name="recommand"
				  value="${freeboard.recommand }">
				</div>
				<div class="mb-3">
				  <label for="viewCount" class="form-label">조회수</label>
				  <input class="form-control" id="viewCount" rows="3" readonly="readonly" name="viewCount"
				  value="${freeboard.viewCount }">
				</div>
				<div class="mb-3">
				  <label for="regdate" class="form-label">작성일</label>
				  <input class="form-control" id="regdate" rows="3" readonly="readonly" name="regdate"
				   value="${freeboard.regdate }">
				</div>
				
				
				
				<div class="mb-3">
				  <label for="content" class="form-label">내용</label>
				  <textarea class="form-control" id="content" rows="3" readonly="readonly">
				  ${freeboard.content}
				  </textarea>
				</div>
				
				
				<div class="mb-3">
				  <label for="formFileMultiple" class="form-label">첨부파일</label>
				  <input class="form-control" type="file" id="formFileMultiple" multiple>
				</div>
				
				
						<div class="card mb-2">
							<div class="card-header bg-light">
							        <i class="fa fa-comment fa"></i> REPLY
							</div>
							<div class="card-body">
								<ul class="list-group list-group-flush">
								    <li class="list-group-item">
									<div class="form-inline mb-2">
										<label for="replyId"><i class="fa fa-user-circle-o fa-2x"></i></label>
										<input type="text" class="form-control ml-2 replyer"  id="replyId" value="${authentication.principal.username }">
										
										<label for="replyPassword" class="ml-4"><i class="fa fa-unlock-alt fa-2x"></i></label>
										<input type="password" class="form-control ml-2" placeholder="Enter password" id="replyPassword">
									</div>
									<textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
									<button type="button" class="btn btn-dark mt-3" onClick="javascript:addReply();">post reply</button>
								    </li>
								</ul>
							</div>
						</div>
				
				
			 <%-- <sec:authentication property="principal" var="pinfo"/> --%>
					<sec:authorize access="isAuthenticated()">
						<%-- <c:if test="${pinfo.username eq freeboard.id }"> --%>
							<a href="/customerService/cusNotice/modify">
								<button type="button" class="btn btn-outline-secondary">수정하기</button>
							</a>
						<%-- </c:if> --%>
					</sec:authorize>
				
				
				<a href="/customerService/cusNotice/main">
					<button type="button" class="btn btn-outline-secondary">목록으로</button>
				</a>
			
		</form>
	</div>
</div>
    
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
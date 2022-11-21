<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- cdn 방식 제이쿼리 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
 integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
</head>
<body>

    <div class="container">

        <table class="table caption-top">
            <caption>공지사항</caption>
            <thead>
              <tr>
                <th scope="col">#</th>
                <th scope="col">제목</th>
                <th scope="col">작성자</th>
                <th scope="col">작성일</th>
                <th scope="col">조회수</th>
              </tr>
            </thead>
            <tbody>
            	
              <c:forEach var="list" items="${noticeList }">
	              <tr>
	                <th scope="row">${list.cusNo}</th>
	                <td><a href="/customerService/cusNotice/detail?cusNo=${list.cusNo}" class="text-decoration-none"> ${list.title} </a></td>
	                <td>${list.content}</td>
	                
	                <td>${list.regdate}</td>
	                <td>@mdo</td>
	              </tr>
              </c:forEach>
              
              
              <tr>
                <th scope="row">2</th>
                <td>Jacob</td>
                <td>Thornton</td>
                
                <td>@fat</td>
                <td>@fat</td>
              </tr>
              <tr>
                <th scope="row">3</th>
                <td>Larry</td>
                <td>the Bird</td>
                
                <td>@twitter</td>
                <td>@twitter</td>
              </tr>
            </tbody>
          </table>

          <nav aria-label="Page navigation example">
            <ul class="pagination justify-content-center">
              <li class="page-item">
                <a class="page-link" href="#" aria-label="Previous">
                  <span aria-hidden="true"><!-- &laquo; --></span>
                  <span class="sr-only">Previous</span>
                </a>
              </li>
              <li class="page-item"><a class="page-link" href="#">1</a></li>
              <li class="page-item"><a class="page-link" href="#">2</a></li>
              <li class="page-item"><a class="page-link" href="#">3</a></li>
              <li class="page-item">
                <a class="page-link" href="#" aria-label="Next">
                  <span aria-hidden="true"><!-- &raquo; --></span>
                  <span class="sr-only">Next</span>
                </a>
              </li>
            </ul>
          </nav>
          
         <!--  메인 첫 조회시 권한에 따라 보여줄지 말지 결정 -->
         <sec:authorize></sec:authorize>
          <a  href="/customerService/cusNotice/write">
          <button type="button" class="btn btn-outline-secondary justify-content-end">공지등록</button>
          </a>
          
        </div>
    
    
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
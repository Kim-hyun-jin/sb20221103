<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signin Form</title>
<!-- 드롭다운 기능을 가능하게 해주는 popper.js -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" 
integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
</head>
<body>

<div id="main">
	   <div class="container">
        <div class="text-center my-5">
            <h2>회원가입</h2>
            <p class="lead">궁금한 점이 있으신가요?</p>
            <a href="/customerService/cusNotice/QA"><button class="btn btn-warning" type="button">상담문의 바로가기</button></a>
        </div>
        <div class="row justify-content-center my-5">
            <div class="col-lg-6">
                <form action="">

                    <label for="name" class="form-label">이름:</label>
                    <input type="text" id="name" placeholder="e.g. 박종찬" class="form-control"/>
                    
                    <label for="name" class="form-label">연락처:</label>
                    <input type="text" id="name" placeholder="e.g. 010-2222-8888" class="form-control"/>

                    <label for="gender" class="form-label">Gender:</label>
                    <select name="gender" id="gender" class="form-select">
                        <option value="male">male</option>
                        <option value="female">female</option>
                    </select>


                    <label for="email" class="form-label">이메일:</label>
                    <input type="email" id="email" placeholder="my@email.com" class="form-control"/>
                    
                    <label for="subject" class="form-label">Subject:</label>
                    <select name="subject" id="subject" class="form-select">
                        <option value="title" selected>title</option>
                        <option value="content">content</option>
                        <option value="number">number</option>
                        <option value="other">other</option>
                    </select>

                    <label for="query">Write a message</label>
                    <textarea name="query" id="query" cols="30" rows="10" class="form-control" placeholder="write a msg"></textarea>

                    <div class="text-end">
                        <button type="submit" class="btn btn-primary">submit</button>
                        <button type="reset" class="btn btn-second">reset</button>
                    </div>
                </form>



                <form class="row g-3">
                    <div class="col-md-6">
                      <label for="inputEmail4" class="form-label">Email</label>
                      <input type="email" class="form-control" id="inputEmail4">
                    </div>
                    <div class="col-md-6">
                      <label for="inputPassword4" class="form-label">Password</label>
                      <input type="password" class="form-control" id="inputPassword4">
                    </div>
                    <div class="col-12">
                      <label for="inputAddress" class="form-label">Address</label>
                      <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
                    </div>
                    <div class="col-12">
                      <label for="inputAddress2" class="form-label">Address 2</label>
                      <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
                    </div>
                    <div class="col-md-6">
                      <label for="inputCity" class="form-label">City</label>
                      <input type="text" class="form-control" id="inputCity">
                    </div>
                    <div class="col-md-4">
                      <label for="inputState" class="form-label">State</label>
                      <select id="inputState" class="form-select">
                        <option selected>Choose...</option>
                        <option>...</option>
                      </select>
                    </div>
                    <div class="col-md-2">
                      <label for="inputZip" class="form-label">Zip</label>
                      <input type="text" class="form-control" id="inputZip">
                    </div>
                    <div class="col-12">
                      <div class="form-check">
                        <input class="form-check-input" type="checkbox" id="gridCheck">
                        <label class="form-check-label" for="gridCheck">
                          Check me out
                        </label>
                      </div>
                    </div>
                    <div class="col-12">
                      <button type="submit" class="btn btn-primary">Sign in</button>
                    </div>
                  </form>
            </div>
        </div>
    </div>
</div>


<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
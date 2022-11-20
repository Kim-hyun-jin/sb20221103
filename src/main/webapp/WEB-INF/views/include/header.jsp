<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<% String context = request.getContextPath(); %>
<link href="<%=context %>/common/css/bootstrap.min.css" rel="stylesheet">

<script src="<%=context %>/common/js/bootstrap.bundle.min.js" type="text/javascript"></script>
<script src="<%=context %>/common/js/jquery.js" type="text/javascript"></script>


   <!---------------------- header 부분 --------------------------------------------------------------------------------------------->
   <body class="d-flex flex-column min-vh-100">
    <header id="header">
        <nav class="navbar navbar-expand-lg navbar-light bg-light" >
          <div class="container-fluid">
            <a class="navbar-brand" href="/index">
              <img src="#" alt="logo" width="40" height="30">
              CareDog
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                
                <li class="nav-item">
                  <a class="nav-link" href="#">혹시몰라여분으로</a>
                </li>

                
                <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="/hotel/intro" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    호텔 
                  </a>
                  <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <li><a class="dropdown-item" href="/hotel/intro">시설안내</a></li>
                    <li><a class="dropdown-item" href="/hotel/usage">이용안내</a></li>
                    <!-- <li><hr class="dropdown-divider"></li> -->
                    <li><a class="dropdown-item" href="/hotel/caution">유의사항</a></li>
                    <li><a class="dropdown-item" href="/hotel/reservation/main">예약하기</a></li>
                  </ul>
                </li>

                <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    유치원 
                  </a>
                  <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <li><a class="dropdown-item" href="/school/intro">시설안내</a></li>
                    <li><a class="dropdown-item" href="/school/usage">이용안내</a></li>
                    <!-- <li><hr class="dropdown-divider"></li> -->
                    <li><a class="dropdown-item" href="/school/dogNotice/main">알림장</a></li>
                    <li><a class="dropdown-item" href="/school/BHCorrection/main">행동교정신청</a></li>
                  </ul>
                </li>
   
   
                <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    고객서비스 
                  </a>
                  <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <li><a class="dropdown-item" href="/customerService/cusNotice/main">공지사항</a></li>
                    <li><a class="dropdown-item" href="/customerService/QA/QA">Q&A</a></li>
                    <!-- <li><hr class="dropdown-divider"></li> -->
                    <li><a class="dropdown-item" href="/customerService/freeboard/main">자유게시판</a></li>
                    <li><a class="dropdown-item" href="#"></a></li>
                  </ul>
                </li>
  
  
              <!-- 선택불가처리 -->
                <!-- <li class="nav-item">
                  <a class="nav-link disabled">Disabled</a>
                </li>
              </ul> -->
              
              
              <!-- 검색창 -->
              <!-- <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
              </form> -->
              
              <!-- <button type="button" class="btn btn-outline-primary" >마이페이지</button> -->
              <button type="button" class="btn btn-outline-secondary"><a  href="/main/login">로그인</a></button>
              <button type="button" class="btn btn-outline-secondary"><a  href="/main/signup">회원가입</a></button>
             <!--  로그인 기능 구현 전이므로 관리자 페이지를 디폴트로 연결 -->
              <button type="button" class="btn btn-outline-secondary"><a href="/mypage/admin/main">마이페이지(admin)</a></button>
              
            </div>
          </div>
        </nav>
  </header>
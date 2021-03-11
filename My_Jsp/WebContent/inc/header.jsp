<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>코딩계의 톡톡튀는 아이디어 준팡준형!</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="shortcut icon" href="<%=request.getContextPath()%>/images/favicon.png" type="image/x-icon"/>
<link rel="icon" 		  href="<%=request.getContextPath()%>/images/favicon.png" type="image/x-icon"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
* {
  box-sizing: border-box;
}

body {
  margin: 0;
}

.hj_navbar {
  overflow: hidden;
  background-color: #333;
  font-family: Arial, Helvetica, sans-serif;
}

.hj_navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.hj_dropdown {
  float: left;
 /*  overflow: hidden; */
}

.hj_dropdown .dropbtn {
   position:relative;
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font: inherit;
  margin: 0;
  border:1px solid #4285f4;
}

.hj_navbar a:hover, .hj_dropdown:hover .dropbtn {
  background-color: red;
  transition:all 1s;
}

.hj_dropdown-content {
  display: none;  
  position: absolute;
  background-color: #f9f9f9;
  width: 100%; 
  z-index: 1;
  /* border-bottom: 1px solid #ddd; */
}

.hj_dropdown-content .header {
  background: red;
  padding: 16px;
  color: white;
}

.hj_dropdown:hover .hj_dropdown-content {
  display: block;
}

 .column {
  float: left;
  width: 33.33%;
  padding: 10px;
  background-color: #ccc;
  height: 250px;
}

.column a {
  float: none;
  color: black;
  padding: 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.column a:hover {
  background-color: #ddd;
}

 .row:after {
  content: "";
  display: table;
  clear: both;
}

@media screen and (max-width: 600px) {
  .column {
    width: 100%;
    height: auto;
  }
} 

 
/*					*/
/*					*/
div#header {  }
/*					*/
/*					*/
/*					*/
.logo{     color: white;  font-weight: bold; font-size: 20px; margin-top: 25px; }
.hj_navbar { overflow: hidrden; background-color:transparent; }
.hj_navbar a { float: left; font-size: 16px; color: #333; }
.hj_dropdown .dropbtn { color: #333; }
.fa-caret-down:before { content: "\f0d7"; }
.hj_navbar a:hover, .hj_dropdown:hover .dropbtn { background-color: white ; color: #333;     }
.fa-caret-down:before { content: ""; }
/*					*/
/*					*/  
.hj_dropdown-content{   width: 28%; 
    border: 1px solid #ccc;
  background-color: #f9f9f9; border-top:0 none;  }
.hj_dropdown-content .column { padding-top:10px;
    position: relative; float: none; width: 20%;   height:auto; background-color:  white;
    border-right: 1px solid #ddd; }
.hj_dropdown-content .column a { float: none; color: black;   text-decoration: none; display: block; text-align: left; }
.hj_dropdown-content .column a:hover {  text-decoration: underline; color: #333;}
.hj_dropdown-content .column h3 a{color:  #333;    color: #333;}

.hj_dropdown-content .column a {  padding:0; font-size:12px; color: #999;}
.nav>li>a:focus, .nav>li>a:hover { text-decoration: underline; background-color: transparent; }

.hj_dropdown .dropbtn {     }
.hj_dropdown-content  .container {  width:auto; }
.lnb {  padding-top:28px }
.lnb a{color:white;  font-size:12px;    }
.submenu {
    position: absolute;
    left: 130px;
    width: 298%;
    top: 13px;
    padding-left: 10px;
    border-bottom: 1px solid #ddd;
}
.hj_dropdown a {
    float: left;
    font-size: 14px;
    color: white;
    padding: 0;
    padding-top: 14px;
    padding-left: 10px;
    padding-right: 10px;
}
.hj_navbar a:hover, .hj_dropdown:hover .dropbtn {
    background-color: transparent;
    color: white;
    text-decoration: underline;
}
.hj_dropdown.total:hover .dropbtn{
	background-color:white; color:#d50527; font-weight:bold;  text-decoration:none; 
	
}

/*				*/ 
.footer{ background-color: #F5F5F5; font-size:12px;   padding-top:20px;  border-top:1px solid #ddd;  padding-bottom:20px }
.footer li{  list-style-type:none;   display:inline-block;  margin:5px; }
.footer a{  color:#666;   }
.footer i{  font-style:normal; }

/*	social */
.fa {
  padding: 20px;
  font-size: 20px;
  width: 30px;
  height: 30px;
  text-align: center;
  text-decoration: none;
  margin: 5px 2px;
  border-radius: 50%;
  border:1px solid #ddd;
    line-height: 0px;
    text-indent: -8px;
}

.fa:hover {
    opacity: 0.7;
}
footer {  padding:10 0; }

nav.navbar.lnb { margin: 0; padding: 0; }
.lnb .navbar-nav>li>a { color: #333; padding: 2px 8px; margin: 0; }


nav.navbar.search  form{  width:50%;      margin-top: 2%;
    margin-left: 5%; }

.logo a.navbar-brand{  color:#4285f4;      font-size: 42px; letter-spacing: -2px; }
  .form-group.myform { border: 1px solid #4285f4;  padding: 7px 0px;    width: 100%; width: 93%;  position: relative;}
  input#header_search { border: 0 none;  box-shadow: none;  width: 92%;   }
  button.header_form_go { border: 0 none; background-color: #4285f4;    color: white; padding: 14px; position: absolute; right: 0;   top: 0;}

.gnb {
    border-top: 1px solid #4285f4;
    border-bottom: 1px solid #4285f4;
}
.hj_dropdown.total .dropbtn , .hj_dropdown .dropbtn{color: white;
    font-weight: bold;
    font-size: 17px;
    padding: 26px;
    background: #4285f4;   position:relative;  }
.hj_dropdown.total:hover .dropbtn , .hj_dropdown:hover .dropbtn{ color:#4285f4;   font-weight:bold;   }
 	/* #4285f4;
    #a48b6d;
 	 */
 form.navbar-form.navbar-left { width: 350%; margin-top: 18px; }
 .hj_dropdown.total:hover .dropbtn {
    color:#4285f4; background-color: white;  
    font-weight: bold;}
  .mymain {
    margin-top: 5%;
  }
  .btn_my {
    padding: 10px 20px;
    background-color: #333;
    color: #f1f1f1;
    border-radius: 0;
    transition: .2s;
  }
</style> 
</head>
<body>

<div id="header" >
<nav class="navbar  lnb">
  <div class="container">
    <ul class="nav navbar-nav navbar-right">
      <!-- <li><a href="#">로그인</a></li>
      <li><a href="#">회원가입</a></li> 
      <li><a href="#">고객센터</a></li> -->
      <%
      	String id=(String)session.getAttribute("id");
      	String pass=(String)session.getAttribute("pass");
      	if(id!=null){
      %>
    	<li><a href="<%=request.getContextPath() %>/mypage.do"><%=id %></a></li>
        <li><a href="<%=request.getContextPath() %>/logout.do">logout</a></li>
      <% }else{ %>
		<li><a href="<%=request.getContextPath() %>/login_view.do">로그인</a></li>
	  <% } %>
        <li><a href="<%=request.getContextPath() %>/agree.do">회원가입</a></li>
        <li><a href="<%=request.getContextPath() %>/list.do">게시판</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">고객센터
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="<%=request.getContextPath()%>/ask_view.do">자주묻는 질문</a></li>
      		<% if(id!=null){ %>
            <li><a href="<%=request.getContextPath()%>/mail_view.do">1:1 문의하기</a></li>
            <% } %>
            <li><a href="<%=request.getContextPath()%>/company_view.do">회사소개</a></li> 
          </ul>
        </li>
    </ul>
  </div>
</nav>
 
<!-- 						 -->
<!-- 						 -->
<!-- 		 				 -->
<div class="gnb">
<div class="container">  
<div class="hj_navbar">
  <div class="hj_dropdown total">
    <button class="dropbtn"> <span class="	glyphicon glyphicon-menu-hamburger"></span>전체 </button>
    <div class="hj_dropdown-content">  
        <div class="column" id="column">
          <h3> <a href="<%=request.getContextPath()%>/submenue_view.do?menue=식품">식품</a></h3>
          <div  class="submenu">
          <a href="#" id="mysubmenu1">과일</a>
          <a href="#" id="mysubmenu2">축산</a>
          <a href="#" id="mysubmenu3">채소</a>
          </div>
        </div>
        <div class="column">
          <h3> <a href="<%=request.getContextPath()%>/submenue_view.do?menue=컴퓨터">컴퓨터</a></h3>
          <div  class="submenu">
          <a href="#" id="mysubmenu4">데스크탑</a>
          <a href="#" id="mysubmenu5">노트북</a>
          <a href="#" id="mysubmenu6">주변기기</a>
          </div>
        </div>    
        <div class="column">
          <h3> <a href="<%=request.getContextPath()%>/submenue_view.do?menue=운동">운동</a></h3>
          <div  class="submenu">
          <a href="#" id="mysubmenu7">홈트레이닝</a>
          <a href="#" id="mysubmenu8">자전거</a>
          <a href="#" id="mysubmenu9">낚시</a>
          </div>
        </div> 
    </div>
  </div><!-- menu --> <!-- menu --> <!-- menu --> 
  <div class="hj_dropdown" style="margin-right:-125px;">
       <div class="navbar-header logo">
	      <a class="navbar-brand" href="<%=request.getContextPath() %>/Main.do"  >
	      	<img src="<%=request.getContextPath()%>/images/logo.jpg" alt="logo" style="width: 55%;margin-top: -45px; padding-right: 0px;"/>
	      </a>
	    </div>
  </div>     
  <div class="hj_dropdown">
   <form class="navbar-form navbar-left" action="/action_page.php">
      <div class="form-group  myform">
        <input type="text"  title="검색어를 입력하세요"  id="header_search"   class="form-control" placeholder="oo을 입력해 보세요">
        <button type="submit"  class="header_form_go"><span class="	glyphicon glyphicon-search"></span></button>
      </div>
    </form>
  </div><!-- menu --> <!-- menu --> <!-- menu --> 
</div>

</div> <!--  end container -->
</div> <!-- end gnb -->
<!-- 						 -->
<!-- 						 -->
<!-- 						 -->
</div> 
 
 
 <!-- https://www.w3schools.com/howto/howto_css_subnav.asp -->
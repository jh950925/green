<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>
<%
String cookie = request.getHeader("Cookie");
String cid ="" , ccheck="";
if(cookie != null){
	Cookie[] cookies = request.getCookies();
	for(int i=0; i< cookies.length; i++){ 
		if(cookies[i].getName().equals("mcheck")){ ccheck = cookies[i].getValue(); }
		if(cookies[i].getName().equals("id")){ cid = cookies[i].getValue(); }
	}
}

%>
<div class="container mymain">
	<h3>FORM_LOGIN</h3>
	<div class="text-center">
		<p><img src="<%=request.getContextPath()%>/images/login.png" alt="오류"  class="myimg"/></p>
	</div>
	<form action="<%=request.getContextPath()%>/login.do" method="post" id="form">
		<fieldset>
			<legend>WELLCOME! COMPANY</legend>
			<div class="form-group">
				<label for="id">아이디</label>
				<input type="text" id="id" name="id" class="form-control" value="${(empty cookie.id)? '':cookie.id.value }"/>
			</div>
			<div class="form-group">
				<label for="pass">비밀번호</label>
				<input type="password" id="pass" name="pass" class="form-control"/>
			</div>
			<div class="form-group">
				<input type="checkbox" id="mcheck" name="mcheck" ${(empty cookie.mcheck)? '':'checked'}/>
				<label for="mcheck">아이디기억하기</label>
			</div>
			<div class="form-group text-right">
				<input type="submit" id="btn" name="btn" value="로그인" class="btn btn-danger">
			</div>
		</fieldset>
	</form>
</div>
<%@ include file="../inc/footer.jsp" %>
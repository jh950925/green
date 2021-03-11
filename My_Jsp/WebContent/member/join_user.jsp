<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- header -->
<%@ include  file="/inc/header.jsp" %>

<!-- body -->
<div class="container mymain">
	<h1>FORM BASICE -JOIN</h1>
	<h4>회원가입을 축하합니다.</h4>
	<br/>
	<table class="table table-striped">
		<caption>회원가입 완료</caption>
		<tbody>
		<c:forEach var="dto" items="${user}" varStatus="status">
			<tr>
				<th scope="row">이름</th>
				<td>${dto.name}</td>
			</tr>
			<tr>
				<th scope="row">아이디</th>
				<td>${dto.id}</td>
			</tr>
			<tr>
				<th scope="row">이메일</th>
				<td>${dto.email}</td>
			</tr>
			<tr>
				<th scope="row">가입날짜</th>
				<td>${dto.date}e</td>
			</tr>
			<tr>
				<th scope="row">전화번호</th>
				<td>${dto.phone}</td>
			</tr>
			<tr>
				<th scope="row">sns동의여부</th>
				<td>${dto.sns}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="form-group text-right">
		<a href="<%=request.getContextPath() %>/login_view.do" class="btn btn-danger">LOGIN</a>
	</div>
</div>
<!-- footer -->
<%@ include  file="/inc/footer.jsp" %>
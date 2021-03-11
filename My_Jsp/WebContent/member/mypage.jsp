<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include  file="/inc/header.jsp" %>
<!-- body -->
<div class="container mymain">
	<h1>MYPAGE</h1>
	<table class="table table-striped">
		<caption>회원정보</caption>
		<tbody>
			<tr>
				<th scope="row">아이디</th>
				<td>${user.id}</td>
			</tr>
			<tr>
				<th scope="row">이름</th>
				<td>${user.name}</td>
			</tr>
			<tr>
				<th scope="row">이메일</th>
				<td>${user.email}</td>
			</tr>
			<tr>
				<th scope="row">가입날짜</th>
				<td>${user.date}</td>
			</tr>
			<tr>
				<th scope="row">전화번호</th>
				<td>${user.phone}</td>
			</tr>
			<tr>
				<th scope="row">sns동의여부</th>
				<td>${user.sns}</td>
			</tr>
		</tbody>
	</table>
	<div class="button-group text-center">
		<a href="<%=request.getContextPath() %>/mypage_edit_view.do" class="btn btn-danger">회원정보 수정</a>
		<a href="<%=request.getContextPath() %>/mpage_pass_edit_view.do" class="btn btn-danger">비밀번호 수정</a>
		<a href="<%=request.getContextPath() %>/MDelete_view.do" class="btn btn-danger">탈퇴</a>
	</div>
</div>
<!-- footer -->
<%@ include  file="/inc/footer.jsp" %>
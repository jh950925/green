<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>

<!-- body -->
<div class="container mymain">
	<h1>MYPAGE</h1>
	<form action="<%=request.getContextPath() %>/mpage_pass_edit.do" method="get" id="form">
		<fieldset>
			<legend>회원정보수정</legend>
			<table class="table table-striped">
				<caption>비밀번호 수정</caption>
				<tbody>
					<tr>
						<th>이전 비밀번호</th>
						<td><input type="password" id="be_pass" name="be_pass" class="form-control"></td>
					</tr>
					<tr>
						<th>새 비밀번호</th>
						<td><input type="password" id="af_pass" name="af_pass" class="form-control"></td>
					</tr>
					<tr>
						<th>새 시밀번호 확인</th>
						<td><input type="password" id="af_pass_chk" name="af_pass_chk" class="form-control"></td>
					</tr>
				</tbody>
			</table>
			<div class="button-group text-center">
				<input type="reset"   onclick="history.go(-1);"  value="취소"    class="btn btn-info"  >
				<input type="submit" id="pass_up" name="pass_up" value="비밀번호 수정하러가기" class="btn btn-danger">
			</div>
		</fieldset>
	</form>
</div>
<%@ include file="/inc/footer.jsp" %>

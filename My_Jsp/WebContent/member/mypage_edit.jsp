<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include  file="/inc/header.jsp" %>
<!-- body -->
<div class="container mymain">
	<h1>MYPAGE</h1>
	<form action="<%=request.getContextPath() %>/mpage_edit.do" method="get" id="form">
		<fieldset>
			<legend>회원정보 수정</legend>
			<table class="table table-striped">
				<caption>당신의 소중한 정보를 수정해주세요!</caption>
				<tbody>
					<tr>
						<th scope="row">user</th>
						<td>${user.id}</td>
					</tr>
					<tr>
						<th scope="row">이름</th>
						<td><input type="text" id="af_mname" name="af_mname" class="form-control" value="${user.name}"></td>
					</tr>
					<tr>
						<th scope="row">이메일</th>
						<td><input type="text" id="af_memail" name="af_memail" class="form-control" value="${user.email}"></td>
					</tr>
					<tr>
						<th scope="row">전화번호</th>
						<td>
							<select id="af_mphone01" name="af_mphone01" class="form-group"> 
								<option value="default">선택</option>
								<option value="010" <c:if test="${phone01 == 010}">selected</c:if>>010</option>
								<option value="011" <c:if test="${phone01 == 011}">selected</c:if>>011</option>
								<option value="019" <c:if test="${phone01 == 019}">selected</c:if>>019</option>
							</select> - 
						<input type="text" id="af_mphone02" name="af_mphone02" value="${phone02}"> - 
						<input type="text" id="af_mphone03" name="af_mphone03" value="${phone03}">
						</td>
					</tr>  
					<tr>
						<th scope="row">sns동의여부</th>
						<td>
						<c:choose>
							<c:when test="${sns eq yes}">
							<input type="radio" id="yes" name="af_msns" value="yes" checked="checked"/>
							<label for="yes">수신동의</label>
							<input type="radio" id="no"  name="af_msns" value="no" />
							<label for="no">수신거부</label>
							</c:when>
							<c:otherwise>
							<input type="radio" id="yes" name="af_msns" value="yes"/>
							<label for="yes">수신동의</label>
							<input type="radio" id="no"  name="af_msns" value="no" checked="checked"/>
							<label for="no">수신거부</label>
							</c:otherwise>
						</c:choose>
						</td>
					</tr>
					<tr>
						<th scope="row">가입날짜</th>
						<td>${user.date}</td>
					</tr>
				</tbody>
			</table>
			<div class="button-group text-center">
				<input type="reset"   onclick="history.go(-1);"  value="취소"    class="btn btn-info"  >
				<input type="submit" id="user_up" name="user_up" value="회원정보수정" class="btn btn-danger">
			</div>
		</fieldset>
	</form>
	 
</div>
<%@ include  file="/inc/footer.jsp" %>
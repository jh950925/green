<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/inc/header.jsp" %>
<!-- body -->
<div class="container mymain">
	<h3 class="panel-heading" style="color: darkgray">JOIN-약관동의</h3>
	<p>(*)은 필수 입력사항입니다.</p>
	<form action="<%=request.getContextPath() %>/join.do" method="post" id="form">
		<!-- 다음페이지는 join.jsp라서 -->
		<fieldset class="form-group">
			<legend>COMPANY 서비스 약관동의</legend>
			<p class="text-right">
				<input type="checkbox" id="agree1" name="agree1"
					title="서비스 약관동의 체크박스입니다." />
			</p>
			<textarea rows="10" class="form-control" title="서비스 약관내용입니다." readonly>
				<%@include file="../inc/agree1.txt"%>
			</textarea>
		</fieldset>

		<fieldset class="form-group">
			<legend>COMPANY 개인정보 수집 및 이용동의</legend>
			<p class="text-right">
				<input type="checkbox" id="agree2" name="agree2" title="개인정보 수집 및 이용동의 체크박스입니다." />
			</p>
			<textarea rows="10" class="form-control" title="개인정보 수집 및 이용동의 내용입니다." readonly>
				<%@include file="../inc/agree2.txt"%>
			</textarea>
		</fieldset>
		<fieldset class="form--group">
			<p class="text-right">
				전체 동의<input type="checkbox" id="AllAgree" name="AllAgree" title="모두동의하기"/>
			</p>
		</fieldset>
		<fieldset class="form-group text-center">
			<legend class="myhidden">동의 버튼</legend>
			<input type="submit" id="btn" value="동의하기" class="form-control btn btn-danger" title="동의하기 버튼입니다." />
		</fieldset>
	</form>
</div>
<script>
	$(document).ready(function() {
		$("#form").submit(function() {
			if ($("#agree1").is(":checked") == false) {
				alert("약관1에 동의 하셔야 합니다.");
				return false;
			}
			if ($("#agree2").is(":checked") == false) {
				alert("약관2에 동의 하셔야 합니다.");
				return false;
			}
			if ($("#AllAgree").is(":checked")==true){
				//??
			}
		});
	});
</script>
<%@include file="/inc/footer.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>

<div class="container"  style="margin-top:5%; min-height:500px">
		<h3>MEMBER 삭제</h3>
		<form action="<%=request.getContextPath() %>/MDelete.do" method="post"   id="deleteForm"> 
			<div class="form-group">
			  <label for="bpass"  >비밀번호</label>
			  <input type="password"   name="bpass"   id="bpass"   class="form-control" > 
			  <span>(*) 삭제시 필수입니다. </span>
			</div>
			<div class="form-group">
				<input type="submit" value=" 확 인 "   class="btn btn-danger" />
				<input type="reset"   onclick="history.go(-1);"  value="취소"    class="btn btn-info"  >  
			</div>	
		</form>
</div>
<script>
	jQuery(document).ready(function(){
		jQuery("#deleteForm").submit(function(){
			if(jQuery("#bpass").val()==""){
				alert("비밀번호을 입력해주세요");
				jQuery("#bpass").focus();
				return false;
			}
		});
	});
</script>
<%@ include file="/inc/footer.jsp" %>
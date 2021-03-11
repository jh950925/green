<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>

<div class="container"  style="margin-top:5%; min-height:500px">
		<h3>MULTIBOARD 답변달기</h3>
		<form action="<%=request.getContextPath() %>/reply.do" method="post" id="form">
			<fieldset>
				<legend>REPLY</legend>
				<input type="hidden" value="${dto.bgroup}" name="bgroup"/>
				<input type="hidden" value="${dto.bstep}" name="bstep"/>
				<input type="hidden" value="${dto.bindent}" name="bindent"/>
				<div class="form-group">
				  <label for="bname"  >이름</label>
				  <input type="text"   name="bname"   id="bname"   class="form-control"   value=""> 
				</div>			
				<div class="form-group">
				  <label for="bpass"  >비밀번호</label>
				  <input type="password"   name="bpass"   id="bpass"   class="form-control" > 
				  <span>(*) 수정, 삭제시 필수</span>
				</div>																
				<div class="form-group">
				  <label for="btitle"  >제목</label>
				  <input type="text"   name="btitle"   id="btitle"   class="form-control"  value="${dto.btitle}"> 
				</div>	
				<div class="form-group">
				  <label for="bcontent"  >내용</label>
				  <textarea name="bcontent"  id="bcontent"  cols="60"  rows="10"   class="form-control" >${dto.bcontent}</textarea>
				</div>	
				<div class="form-group  text-right">
					<input type="submit"   value="입력"   class="btn btn-danger" >  
					<input type="reset"    value="취소"  class="btn btn-default" >  
					<a href="<%=request.getContextPath()%>/list.do"   class="btn btn-default" >목록보기</a>
				</div>
			</fieldset>
		</form>
</div>

<%@ include file="/inc/footer.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include  file="/inc/header.jsp" %>
<!--  END HEADER -->
<!--  END HEADER -->
<!--  END HEADER -->
<%@page import="java.sql.*"%>

<div class="container"  style="margin-top:5%; min-height:500px"   >
	<h3>MULTIBOARD - 글수정 </h3>
		<form action="<%=request.getContextPath()%>/edit.do?bno=${dto.bno}" method="post"  id="editForm" enctype="multipart/form-data">
		   <fieldset>
		   <legend>	UPDATE</legend>
			<div class="form-group">
			  <label for="bname"  >이름</label>
			  <input type="text"   name="bname"   id="bname"   class="form-control"   value="${dto.bname}"  readonly> 
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
			<div class="form-group">
			  <label for="file_up"></label>
			  <input type="text"   name="file_up"   id="file_up" readonly class="form-control"  value="${dto.img}"> 
			</div>	
			<div class="form-group">
				<label for="img">파일업로드</label>
				<input type="file" name="img" id="img" class="form-control" />
			</div>		
			<div class="form-group  text-right">
				<input type="submit"   value="입력"   class="btn btn-danger"  >  
				<input type="reset"    value="취소"  class="btn btn-default"    >  
				<a href="<%=request.getContextPath()%>/list.do"   class="btn btn-default"   >목록보기</a>
			</div>
		 </fieldset>		
		</form> <!-- end form -->	
</div>

<!-- END FOOTER -->
<!-- END FOOTER -->
<!-- END FOOTER -->
<!-- END FOOTER -->
<%@ include  file="/inc/footer.jsp" %>
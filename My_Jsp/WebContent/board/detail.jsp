<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
<%@page import="java.sql.*"%>

<div class="container"  style="margin-top:5%; min-height:500px">

	<h3>MULTIBOARD 상세보기</h3> 					
	<div class="panel" >
		<div  class="panel-body"> 
	  		<span class="glyphicon glyphicon-plus">  조회수</span>
	  		<p>${dto.bhit }</p>
		</div>	
	</div>	
	<div class="panel"  >
		<div  class="panel-body">
	  		<span class="glyphicon glyphicon-plus">  이름</span> 
			<p>${dto.bname }</p>
		</div>
	</div>				
	<div class="panel"  >
	  <div  class="panel-body">
	  	<span class="glyphicon glyphicon-plus">  제목</span> 
	     <p>${dto.btitle }</p>
	  </div>	
	</div>
	<div class="panel"  >
	  <div  class="panel-body">
	  	<span class="glyphicon glyphicon-plus">  내용</span>
	  	<textarea  class="form-control"  readonly>${dto.bcontent }</textarea>
	  </div> 
	</div>	
	<div class="panel"  >
	  <div class="panel-body">
	  	<span class="glyphicon glyphicon-plus">  이미지</span>
	    <%-- <p><img src="${pageContext.request.contextPath}/upload/${dto.img}" alt="${dto.img}"/></p> --%>
	    <p><img src="../upload/${dto.img}" alt="${dto.img}"/></p>
	  </div>	
	</div>
	<div class="text-right"    >
		 <a href="<%=request.getContextPath() %>/edit_view.do?bno=${dto.bno}"  class="btn btn-danger" >수정</a> 
		 <a href="<%=request.getContextPath() %>/delete_view.do?bno=${dto.bno}"  class="btn btn-danger" >삭제</a>    
		 <a href="<%=request.getContextPath() %>/reply_view.do?bno=${dto.bno}"  class="btn btn-danger" >답변달기</a> 
		 <a href="<%=request.getContextPath() %>/list.do"  class="btn btn-info" >목록보기</a> 
	</div>						 
</div>	
<%@ include file="/inc/footer.jsp" %>

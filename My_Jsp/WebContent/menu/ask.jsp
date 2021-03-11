<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
<!-- header -->

<div class="container panel default">
	<h3 class="panel-heading">ask</h3>
	
	<ul class="nav nav-tabs">
		  <c:forEach var="i" items="${list}" varStatus="status">
			  <li <c:if test="${status.first}"> class="active" </c:if>>
			  <a data-toggle="tab" href="#name${i.no}">${i.category}</a></li> 	
		  </c:forEach>
		</ul>
		
		<div class="tab-content">
			<c:forEach var="i" items="${list}" varStatus="status">
			 <div id="name${i.no}" class="tab-pane fade <c:if test="${status.first}">in active</c:if>"> 
			 	<!--  -->
			 	<!--  -->
				<div class="panel-group" id="accordion">
			 	<c:forEach var="ask" items="${ask}" varStatus="status">
				    <div class="panel panel-default">
				      <div class="panel-heading">
				        <h4 class="panel-title">
				          <a data-toggle="collapse" data-parent="#accordion" href="#collapse${ask.no}">${ask.title}</a>
				        </h4>
				      </div>
				      <div id="collapse${ask.no}" class="panel-collapse collapse <c:if test="${status.first}">in</c:if>">
				        <div class="panel-body">${ask.content}</div>
				      </div>
				    </div>
				 </c:forEach>
				 </div> 
				<!--  -->
			 	<!--  -->
			  </div>
			</c:forEach>
		</div>
</div>

<!-- footer -->
<%@ include file="/inc/footer.jsp" %>
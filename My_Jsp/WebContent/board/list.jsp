<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include  file="/inc/header.jsp" %>
<!--  END HEADER -->
<!--  END HEADER -->
<script>


</script>
<div class="container"   style="margin-top:5%; min-height:500px">
	<h3>MULTIBOARD</h3>
	<table  class="table table-striped">
		<caption>MULTIBOARD - MVC1</caption>
		<thead>
			<tr>
				<th scope="col">NO</th>
				<th scope="col">TITLE</th>
				<th scope="col">WRITER</th>
				<th scope="col">DATE</th>
				<th scope="col">HIT</th>
			</tr>
		</thead>
		<tbody>
			<c:set var="total" value="${pageTotal}"/>
			<c:forEach var="dto" items="${paginglist}" varStatus="status">
	 			<tr>
	 				<td>${total- (current-1)*onepagelimit - status.index}</td><!-- pageTotal-status.index-pstartno -->
	 				<td><a href="<%=request.getContextPath() %>/detail.do?bno=${dto.bno}">${dto.btitle}</a></td>
	 				<td>${dto.bname}</td>
	 				<td>${dto.bdate}</td>
	 				<td>${dto.bhit}</td>
	 			</tr>
	 		</c:forEach>
		</tbody>
		<tfoot class="center">
				<tr>
					<td colspan="5" class="text-center">
						<ul class="pagination">
						 <c:if test="${start>=bottomlist}">
						  <li><a href="${pageContext.request.contextPath}/list.do?pstartno=${(start-2)*onepagelimit}">이전</a></li>
						 </c:if>
						  <c:forEach var="i" begin="${start}" end="${end}"> 
							  	<c:choose>
									<c:when test="${i eq current}">
										<li class="active">
									  	<a href="${pageContext.request.contextPath}/list.do?pstartno=${(i-1)*onepagelimit}">${i}</a>
									  	</li> 
									</c:when>
									<c:otherwise>
										<li>
									  	<a href="${pageContext.request.contextPath}/list.do?pstartno=${(i-1)*onepagelimit}">${i}</a>
									  	</li> 
									</c:otherwise>
								</c:choose>
						  </c:forEach>
						  <c:if test="${pageAll>end}">
						  <li><a href="${pageContext.request.contextPath}/list.do?pstartno=${(end)*onepagelimit}">다음</a></li>
						 </c:if>
						</ul>
					</td>
				</tr>				
			</tfoot>
	</table>
	<p  class="text-right"><a href="<%=request.getContextPath() %>/write_view.do"   class="btn btn-danger">글쓰기</a></p>
	<div class="form-group serch" align="center">
		<input type="text" name="keyword" id="keyword"  size="40" value="" placeholder="제목을 입력하세요."/>
		<input type="button" id="search" name="search" class="btn btn-primary" value="검색" style="margin-left:10px">
		<script>
		$(function(){
			$("#search").click(function(){
				
				var keyword = $("#keyword").val();
				console.log("..............1 : " + keyword);
				$.ajax({
					url:"${pageContext.request.contextPath}/BSearch.do",
					type:"get",
					data:{"keyword":keyword},
					dataType:"text",
					success:function(data){
						console.log("..............2 : " + data);
						console.log("...... 3 : " + data);
						/*
						for(var i=0; i<data.length; i++){
							var bno = data[i].bno;
							 
							var btitle = data[i].btitle;
							var bname = data[i].bname; 
							var bdate = data[i].bdate; 
							var bhit = data[i].bhit; 
							 
						}*/
					},
					error:function(xhr, textStatus, errorThrown){
						$(".result").html(textStatus+"(HTTP-" + xhr.status + "/" + errorThrown); 
					}
				});
			});
		});
		</script>
	</div>
	<div class="form-group result">
		<table class="table table-striped">
			<tbody>
			</tbody>
		</table>
	</div>
</div>

<!-- END FOOTER -->
<!-- END FOOTER -->
<%@ include  file="/inc/footer.jsp" %>
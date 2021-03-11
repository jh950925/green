<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
<!-- header -->

<div class="mypage mymain">
	<div class="mymain">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
	    <!-- Indicators -->
	    <ol class="carousel-indicators">
	     <c:forEach var="i" items="${img}" varStatus="status">
	      <li data-target="#myCarousel" data-slide-to="${status.index}" class="<c:if test="${status.first}">active</c:if>"></li>
	     </c:forEach>
	    </ol>
	    <!-- Wrapper for slides -->
	    <div class="carousel-inner text-center">
	    <c:forEach var="i" items="${img}" varStatus="status">
	      <div class="item <c:if test="${status.first}">active</c:if>">
	      	<div class="col-sm-3" style="width:100%; height:400px;" >
				<img alt="${i.img}" src="<%=request.getContextPath()%>/images/${i.img}" />
	      	</div>
	      </div>
        </c:forEach>
	    </div>
		    <!-- Left and right controls -->
		    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
		      <span class="glyphicon glyphicon-chevron-left"></span>
		      <span class="sr-only">Previous</span>
		    </a>
		    <a class="right carousel-control" href="#myCarousel" data-slide="next">
		      <span class="glyphicon glyphicon-chevron-right"></span>
		      <span class="sr-only">Next</span>
		    </a>
	 	 </div>
	</div> 
	<!-- 	main 사진		 -->
	<!--	main 사진		 -->
	<!-- 	main 사진		 -->
	<!-- 	main 사진		 -->
	<!--	main 사진		 -->
	<!-- 	main 사진		 -->
	<div class="container panel panel-default mymain">
		<h3>오늘의 상품</h3>
		<div class="row">
			<div class="col-sm-4 container panel panel-default">
				<p>상품1</p>
				<img alt="이미지1" src="<%=request.getContextPath() %>/images/main01_1.jpg" style="height: 100%; width: 100%">
			</div>
			<div class="col-sm-4 container panel panel-default">
				<p>상품2</p>
				<img alt="이미지1" src="<%=request.getContextPath() %>/images/main01_1.jpg" style="height: 100%; width: 100%">
			</div>
			<div class="col-sm-4 container panel panel-default">
				<p>상품3</p>
				<img alt="이미지1" src="<%=request.getContextPath() %>/images/main01_1.jpg" style="height: 100%; width: 100%">
			</div>
		</div>
		<div class="row">
			<div class="col-sm-4 container panel panel-default">
				<p>상품5</p>
				<img alt="이미지1" src="<%=request.getContextPath() %>/images/main01_1.jpg" style="height: 100%; width: 100%">
			</div>
			<div class="col-sm-4 container panel panel-default">
				<p>상품6</p>
				<img alt="이미지1" src="<%=request.getContextPath() %>/images/main01_1.jpg" style="height: 100%; width: 100%">
			</div>
			<div class="col-sm-4 container panel panel-default">
				<p>상품7</p>
				<img alt="이미지1" src="<%=request.getContextPath() %>/images/main01_1.jpg" style="height: 100%; width: 100%">
			</div>
		</div>
		<div class="row">
			<div class="col-sm-4 container panel panel-default">
				<p>상품5</p>
				<img alt="이미지1" src="<%=request.getContextPath() %>/images/main01_1.jpg" style="height: 100%; width: 100%">
			</div>
			<div class="col-sm-4 container panel panel-default">
				<p>상품6</p>
				<img alt="이미지1" src="<%=request.getContextPath() %>/images/main01_1.jpg" style="height: 100%; width: 100%">
			</div>
			<div class="col-sm-4 container panel panel-default">
				<p>상품7</p>
				<img alt="이미지1" src="<%=request.getContextPath() %>/images/main01_1.jpg" style="height: 100%; width: 100%">
			</div>
		</div>
	</div>
	<div id="notice" class="container panel panel-info subpopup" style=" position: fixed; top: 30%; left: 10%; width: 20%; color: #333;">
		<h3 class="text-center">공지사항</h3>
		<p><img src="<%=request.getContextPath() %>/images/QRCodeImg.jpg" alt="" style="width:100%"/></p>
		<p>본 사이트는 상업적 목적이 아닌 <strong>개인포트폴리오</strong>용도로 제작되었으며,
		홈페이지의 일부 내용과 기타 이미지등은 그 출처가 따로 있음을 밝힙니다.</p>
		<p>
			<input type="checkbox" id="subpop" name="subpop"/>
			<label for="subpop">오늘 하루동안 이창 열지 않음</label>
			<input type="button" class="btn btn-danger" id="close" value="close"/>
		</p>
	</div>
</div>
<script src="${pageContext.request.contextPath}/inc/mycookie.js"></script>
<script>
	$(function(){
		//1. 쿠키설정 확인
		if(getCookie("subpop") == "subpop"){ $("#notice").hide(); }
		else{ $("#notice").show(); }
		/////////////////////////////////////
		$("#close").click(function(){
			if($("#subpop:checked").length == 1){ setCookie("subpop", "subpop", 1); }
			// 체크박스가 체크가 되어있다면 쿠키설정
			$("#notice").fadeOut(); //화면에서 서서히 사라지기
		});
	});
</script>
<!-- footer -->
<%@ include file="/inc/footer.jsp" %>
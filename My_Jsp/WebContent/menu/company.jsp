<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
<!-- header -->

<div class="container panel mymain">
	<h3>회사위치</h3>
	<div id="map" style="width:100%;height:400px;">
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=bb082cfc440200ed8f7a1fcb5c669890"></script>
		<!-- bb082cfc440200ed8f7a1fcb5c669890 -->
	<script>
	$(function(){
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(37.49795096653405, 127.02768345431026),
			level: 3
		};
		var map = new kakao.maps.Map(container, options);
		
		
		var markerPosition  = new kakao.maps.LatLng(37.49795096653405, 127.02768345431026); 

		// 마커를 생성합니다
		var marker = new kakao.maps.Marker({
		    position: markerPosition
		});

		// 마커가 지도 위에 표시되도록 설정합니다
		marker.setMap(map);
	});
	</script>
	<div id="map" style="width:500px;height:400px;"></div>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=bb082cfc440200ed8f7a1fcb5c669890"></script>
	<!-- bb082cfc440200ed8f7a1fcb5c669890 -->
	<!-- 4a1b0b79a622be95d874afd333ace9bb -->
	<script>
	$(function(){
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(37.49795096653405, 127.02768345431026),
			level: 3
		};
		var map = new kakao.maps.Map(container, options);
		
		
		var markerPosition  = new kakao.maps.LatLng(37.49795096653405, 127.02768345431026); 

		// 마커를 생성합니다
		var marker = new kakao.maps.Marker({
		    position: markerPosition
		});

		// 마커가 지도 위에 표시되도록 설정합니다
		marker.setMap(map);
	});
	</script>
	</div>
</div>

<!-- footer -->
<%@ include file="/inc/footer.jsp" %>
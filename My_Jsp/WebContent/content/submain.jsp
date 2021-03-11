<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
<!-- header -->

<%
	String menue = request.getParameter("menue");
%>
<script>
	$(function(){
		console.log($("#menue").val());
		//console.log($("#menue1").prev().html());
		//console.log( $("#menue").val() == $("#menue1").prev().html() );
		if($("#menue").val() == $("#menue1").prev().html()){
			$("#menue1").prop("checked" , true);
		}else if ($("#menue").val() == $("#menue2").prev().html()){
			$("#menue2").prop("checked" , true);
		}else if ($("#menue").val() == $("#menue3").prev().html()){
			$("#menue3").prop("checked" , true);
		}
		$("input:radio[name=menue]").click(function(){
			
			$.ajax({
				url:"${pageContext.request.contextPath}/submenue.do",
				type:"get",
				data:{"keyword":$("input:radio[name=menue]:checked").val()},
				dataType:"text",
				success:function(data){
					console.log(data);
					for(var i=0; i<list.length; i++){
						var title2		= list[i].title;
						var sub_menue2 	= list[i].sub_menue;
						var product2 	= list[i].product;
						var product_img2 = list[i].product_img;
						var tr = $("<tr>");
						var td1 = $("<td>").html(product2);
						var td2 = $("<td>").html(product_img2);
						tr.append(td1).append(td2);
						$(".list tbody").append(tr);
					}//end for
				},
				error:function(xhr, textStatus, errorThrown){
					$(".result").html(textStatus+"(HTTP-" + xhr.status + "/" + errorThrown); 
				}
			});
		});
		
		var list = ${list};
		//console.log(list);
		//console.log(list[1].title);
		
		for(var i=0; i<list.length; i++){
			var title		= list[i].title;
			var sub_menue 	= list[i].sub_menue;
			var product 	= list[i].product;
			var product_img = list[i].product_img;
			
			var tr = $("<tr>");
			var td1 = $("<td>").html(product);
			var td2 = $("<td>").html(product_img);
			tr.append(td1).append(td2);
			$(".list tbody").append(tr);
		}//end for
	});
</script>
<div class="container mymain">
	<div class="row">
		<div class="col-sm-1 container panel panel-default">
			<input type="hidden" id="menue"  value="<%=menue%>"/>
			<div class="form-group">
				<label for="menue1">식품</label>
				<input type="radio" id="menue1" name="menue" value="식품"/>
			</div>
			<div class="form-group">
				<label for="menue2">컴퓨터</label>
				<input type="radio" id="menue2" name="menue" value="컴퓨터"/>
			</div>
			<div class="form-group">
				<label for="menue3">운동</label>
				<input type="radio" id="menue3" name="menue" value="운동"/>
			</div>
		</div>
		<!-- 사진 -->
		<!-- 사진 -->
		<!-- 사진 -->
		<div class="col-sm-11" id="submenue_img">
			<div class=" panel panel-default list">
				<table class="table">
					<tbody>
					</tbody>
				</table>
			</div>
		</div>
		<!-- 사진 -->
		<!-- 사진 -->
		<!-- 사진 -->
	</div>
</div>
<!-- footer -->
<%@ include file="/inc/footer.jsp" %>
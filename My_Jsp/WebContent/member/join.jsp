<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>

<div class="container mymain">
   <h3>로그인</h3>
   <p> (*)은 필수 입력사항입니다. </p>
   <form action="<%=request.getContextPath() %>/joinAction.do" method="post" id="form">
   	<fieldset>
   		<legend>필수입력정보</legend>
   		<div class="form-group">
   			<label for="id">(*) 아이디</label>
   			<input type="text" id="id" name="id" placeholder="아이디를 입력해주세요" class="form-control"/>
   		</div>
   		<div class="form-group">
          <input type="button" id="checkId" value="ID중복확인" title="아이디 중복 확인 버튼입니다." class="btn btn-danger" />
           <script>
			$(function(){
				$("#checkId").click(function(){
					var id = $("#id").val();
					if(id==""){
						$("#id").focus();
						alert('id를 입력해주세요');
						return false;
					}else{
						$.ajax({
							url:"${pageContext.request.contextPath}/id_chk.do",
							type:"get",
							data:{"id":id}, 
							dataType:"text",
							success:function(data){
								$(".id").html(data);
								alert(data);
							},
							error:function(xhr, textStatus,errorThrown){
								$(".id").html(textStatus + "(HTTP-" + xhr.status + "/" + errorThrown);
							}
						});
					}//end else
				});//end click
			});//end function
		</script>
     	</div>
     	<div class="form-group">
     		<label for="pass">(*) 비밀번호</label>
     		<input type="password" id="pass" name="pass" placeholder="비밀번호를 입력해주세요" class="form-control"/>
     	</div>
     	<div class="form-group">
     		<label for="pass_chk">(*) 비밀번호 확인</label>
     		<input type="password" id="pass_chk" name="pass_chk" placeholder="비밀번호를 입력해주세요" class="form-control"/>
     	</div>
     	<div class="form-group">
     		<label for="name">(*) 이름</label>
     		<input type="text" id="name" name="name" placeholder="이름을 입력해주세요" class="form-control"/>
     	</div>
     	<div class="form-group">
         <label for="mphone01">(*) 휴대전화</label>
			<select id="mphone01" name="mphone01" class="form-group"> 
				<option value="default">선택</option>
				<option value="010">010</option>
				<option value="011">011</option>
				<option value="019">019</option>
			</select>
		 <label for="mphone02">-</label>
		 <input type="text" id="mphone02" name="mphone02">
		 <label for="mphone03">-</label>
		 <input type="text" id="mphone03" name="mphone03">
      </div>
      <div class="form-group">
         <label for="email">(*) 이메일</label>
         <input type="email" id="email" name="email" placeholder="이메일을 입력해주세요" class="form-control">
      </div>
      <div>
      	<strong>(*) sns수신동의</strong>
			<div>			
				<input type="radio" id="yes" name="msns" value="yes"/>
				<label for="yes">수신동의</label>
				<input type="radio" id="no"  name="msns" value="no"/>
				<label for="no">수신거부</label>
			</div>
      </div>
      <div class="form-group text-center">
			<input type="submit" id="create_user" name="create_user" value="회원가입하러가기" class="form-control btn btn-danger">
	  </div> 
   	</fieldset>
   </form>
   <div class="form-group">
		<a href="<%=request.getContextPath() %>/agree.do" id="btn_back" class="form-control btn btn-default">이전</a> 
	</div>
</div>
<script>
   $(document).ready(function() {      
      $("#join").submit(function() {
         if ($("#mid").val() == ""){alert("아이디를 입력해주세요."); $("#mid").focus(); return false;}
         if ($("#mname").val() == ""){alert("이름을 입력해주세요."); $("#mname").focus(); return false;}
         if ($("#mpass1").val() == ""){alert("비밀번호를 입력해주세요."); $("#mpass1").focus(); return false;}
         if ($("#mpass2").val() == ""){alert("비밀번호를 확인해주세요."); $("#mpass2").focus(); return false;}
         if ($("#memail").val() == ""){alert("이메일을 입력해주세요."); $("#memail").focus(); return false;}
         if ($("#id_check").val() != "1" ){alert("아이디 중복 체크를 하지 않으셨습니다."); return false;}  
      });
   });
</script>
<%@ include file="../inc/footer.jsp" %>


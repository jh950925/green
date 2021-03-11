<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
<!-- header -->

<div class="container panel mymain">
	<script src="//cdn.ckeditor.com/4.16.0/standard/ckeditor.js"></script>
		 <script>
		 		$(function(){
	                CKEDITOR.replace( 'content' );
		 		});
            </script>
		 <form action="<%=request.getContextPath() %>/Mail.do" method="post">
		 	<fieldset>
		 		<legend>관리자에게 문의메일 보내기</legend>
		 		<table class="table table-striped">
					<caption>궁굼하신 사항이 있으면 메일 보내주세요!</caption>
					<tbody>
						<tr>
							<th scope="row">
								<label for="subject">제목</label>
							</th>
							<td>
								<input type="text" name="subject" id="subject" placeholder="제목을 적어주세요" class="form-control"/>
							</td>
						</tr>	
						<tr>
							<th scope="row">
								<label for="content">내용</label>
							</th>
							<td>
								<textarea rows="10" name="content" id="content" class="form-control">
									
								</textarea>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="submit" id="btn" name="btn" class="btn btn-warning" value="전송"/>
							</td>
						</tr>
					</tbody>
				</table>
		 	</fieldset>
		 </form>
</div>

<!-- footer -->
<%@ include file="/inc/footer.jsp" %>
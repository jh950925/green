package com.company.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.dao.MDao;
import com.company.dto.MDto;

public class MPass_edit implements MAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		
		MDao dao = new MDao();
		MDto dto = new MDto();
		
		String af_pass = request.getParameter("af_pass");
		dto.setId((String)session.getAttribute("id"));
		
		
		if(af_pass.equals(request.getParameter("af_pass_chk"))) {
			int result = dao.user_pass_edit(af_pass,(String)session.getAttribute("id"));
			System.out.println("새비밀번호 : " + af_pass); // b 
			System.out.println("id : " + (String)session.getAttribute("id")); //a 
			System.out.println(request.getParameter("af_pass_chk")); //b
			System.out.println(result);
			if(result>0) {
				out.println("<script> alert('변경되었습니다.'); location.href='"+request.getContextPath()+"/mypage.do'; </script>");
			}else {
				out.println("<script> alert('비밀번호를 확인해주세요'); history.go(-1); </script>");
			}
		}
	}
}


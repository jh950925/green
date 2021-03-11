package com.company.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.company.dao.MDao;

public class MDelete implements MAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		MDao dao = new MDao();
		System.out.println("id : " + (String)session.getAttribute("id"));
		System.out.println("pass : " + (String)session.getAttribute("pass"));
		int result = dao.user_delete((String)session.getAttribute("id"),(String)session.getAttribute("pass"));
		System.out.println("게정삭제 : " + result);
		
		if(result > 0) {
			out.println("<script>alert('삭제에 성공했습니다.'); location.href='"+request.getContextPath()+"/login_view.do';</script>");
			session.invalidate();
		}else {
			out.println("<script> alert('관리자에게 문의해주세요.'); history.go(-1);</script>");
		}
	}

}

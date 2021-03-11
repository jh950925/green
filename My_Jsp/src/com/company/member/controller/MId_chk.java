package com.company.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.MDao;

public class MId_chk implements MAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		MDao dao = new MDao();
		String id = request.getParameter("id");
		System.out.println("id : " + id);
		int result = dao.id_chk(id);
		System.out.println("id체크 액션 : " + result);//a가 있어요
		if(result == 0) {
			System.out.println("if문 동작합니다.");
			//out.println("<script> alert('사용 가능한 아이디 입니다.'); history.do(-1); </script>");
			out.println("사용가능한 아이디입니다.");
		}else {
			System.out.println("else문 동작합니다.");
			//out.println("<script> alert('중복된 아이디 입니다.'); history.do(-1); </script>");
			out.println("사용불가능한 아이디입니다.");
		}
	}
}

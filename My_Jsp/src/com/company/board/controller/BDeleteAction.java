package com.company.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BDao;
import com.company.dto.BDto;

public class BDeleteAction implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		BDao dao = new BDao();
		BDto dto = new BDto();
		
		dto.setBpass(request.getParameter("bpass"));
		dto.setBno(Integer.parseInt(request.getParameter("bno")));
		
		int result = dao.delete(dto);
		request.setAttribute("list", result);
		System.out.println("삭제기능"+result);
		//###
		if(result > 0) {
			out.println("<script>alert('삭제에 성공했습니다.'); location.href='"+request.getContextPath()+"/list.do';</script>");
		}else {
			out.println("<script>alert('관리자에게 문의해주세요.'); history.go(-1);</script>");
		}
	}
}

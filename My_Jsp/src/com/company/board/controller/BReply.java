package com.company.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BDao;
import com.company.dto.BDto;


public class BReply implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		BDao dao = new BDao();
		BDto dto = new BDto();
		
		int bgroup = Integer.parseInt(request.getParameter("bgroup"));
		int bstep = Integer.parseInt(request.getParameter("bstep"));
		int bindent = Integer.parseInt(request.getParameter("bindent"));
		///////////////////////////////////////////////
		dto.setBstep(bstep);
		dao.update_re1(dto);
		///////////////////////////////////////////////
		dto.setBname(request.getParameter("bname"));
		dto.setBpass(request.getParameter("bpass"));
		dto.setBtitle(request.getParameter("btitle"));
		dto.setBcontent(request.getParameter("bcontent"));
		dto.setBip(InetAddress.getLocalHost().getHostAddress());
		dto.setBgroup(bgroup);
		dto.setBstep(bstep-1);
		dto.setBindent(bindent+1);
		int result = dao.create(dto);
		
		if(result>0) {
			out.println("<script> alert('글 답변 추가에 성공했습니다.'); location.href='"+request.getContextPath()+"/list.do'; </script>");
		}else {
			out.println("<script> alert('관리자에게 문의해주세요'); hostory.go(-1); </script>");
		}
		
	}
}

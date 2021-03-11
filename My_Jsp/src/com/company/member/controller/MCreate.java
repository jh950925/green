package com.company.member.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.MDao;
import com.company.dto.MDto;

public class MCreate implements MAction{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		MDao dao = new MDao();
		MDto dto = new MDto();
	
		String mphone01 = request.getParameter("mphone01");
		String mphone02 = request.getParameter("mphone02");
		String mphone03 = request.getParameter("mphone03");
		
		String msns = request.getParameter("msns");
		String sns = "";
		
		if(msns.equals("yes")){
			sns = "동의";
		}else if(msns.equals("no")){
			sns = "거부";
		}
		
		String mphone = mphone01+"-"+mphone02+"-"+mphone03;
		
		String mip=InetAddress.getLocalHost().getHostName();

		dto.setId(request.getParameter("id"));
		dto.setName(request.getParameter("name"));
		if(request.getParameter("pass").equals(request.getParameter("pass_chk"))) {
			dto.setPass(request.getParameter("pass"));
		}
		dto.setEmail(request.getParameter("email"));
		dto.setPhone(mphone);
		dto.setIp(mip);
		dto.setSns(sns);
		
		int result = dao.create(dto);
		if(result > 0) {
			out.println("<script>alert('회원가입에 성공했습니다.'); location.href='"+request.getContextPath()+"/join_user.do?id="+dto.getId()+"';</script>");
		}else {
			out.println("<script>alert('관리자에게 문의해주세요.'); history.go(-1);</script>");
		}
	}
}	

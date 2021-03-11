package com.company.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.dao.MDao;
import com.company.dto.MDto;

public class MMypage_list_edit implements MAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		MDto dto = new MDto();
		MDao dao = new MDao();
		String af_mname = request.getParameter("af_mname");
		String af_memail = request.getParameter("af_memail");
		
		String af_mphone01 = request.getParameter("af_mphone01");
		String af_mphone02 = request.getParameter("af_mphone02");
		String af_mphone03 = request.getParameter("af_mphone03");
		String mphone = af_mphone01+"-"+af_mphone02+"-"+af_mphone03;
		
		String af_msns = request.getParameter("af_msns");
		String msns = "";
		
		if(af_msns.equals("yes")){
			msns = "동의";
		}else if(af_msns.equals("no")){
			msns = "거부";
		}
		String id = (String)session.getAttribute("id");
		System.out.println("mid : " +id);
		dto.setName(af_mname);
		dto.setEmail(af_memail);
		dto.setPhone(mphone);
		dto.setSns(msns);
		dto.setId(id);
		System.out.println("af_mname"+dto.getName());
		System.out.println("af_memail"+dto.getEmail());
		System.out.println("mphone"+dto.getPhone());
		System.out.println("msns"+dto.getDate());
		System.out.println("id"+dto.getId());
		
		int result = dao.user_edit(dto);
		System.out.println(result);
		if(result>0) {
			out.println("<script> alert('회원정보를 수정했습니다.'); location.href='"+request.getContextPath()+"/mypage.do'; </script>");
		}else {
			out.println("<script> alert('수정 실패!!'); location.href='"+request.getContextPath()+"/mypage_edit_view.do'; </script>");
		}
	}

}

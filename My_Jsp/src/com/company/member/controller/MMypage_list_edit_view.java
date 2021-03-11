package com.company.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.dao.MDao;
import com.company.dto.MDto;

public class MMypage_list_edit_view implements MAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html charset-utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		MDto dto = new MDto();
		MDao dao = new MDao();
		dto = dao.user_edit_list((String)session.getAttribute("id"));
		System.out.println("자르기전번호 : "+dto.getPhone());
		String [] phone = dto.getPhone().split("-");
		
		String phone01 = phone[0];
		String phone02 = phone[1];
		String phone03 = phone[2];
		String sns = dto.getSns();
		System.out.println("먼저 sns : " + sns);
		if(sns.equals("동의")) {
			sns = "yes";
		}else {
			sns = "no";
		}
		System.out.println("sns : " + sns);
		request.setAttribute("sns", sns);
		request.setAttribute("phone01", phone01);
		request.setAttribute("phone02", phone02);
		request.setAttribute("phone03", phone03);
		
		// 만약
		System.out.println("번호 : "+phone01+" - "+phone02+" - "+phone03);
		System.out.println("회원정보수정 이동 : " + dto);
		request.setAttribute("user", dto);
		System.out.println("회원정보 수정 이동 result : " + dto);
	}

}

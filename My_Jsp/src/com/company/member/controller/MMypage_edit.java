package com.company.member.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.dao.MDao;
import com.company.dto.MDto;

public class MMypage_edit implements MAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MDto result = new MDto();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html charset-utf-8");
		//PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		MDao dao = new MDao();
		
		//String [] phone = dto.getPhone().split("-");
		System.out.println("dto.getPhone() : "+result.getPhone());
		//System.out.println("phone : "+phone);
		//String phone01 = phone[0];
		//String phone02 = phone[1];
		//String phone03 = phone[2];
		
		// 만약
//		if( phone01.equals("010")  ){
//			out.println("<script>$(function(){ $('select option[value=\"010\"]').attr('selected' , 'selected'); }); </script>");
//		}else if( phone01.equals("011")  ){
//			out.println("<script> $(function(){$('select option[value=\"011\"]').attr('selected' , 'selected'); });</script>");
//		}else if( phone01.equals("019")  ){
//			out.println("<script>$(function(){ $('select option[value=\"019\"]').attr('selected' , 'selected'); });</script>");
//		}
		
		result = dao.user_edit_list((String)session.getAttribute("id"));
		System.out.println(result);
		request.setAttribute("user", result);
	}

}

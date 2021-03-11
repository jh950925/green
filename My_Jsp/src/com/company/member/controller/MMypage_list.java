package com.company.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.dao.MDao;
import com.company.dto.MDto;

public class MMypage_list implements MAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MDto list = new MDto();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html charset-utf-8");
		HttpSession session = request.getSession(true);
		MDao dao = new MDao();
		
		list = dao.user((String)session.getAttribute("id"));
		System.out.println(list);
		request.setAttribute("user", list);
	}
}

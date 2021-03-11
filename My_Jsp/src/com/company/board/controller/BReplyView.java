package com.company.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BDao;
import com.company.dto.BDto;


public class BReplyView implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		BDao dao = new BDao();
		BDto dto = new BDto();
		
		dto.setBno(Integer.parseInt(request.getParameter("bno")));
		System.out.println("");
		dto = dao.read(dto);
		System.out.println("dto1 : " + dto);
		dto.setBtitle("ㄴre:" + dto.getBtitle());
		dto.setBcontent("\n>" + dto.getBcontent().replace("\n", "\n>"));
		request.setAttribute("dto", dto);
		System.out.println("dto2 : " + dto);
	}
}

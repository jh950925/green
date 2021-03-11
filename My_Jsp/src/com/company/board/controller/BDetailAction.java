package com.company.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BDao;
import com.company.dto.BDto;

public class BDetailAction implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		BDto dto = new BDto();
		BDao dao = new BDao();
		
		dto.setBno(Integer.parseInt(request.getParameter("bno")));
		dao.update_hit(dto);//조회수 증가
		request.setAttribute("dto", dao.read(dto));
		
		System.out.println(dto.getImg());
		System.out.println("글 상세가져오기, 조회수 올리기 ");
	}

}

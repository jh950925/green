package com.company.ask.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.AskDao;
import com.company.dto.Ask2Dto;
import com.company.dto.AskDto;

public class Ask_list_View implements AskAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		AskDao dao = new AskDao();
		ArrayList<AskDto> list = dao.list();
		ArrayList<Ask2Dto> ask = dao.ask();
		System.out.println("list : " + list);
		System.out.println("ask : " + ask);
		
		//1. list[0] / list[1]  / list[2]
		//select * from  where category=배송문의
		
		request.setAttribute("list", list);   // 
		request.setAttribute("ask", ask);
	}
}

package com.company.main.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.MainDao;
import com.company.dto.MainPhotoDto;

public class Main implements MainAction{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		MainDao dao = new MainDao();
		
		ArrayList<MainPhotoDto> img = dao.img();
		System.out.println("img : " + img);
		request.setAttribute("img", img);
	}
}

package com.company.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BDao;
import com.company.dto.BDto;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class BSearch implements BAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		BDao dao = new BDao();
		JsonArray list = new JsonArray();
		JsonObject jobj = new JsonObject();
		
		String keyword = request.getParameter("keyword");
		System.out.println("keyword : " + keyword);
		ArrayList<BDto> result = dao.search(keyword);
		System.out.println("result : " + result);
		
		for(int i=0; i<result.size(); i++) {
			jobj.addProperty("bno", result.get(i).getBno());
			jobj.addProperty("btitle", result.get(i).getBtitle());
			jobj.addProperty("bname", result.get(i).getBname());
			jobj.addProperty("bdate", result.get(i).getBdate());
			jobj.addProperty("bhit", result.get(i).getBhit());
			list.add(jobj);
		}
		System.out.println("list : " + list);
		System.out.println(list.getClass().getName());
		out.println(list);
	}

}

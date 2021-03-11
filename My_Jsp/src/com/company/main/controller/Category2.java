package com.company.main.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.MainDao;
import com.company.dto.SubMenueDto;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Category2 implements MainAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		ArrayList<SubMenueDto> result = new ArrayList<>();
		MainDao dao = new MainDao();
		PrintWriter out = response.getWriter();
		
		String keyword = request.getParameter("keyword");
		
		System.out.println("keyword받아오기 : " + keyword);
		
		if(keyword.equals("식품")) {
			int menue_no = 1;
			result = dao.submenue(menue_no);
		} else if(keyword.equals("컴퓨터")) {
			int menue_no = 2;
			result = dao.submenue(menue_no);
		} else if(keyword.equals("운동")) {
			int menue_no = 3;
			result = dao.submenue(menue_no);
		}
		
		JsonArray list2 = new JsonArray();
		
		for(int i=0; i<result.size(); i++) {
			JsonObject jobj = new JsonObject();
			jobj.addProperty("title",       result.get(i).getTitle());
			jobj.addProperty("sub_menue",   result.get(i).getSubmenue());
			jobj.addProperty("product",     result.get(i).getProduct());
			jobj.addProperty("product_img", result.get(i).getProduct_img());
			list2.add(jobj);
		}
		System.out.println("list2 : " + list2);
		System.out.println("result : " + result);
		out.print(list2);
	}

}

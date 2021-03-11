package com.company.main.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.MainDao;
import com.company.dto.SubMenueDto;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Category implements MainAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		ArrayList<SubMenueDto> result = new ArrayList<>();
		MainDao dao = new MainDao();
		
		String menue = request.getParameter("menue");
		
		System.out.println("menue받아오기 : " + menue);
		
		if(menue.equals("식품")) {
			int menue_no = 1;
			result = dao.submenue(menue_no);
		} else if(menue.equals("컴퓨터")) {
			int menue_no =2;
			result = dao.submenue(menue_no);
		} else if(menue.equals("운동")) {
			int menue_no =3;
			result = dao.submenue(menue_no);
		}
		
		JsonArray list = new JsonArray();
		
		for(int i=0; i<result.size(); i++) {
			JsonObject jobj = new JsonObject();
			jobj.addProperty("title",       result.get(i).getTitle());
			jobj.addProperty("sub_menue",   result.get(i).getSubmenue());
			jobj.addProperty("product",     result.get(i).getProduct());
			jobj.addProperty("product_img", result.get(i).getProduct_img());
			list.add(jobj);
		}
		System.out.println("list : " + list);
		System.out.println("result : " + result);
		request.setAttribute("list", list);
	}

}

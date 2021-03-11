package com.company.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.dao.MDao;

public class MLogin implements MAction{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		MDao dao = new MDao();
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String mcheck = request.getParameter("mcheck");
		
		int result = dao.login(id, pass);
		if(result>0) {
			if(mcheck != null){
				String [] name = {"id","mcheck"};
				System.out.println("name : " + name);
				String [] value = {id,"checked"};
				System.out.println("value : " + value);
				Cookie [] cookie_set = new Cookie[2];
				for(int i=0; i<cookie_set.length; i++){
					cookie_set[i] = new Cookie(name[i],value[i]);
					cookie_set[i].setMaxAge(1*60*60*24);
					response.addCookie(cookie_set[i]);
				} // 쿠키설정 
				Cookie [] cookie2 = request.getCookies();
				for(int i=0; i<cookie2.length; i++){
					cookie2[i].setMaxAge(0);
					response.addCookie(cookie_set[i]);
				}// 쿠키삭제
			}else{
				Cookie [] cookie_set = request.getCookies();
				for(int i=0; i<cookie_set.length; i++){
					if(cookie_set[i].getName().equals("id") || cookie_set[i].getName().equals("mcheck")){
						cookie_set[i].setMaxAge(0);
						response.addCookie(cookie_set[i]);
					}
				}// 쿠키삭제
			}
			System.out.println("mcheck : "+mcheck);
			
			session.setAttribute("id", id);
			session.setAttribute("pass", pass);
			out.println("<script> alert('반갑습니다."+id+"고객님'); location.href='"+request.getContextPath()+"/Main.do'; </script>");
		}else {
			out.println("<script> alert('아이디 비밀번호를 확인해주세요'); history.go(-1); </script>");
		}
	}
}

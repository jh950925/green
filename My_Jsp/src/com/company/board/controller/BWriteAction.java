package com.company.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BDao;
import com.company.dto.BDto;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BWriteAction implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		BDto dto = new BDto();
		BDao dao = new BDao();
		int bgroup =-1, bstep =-1, bindent=-1, max=-1;
		max = dao.create_max();
		bgroup = (int)(Math.ceil(max/(float)1000))+1;
		bstep = bgroup * 1000;
		bindent = 0;
		
		//String path = "/upload/";
		String path = request.getServletContext().getRealPath("/upload/"); // 호스팅
		
		
		System.out.println("글 삽입기능 ");
		
		try {
			MultipartRequest multi = new MultipartRequest(request, path, 1024*1024*5, "utf-8",new DefaultFileRenamePolicy());
			dto.setBname(multi.getParameter("bname"));
			dto.setBpass(multi.getParameter("bpass"));
			dto.setBtitle(multi.getParameter("btitle"));
			dto.setBcontent(multi.getParameter("bcontent"));
			dto.setImg(multi.getFilesystemName("img"));
			dto.setBgroup(bgroup);
			dto.setBstep(bstep);
			dto.setBindent(bindent);
			
			System.out.println(dto);
			System.out.println(dto.getImg()); // null
			
			int result = dao.create(dto);
			System.out.println(result);
			
			request.setAttribute("create", result);
			//###
			if(result > 0) {
				out.println("<script>alert('글쓰기에 성공했습니다.'); location.href='"+request.getContextPath()+"/list.do';</script>");
			}else {
				out.println("<script>alert('관리자에게 문의해주세요.'); history.go(-1);</script>");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

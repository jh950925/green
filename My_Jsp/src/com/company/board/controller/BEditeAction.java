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

public class BEditeAction implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		BDto dto = new BDto();
		BDao dao = new BDao();
		
		String path = "/upload/";
		path = request.getServletContext().getRealPath(path); // 호스팅
		
		int pass = Integer.parseInt(request.getParameter("bno"));
		
		try {
			MultipartRequest multi = new MultipartRequest(request, path, 1024*1024*5, "utf-8",new DefaultFileRenamePolicy());
			
			dto.setBtitle(multi.getParameter("btitle"));
			dto.setBcontent(multi.getParameter("bcontent"));
			dto.setBno(pass);
			dto.setBpass(multi.getParameter("bpass"));
			if(multi.getFilesystemName("img") == null) {  //새로 추가하는 파일이 없으면
				dto.setImg(multi.getParameter("file_up")); //원래있던 파일
			}
			else { 
				dto.setImg(multi.getFilesystemName("img")); //추가한 파일
			}
			
			int result = dao.update(dto);
			
			request.setAttribute("list", result);
			System.out.println("수정기능");
			System.out.println(dto);
			//###
			if(result > 0) {
				out.println("<script>alert('수정에 성공했습니다.'); location.href='"+request.getContextPath()+"/detail.do?bno="+pass+"';</script>");
			}else {
				out.println("<script>alert('관리자에게 문의해주세요.'); history.go(-1);</script>");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

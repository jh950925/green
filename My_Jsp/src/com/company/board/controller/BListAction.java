package com.company.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BDao;
import com.company.dto.BDto;

public class BListAction implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		BDao dao = new BDao();
		////////////////////////////////////////////////////////////////////////////////////////////////paging 데이터 셋팅 start
		// 1. 전체게시판(레코드) 개수  : 11
		int pageTotal = dao.listcnt(); 
		System.out.println("1. 전체게시판(레코드) 개수 pageTotal : " + pageTotal);
		//////////////////////////////////////////////////////////////////////////
		// 2. 한페이지당 보여주는(레코드) 개수 : 10
		int onepagelimit = 10; 
		System.out.println("2. 한페이지당 보여주는(레코드) 개수 onepagelimit : " + onepagelimit);
		//////////////////////////////////////////////////////////////////////////
		// 3. 전체페이지				: 2
		int pageAll = (int)Math.ceil(pageTotal/(float)onepagelimit); 
		System.out.println("3. 전체페이지 pageAll : " + pageAll);
		//////////////////////////////////////////////////////////////////////////
		// 4. db에서 가져올 번호			: 0
		int pstartno = 0;
		if(request.getParameter("pstartno") != null) { pstartno = Integer.parseInt(request.getParameter("pstartno")); }
		System.out.println("4-1. db에서 가져올 번호 pstartno : " + pstartno);
		ArrayList<BDto> list =  dao.list10(pstartno); //##
		System.out.println("4-2. db에서 가져온 리스트 : " + list);
		//////////////////////////////////////////////////////////////////////////
		// 5. 하단페이지네비					
		int bottomlist = 10;
		System.out.println("5. 하단페이지네비 bottomlist : " + bottomlist);
		//////////////////////////////////////////////////////////////////////////
		// 6. 현재페이지번호					
		int current = (int)Math.ceil((pstartno+1)/(float)onepagelimit);
		System.out.println("6. 하단네비 현재페이지번호 current : " + current);
		//////////////////////////////////////////////////////////////////////////
		// 7. 시작버튼						
		int start = (int)Math.floor(((current-1)/(float)bottomlist)) * bottomlist +1;
		System.out.println("7. 하단네비 시작버튼 start : " + start);
		//////////////////////////////////////////////////////////////////////////
		// 8. 마지막버튼					
		int end = start + bottomlist -1;
		if(pageAll < end) {
			end=pageAll;
		}
		System.out.println("8. 하단네비 마지막버튼 end : " + end);
		//////////////////////////////////////////////////////////////////////////////////////////////// paging 데이터 셋팅 end
		request.setAttribute("pageTotal", pageTotal);
		request.setAttribute("onepagelimit", onepagelimit);
		request.setAttribute("pageAll", pageAll);
		request.setAttribute("bottomlist", bottomlist);
		request.setAttribute("current", current);
		request.setAttribute("start", start);
		request.setAttribute("end", end);
		request.setAttribute("paginglist", list ); //##
		
		System.out.println("전체데이터 가져오기");
	}

}

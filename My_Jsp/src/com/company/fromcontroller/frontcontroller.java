package com.company.fromcontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.ask.controller.AskAction;
import com.company.ask.controller.Ask_Mail;
import com.company.ask.controller.Ask_list_View;
import com.company.board.controller.BAction;
import com.company.board.controller.BDeleteAction;
import com.company.board.controller.BDetailAction;
import com.company.board.controller.BEditeAction;
import com.company.board.controller.BEditeViewAction;
import com.company.board.controller.BListAction;
import com.company.board.controller.BReply;
import com.company.board.controller.BReplyView;
import com.company.board.controller.BSearch;
import com.company.board.controller.BWriteAction;
import com.company.main.controller.Category;
import com.company.main.controller.Category2;
import com.company.main.controller.Main;
import com.company.main.controller.MainAction;
import com.company.member.controller.MAction;
import com.company.member.controller.MCreate;
import com.company.member.controller.MDelete;
import com.company.member.controller.MId_chk;
import com.company.member.controller.MList;
import com.company.member.controller.MLogin;
import com.company.member.controller.MLogout;
import com.company.member.controller.MMypage_list;
import com.company.member.controller.MMypage_list_edit;
import com.company.member.controller.MMypage_list_edit_view;
import com.company.member.controller.MPass_edit;


@WebServlet("*.do")
public class frontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public frontcontroller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionTest(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionTest(request, response);
	}
	// actionTest
		protected void actionTest(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");
			/////////////////////////////////////////////////////////
			// String path = request.getServletPath();
			String path = request.getRequestURI().substring(request.getContextPath().length());
			BAction comm = null;
			MAction comm_member = null;
			AskAction comm_ask = null;
			MainAction comm_main = null;
			String view = "/member/login.jsp";
			if (path.equals("/list.do")) {
				comm = new BListAction();
				comm.execute(request,response);
				view = "/board/list.jsp";
			} else if (path.equals("/write_view.do")) {
				// 1.------------ //2./board/write.jsp로 이동
				view = "/board/write.jsp";
			} else if (path.equals("/write.do")) {
				// 1.글삽입  //2./board/list.jsp로 이동
				comm = new BWriteAction();
				comm.execute(request,response);
				view = "/list.do";
				return;
			} else if (path.equals("/detail.do")) {
				// 1.글 상세 가져오기 / 조회수 올리기 //2./board/detail.jsp로 이동
				comm = new BDetailAction();
				comm.execute(request,response);
				view = "/board/detail.jsp";
			} else if (path.equals("/edit_view.do")) {
				// 1.글 상세 가져오기 //2./board/edit.jsp로 이동
				comm = new BEditeViewAction();
				comm.execute(request,response);
				view = "/board/edit.jsp";
			} else if (path.equals("/edit.do")) {
				// 1.글 수정하기 //2./board/detail.jsp로 이동
				comm = new BEditeAction();
				comm.execute(request,response);
				view = "/detail.do"; //##
				return;
			} else if (path.equals("/delete_view.do")) {
				// 1.------------ //2./board/delete.jsp로 이동
				view = "/board/delete.jsp";
			} else if (path.equals("/delete.do")) {
				// 1.글 삭제하기 //2./board/list.jsp로 이동
				comm = new BDeleteAction();
				comm.execute(request,response);
				view = "/list.do";
				return;
			} else if (path.equals("/agree.do")) { //회원가입 개인정보 동의
				view = "/member/agree.jsp";
			} else if (path.equals("/join.do")) { //회원가입
				view = "/member/join.jsp";
			} else if (path.equals("/joinAction.do")) { //회원가입 처리
				comm_member = new MCreate();
				comm_member.execute(request, response);
				return;
			} else if (path.equals("/join_user.do")) { //회원가입 후 정보리스트
				comm_member = new MList();
				comm_member.execute(request, response);
				view = "/member/join_user.jsp";
			} else if (path.equals("/login_view.do")) { //로그인 화면 이동
				view  = "/member/login.jsp";
			}else if(path.equals("/login.do")) { //로그인 처리
				comm_member = new MLogin();
				comm_member.execute(request, response);
				view = "/member/login.jsp";
				return;
			} else if(path.equals("/logout.do")) { //로그아웃
				comm_member = new MLogout();
				comm_member.execute(request, response);
				view = "/member/login.jsp";
			} else if(path.equals("/mypage.do")) { //마이페이지 이동
				comm_member = new MMypage_list();
				comm_member.execute(request, response);
				view = "/member/mypage.jsp";
			} else if(path.equals("/mypage_edit_view.do")) { //회원정보수정 이동
				comm_member = new MMypage_list_edit_view();
				comm_member.execute(request, response);
				view = "/member/mypage_edit.jsp";
			} else if(path.equals("/mpage_edit.do")) { //회원정보 수정
				comm_member = new MMypage_list_edit();
				comm_member.execute(request, response);
				view = "/mypage.do";
			} else if(path.equals("/mpage_pass_edit_view.do")) { //회원비밀번호수정 이동
				view = "/member/mypage_pass.jsp";
			} else if(path.equals("/mpage_pass_edit.do")) { //회원 비밀번호 수정
				comm_member = new MPass_edit();
				comm_member.execute(request, response);
				view = "/member/mypage_edit.jsp";
				return;
			} else if(path.equals("/MDelete_view.do")) { //회원삭제 이동
				view = "/member/delete.jsp";
			} else if(path.equals("/MDelete.do")) { //회원삭제
				comm_member = new MDelete();
				comm_member.execute(request, response);
				view = "/login.do";
				return;
			} else if(path.equals("/id_chk.do")) { //id 체크
				comm_member = new MId_chk();
				comm_member.execute(request, response);
				view = "/join.do";
				return;
			} else if(path.equals("/reply_view.do")) { //답변달기(폼)
				System.out.println("답변달기(폼)");
				comm = new BReplyView();
				comm.execute(request, response);
				view = "/board/reply.jsp";
				System.out.println("view : "+ view);
			} else if(path.equals("/reply.do")) { //답변달기
				comm = new BReply();
				comm.execute(request, response);
				view = "/list.do";
				return;
			} else if(path.equals("/ask_view.do")) { //자주묻는 질문
				comm_ask = new Ask_list_View();
				comm_ask.execute(request, response);
				view = "/menu/ask.jsp";
			} else if(path.equals("/mail_view.do")) { //1:1문의하기
				view = "/menu/mail.jsp";
			} else if(path.endsWith("/Mail.do")) { //메일보내기
				comm_ask = new Ask_Mail();
				comm_ask.execute(request, response);
				view = "/menu/mail.jsp";
				return;
			} else if(path.equals("/company_view.do")) { //회사소개
				view = "/menu/company.jsp";
			} else if(path.equals("/BSearch.do")) {
				comm = new BSearch();
				comm.execute(request, response);
				view = "list.do";
			} else if(path.equals("/Main.do")) {
				comm_main = new Main();
				comm_main.execute(request, response);
				view = "/content/main.jsp";
			} else if(path.equals("/submenue_view.do")) {
				comm_main = new Category();
				comm_main.execute(request, response);
				view = "/content/submain.jsp";
			} else if(path.equals("/submenue.do")) {
				comm_main = new Category2();
				comm_main.execute(request, response);
				view = "/content/submain.jsp";
			}
			request.getRequestDispatcher(view).forward(request, response);
		}
}

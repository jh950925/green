package com.company.ask.controller;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ask_Mail implements AskAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		///////////////////////////////////////////////////////////////네이버셋팅
		String host = "smtp.naver.com";
		final String user = "jh950925@naver.com"; //관리자 아이디
		final String password = "dustp@025";	   //관리자비밀번호
		
		///////////////////////////////////////////////////////////////받는사람설정
		String to  = "junhyoung0925@daum.net"; 
		//연결세션정보
		Properties props = new Properties(); //java.util.Properties
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.trust", "smtp.naver.com");
		
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user,password);
			}
		});
		
		// 메세지내용구성
		try {
			MimeMessage message = new MimeMessage(session);	//보내는 정보(주소지)
			message.setFrom( new InternetAddress(user));	//보내는 사람 설정
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));	//받는사람설정
			//내용구성
			message.setSubject(subject);
			message.setContent("<p>"+content+"</p>", "text/html; charset=euc-kr"); //메일보낼시 한글깨짐 인코딩설정
			Transport.send(message);
			response.sendRedirect(request.getContextPath()+"/menu/mail.jsp");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

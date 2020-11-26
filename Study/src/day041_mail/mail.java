package day041_mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class mail {
	public static void main(String[] args) {
		
		String subject ="김준형";
		String content ="메일내용 - 감사합니다.";
		String host = "smtp.naver.com";
		String user = "jh950925@naver.com"; //네이버 아이디
		String password = "dustp@025";//네이버 비밀번호
				
		String to = "cozizii-_-@naver.com";  //받는사람 이메일 주소
		
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.ssl.enabel", "true");
		props.put("mail.smtp.ssl.trust", "smtp.naver.com");
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user,password);
			}
		});
		System.out.println("1");
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//1.메일 제목
			message.setSubject(subject);
			//2.메일 내용
			message.setText(content);
			System.out.println("2");
			Transport.send(message);
			System.out.println("3 successfully!!");
		}catch(AddressException e) {
			e.printStackTrace();
		}catch(MessagingException e) {
			e.printStackTrace();
		}
	}
}
//1.다운로드
//https://mvnrepository.com/artifact/javax.mail/mail/1.4.7
//2.jar파일 - build path
//3.naver가서 smtp퐉인
//POP 서버명 : pop.naver.comSMTP 
//서버명 : smtp.naver.com
//필요SMTP 포트 : 465
//필요아이디 : jh950925
//비밀번호 : 네이버 로그인 비밀번호
package study;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void sendEmail( String fromEmail , String title, String content ) {
		// 문의글 등록되면 관리자 이메일로 전송하기
		// 작성자, 제목, 내용을 보냄
		
		final String adminEmail = "dwjavadrone@naver.com";
		final String password = "X86TN5JZYF8W";
		
		Properties prop = new Properties(); 
		//Properties는 문자열만 저장가능 데이터가 Map과 같이 저장됨
		prop.put( "mail.smtp.host" , "smtp.naver.com" ); // smtp서버명
		prop.put( "mail.smtp.port", "587" ); // smtp포트번호
		prop.put( "mail.smtp.starttls.enable" , "ture" ); // tls사용여부
		prop.put( "mail.smtp.auth", "true" ); // smtp서버 인증
		
		// 문의글이 등록되면 관리자 이메일로 전송 되어야 한다
		// 보내는 사람과 받는 사람이 필요한데 보내는 사람은 클라이언트이지만 실제 클라이언트 메일에서 발송되는게 아니고
		// 자바에서 발송하는 것이기 때문에 관리자가 보내고 받고를 해야한다
		Session adminAuth = Session.getInstance( prop , new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication( adminEmail , password );
			}
		}); // 보내는 이메일 로그인 인증
		
		
		try {
			MimeMessage msg = new MimeMessage( adminAuth );
			msg.setFrom( new InternetAddress( adminEmail ) ); // 보내는 이메일 주소
			msg.setRecipients( Message.RecipientType.TO , InternetAddress.parse( adminEmail ) );
			// 받는 주소
			
			msg.setHeader( "Content-type" , "text.html;charset=utf-8" );
			
			msg.setSubject( " 문의글 등록 [ " + title + " ]- " + fromEmail ); // 제목
			
			msg.setContent( // 이메일 내용
					"<h3>문의 내용</h3> <b>" + content + 
					"</b> <div><a href='http://localhost:8080/jsp_study1/study/?part=inquiry'>문의글확인</a></div>"
					, "text/html;charset=utf-8"
			);
			
			Transport.send( msg ); //메일 전송
			
			
		}
		catch( MessagingException e ) {
			e.printStackTrace();
			System.out.println( "이메일 전송 실패" );
		}
	}
}














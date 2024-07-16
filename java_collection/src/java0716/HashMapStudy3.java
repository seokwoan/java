package java0716;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudy3 {

	public static void main(String[] args) {

		HashMap< Integer , String > url = new HashMap<>();
		url.put( 1 , "login" );
		url.put( 2 , "signup");
		url.put( 3 , "notice_view");
		url.put( 4 , "notice_write");
		
		// 웹사이트에서 사용자가 원하는 페이지를 제공 및 요청 처리
		HashMap< String , PageAction > map = new HashMap<>();
		
		map.put( "login" , new Login() );
		map.put( "notice_write", new NoticeWrite() );
		map.put( "signup", new SignUp() );
		map.put( "notice_view" , new NoticeView() );
		
		// 사이트의 메뉴를 제공하고 사용자가 선택하면 해당 메뉴의 페이지를 보여준다
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "=== 자바 개발자 사이트 === " );
		System.out.println( "1. 로그인" );
		System.out.println( "2. 회원가입" );
		System.out.println( "3. 글 보기" );
		System.out.println( "4. 글 쓰기" );
		
		System.out.println( "메뉴 선택 : " );
		int menu = sc.nextInt();
		sc.nextLine();
		
		String cmd = null;
		
		cmd = url.get( menu );
		
		PageAction obj = map.get( cmd );
		
		String view = obj.action();
		System.out.println( view );
		
		
		
	}

	
}
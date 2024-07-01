package java0627;

import java.util.Scanner;

public class java0627_2 {

	public static void main(String[] args) {
		
		// 조건문 if(범위), switch(프로그램제어)
		// 반복문 for, while, do~while
		
		
		
		
		
		
		
		// 시험 합격 기준 - 합격(60점이상), 불합격(60점미만)
		
		int score = 72;
		if( score >= 60 ) {
			System.out.println( "합격" );
		}
		else if( score < 60 ) {
			System.out.println( "불합격" );
		}
		
		// if~else - 조건식이 참, 거짓에 따라 실행되는 내용이 다른경우
		// 하나의 조건에 두개의 내용이 있는 경우에 if~else 구조로 작성
		
		// 시험 성적 등급 A(90점이상), B(80점이상), C(70점이상), D(나머지 - 70점미만)
		
		score = 89;
		if( score >= 90 ) {
			System.out.println( "A" );
		}
		else if( score >= 80 /*등급이 2개뿐이면 else의 조건이 필요 없음 */ ) { // 첫 조건식에서 90미만으로 걸러져 90미만의 조건을 추가할 필요가 없음
			System.out.println( "B" );
		}
		else if( score >= 70 ){ // 등급이 3개면 조건식이 2개가 필요   
			System.out.println( "C" ); //  
		}
		else {
			System.out.println( "D" );
		}
		
		

		//  switch - 실행조건을 case로 설정하여  case와 일치하는 값일 경우 발동되는 조건문
		
		// 지렁이 게임을 만든다. 방향키는 w, a, s, d이고
		// p키는 일시정지, o키는 계속하기, i는 처음부터 다시시작
		// ctrl+s는 게임시작이라고 한다면
		/*
		  switch(키보드값){
		  	case 'a' :
		  	case 'w' :
		  	case 's' : 
		  	case 'd' :
		  	case 'p' : 
		  	case 'o' : 
		  	case 'i' : 
		  	case 'ctrl':
		  		switch(키2){
		  			case 's' : 
		  		}
		  }
		 
		
		// 프로그램의 메뉴 구성
		
		// switch(menu){
		// 		case "open" :
		//		case "save" :
		//		case "build" : 
		//		case "git" :
		//		case "exit" :
		// }
	
			
		// 조건식 == 연산자가 사용된다면 switch로 작성하는것을 고려해보기.
		
		 
		*/
		
		String button = "종료";
		switch(button) {
			case "시작" :
				System.out.println("게임 시작");
				break;
			case "자동 저장" : // 일부러 break를 쓰지 않는 경우도 있음
			case "저장" :
				System.out.println("게임 시작");
				break;
			case "종료" :
				System.out.println("게임 종료");
		}	
		
			
		
		// 가로와 세로의 길이를 키보드로 입력하세요. (단위는 상관없다)
		// 가로 또는 세로의 길이가 크다면 직사각형
		// 가로와 세로의 길이가 같다면 정사각형이라고 출력하세요.
		// switch문으로 (  if문 절대 쓰지 말고)
		
		Scanner cm = new Scanner(System.in);
		int width = 0 , height = 0;
		
		System.out.print("가로의 길이를 입력하세요 : ");
		width = cm.nextInt();
		System.out.print("세로의 길이를 입력하세요 : ");
		height = cm.nextInt();
		int minus = width - height; // 10 - 5 -> 5 , 5 - 8 -> -3

		switch ( minus ) { // switch문의 ()에 들어간 데이터타입과 같은 데이터타입이 case의 값으로 들어가야한다.
			case 0 : 
				System.out.println("정사각형");
				break;
			default :
				System.out.println("직사각형");
		}
		
		// switch문에서 default는 한번만 사용 
		// switch에 들어온 값이 case에 일치하는게 없다면 default 실행
		// 주어진 case와 일치하는게 하나도 없으면 default만 실행하고 종료 
		// default는 switch문의 마지막에 작성
		
		
	}

}
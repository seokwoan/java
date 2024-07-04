package java0704;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) {
		
		// 컴퓨터와 가위바위보 하기
		// 컴퓨터의 가위바위보 값은 comInput method를 사용한다.
		// 유저의 가위바위보는 한글로 입력한다.
		// 승, 무, 패에 대해 출력한다.
		// method - 유저 가위바위보 입력하고 저장하는 method
		// 		  - 컴퓨터와 비교하여 결과 출력하는 method
		// Game class에 필요한 변수나 method작성
		// main method에서는 Game class의 객체로 method들만 실행

		Game game = new Game();
		game.comInput();
		game.userInput();
		game.winner();
		
		game.play(); // play method에서 comInput, userInput, winner method를 전부 실행시킴
					 // 3개의 method를 각각 실행하지 않고 묶어서 실행 가능
	
	}

}

class Game{ // rock - paper - scissors 게임
	
	String com;
	String user;
	
	void comInput() {
		int temp = (int) ( Math.random() * 3 );
		switch ( temp ) {
			case 0 : this.com = "가위"; break;
			case 1 : this.com = "바위"; break;
			case 2 : this.com = "보"; break;
		}
	}
	
	void play() { // play라는 method를 만들어주고 그 method에서 다른 method를 실행시키면 method호출 한번으로 가능
		comInput();
		userInput();
		winner();
	}
	
	
	void userInput() {
		Scanner rps = new Scanner(System.in);
		System.out.print( "\n가위~ 바위~ 보! : " );
		this.user = rps.nextLine();
		// this.user로 표현하는 이유는 사용하는 객체의 변수를 사용한것이다 라는 표현을 해주는것
	}
	
	void winner() {
//		if( this.com.equals(this.user) ) {
//			System.out.printf( " 컴퓨터 %s 유저 %s 무승부입니다. " , this.com , this.user );
//		}
//		else if( this.com.equals( "가위" ) ) {
//			if( this.user.equals( "보" ) ) {
//				System.out.printf( " 컴퓨터 %s 유저 %s 컴퓨터 승리 " , this.com , this.user );
//			}
//			else {
//				System.out.printf( " 컴퓨터 %s 유저 %s 유저 승리 " , this.com , this.user );
//			}
//		}
//		else if( this.com.equals( "바위" ) ) {
//			if( this.user.equals( "가위" ) ) {
//				System.out.printf( " 컴퓨터 %s 유저 %s 컴퓨터 승리 " , this.com , this.user );
//			}
//			else {
//				System.out.printf( " 컴퓨터 %s 유저 %s 유저 승리 " , this.com , this.user );
//			}
//		}	
//		else if	( this.com.equals( "보" ) ) {
//			if( this.user.equals( "바위" ) ) {
//				System.out.printf( " 컴퓨터 %s 유저 %s 컴퓨터 승리 " , this.com , this.user );
//			}
//			else {
//				System.out.printf( " 컴퓨터 %s 유저 %s 유저 승리 " , this.com , this.user );
//			}
//		}
		switch( this.com ) {
			case "가위" :
				switch( this.user ) {
					case "가위" : 
						System.out.printf( " 컴퓨터 %s 유저 %s 무승부입니다. " , this.com , this.user );
						break;
					case "바위" :
						System.out.printf( " 컴퓨터 %s 유저 %s 유저 승리 " , this.com , this.user );
						break;
					case "보" :
						System.out.printf( " 컴퓨터 %s 유저 %s 컴퓨터 승리 " , this.com , this.user );
						break;
				}
				break;
			case "바위" :
				switch( this.user ) {
					case "가위" : 
						System.out.printf( " 컴퓨터 %s 유저 %s 컴퓨터 승리. " , this.com , this.user );
						break;
					case "바위" :
						System.out.printf( " 컴퓨터 %s 유저 %s 무승부입니다. " , this.com , this.user );
						break;
					case "보" :
						System.out.printf( " 컴퓨터 %s 유저 %s 유저 승리 " , this.com , this.user );
						break;
				}
				break;
			case "보" :
				switch( this.user ) {
					case "가위" : 
						System.out.printf( " 컴퓨터 %s 유저 %s 유저 승리. " , this.com , this.user );
						break;
					case "바위" :
						System.out.printf( " 컴퓨터 %s 유저 %s 컴퓨터 승리. " , this.com , this.user );
						break;
					case "보" :
						System.out.printf( " 컴퓨터 %s 유저 %s 무승부입니다. " , this.com , this.user );
						break;
				}	
		}
	}
	
	
}

// 선생님 풀이
// void result() {
//	 if( user.equals(com) ) {
//		 System.out.println( "비김" );
//	 }
//	 else if( user.equals( "가위" ) && com.equals( "보" ) ||
//			  user.equals( "바위" ) && com.equals( "가위" ) ||
//			  user.equals( "보" ) && com.equals( "바위" ) ) {
//		 System.out.println( "유저 승 , 컴퓨터 패" );
//	 }
//	 else {
//		 System.out.println( "컴퓨터 승, 유저 패" );
//	 }
// }











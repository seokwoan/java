package java0704;

import java.util.Arrays;
import java.util.Scanner;

public class DiceHomework {

	public static void main(String[] args) {
		
		// 2명 이상의 참가자가 게임을 할때
		DiceGame game = new DiceGame();
		game.init();
		game.diceThrow();
		game.result();
		

		
		// 2명의 참가자가 게임을 할때
//		Dice game = new Dice();
//		
//		int 석완 = game.getDice( "석완" );
//		int 형준 = game.getDice( "형준" );
//		game.result( 석완 , 형준 );
		

	}

}

// 2명이상의 참가자가 게임을 할때
class DiceGame{ // 참가인원 상관없이 게임진행 가능, class내부에서 전부 처리 가능하게 코드 작성
	
	String[] names; // 공간을 정하지 않고 배열 생성
	int[] diceNum;
	
	void init() {
		Scanner sc = new Scanner(System.in);
		System.out.print( "주사위 게임 참가인원 : " );
		int cnt = sc.nextInt();
		this.names = new String[cnt]; // 참가인원에 맞게 배열의 공간을 만들어줌
		this.diceNum = new int[cnt];
		sc.nextLine(); // nextInt 입력후 입력한 enter가 버퍼에 남아있어 버퍼를 비워줌
		for( int i = 0 ; i < names.length ; i++ ) {
			System.out.print( "참가자 이름 : " );
			names[i] = sc.nextLine();
		}
	}
	
	void diceThrow() {
		for( int i = 0 ; i < names.length ; i++ ) {
			this.diceNum[i] = (int) ( Math.random() * 6 + 1 );
			System.out.printf( " %s 주사위 : %d\n", this.names[i] , this.diceNum[i] );
		}
	}
	
	void result() { // 주사위 결과 - 주사위 값이 크면 이긴다.
		// 가장 큰 주사위 값 찾기
		int max = 0;
		for( int num : diceNum ) {
			if( max < num ) {
				max = num;
			}
		}
		// 모든 참가자들의 주사위 값이 같다면 
		boolean isSame = true;
		for( int num : diceNum ) { // max의 값과 dice의 값을 비교
			if( num != max ) { // 다른게 하나라도 있으면 isSame이 거짓
				isSame = false; // 모두가 같으면 실행되지 않음
				// 거짓이면 높은 사람이 승리 참이면 모두 같은 수가 나옴
			}
		}
		if( isSame ) {
			System.out.println( "모든 참가자의 주사위 값이 같습니다. 비김" );
			return; // method를 종료 시킴 return에 값을 안주려면 method의 타입이 void여야 한다
		}
		
		// 가장 큰 주사위 값을 가지고 있는 사람들이 이긴다.
		for( int i = 0 ; i < diceNum.length ; i++ ) {
			if( diceNum[i] == max ) {
				System.out.printf( "%s 승 " , names[i] );
			}
		}
				
		
	}
	
	
	
}





// 2명의 참가자가 게임을 할때
//class Dice{
//	
//	int getDice( String name ) {
//		int num = (int)( Math.random() * 6 + 1 );
//		System.out.println( name + "주사위 : " + num );
//		return num;
//	}
//	
//	void result( int 서 , int 전 ) {
//		if( 서 > 전 ) {
//			System.out.println( " 석완 승, 형준 패 " );
//		}
//		else if( 서 < 전 ) {
//			System.out.println( " 석완 패, 형준 승 " );
//		}
//		else {
//			System.out.println( "비김" );
//		}
//	}
//}


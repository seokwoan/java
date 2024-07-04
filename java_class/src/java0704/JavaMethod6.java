package java0704;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) {
		
		// ��ǻ�Ϳ� ���������� �ϱ�
		// ��ǻ���� ���������� ���� comInput method�� ����Ѵ�.
		// ������ ������������ �ѱ۷� �Է��Ѵ�.
		// ��, ��, �п� ���� ����Ѵ�.
		// method - ���� ���������� �Է��ϰ� �����ϴ� method
		// 		  - ��ǻ�Ϳ� ���Ͽ� ��� ����ϴ� method
		// Game class�� �ʿ��� ������ method�ۼ�
		// main method������ Game class�� ��ü�� method�鸸 ����

		Game game = new Game();
		game.comInput();
		game.userInput();
		game.winner();
		
		game.play(); // play method���� comInput, userInput, winner method�� ���� �����Ŵ
					 // 3���� method�� ���� �������� �ʰ� ��� ���� ����
	
	}

}

class Game{ // rock - paper - scissors ����
	
	String com;
	String user;
	
	void comInput() {
		int temp = (int) ( Math.random() * 3 );
		switch ( temp ) {
			case 0 : this.com = "����"; break;
			case 1 : this.com = "����"; break;
			case 2 : this.com = "��"; break;
		}
	}
	
	void play() { // play��� method�� ������ְ� �� method���� �ٸ� method�� �����Ű�� methodȣ�� �ѹ����� ����
		comInput();
		userInput();
		winner();
	}
	
	
	void userInput() {
		Scanner rps = new Scanner(System.in);
		System.out.print( "\n����~ ����~ ��! : " );
		this.user = rps.nextLine();
		// this.user�� ǥ���ϴ� ������ ����ϴ� ��ü�� ������ ����Ѱ��̴� ��� ǥ���� ���ִ°�
	}
	
	void winner() {
//		if( this.com.equals(this.user) ) {
//			System.out.printf( " ��ǻ�� %s ���� %s ���º��Դϴ�. " , this.com , this.user );
//		}
//		else if( this.com.equals( "����" ) ) {
//			if( this.user.equals( "��" ) ) {
//				System.out.printf( " ��ǻ�� %s ���� %s ��ǻ�� �¸� " , this.com , this.user );
//			}
//			else {
//				System.out.printf( " ��ǻ�� %s ���� %s ���� �¸� " , this.com , this.user );
//			}
//		}
//		else if( this.com.equals( "����" ) ) {
//			if( this.user.equals( "����" ) ) {
//				System.out.printf( " ��ǻ�� %s ���� %s ��ǻ�� �¸� " , this.com , this.user );
//			}
//			else {
//				System.out.printf( " ��ǻ�� %s ���� %s ���� �¸� " , this.com , this.user );
//			}
//		}	
//		else if	( this.com.equals( "��" ) ) {
//			if( this.user.equals( "����" ) ) {
//				System.out.printf( " ��ǻ�� %s ���� %s ��ǻ�� �¸� " , this.com , this.user );
//			}
//			else {
//				System.out.printf( " ��ǻ�� %s ���� %s ���� �¸� " , this.com , this.user );
//			}
//		}
		switch( this.com ) {
			case "����" :
				switch( this.user ) {
					case "����" : 
						System.out.printf( " ��ǻ�� %s ���� %s ���º��Դϴ�. " , this.com , this.user );
						break;
					case "����" :
						System.out.printf( " ��ǻ�� %s ���� %s ���� �¸� " , this.com , this.user );
						break;
					case "��" :
						System.out.printf( " ��ǻ�� %s ���� %s ��ǻ�� �¸� " , this.com , this.user );
						break;
				}
				break;
			case "����" :
				switch( this.user ) {
					case "����" : 
						System.out.printf( " ��ǻ�� %s ���� %s ��ǻ�� �¸�. " , this.com , this.user );
						break;
					case "����" :
						System.out.printf( " ��ǻ�� %s ���� %s ���º��Դϴ�. " , this.com , this.user );
						break;
					case "��" :
						System.out.printf( " ��ǻ�� %s ���� %s ���� �¸� " , this.com , this.user );
						break;
				}
				break;
			case "��" :
				switch( this.user ) {
					case "����" : 
						System.out.printf( " ��ǻ�� %s ���� %s ���� �¸�. " , this.com , this.user );
						break;
					case "����" :
						System.out.printf( " ��ǻ�� %s ���� %s ��ǻ�� �¸�. " , this.com , this.user );
						break;
					case "��" :
						System.out.printf( " ��ǻ�� %s ���� %s ���º��Դϴ�. " , this.com , this.user );
						break;
				}	
		}
	}
	
	
}

// ������ Ǯ��
// void result() {
//	 if( user.equals(com) ) {
//		 System.out.println( "���" );
//	 }
//	 else if( user.equals( "����" ) && com.equals( "��" ) ||
//			  user.equals( "����" ) && com.equals( "����" ) ||
//			  user.equals( "��" ) && com.equals( "����" ) ) {
//		 System.out.println( "���� �� , ��ǻ�� ��" );
//	 }
//	 else {
//		 System.out.println( "��ǻ�� ��, ���� ��" );
//	 }
// }











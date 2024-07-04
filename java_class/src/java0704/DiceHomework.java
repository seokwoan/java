package java0704;

import java.util.Arrays;
import java.util.Scanner;

public class DiceHomework {

	public static void main(String[] args) {
		
		// 2�� �̻��� �����ڰ� ������ �Ҷ�
		DiceGame game = new DiceGame();
		game.init();
		game.diceThrow();
		game.result();
		

		
		// 2���� �����ڰ� ������ �Ҷ�
//		Dice game = new Dice();
//		
//		int ���� = game.getDice( "����" );
//		int ���� = game.getDice( "����" );
//		game.result( ���� , ���� );
		

	}

}

// 2���̻��� �����ڰ� ������ �Ҷ�
class DiceGame{ // �����ο� ������� �������� ����, class���ο��� ���� ó�� �����ϰ� �ڵ� �ۼ�
	
	String[] names; // ������ ������ �ʰ� �迭 ����
	int[] diceNum;
	
	void init() {
		Scanner sc = new Scanner(System.in);
		System.out.print( "�ֻ��� ���� �����ο� : " );
		int cnt = sc.nextInt();
		this.names = new String[cnt]; // �����ο��� �°� �迭�� ������ �������
		this.diceNum = new int[cnt];
		sc.nextLine(); // nextInt �Է��� �Է��� enter�� ���ۿ� �����־� ���۸� �����
		for( int i = 0 ; i < names.length ; i++ ) {
			System.out.print( "������ �̸� : " );
			names[i] = sc.nextLine();
		}
	}
	
	void diceThrow() {
		for( int i = 0 ; i < names.length ; i++ ) {
			this.diceNum[i] = (int) ( Math.random() * 6 + 1 );
			System.out.printf( " %s �ֻ��� : %d\n", this.names[i] , this.diceNum[i] );
		}
	}
	
	void result() { // �ֻ��� ��� - �ֻ��� ���� ũ�� �̱��.
		// ���� ū �ֻ��� �� ã��
		int max = 0;
		for( int num : diceNum ) {
			if( max < num ) {
				max = num;
			}
		}
		// ��� �����ڵ��� �ֻ��� ���� ���ٸ� 
		boolean isSame = true;
		for( int num : diceNum ) { // max�� ���� dice�� ���� ��
			if( num != max ) { // �ٸ��� �ϳ��� ������ isSame�� ����
				isSame = false; // ��ΰ� ������ ������� ����
				// �����̸� ���� ����� �¸� ���̸� ��� ���� ���� ����
			}
		}
		if( isSame ) {
			System.out.println( "��� �������� �ֻ��� ���� �����ϴ�. ���" );
			return; // method�� ���� ��Ŵ return�� ���� ���ַ��� method�� Ÿ���� void���� �Ѵ�
		}
		
		// ���� ū �ֻ��� ���� ������ �ִ� ������� �̱��.
		for( int i = 0 ; i < diceNum.length ; i++ ) {
			if( diceNum[i] == max ) {
				System.out.printf( "%s �� " , names[i] );
			}
		}
				
		
	}
	
	
	
}





// 2���� �����ڰ� ������ �Ҷ�
//class Dice{
//	
//	int getDice( String name ) {
//		int num = (int)( Math.random() * 6 + 1 );
//		System.out.println( name + "�ֻ��� : " + num );
//		return num;
//	}
//	
//	void result( int �� , int �� ) {
//		if( �� > �� ) {
//			System.out.println( " ���� ��, ���� �� " );
//		}
//		else if( �� < �� ) {
//			System.out.println( " ���� ��, ���� �� " );
//		}
//		else {
//			System.out.println( "���" );
//		}
//	}
//}


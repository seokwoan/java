package java0627;

import java.util.Scanner;

public class java0627_loop {

	public static void main(String[] args) {

		// �ݺ��� for, while, do~while
		// for( �ʱⰪ ; ���ǽ� ; ������ ) { �ݺ����� }
		// ���ǽ��� ������ �ɋ����� �߰�ȣ���� ������ ��� ����ȴ�.
		// �ʱⰪ -> ���ǽĺ� -> �� -> �߰�ȣ���� -> ������ -> ���ǽĺ� -> �� -> �߰�ȣ���� -> ������ -> ���ǽĺ� -> ���� -> ��
//		for ( int i = 1 ; i < 10 ; i++ ) {
//			int k = 2 * i - 1;
//			System.out.printf( "��... �ݺ���....%d\n" , k );
//		}
//		
//		for ( int i = 1 ; i < 18 ; i += 2 ) {
//			System.out.println( "��... �ݺ���...." + i );
//		}
//		
//		for ( int i = 1 ; i < 18; i++) {
//			System.out.printf( "��... �ݺ���....%d\n" , i );
//			i++;
//		}
//		
//		for ( int i = 10 ; i > 0 ; i--) {
//			System.out.printf( "%d\n" , i );
//		}

		
		int num = 1;
//		int a = 1;	
//		num += a; 
//		System.out.printf( "%d\n" , num );
//		a++;
//		num += a;
//		System.out.printf( "%d\n" , num );
//		a++;
//		num += a;
//		System.out.printf( "%d\n" , num );
		
		
		for ( int a = 1 ; a < 4 ; a++) {
			num += a;
			System.out.printf( "%d\n" , num );
		}
		
		
		// 1���� ���� �Է��� ���ڱ����� ������ ���ϼ���.
		
		int sum = 0;
		Scanner number = new Scanner(System.in);
		System.out.print( "���ڸ� �Է��ϼ��� : " );
		int calcNum = number.nextInt();
		
		for( int i = 1; i <= calcNum ; i++) {
			sum += i;
		}
		
		System.out.printf( "%d\n" , sum );
		
		
		
		
	}

}













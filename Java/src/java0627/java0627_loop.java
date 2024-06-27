package java0627;

import java.util.Scanner;

public class java0627_loop {

	public static void main(String[] args) {

		// 반복문 for, while, do~while
		// for( 초기값 ; 조건식 ; 증감식 ) { 반복내용 }
		// 조건식이 거짓이 될떄까지 중괄호안의 내용이 계속 실행된다.
		// 초기값 -> 조건식비교 -> 참 -> 중괄호실핼 -> 증감식 -> 조건식비교 -> 참 -> 중괄호실행 -> 증감식 -> 조건식비교 -> 거짓 -> 끝
//		for ( int i = 1 ; i < 10 ; i++ ) {
//			int k = 2 * i - 1;
//			System.out.printf( "아... 반복문....%d\n" , k );
//		}
//		
//		for ( int i = 1 ; i < 18 ; i += 2 ) {
//			System.out.println( "아... 반복문...." + i );
//		}
//		
//		for ( int i = 1 ; i < 18; i++) {
//			System.out.printf( "아... 반복문....%d\n" , i );
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
		
		
		// 1부터 내가 입력한 숫자까지의 총합을 구하세요.
		
		int sum = 0;
		Scanner number = new Scanner(System.in);
		System.out.print( "숫자를 입력하세요 : " );
		int calcNum = number.nextInt();
		
		for( int i = 1; i <= calcNum ; i++) {
			sum += i;
		}
		
		System.out.printf( "%d\n" , sum );
		
		
		
		
	}

}













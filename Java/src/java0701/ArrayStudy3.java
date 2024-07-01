package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy3 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
//		// 배열에 20개의 랜덤 숫자 (랜덤 범위 1~30)
//		// 배열에 저장된 데이터 중에서 5의 배수는 몇개인지 출력하기
//		
//		int[] number = new int[20];
//		// 배열의 크기를 코드에서 정해주는것보다는 프로그램 실행시 변하게 해주는게 좋다
//		// 정수로 크기를 정하면 컴파일을 다시하고 테스트를 다시 해야함
//		// 변수 또는 메소드를 이용해 실행시 변하게 해주는 방식을 많이 사용
//		int five = 0;
//		
//		for ( int i = 0 ; i < number.length ; i++ ) {
//			number[i] = (int) (Math.random() * 30 + 1) ;
//			// 강제형변환을 하는 경우는 데이터타입이 큰 쪽에서 작은쪽으로 저장될때 해준다. 
//		}
//		
//		for( int i = 0 ; i < number.length ; i++ ) {
//			if( number[i]%5 == 0) {
//				five++;
//			}
//		}
//		
//		System.out.println( Arrays.toString(number));
//		System.out.printf( "5의 배수는 %d개 입니다" , five );
		
		// 배열 생성방법, 배열 데이터 저장 방법, 배열에 저장된 데이터 추출 또는 출력
		// 배열은 공간이 연속적으로 저장되어있어 순차적으로 사용할때 속도가 빠르다.
		// 순차적이 아닌 작업의 경우는 유의미한 속도를 가지지 않는다.
		
		
		
		// 빙고
		
		// 빙고 게임 만들기 
		// 1. 25크기의 배열 선언
		// 2. 뱅열에 랜덤숫자 저장
		// 3. 중복없이 저장하게 만들기
		// 4. 25개의 숫자를 화면에 출력
		// 5. 게임시작 - 숫자 선택( 입력)
		// 6. 선택한 숫자 위치에 표시하기
		// 7. 몇 줄 빙고인지 확인하기
		// 8. 빙고판 화면에 출력
		// 9. 5~8번 반복
		
		
		int[] bingo = new int[25];
		
		// 25개의 숫자 중복없이
		for ( int i = 0 ; i < bingo.length ; i++ ) {
			bingo[i] = (int) ( Math.random() * 50 + 1 );
			for( int k = 0 ; k < i ; k++ ) {
				if( bingo[k] == bingo[i] ) {
					i--; // 중복이면 i의 값을 1감소 시켜 i++의 증감식을 상쇄시켜
					// 중복된 index의 값을 다시 실행하게 함
					// for문 안의 if문으로 증감식의 값만큼 감소시켜 for문의 제어가 가능
					break;
				}
			}
		}
		
		while(true) {
		// 5줄 5칸 출력
			for( int i = 0 ; i < bingo.length ; i++ ) {
				if( i % 5 == 0 ) {
					System.out.println();
				}
				if( bingo[i] == 0 ) {
					System.out.printf( " %2c ", '■' );
				}
				else {
					System.out.printf( " %2d " , bingo[i]); // %2d에서 2는 자리수 
				}
			}
			
			System.out.print( "\n빙고 숫자 입력 : " );
			int num = scan.nextInt();
			
			// 선택한 숫자 표시하기
			for( int i = 0 ; i < bingo.length ; i++ ) {
				if( num == bingo[i] ) {
					bingo[i] = 0;
					break;
				}
			}
			
			// 빙고 줄수 표현 몇줄 빙고냐
			int 가로 = 0 , 세로 = 0 , 대각선1 = 0 , 대각선2 = 0 , end = 0;
			
			for ( int i = 0 ; i < 5 ; i++ ) {
				for ( int k = 0 ; k < 5 ; k++ ) {
					if ( bingo[ i * 5 + k ] == 0 ) {
						가로++;
					}
					if ( bingo[ i + k * 5 ] == 0 ) {
						세로++;
					}
				}	
				
				if( i * 6 == 0 ) {
					대각선1++;
				}
				
				if ( i * 4 + 4 == 0 ) {
					대각선2++;
				}
					
				if( 가로 == 5 ) { // 행방향에 0이 5개라면 1줄 빙고
					end++;
				}
				
				if( 세로 == 5 ) { // 열방향에 0이 5개라면 1줄 빙고
					end++;
				}
				
				if( 대각선1 == 5) {
					end++;
				}
				
				if( 대각선2 == 5 ) {
					end++;
				}
				
				가로 = 0;
				세로 = 0;
				
			}
			
			if( end == 5 ) { // 5줄 빙고
				System.out.println( "5줄 빙고 완성!" );
				break;
			}
		}	

	}

}




























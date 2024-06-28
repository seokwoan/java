package java0627;

import java.util.Scanner;

public class java0627_loop {
	
	static Scanner sc = new Scanner(System.in); // void main의 위에 변수를 만들면 static을 붙여줘야함

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

		
//		int num = 1;
//		int a = 1;	
//		num += a; 
//		System.out.printf( "%d\n" , num );
//		a++;
//		num += a;
//		System.out.printf( "%d\n" , num );
//		a++;
//		num += a;
//		System.out.printf( "%d\n" , num );
		
		
//		for ( int a = 1 ; a < 4 ; a++) {
//			num += a;
//			System.out.printf( "%d\n" , num );
//		}
		
		
		// 1부터 내가 입력한 숫자까지의 총합을 구하세요.
		
//		int sum = 0;
//		Scanner number = new Scanner(System.in);
//		System.out.print( "숫자를 입력하세요 : " );
//		int calcNum = number.nextInt();
//		
//		for( int i = 1; i <= calcNum ; i++) {
//			sum += i;
//		}
//		
//		System.out.printf( "%d\n" , sum );
		
//		for( int i = 1; true ; i++) { // for문에 조건식을 넣지 않거나 true로 설정하면 for문이 무한루프한다
//			if( i > 10000) break;  // if로 break;를 실행할 조건을 정해주면 무한루프가 끝난다.
//				System.out.println(i);
//		}
		
		// 반복문을 작성하려면 몇번 반복되는가, 언제 반복문이 종료되어야 하는가
		// 반복문 종료시점에 대해서 먼저 생각해야한다.
		// for문, while문, do~while문 모두 언제 반복이 끝나야하는가를 
		// 찾지 못하면 작성할 수 없다.(무한루프, n번 반복으로 원하는 반복횟수를 실행할 수 없다.)
		
		// 무한루프를 종료시키는 방법
		// 1. if문의 조건식이 참이되면 break; 실행
		// 2. for ( ; 조건식 ; ) 반복문의 조건식으로 
		// 3. return; 반복문코드가 있는 메서드를 종료시키기 때문에 반복문도 종료된다.
		// 4. break; 반복문, switch 사용가능 , if문 단독으로 break 사용 불가
		// if( 10 > 5 ) break; -> 오류 반복문 or switch문에 있어야 사용가능 
		
		
		
		// if로 반복문 무한루프 멈춤 1번 
//		for( ; true ; ) {
//			System.out.print("정수입력 : ");
//			int num = sc.nextInt();
//			if( num == 10) {
//				break;
//			}
//		}
		
		// 반복문의 조건식으로 무한루프 멈춤 2번
		
//		int num1 = -1;
//		for( ; num1 != 20 ; ) {
//			System.out.print("정수입력 : ");
//			num1 = sc.nextInt();
//		}

		
		// continue; 반복문의 흐름을 다음 반복으로 넘김
//		for ( int i = 1 ; i <= 10 ; i++ ) {
//			System.out.println( i + "번째 반복 시작" );
//			if( i%3 == 0 ) {
//				continue; 
//				// 반복중 continue;가 있으면 현재 반복의 남은 내용을 실행하지 않고 다음 반복이 실행됨
//				// 
//			}
//			System.out.println( i + "번째 반복 진행중" );
//			System.out.println( i + "번째 반복 마지막내용" );
//		}
		
		// 자바의 랜덤
//		int random = (int)Math.floor(Math.random() * 10 + 1);
		// 랜덤값을 설정할때 java는 데이터타입이 있어 random함수의 값이 실수로 나오기 때문에 형변환을 해줌
		// Math.random() -> 실수이기때문에 Math.floor의 값도 실수
		// int로 정수의 값을 저장하기 위해 int로 형변환
		
		
		
		// 랜덤의 범위 ( 1~50 ) 
		// 랜덤 값 계속 출력
		// 랜덤값이 11의 배수일 경우 반복문 종료
		
//		for ( ; true ; ) {
//			// int random = (int)Math.floor(Math.random() * 50 + 1);
//			
//			// double random = Math.floor(Math.random() * 50 + 1);
//			// 변수타입을 double로 만들면 형변환이 필요없다.
//			
//			// int random = Integer.parseInt( Math.random() * 50 + 1 );
//			// java에서 parseInt는 문자열을 정수로 만들때 사용 위의 경우 오류
//			int random = (int)( Math.random() * 50 + 1 );
//			// java는 타입이 존재해서 랜덤값을 바로 int로 형변환 해주면 Math.floor가 필요 없다
//			
//			System.out.println( "랜덤값은 : " + random );
//			if( random%11 == 0 ) {
//				break;
//			}
//		}
		
		// up & down 만들기
		// 컴퓨터가 제시한 숫자 맞추기
		// 컴푸터가 제시하는 숫자는 랜덤으로 ( 랜덤범위 20 ~ 100 )
		// 컴퓨터가 제시한 숫자가 74라면 
		// 내가 입력한 숫자가 40일 경우 up이라고 출력
		// 내가 입력한 숫자가 80일 경우 down이라고 출력
		
//		int comNum = (int)( Math.random() * 81 + 20 );
//		int userNum = 0;
//		for( ; true ; ) {
//			//if( userNum == 0 ) { // 숫자의 범위를 알려줌
//			//	System.out.println( "숫자의 범위는 20~100 입니다. " );
//			//} -> 숫자를 입력 받을때 범위를 알려주면 필요 없는 부분
//			System.out.print( "숫자를 입력하세요 : " );
//			userNum = sc.nextInt();
//			if( userNum < 20 || userNum > 100 ) {
//				System.out.println( "숫자의 범위는 20~100 입니다. " );
//				userNum = -1; // 0을 넣으면 숫자의 범위가 2번 나오는걸 막기위해
//				// 숫자를 입력받을때 범위를 알려주면 필요 없는 동작
//				continue; // 범위외의 숫자면 up, down, 정답 실행 안함
//			}
//			if( userNum > comNum ) {
//				System.out.println( "Down" );
//			}
//			else if ( userNum < comNum ) {
//				System.out.println( "Up" );
//			}
//			else {
//				System.out.println( "정답" );
//				break;
//			}
//		}
		
		
		// 이름이 있는 반복문 
		
		int sum = 0;
		
		// for문의 이름을 더하기로 만듬		
		더하기 : for( int i = 1 ; i <= 10 ; i++ ) {
			for ( int k = 1 ; k <= 4 ; k++) {
				if( sum + k >= 40) break 더하기; // 더하기라는 이름을 가진 for문이 멈춤
											   // continue도 가능함
				sum += k;
				System.out.println( i + " " + k );
			} // for문의 중첩에서 하위 for문이 break로 멈춰도 상위for문은 멈추지 않음
			System.out.println( i );
			sum += i ;
		}
		
		if( sum < 40 ) {
			System.out.println( "sum 출력 : " + sum );
		}

		// 베스킨라빈스 31
		// 컴퓨터와 나하고 둘이 한다.
		// 한번에 제시할 수있느  숫자는 최소 1개, 최대 3개
		// 31을 입력하면 패배
		
		int num = 1;
		for( ; ; ) {
			System.out.print( "숫자 몇개 : " );
			int user = sc.nextInt();
			System.out.print( "나 : ");
			for( int u = 1 ; u <= user ; u++) {
				System.out.println( num + " ");
				if ( num == 31 ) break;
				num++;
			}
			if ( num == 31 ) break;
			System.out.println();
			
			int com = (int)( Math.random() *3 + 1);
			System.out.print( "com : ");
			for( int c = 1 ; c <= com ; c++) {
				System.out.println( num + " ");
				if ( num == 31 ) break;
				num++;
			}
			if ( num == 31 ) break;
			System.out.println();
		}
		
//		베스킨 : 
//		for( ; ; ) {
//			System.out.print( "숫자 몇개 : " );
//			int user = sc.nextInt();
//			System.out.print( "나 : ");
//			for( int u = 1 ; u <= user ; u++) {
//				System.out.println( num + " ");
//				if ( num == 31 ) break 베스킨;
//				num++;
//			}
//			System.out.println();
//			
//			int com = (int)( Math.random() *3 + 1);
//			System.out.print( "com : ");
//			for( int c = 1 ; c <= com ; c++) {
//				System.out.println( num + " ");
//				if ( num == 31 ) break 베스킨;
//				num++;
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
	}

}
























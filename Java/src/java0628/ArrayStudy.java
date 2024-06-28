package java0628;

import java.util.Arrays;

public class ArrayStudy {

	public static void main(String[] args) {
		// 배열 - 같은 데이터타입의 데이터가 저장되는 공간이 연속적으로 되어있는 구조
		// 배열을 만들때 지정한 데이터타입의 데이터만 저장이 가능
		//  int -> 정수만 저장 가능
		
		int[] a = { 10, 20, 30 }; 
		// 데이터타입[] 변수명 = { 저장할 데이터 };
		// 배열을 만들때 데이터타입옆에 대괄호를 입력함 데이터 저장은 중괄호
		// 데이터타입[대괄호] 변수명 = {중괄호};
		System.out.println( a[0] + " " + a[1] );
		// 배열의 인덱스 표현은 [대괄호]
		
		int b[] = { 30, 40, 50 };
		// 변수명 옆에 [대괄호]를 붙여도 배열이 만들어짐
		
		// java는 배열에 데이터 추가, 제거가 불가능함 만들어진 배열의 데이터가 고정됨
		System.out.println( a );
		// java에서 배열의 변수를 입력하면 데이터 메모리주소가 나옴
		System.out.println( Arrays.toString(a) );
		// Arrays.toString 배열의 값을 문자열로 보여줌
		
		int[] arr = new int[10];
		// int[] 변수명 = new int[배열의 공간];
		// 배열의 공간 10개 생성
		
		int[] brr = new int[]{10,20,30,40};
		// 이미 데이터가 있는 배열을 만들때도 이렇게 만들어줌
		
		int size = 15;
		
		int[] arr2 = new int[size];
		// 변수를 통해 배열의 크기를 정할수 있음
		
		System.out.println( arr2[0] );
		// 생성된 배열에는 0이 들어있음
		
		// int[] arr2 = new int[];
		// 배열의 공간을 넣어줘야함 공백으로 만들면 오류
		
		// 위에 만든 배열은 크기가 정해진 정적배열 크기가 정해져 있어 데이터공간 추가, 삭제 불가능
		
		// 배열 생성 방법
		// 데이터타입[] 배열이름 = new 데이터타입[배열크기];
		int[] money = new int[5]; // 5개의 int타입 공간을 가진 배열
		money[0] = 5000;
		money[1] = 12000;
		money[2] = 4000;
		money[3] = 43000;
		money[4] = 50000;
		
		for( int i = 0 ; i < money.length ; i++ ) {
			if ( money[i] >= 10000 ) {
			System.out.println( money[i] );
			}
		}
		
		
		int[] A반 = new int[3];
		
		A반[0] = 89;
		A반[1] = 78;
		A반[2] = 93;
		
		int[] B반 = new int[3];
		B반[0] = 56;
		B반[1] = 84;
		B반[2] = 72;
		
		System.out.println( "A반 성적 : " + Arrays.toString(A반) );
		System.out.println( "B반 성적 : " + Arrays.toString(B반) );
		
		// A반, B반 성적중에서 80점 이상만 출력
		for( int i = 0 ; i < A반.length ; i++ ) {
			if( A반[i] >= 80 ) {
				System.out.println( A반[i] );
			}
			if( B반[i] >= 80 ) {
				System.out.println( B반[i] );
			}
		}
		
		// 두개의 배열을 합쳐줌
		int[] 일학년 = new int[ A반.length + B반.length ]; // 배열의 크기를 정함
		
		// 3번 반복
//		for( int i = 0 ; i <  A반.length ; i++ ) {
//			일학년[i] = A반[i];
//			일학년[i+3] = B반[i];
//		}
		
		// 6번 반복
//		for( int i = 0 ; i < 일학년.length ; i++ ) {
//			if ( i < 3) {
//				일학년[i] = A반[i];
//			}
//			else {
//				일학년[i] = B반[i-3];
//			}	
//		}
		
		// method사용 
		System.arraycopy( A반 , 0 , 일학년 , 0 , A반.length );
		System.arraycopy( B반 , 0 , 일학년 , 3 , B반.length ); // A반의 데이터가 일학년에 이미 들어있기때문
		// 배열복사 -> 배열의 값을 복사해서 다른 배열에 넣어주는 method
		// 같은 타입의 배열만 가능
		// System.arraycopy (복사할배열(a), a에서 복사를 시작할 인덱스 , 저장할 배열(b) , b에서 저장 시작 위치의 인덱스, 복사할 데이터 수( a시작 인덱스에서 몇번 인덱스까지 ));
		
		for ( int i = 0 ; i < 일학년.length ; i++) {
			if( 일학년[i] >= 80 ) {
				System.out.println( 일학년[i] );
			}
		}
		
		Arrays.sort( 일학년 );  // 배열의 데이터값 정렬 오름차순
		System.out.println( Arrays.toString( 일학년 ) );
		boolean same = Arrays.equals( A반 , B반 ); // 배열의 같은 배열인지 확인하는 method
		System.out.println( "A반, B반 배열이 같은가? " + same );

	}

}






































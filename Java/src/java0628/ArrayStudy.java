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
		
		// 위에 만든 배열은 크기가 정해진 정적배열 크기가 정해져 있어 데이터추가, 삭제 불가능
		
		// 배열 생성 방법
		// 데이터타입[] 배열이름 = new 데이터타입[배열크기];
		int[] money = new int[5]; // 5개의 int타입 공간을 가진 배열
		money[0] = 5000;
		money[1] = 12000;
		money[2] = 4000;
		money[3] = 43000;
		money[4] = 50000;
		
		for( int i = 0 ; i < money.length ; i++ ) {
			
			System.out.println( money[i] );
		}
		
		
		
		

	}

}






































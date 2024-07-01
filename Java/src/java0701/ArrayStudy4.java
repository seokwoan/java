package java0701;

import java.util.Arrays;

public class ArrayStudy4 {

	public static void main(String[] args) {
	
		// 많은 양의 데이터를 다룰때는 배열을 사용한다.
		// 상황에 따라서는 배열을 쓰면 안되는 경우도 있지만
		// 보통은 배열의 구조에 데이터를 저장한다. 
		
		// 동적 배열 만들기
		// 자바에서는 배열의 크기가 변하지 않음. 변하게 보이는것처럼 만들어줌
		// 크기가 변하는 자료구조가 따로 있음 
		
		// 동적 배열
		// 기존의 배열 크기를 늘리거나 줄여서 사용하는 배열
		
//		int[] a = new  int[5];
//		
//		a[0] = 10; 
//		a[1] = 20;
//		
//		System.out.println( Arrays.toString(a) );
//		
//		
//		a = new int[7]; 
//		// new를 통해 배열의 크기를 늘리면 새로운 공간을 만들어서 기존 배열의 값이 넘어오지 않음 
//		a[5] = 100;
//		System.out.println( Arrays.toString(a) );
		
		int[] num = new int[] { 10, 20, 30, 40, 50 };
		
		// 데이터를 추가로 더 저장하려면 배열의 크기를 늘려야한다.
		int size = num.length; // 기존 배열의 크기
		
		int[] temp = new int[ size+1 ]; // 기존 배열+1의 크기, 상관관계 없음
		
		for( int i = 0 ; i < size ; i++) {
			temp[i] = num[i];  // 기존 배열의 값을 넣어줌
		}
		
		num = temp; // 배열이 같다?
		num[5] = 60;
		System.out.println( Arrays.toString( num ) );
		
		// 문자열에서 같다 비교는 .equals()로 한다. 
		// 문자열에 특정문자나 문자열 포함여부는 .contains()
		// 다음 주소중 선화동에 주소만 추출하여 배열에 저장하세요
		// 배열에 잘 저장되었는지 확인 출력은 Arrays 이용하여 출력
		
		String[] addr = new String[] {
				"대전 중구 선화동 25" , "대전 중구 선화동 92" , "대전 서구 둔산동 11" , 
				"대전 서구 둔산동 1023" , "대전 유성구 노은동 93" , "대전 중구 대흥동 932" , 
				"대전 동구 가양동 945" , "대전 중구 선화동 1234" , "대전 중구 대흥동 23" , 
				"대전 중구 선화동 984"
		};
		
		System.out.println( addr[1].contains( "선화동" ) );
		
		
		int length = 0; 
		
		for( int i = 0 ; i < addr.length ; i++) {
			if( addr[i].contains("선화동") ) {
				length++;
			}
		}
		
		String[] 선화동 = new String[length];
		

		
		System.out.println( Arrays.toString(선화동) );
		
		
		
	}

}























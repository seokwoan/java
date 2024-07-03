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
		
		num = temp; // 배열이 같다? 배열의 인덱스 데이터 값이 같다.
		// num에 temp의 주소값이 저장되어 temp의 주소값을 가져오는데 
		// num배열의 인덱스와 temp배열의 인덱스에 같은 값을 넣어주는 for문을 돌려서 
		// temp의 주소값을 가져와도 같은 인덱스에 같은 값을 가지고 있어서 배열의 크기가 늘어난것처럼 보인다. 
		num[5] = 60;
		System.out.println( Arrays.toString( num ) );
		
		// 문자열에서 같다 비교는 .equals()로 한다. - 문자열.equals(비교문자열)
		// 문자열에 특정문자나 문자열 포함여부는 .contains() - 문자열.contains(타겟문자열)
		// 다음 주소중 선화동에 주소만 추출하여 배열에 저장하세요
		// 배열에 잘 저장되었는지 확인 출력은 Arrays 이용하여 출력
		
		String[] addr = new String[] {
				"대전 중구 선화동 25" , "대전 중구 선화동 92" , "대전 서구 둔산동 11" , 
				"대전 서구 둔산동 1023" , "대전 유성구 노은동 93" , "대전 중구 대흥동 932" , 
				"대전 동구 가양동 945" , "대전 중구 선화동 1234" , "대전 중구 대흥동 23" , 
				"대전 중구 선화동 984"
		};

		int length = 0; 
		int 선화 = 0;
		
		for( int i = 0 ; i < addr.length ; i++) {
			if( addr[i].contains("선화동") ) {
				length++;
			}
		}
		
		String[] 선화동 = new String[length];
		
		for ( int i = 0 ; i < addr.length ; i++ ) {
			if( addr[i].contains("선화동") ) {
				선화동[선화++] = addr[i]; // ++이 뒤에 있으면 우선순위가 낮아 대입연산자 다음작동 
				//선화++;
			}
		}
		
		System.out.println( Arrays.toString(선화동) );
		
		
		// 2차원 배열 
		// 1차원 배열의 공간에 1차원 배열을 연결해놓은 구조
		
		int[][] arr = new int[2][3];
		// java에서 2차원배열은 index가 2개이기 때문에 []를 2개 넣어준다
		// int[][] 변수명 = new int[length][length];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		
		// System.out.println( Arrays.toString(arr) ); 
		// 2차원 배열의 경우 index를 입력하지 않으면 각 1차원 배열의 주소가 나온다.
		
		// 고등학교 1학년 학생들의 성적
		// 1학년은 1반부터 6반까지 있다.
		
		// new int[6][30];
		// 데이터의 종류가 다양하면 배열을 사용하지 않음
		// 3차원 배열까지는 사용 4차원 이상은 거의 사용하지 않음
		// 1~3학년까지로 하면 3차원 배열
		// 대전 고등학교까지하면 4차원 배열
		// 전국 고등학교면 5차원 배열
		// 데이터 저장보다는 화면 표시를 위해 사용
		
		
		int[] a = new int[] {
				10, 20 ,30 ,40 ,50, 60, 70 ,80, 90, 100
		};
		
		for( int data : a ) { // for-each문 // javascript for-each문, jquery each문
			System.out.println( data );
		}// 배열 전용 for문
		// for( int 변수명 : 배열명){ (변수명) } 배열에서 데이터값을 순차적으로 빼올때 사용
		// index없이 데이터를 표현가능 index표현이 없어 index의 값은 알수 없음
		
		
		int[][] array1 = new int[2][3];
		System.out.println( array1.length ); // 행의 개수 2
		System.out.println( array1[0].length ); // index0(1행)의 열의 개수 3
		System.out.println( array1[1].length); // index1(2행)의 열의 개수 3
		System.out.println();
		
		int[][] array2 = new int[][] { { 1 , 2 } , { 3 , 4 , 5 } };
		System.out.println( array2.length ); // 행의 개수 2
		System.out.println( array2[0].length ); // index0(1행)의 열수 개수 2
		System.out.println( array2[1].length ); // index1(2행)의 열수 개수 3
		System.out.println();
		
		System.out.print( array2[0][0] + " " ); // array2의 0,0 index 1
		System.out.print( array2[0][1] + " " ); // array2의 0,1 index 2
		System.out.println();
		System.out.print( array2[1][0] + " " ); // array2의 1,0 index 3
		System.out.print( array2[1][1] + " " ); // array2의 1,1 index 4
		System.out.print( array2[1][2] + " " ); // array2의 1,2 index 5
		System.out.println();
		System.out.println();
		
		for( int i = 0 ; i < array2.length ; i++ ) {  // 행의 index
			for( int j = 0 ; j < array2[i].length ; j++ ) { // i행의 j index
				System.out.print( array2[i][j] + " " ); // 
			}
			System.out.println();
		}
		System.out.println();
		
		for ( int[] array : array2 ) { // for-each문 으로 array2의 행의 값을 array에 순차적 저장
									   // array2의 행 값이 배열이라 int[]로 배열생성
			for ( int k : array) { // array에 저장된 행의 열값을 순차적 저장
								   // array의 열 값이 정수라 변수에 대입
				System.out.print( k + " " ); // 출력
			}
			System.out.println();
		}
		
	}

}
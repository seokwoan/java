package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy2 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 과자 배열에 좋아하는 과자의 판매가격을 키보드로 입력하여 저장
		// 과자 배열에 저장된 판매가격들의 총 합과 평균을 구하세요
//		int[] 과자 = new int[5];
//		for ( int i = 0 ; i < 과자.length ; i++ ) {
//			System.out.printf( "%d번째 과자의 판매가격 : " , (i+1) );
//			과자[i] = scan.nextInt();
//		}
//		
//		int sum = 0;
//		int avg = 0;
//		for( int i = 0 ; i < 과자.length ; i++ ) {
//			sum += 과자[i];
//			
//		}
//		avg = sum / 과자.length ;
//		System.out.printf( "과자 판매금액의 총합 : %d \n과자 판매금액의 평균 : %d", sum , avg );
		
		
		// 6명의 키를 tall배열에 저장하였다.
		// 키 175 미만을 출력하세요
		
//		float[] tall = new float[] {173.4f, 175.1f, 169.5f, 181.4f, 178.8f, 185.3f};
//		
//		for ( int i = 0 ; i < tall.length ; i++ ) {
//			if( tall[i] < 175 ) {
//				System.out.println( tall[i] );
//			}
//		}
		
		// name 배열의 문자열중에서 이성계, 문익점, 정도전, 최영을
		// 선발대 배열에 저장하고 출력하세요
//		String[] name = new String[] {
//				"이순신" , "김유신" , "장보고" , "이성계" , "문익점" , "정도전" , 
//				"최영" , "양만춘"
//		};
//		
//		String[] 선발대 = new String[4];
//		
//		System.arraycopy( name , 3 , 선발대 , 0 , 4 );
//		System.out.println( Arrays.toString(선발대) );
		
		
//		String word = "i like banana";
//		// String은 class, word에 저장된 값은 String class의 객체
//		System.out.println( word.indexOf(" ") );
//		// 객체는 indexOf 사용 가능
//		// 위치를 찾기위해 사용
//		
//		word.contains( "orange" );
//		System.out.println( word.contains("bn") );
//		// 문자열에서 특정 문자나 문자열의 존재유무 - true, false
//		// 존재 유무의 판단을 위해 사용
//		
//		String[] a = new String[] { "banana" , "orange" };
//		// a.indexOf(); 사용 불가
//		// a는 배열일뿐이지 String class의 객체가 아니다.
//		// a[i]의 값은 문자열이므로? String의 객체?라서 쓸 수 있다? 
//		a[0].indexOf( "na" ); // n의 시작인 2가 나옴
//		a[1].contains( "ge" ); // ge를 포함하고 있어 true
		// 
		
//		String[] name = new String[] {
//				"김유신" , "한석봉" , "양만춘" , "김춘추" , "정도전" , "정약용" , 
//				"이순신" , "이사부" , "이사람" , "한가인"
//		};
//		
//		System.out.print("이름검색 : ");
//		String search = scan.nextLine();
//		
//		for( int i = 0 ; i < name.length ; i++) {
//			if( name[i].contains(search) ) {
//				System.out.println( "검색 결과 : " + name[i] );
//			}
//		}
		
		
		// 음료 검색하여 음료이름과 금액이 출력되게 하세요
		// 카페 배열에 없는 음료 검색시 죄송합니다. 준비중입니다. 라고 출력
		String[] 카페 = new String[] {
				"아메리카노 : 2000원" , "화이트 아메리카노 : 2800원" , "카페라떼 : 3000원" , 
				"돌체라떼 : 3800원" , "카페모카 : 3800원" , "수박주스 : 4000원" , 
				"써머아이스티 : 2900원" , "복숭아아이스티 : 2800원" , 
				"자두아이스티 : 2800원" , "유자에이드 : 3500원" , "레몬에이드  : 3500원" , 
				"청포도에이드 : 3500원"
		};
		
		System.out.print( "음료 검색 : " );
		String coffee = scan.nextLine();
		
		boolean isDrink = true;
		for( int i = 0 ; i < 카페.length ; i++ ) {
			if( 카페[i].indexOf( coffee ) != -1 ) {
				System.out.printf( "%s\n", 카페[i] );
			}
		}
		for( int i = 0 ; i < 카페.length ; i++  ) {
			if( 카페[i].indexOf( coffee ) == -1)
				System.out.print( "죄송합니다. 준비중입니다." );
				break;
				// 안에 있으면 계속 반복됨. 밖에 있어야함
		}

		
//		for( int i = 0 ; i < 카페.length ; i++ ) {
//			if( 카페[i].indexOf( coffee ) != -1 ) {
//				System.out.println( 카페[i] );
//				isDrink = false;
//			}
//		}
//		if( isDrink) {
//			System.out.println( "죄송합니다. 준비중입니다." );
//		}
		
		
	}

}

// 



















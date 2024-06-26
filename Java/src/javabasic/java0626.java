package javabasic;

public class java0626 {

	public static void main(String[] args) {
		// 자바 기본 구조 - 프로젝트 - 패키지 - 클래스 
		
		System.out.println("자바테스트"); // 출력
		// 코드실행 - 왼쪽ctrl + f11
		// 자바 변수 생성
		// 데이터타입 변수이름 = 데이터;
		// 자바는 같은 초기생성시 입력한 데이터타입의 데이터만 넣을수 있음
		// 데이터타입 = 숫자 -> 숫자만 가능
		// 데이터타입의 종류 : 정수, 실수, 문자 
		// 정수 - byte, short, int, long, char -> 가질수 있는 최대값이 다름 byte-> 127이 최대
		// 문자 - char(정수데이터, 문자데이터 둘다 저장가능)
		// 실수 - float, double
		byte num = 10; // 오류를 줄이기 위해서 타입을 지정하는게 좋음 변수데이터의 오류  // 1byte = 256의 숫자 표현가능 
		short num1 = 200; // 2byte = 65536의 숫자 표현가능
		int num2 = 3000;  // 4byte 숫자 표현가능 
		long num3 = 15l; // long은 저장데이터 뒤에 l을 넣어줘야 저장이됨 // 8byte 숫자 표현 가능
		
		char ch = 'a'; // 자바에서는 "" 는 문자열, ''는 문자를 의미함 구분해서 사용해야함
		// char cha = 'ab'; -> a,b 두개의 문자라서 저장이 불가능함
		
		float fnum = 3.14f; // float은 저장데이터 뒤에 반드시 f를 넣어줘야 저장이됨 소수점 6자리까지 표현가능
							// float을 double로 바꿔서 처리하고 다시 float으로 바꾸기 위해 뒤에 f를 넣어줌
		double dnum = 12.345; // double은 소수점 15자리까지 표현가능 표현가능한 자리수가 많을수록 정확도 상승
		fnum =35; // 실수데이터 타입에 정수 입력 가능
		
		boolean isTrue = false; // 참이냐 거짓이냐만 표현 가능한 데이터타입
		// 변수를 만들때 데이터타입을 지정하고 지정한 데이터타입으로만 변경가능
		// 문자열을 다루는 기본 데이터타입은 존재하지 않음
		// char타입으로 배열을 만들면 문자열을 만들수 있음
		
		String word = "이순신"; // 기본데이터 타입이 아닌 class다
		// class - 사용자 정의 타입 
		// class는 시작할때 문자로 시작한다
		
		// 사각형의 넓이를 구하시오. (밑변과 높이는 정수이다.)
		int width = 15;
		int height = 20;
		int area = width * height;
		System.out.println("넓이 : " + area);
		
		// 키보드를 30개 구매해야한다. 
		// hp게이밍키보드의 가격이 8000원 이라면 총 구매금액은 얼마인가?
		int keyboard = 30;
		int price = 8000;
		int total = keyboard * price ;
		System.out.println( "총 구매금액 : " + total );
		
		System.out.print( "Java 출력 방법 print" );
		System.out.print( "줄바꿈 안된다" );
		// println은 줄이 바뀜 ln -> line으로 print값이 한줄에 하나의 값(println으로 출력한 값)만 표시
		// print는 줄바꿈이 안됨 한줄에 여러개의 값(print로 출력한 값)이 나옴
		
		System.out.printf( "printf \n 출력" );
		// 서식문자 - 형식지정문자
		System.out.printf( "총 금액 : %d \n" , total );
		// printf는 출력 방법을 지정 printf( " " , )
		// %d가 형식지정자 -> 출력 위치에 %d를 입력하고 
		// %d -> 10진수 정수 표현
		// %u -> 10진수 정수 표현
		// %f -> 10진수 실수 표현
		// %c -> 문자표현
		// %s -> 문자열
		// %b -> boolean(false,true)
		// %o -> 8진수 표현
		// %x -> 16진수 정수 표현
		System.out.printf( "국어 : %d점 수학 : %d점 \n" , 80 , 90 );
		
		System.out.printf(" 나이 : %d 키 :  %f \n" , 34 , 172.3 );
		// 형식 지정자의 위치에 맞게 넣어줘야하 한다. %d는 정수이기에 3.14가 오류
		// printf의 "" 안의 데이터는 모두 문자열로 취급된다. 사칙연산 불가
		
		System.out.println( 172.315 );
		System.out.print( 172.315 );
		// println과 print는 데이터를 있는 그대로 표현
		System.out.printf( "\n %.1f \n", 172.315 );
		// printf는 소수점 6자리 까지 표현 f앞에 .x를 붙여서 소수점 자리수를 조절가능
		System.out.println(3);
		System.out.printf( "%5d" , 3 );
		// d의 앞에 x를 붙여 자리수 맞춤 여러개의 숫자를 입력할때 정렬 
		
		// \n -> 엔터키의 문자표현 모든 print에서 사용가능 
		
		
		
	}

}

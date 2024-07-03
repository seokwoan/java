package java0703;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		
		// 정수 두개 입력받아 합을 출력하기
		Calc calc = new Calc(); // Calc 객체 생성
		calc.sum(40,10);  // 같은 이름의 method가 overloading
		
		
		//calc.sum(); // Calc객체의 sum method 호출
		
		// 세 과목의 총점을 구하여 출력하세요 
		int kor = 89, eng = 74 , mat = 43;
		
		calc.sum( kor , eng , mat );
		
		// method 호출하여 '메서드 dog쉽네~' 라고 출력
		calc.sum( '개' );
		calc.sum( "dog" );
		calc.view();
		
		//method를 호출하여 이름과 나이를 출력하세요
		// 매개변수 없는 method, 키보드 입력X
		
		calc.person(); 
		// instance method, 변수는 class의 객체(instance)를 통해 호출해야한다.
		// class method, 변수는 class 이름을 통해 호출 -> static이 붙은 경우
		
		
		// method를 호출하여 아래의 데이터를 출력하세요
		String animal = "골드리트리버";
		String 공고일 = "2024-07-01";
		
		TestMethod testMethod = new TestMethod();
		
		testMethod.animalStray( animal , 공고일 );
		
		
		// 다음 날짜중에서 월과 일만 출력하세요
		// 문자열 method substring 또는 split 사용
		String examDate = "2024-08-13";
		testMethod.split(examDate);
		testMethod.substring(examDate);
		
		// 네 사람의 나이 평균 값을 구하여 출력하세요
		// 평균값은 정수입니다
		int 흥민 = 31, 강인 = 23, 희찬 = 28, 재범 = 37;
		
		testMethod.avg(흥민, 강인, 희찬, 재범);
		
	}

}

class Calc{
	
	void sum( int num1 , int num2 ) {
		int result = num1 + num2;
		System.out.printf( "두 정수의 합 : %d\n" , result );
	}
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.println( "첫번째 정수 : " );
		int num1 = scan.nextInt();
		System.out.println( "두번째 정수 : " );
		int num2 = scan.nextInt();
		int result = num1 + num2;
		System.out.printf( "두 정수의 합 : %d\n" , result );
	}
	
	void sum( int kor , int eng , int mat) {
		int result = kor + eng + mat;
		System.out.printf( "세 과목의 총점 : %d\n" , result );
	}
	
	void sum( char dog ) {
		System.out.printf( "메서드 %c쉽네~ \n" , dog );
	}
	
	void sum( String dog ) {
		System.out.printf( "메서드 %s쉽네~ \n", dog );
	}
	
	void view() { // 변수 a,b의 값 출력하는 method
		int a = 10 , b = 20;
		System.out.printf( " a : %d, b : %d \n" , a , b  );
	}
	
	void person() {
		String name = "이순신";
		int age = 35;
		System.out.printf( "이름 : %s, 나이 : %d\n" , name , age );
	}
	
}


class TestMethod{
	void animalStray( String animal , String date) {
		System.out.printf( "\n견종 : %s \n공고일 : %s\n" , animal , date );
	}
	
	
	void split( String date ) {
		String[] day  = date.split("-"); // split("나눌지표") -> 나눌지표는 특수문자 나뉜 데이터는 배열
		System.out.println( day[1] + "월" + day[2] + "일");
	}
	
	
	void substring( String date ) {
		String day = date.substring( 5 , date.length() );
		System.out.println( day );
	}
	
	void avg( int 흥민 , int 강인 , int 희찬 , int 재범 ) {
		int total = 흥민 + 강인 + 희찬 + 재범;
		int avg = total / 4;
		System.out.printf( "네 사람의 평균 나이 : %d ", avg );
	}
}















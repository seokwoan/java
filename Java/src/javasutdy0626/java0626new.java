package javasutdy0626;

import java.util.Scanner;

public class java0626new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("자바출력");
		// System.in -> 입력 
		// 입력받을수 있는 내장 클래스 Scanner
		Scanner scan = new Scanner(System.in);
		// 다른 패키지에 있을경우 경로를 지정해 줘야함
		// new를 통해 생성하면 메모리 주소를 가짐 
		// 메모리 주소를 가진 변수를 참조변수라고함
		// float 타입 - .nextfloat , double - /nextdouble
		// .next옆에 받을 데이터타입을 넣어줌
		// char는 없다. 문자를 받을수 없음 문자열로 받아야함
		// 문자열 .nextLine() , next() 
		
//		System.out.print( "정수 입력 : " );
//		int a = scan.nextInt();
//		
//		System.out.printf( "%d\n", a );
		
		
		// 철수가 점심을 먹기위해 편의점에 갔다.
		// 대게라면과 삼각김밥, 바나나우유를 먹었다.
		// 철수가 점심값으로 지불한 금액은 얼마인가?
		// int 대게라면, 삼각김밥, 바나나우유; -> 데이터타입을 정해줘서 초기값을 안주고 여러개의 변수를 같이 만들수 있음
		
//		System.out.print( "대게라면 값 : ");
//		int noodle = scan.nextInt();
//		System.out.print( "\n삼각김밥 값 : ");
//		int kimbab = scan.nextInt();
//		System.out.print( "\n바나나우유 값 : ");
//		int milk = scan.nextInt();
//		int amount = noodle + kimbab + milk;
//		//System.out.print( "\n점심값은 " + amount + "원\n" );
//		System.out.printf( "\n점심값은 %d원 \n" , amount); 
		
		// 민수가 친구들을 만나기위해 나왔다.
		// 나와서보니 지갑을 놓고 와서 집에 갔다왔다.
		// 이번에는 신발을 짝짝이로 신어서 다시 집에 갔다왔다.
		// 민수의 집은 5층이다. 민수가 1층 올라가는데 3.4초가 걸린다.
		// 민수가 집에 들어갔다 나왔다 하는데 걸린 총 시간은 몇 초?
//		float sec = 3.4f;
//		int floor = 4; // 5
//		int much = 4;
//		float howLong = sec * floor * much; // 5로 했으면 (floor-1)
//		System.out.printf( "총 %.1f초 걸렸습니다.\n" , howLong);

		// 프로그램 코드는 기본적으로 순차진행
		// if(조건문), 함수(메서드), 반복문, goto문(이름있는for문) 순차진행이 아니라 분기진행
		
		
		
		
		/* 
		 데이터의 종류는 정수, 실수, 문자, boolean(true,false)
		 데이터타입
		 	정수 - byte, short, int, long
		 	문자 - char
		 	실수 - float, double
		 	참거짓 - boolean
		 을 변수 앞에 써서 변수를 만들어야 한다.
		 
		 변수 선언 방법
		 (데이터타입) (변수명);
		 int num; 정수 타입 변수 선언
		 double dnum; 실수 타입 변수 선언
		 char ch; 문자 타입 변수 선언
		 boolean bool; 참 거짓 변수 선언
		 
		 변수의 초기화
		 int num = 10; 변수 선언과 함께 데이터를 저장
		 
		 출력 방법 
		 System.out.println( 출력내용 );
		 System.out.print( 출력내용 );
		 System.out.printf( 출력내용 , 변수(넣고자하는 데이터), 변수(여러개의 데이터를 넣으려면 변수를 늘려주면 된다. 각 변수의 데이터 타입에 맞는 형식 지정자 사용 ) );
		 
		 printf 사용시 함께 사용하는 형식지정자
		 	%d, %u - 정수 / %f - 실수 / %c - 문자 / %s - 문자열
		 
		 int age = 28;
		 System.out.printf( "%s 마을의 나이가 %d살인 폭군지도자 %c씨" , "코딩빌" , age , '박' );
		 
		 입력방법
		 Scanner 클래스 객체 필요
		 Scanner 변수명 = new Scanner(System.in);
		 *Scanner 클래스는 내장외부클래스이므로 import 해야한다. 
		 변수명.nextInt(); int타입 정수만 입력가능
		 변수명.nextByte(); byte타입 정수만 입력가능
		 .nextLong(); long타입 정수만 압력
		 .nextShort(); short타입 정수만 입력
		 .nextFloat(); float타입 실수만 입력
		 .nextDouble(); double타입 실수만 입력
		 .next(); 문자열 입력
		 .nextLine(); 문자열 입력
		 
		 */
			
		// c언어, 자바, 건축학개론 시험성적을 입력하세요.
		// 세과목의 총점과 평균을 각각 출력하세요.
		Scanner score = new Scanner(System.in);
		
		System.out.printf( "c언어 점수 : " );
		float cLang = score.nextFloat();
		System.out.printf( "자바 점수 : " );
		float java = score.nextFloat();
		System.out.printf( "건축학개론 점수 : " );
		float arch = score.nextFloat();
		
		float total = cLang + java + arch;
		float avg = total/3;
		
		System.out.printf( "세 과목의 총점 : %.0f 점 \n세 과목의 평균 : %.2f 점" , total , avg );

		//test

	}

}

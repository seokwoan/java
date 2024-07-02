package java0702_2;

public class JavaMethod {

	public static void main(String[] args) {
		
		//output(); 
		// static main이 먼저 실행돼서 output호출이 먼저되고 output method가 뒤에 만들어짐
		// static이 붙으면 자바 실행시loading에서 만들어지고 
		// 인스턴스는 컴파일과정에서 만들어져서 실행이 불가능
		// class method는 오직 class변수나 class method만 실행
		// 실행 - 메모리에 로드(적재)되는 때가 인스턴스보다 먼저 이루어지기 때문에
		// 인스턴스 변수나 인스턴스 method에서는 안된다. 
		a.out();
		
		int num = 300; // main안에서 만들어진 지역변수 - class변수, 인스턴스변수가 아님
		output( num );

	}
	
//	void output() { // static이 없어 인스턴스로 실행 - > static main에서 실행불가
//		System.out.println( "나는 method 입니다." );
//	}
	
	static void output( int a ) { // static을 붙여주면 실행 가능 매개변수는 가져올 데이터의 데이터 타입을 가져야함 
		System.out.println( a );
		System.out.println( "나는 method 입니다." );
	}

}

class a {
	int num = 10;
	
	static void out() {
		System.out.println( "나는 method 입니다." );
	}
}




// main method -> JVM이 가장 먼저 실행하는 method로 반드시 있어야함 
// JVM  운영체제 상관 없이 동작하기 위한 가상의 컴퓨터
// java에서 컴파일하면 -> JVM이 사용하는 언어로 변경 -> JVM이 실행해서 운영체제에 넘겨줌




// 자바 method
// 반환타입 method명(매개변수){ 내용 }

// 반환타입 - int , short , float , double , byte , char , boolean , void , 
//			String
// method의 return 데이터 타입
// return 10; -> 반환타입은 int, short, byte, long 10은 정수이므로 정수를 지정하는 데이터 타입
// return income; -> income이라는 변수의 타입을 반환타입으로 작성
// 반환값의 데이터 타입은 같아야한다 -> if 참 정수 if 거짓 문자열 -> 불가

// void 타입은 반환값이 없다는 의미 return이 없다.


/*
	990101-1234567
	주민등록번호로 남자인지 여자인지 구별
	String gender( String jumin ){
		
		String gen = jumin.substring( 7 , 8 );
		if( gen.equals("1") || gen.equals("3") ){
			return "남자";	
		}
		else if( gen.equals("2") || gen.equals("4") ){
			return "여자";
		}
		return "중성";
	}

*/


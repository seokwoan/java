package java0702;

public class ClassBasic {

	public static void main(String[] args) {
		
		// class의 객체를 
		// 정의된 class 타입의 공간을 생성한다.
		// 생성된 공간에 데이터를 저장한다.
		// class 타입으로 생성된 공간을 인스턴스(하나) 또는 객체(공간 전부) 라고 한다.
		
		Member member1 = new Member(); // class 인스턴스 생성 
		Member member2 = new Member(); // 생성자 method( class를 만들때 자동생성)
		// class명 변수명 = new class명(); 
		// class는 데이터 타입 ( 사용자정의 데이터 타입)
		// 생성된 member1과 member2는 Member타입을 가지는 변수
		
		System.out.println( member1 );  //new로 생성된 변수는 참조변수이므로 주소가 나옴
		System.out.println( member2 );
		
		member1.name = "이순신";
		member1.age = 23;
		System.out.println( member1.name );
		System.out.println( member1.age );
		
		member2.name = "김유신";
		member2.age = 34;
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page = 495;
		book2.title = "메모리최적화기법";
		book2.page = 893;
		
		
		// 스마트폰 제품명, 운영체제, 메모리(ram)크기에 대해
		// 저장할 수 있는 클래스를 정의하고 인스턴스 생성하여
		// 값 저장, 출력을 하세요 ( 스마트폰 3개)
		
		
		Phone fold = new Phone();
		Phone flip = new Phone();
		Phone apple = new Phone();
		
		fold.product = "갤럭시폴드6";
		fold.os = "android";
		fold.ram = 12;
		flip.product = "갤럭시플립6";
		flip.os = "android";
		flip.ram = 8;
		apple.product = "iPhone16";
		apple.os = "iOS18";
		apple.ram  = 8;
		
		System.out.println( fold.product );
		System.out.println( fold.os );
		System.out.println( fold.ram + "G" );
		System.out.println( flip.product );
		System.out.println( flip.os );
		System.out.println( flip.ram + "G" );
		System.out.println( apple.product );
		System.out.println( apple.os );
		System.out.println( apple.ram + "G");
		
		
		
	}

}

// class는 사용자 정의 데이터 타입이라고 한다. 
class Member{  // Member라는 이름의 class 정의
	String name; // 데이터를 넣어줄 변수 이름
	int age;	 // 데이터를 넣어줄 변수 이름 class내부의 변수는 멤버변수라고 부름
	// 생성자 method가 위치함 ( 생략됨 ) Member(){}; 
	// class를 만들때 class 이름으로된 생성자 method가 생성되게 작동함
}


// 책 제목과 총 페이지 수를 저장하기 위한 클래스 

class Book{
	String title;
	int page;
}


class Phone{
	String product;
	String os;
	int ram;
}



// 변수 -> 배열 -> 구조체(자바엔 없음) -> 클래스의 순서로 데이터 저장 방식이 
// 단일타입의 데이터를 저장하면서 데이터 취급에 불편함이 생겨 
// 여러 타입의 데이터를 저장할 수 있는 구조체를 만듬
// struct a; -> int, float 등 다른 타입의 데이터를 저장
// 구조체를 사용하면서 구조체에서만 사용하는 함수가 등장해 불편함이 생김
// 구조체에 함수를 포함하는 클래스를 만듬
// 클래스에 있는 함수는 클래스에 귀속되어있어 method라고 부름
// 함수는 귀속되지 않고 method는 귀속되어있음 



// class 이름(첫글자 대문자) -> ex) Scanner, Arrays, String 관례적 첫문자를 대문자로 사용






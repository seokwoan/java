package java0702_2;

public class ClassObject {

	public static void main(String[] args) {
		
		System.out.println( Car.제조사 ); 
		// 제조사는 class변수라 프로그램이 실행될 때 생성되어있어 사용가능
		// 인스턴스 변수는 생성되지 않은 상태
		// class변수는 하나만 존재 모든 객체가 사용 가능한 공유자원이라고 함
		
		Car car1; // 생성자 함수를 사용하지 않아서 변수 공간만 있고 변수 공간에 주소가 만들어짐 
		
		car1 = new Car(); // new연산자를 통해 공간을 만들어야 인스턴스 변수 사용가능 class변수는 생성안됨
		car1.carName = "쏘나타";
		car1.연료 = "휘발유";
		
		Car car2 = new Car( "그랜져" , 3000 , "휘발유" ); 
		// 매개변수가 있는 생성자 method를 사용하면 객체를 만들때 매개변수를 이용해 값을 저장할 수 있다. 
		
		
		/*  
		 데이터 : 이름 , 포인트 , 평점
				김건우 , 4580 , 4.3
				김경제 , 3485 , 4.1
				박재범 , 90930 , 2.7
				서석완 , 19200 , 3.1
				
		 웹소설 작가들의 구독자 평점과, 소설 뷰횟수에 따른 포인트점수이다.
		 위 내용을 저장 할 수 있는 클래스를 정의하고 데이터 입력후 출력하세요
		 ( 매개변수 있는 생성자 method는 두개 이상 구현)		
		*/
		
		Author 김건우 = new Author("김건우");
		김건우.point = 4580;
		김건우.rating = 4.3f;
		Author 김경제 = new Author(3485);
		김경제.name = "김경제";
		김경제.rating = 4.1f;
		Author 박재범 = new Author( "박재범" , 2.7f , 90930 );
		Author 서석완 = new Author( "서석완" , 19200 , 3.1f );
		
		System.out.println( 김건우.name + " " + 김건우.point + " " + 김건우.rating);
		System.out.println( 김경제.name + " " + 김경제.point + " " + 김경제.rating );
		System.out.println( 박재범.name + " " + 박재범.point + " " + 박재범.rating );
		System.out.printf( "%s %d %.1f\n" , 서석완.name , 서석완.point , 서석완.rating );
		System.out.println( 김건우 );
		
	}

}

// class 내부에 선언되는 변수(또는 배열)은 두가지로 나뉜다.
// class 변수(배열) , 인스턴스 변수 
// 인스턴스변수는 class 객체 생성시 메모리 할당이 된다. 
// class 객체 생성은 new 연산자를 통한다.
// class변수는 프로그램 실행 할때 메모리에 로드하면서 생성된다. 


// 생성자 method - 객체(인스턴스) 공간을 생성할때 공간 초기화 해주는 method
// 생성자 method - return아 존재하지 않는다. return을 가지면 안된다
// 				 return을 하면 안되는 이유가 생성자 method에서는 return 타입 지정이 안되기 때문
// 오버로딩 - 하나의 method이름으로 여러개의 method를 만드는것( 매개변수의 데이터 타입 다름)
// 오버로딩 구현 조건
// 1. 동일 클래스에서만 가능하다.
// 2. method의 이름은 같아야 한다.
// 3 or 4 를 만족하면 가능
// 3. 매개변수의 타입은 다르게 선언되어야 한다.
// 4. 매개변수의 갯수가 달라야 한다. 
// 매개변수 타입의 순서를 확인해서 순서가 같고 갯수가 같으면 overloading 불가
// 매개변수 타입의 총합이 같아도 타입의 순서가 다르면 overloading 가능 
// 매개변수의 이름은 상관없다. 

class Car{
	static String 제조사 = "현대"; // class에 변수를 만들면서 데이터를 바로 넣어줄 수 있음
	// class에 변수를 저장할때 변수 앞에 static을 넣으면 class변수가 된다. 
	// static은 제어자
	
	String carName; // 인스턴스 변수
	int 배기량; // 인스턴스 변수
	String 연료; // 인스턴스 변수
	
	// 생성자 method 
	// 객체지향언어는 method의 이름이 같아도 된다. overloading
	// method의 이름이 같고 매개변수의 타입만 바꿔주면 같은 method로 사용 가능
	// 같은 기능을 가진 다른 이름의 함수를 여러개 만들 필요가 없음
	Car(){ // 함수를 만들기 때문에 "()"가 필요하다 매개변수가 없음
		// 생성자 method의 내용 - 인스턴스 변수의 초기값 지정
		연료 = "휘발유"; // Car 데이터타입을 갖는 new연산자로 만들어진 객체는 연료변수에 휘발유값이 저장됨
		
	}
	// 매개변수가 있는 생성자 method
	Car( String carName , int cc , String fuel){ 
		// 매개변수를 작성해줌
		// 일반적으로 매개변수의 이름과 인스턴스변수와 같은 이름으로 작성 
		this.carName = carName; // 구분을 해주기 위해 this.인스턴스 변수로 구분을 해줌
		// this는 생성자 method가 객체를 생성할 때의 객체를 의미 
		배기량 = cc;
		this.연료 = fuel;
	}
	
	Car( String carName , String fuel , int cc ){ 
		// 매개변수를 작성해줌
		// 일반적으로 매개변수의 이름과 인스턴스변수와 같은 이름으로 작성 
		this.carName = carName; // 구분을 해주기 위해 this.인스턴스 변수로 구분을 해줌
		// this는 생성자 method가 객체를 생성할 때의 객체를 의미 
		배기량 = cc;
		this.연료 = fuel;
	}
	
	
	Car( String 연료 ){ // 필요한 값만 매개변수를 이용해 사용할 수 있다.
		this.연료 = 연료;
	}
	
}

class Author{
	String name; // 이름 - 인스턴스 변수
	int point; // 포인트 - 인스턴스 변수
	float rating; // 평점 - 인스턴스 변수
	
	// 매개변수가 없는 생성자 method는 자동생성
	// 매개변수가 없는 생성자 method를 생성하지 않고 매개변수가 있는 method를 생성하면
	// 매개변수없는 생성자method가 자동으로 생성되지 않음
	// 매개변수가 있는 생성자 method를 만들면 매개변수가 없는 생성자 method를 추가해야 생성
	// 매개변수가 없는 생성자 method가 없으면 new연산자로 비어있는 method 호출 불가
	Author(){
		// 매개변수가 없는 생성자 method를 생성해줌
		// 매개변수 없이 호출할 가능성도 있으므로 생성
	}
	
	Author( String name ){
		this.name = name;
	}
	
	Author( int point ){
		this.point = point;
	}
	
	Author( float rating ){
		this.rating = rating;
	}
	
	Author( String name , int point , float rating ){
		this.name = name;
		this.point = point;
		this.rating = rating;
	}
	
	Author( String name , float rating , int point ){
		this.name = name;
		this.point = point;
		this.rating = rating;
	}
	
	public String toString() {
		return name + " " + point + " " + rating;
		// public String(데이터타입) toString() -> String은 return의 타입 
		//       
		// return 문자열 ;
		
	}
}











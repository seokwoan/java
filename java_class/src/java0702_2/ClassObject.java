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
	}

}

// class 내부에 선언되는 변수(또는 배열)은 두가지로 나뉜다.
// class 변수(배열) , 인스턴스 변수 
// 인스턴스변수는 class 객체 생성시 메모리 할당이 된다. 
// class 객체 생성은 new 연산자를 통한다.
// class변수는 프로그램 실행 할때 메모리에 로드하면서 생성된다. 


// 생성자 method - 객체(인스턴스) 공간을 생성할때 공간 초기화 해주는 method

class Car{
	static String 제조사 = "현대"; // class에 변수를 만들면서 데이터를 바로 넣어줄 수 있음
	// class에 변수를 저장할때 변수 앞에 static을 넣으면 class변수가 된다. 
	// static은 제어자
	
	String carName; // 인스턴스 변수
	int 배기량; // 인스턴스 변수
	String 연료; // 인스턴스 변수
}














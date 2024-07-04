package homeProduct;

public class Tv extends House { 
//// public class 상속받을class extends 상속해줄class 	
	// 하나의 파일에 class를 여러개 넣는게 아닌 class를 파일로 분할해 
	// 모듈화 한다. 
	// main method가 없는 class를 만들기 위한 class
	
	int channel = 10; // 채널 instance변수
	int vol = 5; // 소리

	Tv(){ // 생성자 method
		super(); // -> super() == new House()
//		new House(); 자식class의 생성자 함수에는 super();가 생략되어있음
//		Tv class의 객체를 만들때마다 부모 class의 instance값이 생성됨
//		
	}
	
	// 매개변수 있는 생성자 method
	Tv( String brand , int price ){
		super( brand , price ); // 부모class 생성자method 호출
	}
	
	void channelUp() {
		this.channel++; // 객체의 channel의 값을 올줌
		// 객체 내의 instance변수의 값을 바꾸면 return이 필요없다
	}
	
	void channelDown() {
		this.channel--;
	}
	
}

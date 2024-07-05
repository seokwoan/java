package homeProduct;

public class Tv extends House { 
//// public class 상속받을class extends 상속해줄class 	
	// 하나의 파일에 class를 여러개 넣는게 아닌 class를 파일로 분할해 
	// 모듈화 한다. 
	// main method가 없는 class를 만들기 위한 class
	
	// 변수를 private로 만들면 데이터 값변경, 출력 모두 매개변수가 있는 method를 이용함
	private int channel = 10; // 채널 instance변수 private라 class내부에서만 사용가능 객체를 통한 변경 불가
	private int vol = 5; // 소리
	// 자바의 거의 모든 변수는 private
	// 자바에서의 동작은 거의 대부분 method에서 동작
	// 변수의 노출이 필요 없음
	
//	public void setChannel( int channel ) { //channel의 값을 변경할 method
//		this.channel = channel;
//	} 
	// eclipse에서 생성하는 기능이 있음 
	// Source - Generate Getters and Setters

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	Tv(){ // 생성자 method
		super(); // -> super() == new House()
//		new House(); 자식class의 생성자 함수에는 super();가 생략되어있음
//		Tv class의 객체를 만들때마다 부모 class의 instance값이 생성됨
//		
	}
	
	// 매개변수 있는 생성자 method
	public Tv( String brand , int price ){
		super( brand , price ); // 부모class 생성자method 호출
	}
	
	public void channelUp() {
		this.channel++; // 객체의 channel의 값을 올줌
		// 객체 내의 instance변수의 값을 바꾸면 return이 필요없다
	}
	
	public void channelDown() {
		this.channel--;
	}
	
	@Override // annotatin : @(설명) -> 컴퓨터에 설명해줌
	// power가 override 된다고 컴퓨터에 설명
	// Override의 경우에는 부모가 아닌 자식method 작성해줌
	protected void power() { // 부모class와 자식class에 같은 이름의 method가 있으면 자식class의 method실행 
		super.onOff = !super.onOff;
		System.out.printf( "TV전원 : %s\n", super.onOff );
	} // overriding된 method는 부모의 제어자를 똑같이 사용해야한다
	
}

//overriding 조건
//부모class에 해당 method가 존재해야한다.
//overriding method는 반드시 반환타입, method명, 매개변수 모두 똑같이 작성해야한다.
//method의 {}내용은 달라도 된다.


// overloading - 새로운 method를 정의하는것
// 같은 class의 같은 이름의 method의 매개변수의 타입, 갯수가 다를때를 지칭 반환타입은 상관없음

//overriding - 기존의 method를 재정의 하는것
// 부모 자식 관계의 class에서 부모 자식이 같은 method명, 매개변수, 반환타입을 가질때
// 부모의 method가 자식의 method로 재정의 되어 실행될 때를 지칭













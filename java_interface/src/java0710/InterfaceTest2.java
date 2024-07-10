package java0710;


interface Animal1{ // interface는 기본적으로 추상의 형태이다
	static int a =10;
	final int b = 10;
	static void mee() {
		
	}
	
	public void sound(); 
	// 추상 method -> interface에서 만들어지는 method는 abstrct를 붙이지 않아도 기본적으로 추상method로 만들어짐
	// public void fly();
	// interface에서 method를 구현해도 class에서 재정의 해야한다.
	// class의 상속은 하나의 부모만 가질수 있지만 interface는 여러개를 가질수 있음 
	// class에서 적용할 interface를 선택할 수 있음 -> 여러개의 interface를 만들고 선택해서 사용
	// 상속의 경우 하나의 부모class를 가지므로 서로 다른 동작의 경우 메모리 낭비
}

interface bird{
	
	public void fly();
}


class Dog1 implements Animal1{
	
	@Override
	public void sound() {
		System.out.println( "멍멍" );
	}
}


class Cat1 implements Animal1{
	
	@Override
	public void sound() {
		System.out.println( "냐옹" );
	}
}



class Pigeon1 implements Animal1, bird{
	
	@Override
	public void sound() {
		System.out.println( "구구" );
	}
	
	@Override
	public void fly() {
		System.out.println( "푸드득 비둘기 날다" );
	}
}





public class InterfaceTest2 {

	public static void main(String[] args) {
		
		Dog1 d = new Dog1();
		Cat1 c = new Cat1();
		Pigeon1 p = new Pigeon1();
		
		d.sound();
		c.sound();
		p.sound();
		p.fly();
	}

}



/*
	class 상속
	
		1.	단일상속 - 하나의 class만 상속 가능하다.
			자식class는 하나의 부모class만 가질수 있다.
			다른 class의 기능을 사용하려면 포함관계로 구현
			
			포함관계
			class A {}
			class B {
				A a = new A(); -> B class에 A class의 객체를 만들어줌
			}
			자동차 - 타이어, 엔진, 창문, 에어컨, 핸들.. -> 자동차class에 포함관계가 되어야한다.
			자동차 - 소나타, 아반떼, 그랜저, 스포티지, 카니발 -> 자동차class가 부모class
			
		2.	부모class의 변수와 method를 상속받아 사용한다.
			부모class의 public, protected, default제어자
				변수와 method만 상속된다.
			자식class는 부모가 상속으로 주는 모든것을 다 받아야 한다.
			자식class입장에서는 선택지가 없다. 강제적으로 상속이다.
			
		3.	강한 결합
				부모class의 변경이 자식class에 영향을 준다.
			
			
	interface
		1. 다중 구현
			class가 여러개의 interface를 연결하여 구현 할 수 있다.
			
		2. 유연성
			class는 필요한 interface를 조합하여 구현 할 수 있다.
			 
		3. 약한 결합
			class는 필요한 interface만 구현하면 되므로 상속관계일때보다 유연성이 높아진다.(상속보다 영향이 적다)
			

*/

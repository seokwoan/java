package java0717;

public class Juice {
	
	
	// 제네릭을 사용하지 않는 class에서 method의 매개변수로 제네릭타입을 사용하는 경우 
	public void makeJuice( FruitBox<? extends Fruit> box ) {
		// method 매개변수에 제네릭 타입 표현을 해줘야한다
		// FruitBox<> box -> method에서는 class에서처럼 T,E 등과 같은 표현 불가
		// 와일드카드인 ? 를 이용해 제네릭 타입을 표시해줌
		// 와일드카드? 는 모든 타입 가능 
		// 제네릭타입에 제한을 만들었다면 와일드카드에도 제한을 걸어주는게 좋다 -> 모든 타입 가능하므로
		// 컴파일 과정에서 타입 불일치 오류가 생길수 있다
	}
}

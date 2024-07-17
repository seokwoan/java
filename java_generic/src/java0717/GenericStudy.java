package java0717;

import java.util.ArrayList;

public class GenericStudy {

	public static void main(String[] args) {

		A<String> a = new A<>();
		// A<String> -> A class의 제네릭타입 T에 String으로 지정된다
		// item변수는 String item으로 사용된다.
		a.item = "이순신";
		
		A<Integer> b = new A<>();
		// 제네릭타입 T에 Integer 지정 Integer item으로 사용
		b.item = 3;
		// b.setItem(233); -> setItem에 T타입으로 매개변수를 만들면 setItem으로 
		// 객체를 만들때 사용한 타입의 데이터를 받을 수 있음
		
		
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		
		appleBox.setFruit( new Apple() );
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		
		bananaBox.setFruit( new Banana() );
		
		FruitBox<Grape> grapeBox = new FruitBox<>();
		grapeBox.setFruit( new Grape() );
		
		Apple apple = appleBox.getFruit();
		// FruitBox의 자식class이므로 (Apple)appleBox.getFruit();로 형변환을 해줘야 한다
		// getFruit method의 리턴타입을 제네릭타입으로 만들어서 형변환을 하지 않아도 가능
		
		// FruitBox<Toy> toyBox = new FruitBox<>();
		// toyBox.setFruit( new Toy() );
		// FruitBox의 제네릭타입을 제한해서 Fruit class를 상속받는 class만 제네릭타입으로 지정 가능
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		fruitBox.setFruit( new Apple() );
		// 제네릭타입을 Fruit class로 설정해 자식class인 Apple class의 객체 저장 가능
		
		Juice j = new Juice();
		j.makeJuice( appleBox );
		j.makeJuice( bananaBox );
		
		
	}

}


class A<T> { 
	// 제네릭타입을 만들려면 class의 이름뒤에 "<타입명>"를 붙여준다 - 일반적으로 T를 사용 
	// <T> -> 타입의 이름이 T
	// <K,V> -> 여러개의 타입 사용 가능 생성할때 여러개의 타입 지정
	
	T item; // item에 어떤 타입이 저장될지 모르는 상태
	
	// T[] arr = new T[3];
	// 제네릭타입으로 new연산자를 통한 배열의 생성 불가
	// -> 타입이 지정되기 전이라 크기가 정해지지 않아 hip영역에 공간 생성 불가
	// method에서도 생성 불가
	
	ArrayList<T> list = new ArrayList<>();
	// ArrayList를 통한 동적배열은 생성 가능
	// 생성 가능하게 만들어져 있음
	
	void setItem( T item ) {
		this.item = item;
	}
	// 제네릭을 사용하지 않으면 item변수를 다른타입, 다른이름으로 여러개를 만들고
	// 같은 이름의 method를 overloading해서 만들어야한다.
	
}

class B{
	int item1;
	String item2;
	
	void setItem( int item ) {
		this.item1 = item;
	}
	
	void setItem( String item ) {
		this.item2 = item;
	}
	
	// 제네릭타입을 사룔하지 않으면 여러개의 변수, method의 overloading이 필요하다
}


/*
	제네릭
		- class, interface 내부의 타입을 지정하는 방법
		- class, interface 내부에 여러 타입의 변수, 배열을 만들때 사용
		- 다른 타입의 변수, 배열을 하나의 변수, 배열로 처리 가능하게 해줌
		- 제너릭 타입 표현
			- T -> type
			- E -> element
			- K -> key
			- V -> value
			- N -> number
		- 제네릭타입은 class내에서 사용되는 타입으로 외부에서 인식하는 타입이 아님	
			
		- class에 제네릭 표현 방법
			class A<T>
		- 제네릭타입은 class타입만 지정 할 수 있다
			A<Tea> a = new A<Tea>();
			제한 없이 class면 모두 가능
		- 제네릭타입으로 사용 가능한 class에 제한방법
		 	<T extends Parent> -> Parent class와 Parent class의 자식 class만 제네릭타입 지정가능
		 	이외의 class는 지정 불가 
		 	다중으로 제한 설정 가능
		 	-> interface만 다중 타입 설정 가능, class는 불가 
		 	interface는 다중 상속 가능
		 	
	 	- 제네릭 와일드 카드 '<?>'
			제네릭 타입의 한계를 보완하기 위해 사용하는 방법
			method의 매개변수 타입으로 제네릭타입으로 표현하는 class를 사용한다면 class에 표현된
			제네릭타입이 제대로 표현되지 않기 때문에 다시 한번 제네릭을 지정해야 한다 -> class가 다르면 메모리 공간이 다르기때문
			이때 사용되는 예외 없이 허용한다라고 해서 '?' 로 표현
			
		- 와일드 카드의 제한
			<? extends T> -> T클래스와 그 자식까지 가능
			<? super T> -> T클래스와 그 조상까지 가능( 자식 불가 )
			

*/

package java0717;

public class FruitBox<T extends Fruit> {
				// < type extends 부모class > -> 제네릭타입으로 부모class를 상속받은 
				// class의 객체의 타입으로 받을 수 있음 -> 받을 타입을 제한
	private T fruit; 
		
	public void setFruit( T fruit ) {
		this.fruit = fruit;
	}
	
	public T getFruit() {
		return this.fruit;
	}
	
}

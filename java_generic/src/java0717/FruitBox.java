package java0717;

public class FruitBox<T extends Fruit> {
				// < type extends �θ�class > -> ���׸�Ÿ������ �θ�class�� ��ӹ��� 
				// class�� ��ü�� Ÿ������ ���� �� ���� -> ���� Ÿ���� ����
	private T fruit; 
		
	public void setFruit( T fruit ) {
		this.fruit = fruit;
	}
	
	public T getFruit() {
		return this.fruit;
	}
	
}

package java0717;

import java.util.ArrayList;

public class GenericStudy {

	public static void main(String[] args) {

		A<String> a = new A<>();
		// A<String> -> A class�� ���׸�Ÿ�� T�� String���� �����ȴ�
		// item������ String item���� ���ȴ�.
		a.item = "�̼���";
		
		A<Integer> b = new A<>();
		// ���׸�Ÿ�� T�� Integer ���� Integer item���� ���
		b.item = 3;
		// b.setItem(233); -> setItem�� TŸ������ �Ű������� ����� setItem���� 
		// ��ü�� ���鶧 ����� Ÿ���� �����͸� ���� �� ����
		
		
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		
		appleBox.setFruit( new Apple() );
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		
		bananaBox.setFruit( new Banana() );
		
		FruitBox<Grape> grapeBox = new FruitBox<>();
		grapeBox.setFruit( new Grape() );
		
		Apple apple = appleBox.getFruit();
		// FruitBox�� �ڽ�class�̹Ƿ� (Apple)appleBox.getFruit();�� ����ȯ�� ����� �Ѵ�
		// getFruit method�� ����Ÿ���� ���׸�Ÿ������ ���� ����ȯ�� ���� �ʾƵ� ����
		
		// FruitBox<Toy> toyBox = new FruitBox<>();
		// toyBox.setFruit( new Toy() );
		// FruitBox�� ���׸�Ÿ���� �����ؼ� Fruit class�� ��ӹ޴� class�� ���׸�Ÿ������ ���� ����
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		fruitBox.setFruit( new Apple() );
		// ���׸�Ÿ���� Fruit class�� ������ �ڽ�class�� Apple class�� ��ü ���� ����
		
		Juice j = new Juice();
		j.makeJuice( appleBox );
		j.makeJuice( bananaBox );
		
		
	}

}


class A<T> { 
	// ���׸�Ÿ���� ������� class�� �̸��ڿ� "<Ÿ�Ը�>"�� �ٿ��ش� - �Ϲ������� T�� ��� 
	// <T> -> Ÿ���� �̸��� T
	// <K,V> -> �������� Ÿ�� ��� ���� �����Ҷ� �������� Ÿ�� ����
	
	T item; // item�� � Ÿ���� ������� �𸣴� ����
	
	// T[] arr = new T[3];
	// ���׸�Ÿ������ new�����ڸ� ���� �迭�� ���� �Ұ�
	// -> Ÿ���� �����Ǳ� ���̶� ũ�Ⱑ �������� �ʾ� hip������ ���� ���� �Ұ�
	// method������ ���� �Ұ�
	
	ArrayList<T> list = new ArrayList<>();
	// ArrayList�� ���� �����迭�� ���� ����
	// ���� �����ϰ� ������� ����
	
	void setItem( T item ) {
		this.item = item;
	}
	// ���׸��� ������� ������ item������ �ٸ�Ÿ��, �ٸ��̸����� �������� �����
	// ���� �̸��� method�� overloading�ؼ� �������Ѵ�.
	
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
	
	// ���׸�Ÿ���� ������� ������ �������� ����, method�� overloading�� �ʿ��ϴ�
}


/*
	���׸�
		- class, interface ������ Ÿ���� �����ϴ� ���
		- class, interface ���ο� ���� Ÿ���� ����, �迭�� ���鶧 ���
		- �ٸ� Ÿ���� ����, �迭�� �ϳ��� ����, �迭�� ó�� �����ϰ� ����
		- ���ʸ� Ÿ�� ǥ��
			- T -> type
			- E -> element
			- K -> key
			- V -> value
			- N -> number
		- ���׸�Ÿ���� class������ ���Ǵ� Ÿ������ �ܺο��� �ν��ϴ� Ÿ���� �ƴ�	
			
		- class�� ���׸� ǥ�� ���
			class A<T>
		- ���׸�Ÿ���� classŸ�Ը� ���� �� �� �ִ�
			A<Tea> a = new A<Tea>();
			���� ���� class�� ��� ����
		- ���׸�Ÿ������ ��� ������ class�� ���ѹ��
		 	<T extends Parent> -> Parent class�� Parent class�� �ڽ� class�� ���׸�Ÿ�� ��������
		 	�̿��� class�� ���� �Ұ� 
		 	�������� ���� ���� ����
		 	-> interface�� ���� Ÿ�� ���� ����, class�� �Ұ� 
		 	interface�� ���� ��� ����
		 	
	 	- ���׸� ���ϵ� ī�� '<?>'
			���׸� Ÿ���� �Ѱ踦 �����ϱ� ���� ����ϴ� ���
			method�� �Ű����� Ÿ������ ���׸�Ÿ������ ǥ���ϴ� class�� ����Ѵٸ� class�� ǥ����
			���׸�Ÿ���� ����� ǥ������ �ʱ� ������ �ٽ� �ѹ� ���׸��� �����ؾ� �Ѵ� -> class�� �ٸ��� �޸� ������ �ٸ��⶧��
			�̶� ���Ǵ� ���� ���� ����Ѵٶ�� �ؼ� '?' �� ǥ��
			
		- ���ϵ� ī���� ����
			<? extends T> -> TŬ������ �� �ڽı��� ����
			<? super T> -> TŬ������ �� ������� ����( �ڽ� �Ұ� )
			

*/

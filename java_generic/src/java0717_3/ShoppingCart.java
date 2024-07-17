package java0717_3;

import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<CartItem<? extends Product>> list = new ArrayList<>();
	// 제네릭class의 객체를 만드는 경우가 아닌 타입으로만 사용할때는 와일드카드를 이용해 표현
	
	public <T extends Product> void addCart( T item , int quantity ) {
		CartItem<T> cart = new CartItem<>( item , quantity );
		list.add( cart );
	}
	
	public void showCart() {
		for( CartItem<? extends Product> l : list) {
			System.out.println( l );
		}	
	}
	
	
}

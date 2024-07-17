package java0717_3;

import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<CartItem<? extends Product>> list = new ArrayList<>();
	// ���׸�class�� ��ü�� ����� ��찡 �ƴ� Ÿ�����θ� ����Ҷ��� ���ϵ�ī�带 �̿��� ǥ��
	
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

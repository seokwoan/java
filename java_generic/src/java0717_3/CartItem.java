package java0717_3;

public class CartItem<T extends Product> {

	private T item;
	private int quantity; // 구매수량
	
	public CartItem( T item , int quantity ) {
		this.quantity = quantity;
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public int getQuantityr() {
		return quantity;
	}
	public void setQuantityr(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "상품 " + item + " , 수량 : " + quantity + "개";
	}
	
}

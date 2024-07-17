package java0717_3;

public class CartItem<T extends Product> {

	private T item;
	private int quantity; // ���ż���
	
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
		return "��ǰ " + item + " , ���� : " + quantity + "��";
	}
	
}

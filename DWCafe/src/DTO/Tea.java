package DTO;

public class Tea {

	private int price;
	private String name;
	
	public Tea( int price , String name ) {
		this.price = price;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return name + "("+price+"¿ø)";
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

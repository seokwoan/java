package java0717_3;

public class Clothing extends Product{

	private String size; // 옷 사이즈 

	public Clothing( String id , String name , int price , String size ) {
		super( id , name , price);
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return super.toString() + " , 사이즈 : " + size;
	}
	
	
}

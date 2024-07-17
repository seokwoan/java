package java0717_3;

public class Electronics extends Product{

	private String brand; // �귣��
	
	public Electronics( String id , String name , int price , String brand ) {
		super( id , name , price);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return super.toString() + " , " + "�귣�� : " + brand;
	}
	
	
}

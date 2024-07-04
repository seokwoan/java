package homeProduct;

public class House {

	boolean onOff;
	String brand; // 제품브랜드
	int price; // 제품 구매가격
	
	
	
	House(){
		this.onOff = false;
	}
	
	House( String brand , int price ){
		this.brand = brand; // 부모가 가지고 있는 변수는 부모가 초기화
		this.price = price;
	}
	
	void power() {
		this.onOff = !this.onOff;
		System.out.printf( "전원 : %b\n" , this.onOff );
	}
	

}

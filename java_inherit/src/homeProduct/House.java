package homeProduct;

public class House {

	boolean onOff;
	String brand; // ��ǰ�귣��
	int price; // ��ǰ ���Ű���
	
	
	
	House(){
		this.onOff = false;
	}
	
	House( String brand , int price ){
		this.brand = brand; // �θ� ������ �ִ� ������ �θ� �ʱ�ȭ
		this.price = price;
	}
	
	void power() {
		this.onOff = !this.onOff;
		System.out.printf( "���� : %b\n" , this.onOff );
	}
	

}

package homeProduct;

public class Computer extends House {

	
	Computer(){}
	
	Computer( String brand , int price){
		super( brand , price );
	}
	
	
//	abstract void power(); 
	// 부모class에 의해 상속
	// 추상method를 갖기에 추상class가 되거나 method를 정의해야함

	// 추상method인 power를 정의
	@Override
	protected void power() {  
		super.onOff = !super.onOff;
		System.out.printf( "컴퓨터전원 : %s\n", super.onOff );
	}
}

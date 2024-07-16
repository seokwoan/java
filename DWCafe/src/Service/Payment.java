package Service;

import DTO.Coffe;
import DTO.Tea;

public class Payment implements Kiosk{

	private Coffe orderCoffe;
	private Tea orderTea;
	
	public Payment( Object drink ) {
		if( drink instanceof Coffe ) {
			// instanceof -> 부모 자식의 관계에서 class타입 확인하기 위한 연산자
			this.orderCoffe = (Coffe)drink;
		}
		
		if( drink instanceof Tea ) {
			this.orderTea = (Tea)drink;
		}
	}
	
	
	@Override
	public void action() {
		
		System.out.println( "결제 진행 합니다." );
		int price = orderCoffe != null ? orderCoffe.getPrice() : orderTea.getPrice();
		System.out.println( "결제 금액 : " + price );
	}
}















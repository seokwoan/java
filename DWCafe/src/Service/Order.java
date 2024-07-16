package Service;

import java.util.Scanner;

import DTO.Coffe;
import DTO.Tea;

public class Order implements Kiosk{ 
	
	private Coffe orderCoffe;
	private Tea orderTea;
	
	public Order( Coffe orderCoffe ) {
		this.orderCoffe = orderCoffe;
	}
	
	public Order( Tea orderTea ) {
		this.orderTea = orderTea;
	}
	
	@Override
	public void action() {
		
		// 주문 확인 및 결제 
		System.out.println( "주문 메뉴 확인" );
		System.out.println( orderCoffe != null ? orderCoffe : orderTea );
		System.out.println( "=== 결제 ===");
		
		Scanner sc = new Scanner(System.in);
		System.out.print( "1.결제 2. 닫기 : " );
		
		if( sc.nextInt() == 2 ) {
			sc.nextLine();
			return;
		}
		
		sc.nextLine();
		
		Kiosk payment = new Payment( orderCoffe != null ? orderCoffe : orderTea );
		payment.action();
		
		
	}
}

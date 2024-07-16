package Service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import DAO.CoffeDAO;
import DAO.TeaDAO;
import DTO.Coffe;
import DTO.Tea;

public class SelectDrink implements Kiosk{

	private HashMap< Integer , Coffe > coffe;
	private HashMap< Integer , Tea > tea;
	
	public SelectDrink() { // 생성자 method
		
	}
	
	
	@Override
	public void action() {
		Scanner scan = new Scanner(System.in);
		
		while( true ) {
			System.out.println( "1. 커피  2. 티" );
			
			int category = scan.nextInt();
			scan.nextLine();
			
			switch( category ) {
				case 0 : 
					System.out.println( "다음에 만나요" );
					return;
				case 1 :
					selectCoffe();
					break;
				case 2 :
					selectTea();
					break;
				default :
					System.out.println( "다시 입력하세요" );
			
			}
		}
	}
	
	// 커피 선택
	private void selectCoffe() {
		CoffeDAO dao = new CoffeDAO();
		coffe = dao.findAll();
		// findAll();을 부모에서 상속을 못하는 이유는 return타입이 다르다
		
		Set<Integer> ids = coffe.keySet();
		for( Integer id : ids ) {
			System.out.println( id + " . " + coffe.get(id) );
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print( "메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		Kiosk order = new Order( coffe.get( menu ) );
		order.action();
		
	}
	
	// 티 선택
	private void selectTea() {
		TeaDAO dao = new TeaDAO();
		tea = dao.findAll();
		
//		Set<Integer> ids = tea.keySet();
//		
//		for( Integer id : ids ) {
//			System.out.println( id + " . " + tea.get(id) );
//		}
		
		tea.forEach( ( k , v ) -> System.out.println( k + " . " + v) );
		// forEach를 통해 출력 가능
		
		Scanner sc = new Scanner(System.in);
		System.out.print( "메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		if( tea.get( menu ) == null ) return;
		
		Kiosk order = new Order( tea.get( menu ) );
		order.action();
		
	}
	
	
}
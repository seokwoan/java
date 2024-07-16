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
	
	public SelectDrink() { // ������ method
		
	}
	
	
	@Override
	public void action() {
		Scanner scan = new Scanner(System.in);
		
		while( true ) {
			System.out.println( "1. Ŀ��  2. Ƽ" );
			
			int category = scan.nextInt();
			scan.nextLine();
			
			switch( category ) {
				case 0 : 
					System.out.println( "������ ������" );
					return;
				case 1 :
					selectCoffe();
					break;
				case 2 :
					selectTea();
					break;
				default :
					System.out.println( "�ٽ� �Է��ϼ���" );
			
			}
		}
	}
	
	// Ŀ�� ����
	private void selectCoffe() {
		CoffeDAO dao = new CoffeDAO();
		coffe = dao.findAll();
		// findAll();�� �θ𿡼� ����� ���ϴ� ������ returnŸ���� �ٸ���
		
		Set<Integer> ids = coffe.keySet();
		for( Integer id : ids ) {
			System.out.println( id + " . " + coffe.get(id) );
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print( "�޴� ���� : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		Kiosk order = new Order( coffe.get( menu ) );
		order.action();
		
	}
	
	// Ƽ ����
	private void selectTea() {
		TeaDAO dao = new TeaDAO();
		tea = dao.findAll();
		
//		Set<Integer> ids = tea.keySet();
//		
//		for( Integer id : ids ) {
//			System.out.println( id + " . " + tea.get(id) );
//		}
		
		tea.forEach( ( k , v ) -> System.out.println( k + " . " + v) );
		// forEach�� ���� ��� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print( "�޴� ���� : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		if( tea.get( menu ) == null ) return;
		
		Kiosk order = new Order( tea.get( menu ) );
		order.action();
		
	}
	
	
}
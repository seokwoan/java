package java0709_3;

//	class�� ���� ���鶧 
//	class RestCustomer{ // �Ĵ翡 ã�ƿ��� �մ�
//		String customer; // ���� �մ�
//		public void setCustomer( String customer ) {
//			this.customer = customer;
//		}
//	}
//	
//	
//	class ReservCustomerA extends RestCustomer{
//		// ���� �մ� A
//	}
//	
//	class ReservCustomerB extends RestCustomer{
//		// ���� �մ� B
//	}
//	// �մ��� �߰��Ǹ� class�߰� 
//
//
//	class Owner{ // ����
//		void food( ReservCustomerA cusA  ) { // �� �մ��� class�� ����� ���� ������ ���� method�� ����� �����
//			System.out.println( cusA.customer + " û���� �ش�" );
//		}
//		
//		void food( ReservCustomerB cusB ) {
//			System.out.println( cusB.customer + " ��� �ش�" );
//		}
//	}


// interface�� ����Ҷ�
interface RestCustomer{ // �Ĵ翡 ã�ƿ��� �մ�
	public void setCustomer( String customer );
	public String food();
}


class ReservCustomerA implements RestCustomer{
	String customer; // ���� �մ� A
	
	@Override
	public void setCustomer( String customer ) {
		this.customer = customer;
	}
	
	@Override
	public String food() {
		return customer + " û���� �ش�";
	}

}

class ReservCustomerB implements RestCustomer{
	String customer; // ���� �մ� B
	
	@Override
	public void setCustomer( String customer ) {
		this.customer = customer;
	}
	
	@Override
	public String food() {
		return customer + " ��� �ش�";
	}
}

class Owner{ // ����
	void food( RestCustomer cus  ) { // �Ű������� Ÿ���� interface Ÿ������ class���� �ٸ� �ʿ䰡 ����
		System.out.println( cus.food() ); // �մ��� class�� �߰����ְ� �� �߰��� �ʿ䰡 ����
	}
}




public class Interface_test1 {

	public static void main(String[] args) {
		
		Owner ow = new Owner();
		ReservCustomerA a = new ReservCustomerA();
		ReservCustomerB b = new ReservCustomerB();
		
		a.setCustomer( "A-�̼���" );
		b.setCustomer( "B-�庸��" );
		
		ow.food( a );
		ow.food( b );
	}
}







// ��� -> �θ�class - �ڽ�class �ڽ� class�� �θ�class�� ���� ������ ��������?


// �θ� class �л�
// �ʵ��л�, ���л�, ����л�, ���л�

// ���� interface -> ������ ���� ���� method 
// �ʵ��л�, ���л�, ����л�, ���л�

// ����� ��û ó�� class - ��Ʈ�� class 
// ����� ��û�� �ʿ��� ������ ���� �� ���� ���� class - ���� class , interface
// �����͸� �����ϴ� class - ����ڿ��� ������ ������ class - VO , DTO
//					   - �����ͺ��̽��� ������ ������ class - Entity
// �����ͺ��̽� ó�� interface - repository


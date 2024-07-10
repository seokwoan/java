package java0709_3;

//	class를 통해 만들때 
//	class RestCustomer{ // 식당에 찾아오는 손님
//		String customer; // 예약 손님
//		public void setCustomer( String customer ) {
//			this.customer = customer;
//		}
//	}
//	
//	
//	class ReservCustomerA extends RestCustomer{
//		// 에약 손님 A
//	}
//	
//	class ReservCustomerB extends RestCustomer{
//		// 예약 손님 B
//	}
//	// 손님이 추가되면 class추가 
//
//
//	class Owner{ // 사장
//		void food( ReservCustomerA cusA  ) { // 각 손님의 class를 만들고 무슨 음식을 낼지 method를 만들어 줘야함
//			System.out.println( cusA.customer + " 청국장 준다" );
//		}
//		
//		void food( ReservCustomerB cusB ) {
//			System.out.println( cusB.customer + " 돈까스 준다" );
//		}
//	}


// interface를 사용할때
interface RestCustomer{ // 식당에 찾아오는 손님
	public void setCustomer( String customer );
	public String food();
}


class ReservCustomerA implements RestCustomer{
	String customer; // 에약 손님 A
	
	@Override
	public void setCustomer( String customer ) {
		this.customer = customer;
	}
	
	@Override
	public String food() {
		return customer + " 청국장 준다";
	}

}

class ReservCustomerB implements RestCustomer{
	String customer; // 예약 손님 B
	
	@Override
	public void setCustomer( String customer ) {
		this.customer = customer;
	}
	
	@Override
	public String food() {
		return customer + " 돈까스 준다";
	}
}

class Owner{ // 사장
	void food( RestCustomer cus  ) { // 매개변수의 타입이 interface 타입으로 class별로 다를 필요가 없음
		System.out.println( cus.food() ); // 손님의 class만 추가해주고 더 추가할 필요가 없다
	}
}




public class Interface_test1 {

	public static void main(String[] args) {
		
		Owner ow = new Owner();
		ReservCustomerA a = new ReservCustomerA();
		ReservCustomerB b = new ReservCustomerB();
		
		a.setCustomer( "A-이순신" );
		b.setCustomer( "B-장보고" );
		
		ow.food( a );
		ow.food( b );
	}
}







// 상속 -> 부모class - 자식class 자식 class는 부모class의 값을 강제로 가져야함?


// 부모 class 학생
// 초등학생, 중학생, 고등학생, 대학생

// 성적 interface -> 점수를 내기 위한 method 
// 초등학생, 중학생, 고등학생, 대학생

// 사용자 요청 처리 class - 컨트롤 class 
// 사용자 요청에 필요한 데이터 가공 및 수집 실행 class - 서비스 class , interface
// 데이터만 저장하는 class - 사용자에게 제공할 데이터 class - VO , DTO
//					   - 데이터베이스에 저장할 데이터 class - Entity
// 데이터베이스 처리 interface - repository


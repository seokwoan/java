package java0718_3;

public class Money {

	private int myMoney = 10000;
	
	public int getMyMoney() {
		return myMoney;
	}
	
	// widhdraw method를 임계영역으로 설정
	// 여러개의 thread가 하나의 변수 혹은 method를 같이 사용할때 동기화의 문제가 생겨
	// 임계영역을 설정해 하나의 thread씩 순차적으로 실행되게 해준다
	public synchronized boolean widhdraw( int money ) {
		// 제어자 synchronized 타입 method명 -> 제어자와 타입 사이에 synchronized를 입력해서 
		// 임계영역으로 설정해준다
		if( myMoney >= money ) { // 출금금액과 보유금액을 비교해 작거나 같으면 출금
			try {
				Thread.sleep( 1000 ); // 1초의 타임 딜레이 설정
			}
			catch( Exception e ) {}
			
			// 출금
			myMoney -= money; // 1초의 타임 딜레이에서 박문수와 이순신의 출금이 동시에 일어나 잔액이 동시에 빠짐
			// 임계영역을 설정해줘 하나의 thread만 작동되게 해줘야 한다.
			// 임계영역은 thread class가 아닌 thread가 공통으로 작동하는 class의 method에 설정해줘야한다
			return true;
		}
		return false; // 보유금액 부족으로 출금 실패
		
	}
	
	
}

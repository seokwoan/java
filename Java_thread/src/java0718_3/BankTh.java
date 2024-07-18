package java0718_3;

public class BankTh implements Runnable{
	
	Money my = new Money();
	// Money class객체 생성
	
	@Override
	public void run() {
		while( my.getMyMoney() > 0  ) {
			// 출금금액 
			int money = (int)(Math.random() * 3 + 1 ) * 1000;
			if( my.widhdraw(money) ) {
				System.out.println( Thread.currentThread().getName() + " -> 출금 : " + money + " , 잔액 : " + my.getMyMoney() );
			}
			else { // 출금 실패 - 잔액부족
				System.out.println( "출금 거부 - 잔액부족" );
			}
		}
	}

}

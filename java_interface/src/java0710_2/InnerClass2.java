package java0710_2;

interface Runnable{
	public void run();
}



class BankAccount{
	private int balance; // 잔액
	private static String bankName = "계림Bank";
	
	public BankAccount( int balance ) { // 생성자 method
		this.balance= balance;
	}
	
	public void showBalance() { // 잔액 확인 method
		System.out.println( "계좌 잔액 : " + balance );
	}
	
	// instance 내부class
	class transaction{ // 거래 - 입금, 출금
		void deposit( int amount ) {
			balance = balance + amount;
			System.out.println( "입금 금액 : " + amount );
		}
		void withdraw( int amount ) {
			if( balance >= amount ) {
				balance = balance - amount;
				System.out.println( "출금 금액 : " +amount );
			}
			else {
				System.out.println( "잔액 부족! 출금 불가" );
			}
		}
		
	}
	
	// 정적 내부class
	static class BankInfo {
		
		void ShowBankName() {
			System.out.println( "은행 이름 : " + bankName );
		}
	}
	
	
	// 지역 내부class
	public void applyLoan( int amount ) { // 대출 신청
		class Loan{ // 지역 내부class - 대출
			void progress() {
				System.out.println( "대출 신청 금액 : " + amount );
				// 지역 내부class라서 method의 지역변수 사용 가능
			}
		}
		Loan loan = new Loan();
		loan.progress();
	}
	
	
	// 익명 내부class
	public void interestCalc() {
		Runnable interest = new Runnable() {
			@Override
			public void run() {
				int interestMoney = (int) (balance * 0.03);
				balance += interestMoney;
				System.out.println( "이자 지급 : " + interestMoney );
			}
		}; // 익명 내부class의 객체는 1번만 만들수 있다.
		interest.run();
	}
	
}



public class InnerClass2 {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount( 3000000 );
		
		account.showBalance();
		
		// instance 내부class 객체 생성
		BankAccount.transaction tran = account.new transaction();
		// 외부class명.instance내부class명 변수명 = 외부class객체명.new instance내부class명();
		
		tran.deposit( 50000 );
		
		account.showBalance();
		
		tran.withdraw( 200000 );
		
		account.showBalance();
		
		// 정적 내부class 객체 생성
		// 외부class의 객체가 아닌 class를 이용
		BankAccount.BankInfo info = new BankAccount.BankInfo();
		// 외부class명.정적내부class명 변수명 = new 외부class명.정적내부class명();
		
		info.ShowBankName();
		
		
		// 지역 내부class 사용
		
		account.applyLoan( 4000000 );
		account.showBalance();
		
		// 익명 내부class 사용
		
		account.interestCalc();
		account.showBalance();
	}

}


/*
	클래스 :BankAccount; BackAccounts -
	인스턴트내부class : Tansactoin (거래)	
	정젹 내부class : BaknkInf{)
	지역 내부class : loan(대출)
	악명 내부class Runnable(이자 겸삿)
 */



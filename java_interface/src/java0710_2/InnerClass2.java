package java0710_2;

interface Runnable{
	public void run();
}



class BankAccount{
	private int balance; // �ܾ�
	private static String bankName = "�踲Bank";
	
	public BankAccount( int balance ) { // ������ method
		this.balance= balance;
	}
	
	public void showBalance() { // �ܾ� Ȯ�� method
		System.out.println( "���� �ܾ� : " + balance );
	}
	
	// instance ����class
	class transaction{ // �ŷ� - �Ա�, ���
		void deposit( int amount ) {
			balance = balance + amount;
			System.out.println( "�Ա� �ݾ� : " + amount );
		}
		void withdraw( int amount ) {
			if( balance >= amount ) {
				balance = balance - amount;
				System.out.println( "��� �ݾ� : " +amount );
			}
			else {
				System.out.println( "�ܾ� ����! ��� �Ұ�" );
			}
		}
		
	}
	
	// ���� ����class
	static class BankInfo {
		
		void ShowBankName() {
			System.out.println( "���� �̸� : " + bankName );
		}
	}
	
	
	// ���� ����class
	public void applyLoan( int amount ) { // ���� ��û
		class Loan{ // ���� ����class - ����
			void progress() {
				System.out.println( "���� ��û �ݾ� : " + amount );
				// ���� ����class�� method�� �������� ��� ����
			}
		}
		Loan loan = new Loan();
		loan.progress();
	}
	
	
	// �͸� ����class
	public void interestCalc() {
		Runnable interest = new Runnable() {
			@Override
			public void run() {
				int interestMoney = (int) (balance * 0.03);
				balance += interestMoney;
				System.out.println( "���� ���� : " + interestMoney );
			}
		}; // �͸� ����class�� ��ü�� 1���� ����� �ִ�.
		interest.run();
	}
	
}



public class InnerClass2 {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount( 3000000 );
		
		account.showBalance();
		
		// instance ����class ��ü ����
		BankAccount.transaction tran = account.new transaction();
		// �ܺ�class��.instance����class�� ������ = �ܺ�class��ü��.new instance����class��();
		
		tran.deposit( 50000 );
		
		account.showBalance();
		
		tran.withdraw( 200000 );
		
		account.showBalance();
		
		// ���� ����class ��ü ����
		// �ܺ�class�� ��ü�� �ƴ� class�� �̿�
		BankAccount.BankInfo info = new BankAccount.BankInfo();
		// �ܺ�class��.��������class�� ������ = new �ܺ�class��.��������class��();
		
		info.ShowBankName();
		
		
		// ���� ����class ���
		
		account.applyLoan( 4000000 );
		account.showBalance();
		
		// �͸� ����class ���
		
		account.interestCalc();
		account.showBalance();
	}

}


/*
	Ŭ���� :BankAccount; BackAccounts -
	�ν���Ʈ����class : Tansactoin (�ŷ�)	
	���� ����class : BaknkInf{)
	���� ����class : loan(����)
	�Ǹ� ����class Runnable(���� ���)
 */



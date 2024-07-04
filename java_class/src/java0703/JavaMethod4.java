package java0703;

public class JavaMethod4 {

	public static void main(String[] args) {
		
		// method�� ���ؼ� ���� 10�� �޾� ����ϱ�
		ReturnMth rm = new ReturnMth(); // instance method�� �����ϱ����� ��ü ����
		int num = rm.get(); // instance method�� ȣ���� ������ ����
		System.out.printf( "%d\n" , num );

		
		// method�κ��� �� ������ ���ϱ� ��� �޾Ƽ� ����ϱ�
		int result = rm.sum();
		// return���� �ִ� method�� ���� ���� ������ return�� ������Ÿ�԰� ���� ������Ÿ���̾�� �Ѵ�
		System.out.printf( "%d\n" , result );
		
		// ������ ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���̰� ��µǰ��ϱ�
		String userName = rm.getName();
		int age = 34;
		System.out.println( userName + " " + age );
		System.out.printf( "%s %d\n" , userName , age );
		
		// ����� method�� �ƴ� main���� �� ��
		// ����(89), ����(78), ����(50) �� ������ ������ ���ϴ� method
		// �� ������ ����� ���ϴ� method
		// ������ ����� ����ϼ���
		int total = rm.total(); // method���� ���� ����ؼ� return�� �ޱ�
		int avg = rm.avg(total); // return ���� �� �Ű������� method�� �Ѱ� ��հ� return
		System.out.printf( "���� : %d \n��� : %d\n", total , avg );
		
		Dice game = new Dice();
		int ���� = game.chance();
		int ���� = game.chance();
		game.winner( ���� , ���� );
	}

}

/*
	�ֻ��� ����
	
	j���ذ� s�����̰� �ֻ��� ������ �Ѵ�.
	�ֻ����� �ϳ�, �����̴�
	�ֻ����� ���� ū ����� �̱��.
	
	�ֻ����� �� ���ϴ� method
	
	�ֻ��� ���� ���Ͽ� ���� �̰���� ����ϴ� method 
 
*/


class ReturnMth{
	
	int get() {
		return 10; // return�� method ������ �����Ͱ��� �ܺη� �Ѱ��ٶ� ���
		// 10�� get method���ο� ����
	}
	
	int sum() {
		int num1 = 30, num2 = 45;
		int result = num1 + num2 ;
		return result; 
		// method���� ����� ���� ������ ���� return�� �ܺο��� ����ؾ��Ѵ�
		// ���ο� �ܺ� ��� ������� ������ method�� ����� ������ ����
	}
	
	String getName() {
		String name = "�̼���";
		return name;
	}
	
	int total() {
		int ���� = 89 , ���� = 78 , ���� = 50;
		int plus = ���� + ���� + ����;
		return plus;
	}
	
	int avg( int total ) {
		int avg = total / 3;
		return avg;
	}
	
}

class Dice{
	
	int chance() {
		int roll = (int) ( Math.random() * 6 + 1 );
		return roll;		
	}
	
	void winner( int ���� , int ���� ) {
		String lose = null;
		if( ���� > ���� ) {
			lose = "���� ��";
		}
		else if( ���� < ����) {
			lose = "���� ��";
		}
		else {
			lose = "���º�";
		}
		System.out.printf( "���� �ֻ��� : %d \n���� �ֻ��� : %d\n��� : %s" , ����, ����, lose );	
	}
}












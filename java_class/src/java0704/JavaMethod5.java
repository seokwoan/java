package java0704;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {
		
		// �� ���� ������ ��ȯ�ϱ�
		// return
		MethodUtil util = new MethodUtil();
		int[] num = util.twoNum(); // return�� ������ Ÿ���� �迭�̸� �������� �迭�� �޾ƾ� �Ѵ�.
		
		System.out.println( Arrays.toString(num));
		
		// �簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����ϼ���
		// ���̴� main method���� ��µǰ� �ϼ���
		
//		Box box = new Box();
//		box.main();
//		int area = util.rectArea();
//		System.out.println( "���� : " + area );
		
		// �α��� ������ ���̵�� skyblue ��й�ȣ�� 1234sea
		// login method�� �����Ͽ� �α��� ���θ� ����ϼ���
		// ���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
		// �ϳ��� ����ġ�� �α��� ���� ���
		// �α��� ���� ����� main���� 
		
		
//		boolean isFail = util.login();
//		if( isFail ) {
//			System.out.println( "�α��ο� �����ϼ̽��ϴ�.");
//		}
//		else {
//			System.out.println( "�α��ο� �����ϼ̽��ϴ�.");
//		}
		
		// ���� 3���� Ű���带 ���� �Է� ��������.
		// �Է��� �� ������ ���� 100�� ������ 100 - ���� ����� ����ϰ� 
		// 100�� ���� ������ �� ������ ���� ����ϼ���
		// main method���� ���
		
		int calc = util.numSum();
		System.out.printf( "�� ������ ��  : %d ", calc );
	}

}


class MethodUtil{

	int[] twoNum() { // return���� 2�� �̻��� ���� �������� �迭�� �������Ѵ�. 
		int num1 = 20, num2 = 50;
//		int[] temp = new int[] { num1 , num2 }; // �迭���� ���ؼ� ���ο� �迭�� ���� �ǰ�
		return new int[] { num1 , num2 };		// ���ο� �迭�� return�� ���� �ȴ�
//		return num2; // return num1; ���� method�� ����� ������ ���ϴ� �ڵ� 2���� return �Ұ�
		// return���� ��ȯ ��ų�� �ִ� ���� ���� ���̴�.
	}
		
	int rectArea() {
		int width = 45, height = 50;
		int area = width * height;
		return area;
		
	}
	
	
	boolean login(){
		Scanner sc = new Scanner(System.in);
		System.out.print( "���̵� : " );
		String id = sc.nextLine();
		System.out.print( "��й�ȣ : ");
		String password = sc.nextLine();
		
		
//		boolean success = false;
		boolean logCheck = id.equals("skyblue") && password.equals("1234sea");
//		boolean pwCheck = password.equals("1234sea");
//		if( logCheck ) { 
//			success = true;
//		}
		return logCheck;
		
//		boolean isSuccess = true;
//		if( id.equals("skyblue") ) {
//			if( password.equals("1234sea") )
//				return isSuccess; // if������ return�� ������ ������ �ƴ϶� if���� return�� ���� ����
//		}
//		return isSuccess = false; // if������ return 
		
	}
	
	int numSum() {
		Scanner num = new Scanner(System.in);
		System.out.print( "ù��° ������ �Է��ϼ��� : " );
		int num1 = num.nextInt();
		System.out.print( "�ι�° ������ �Է��ϼ��� : " );
		num1 += num.nextInt();
		System.out.print( "����° ������ �Է��ϼ��� : " );
		num1 += num.nextInt();
		if( num1 > 100 ) {
			num1 = 100 - num1;
		}
		return num1;
	}
	
}

class Box{
	
	void main() {
		Scanner cm = new Scanner(System.in); 
		// method���� ���� ������ ���� ������ method�� ����Ǹ� �����
		// new �����ڸ� ���� ������� ���������� ������� ����
		int row;
		int col;
		int cross;
		System.out.print( "������ ���̸� �Է��ϼ��� : " );
//		row = cm.nextInt();
		row = Integer.parseInt(cm.nextLine() );
		System.out.print( "������ ���̸� �Է��ϼ��� : " );
//		col = cm.nextInt();
		col = Integer.parseInt( cm.nextLine() );
		cross = row * col;
		
		System.out.printf( "���� %d ���� %d ���� %d\n", row, col, cross );
		
		
	}
	
}





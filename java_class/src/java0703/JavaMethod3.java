package java0703;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		
		// ���� �ΰ� �Է¹޾� ���� ����ϱ�
		Calc calc = new Calc(); // Calc ��ü ����
		calc.sum(40,10);  // ���� �̸��� method�� overloading
		
		
		//calc.sum(); // Calc��ü�� sum method ȣ��
		
		// �� ������ ������ ���Ͽ� ����ϼ��� 
		int kor = 89, eng = 74 , mat = 43;
		
		calc.sum( kor , eng , mat );
		
		// method ȣ���Ͽ� '�޼��� dog����~' ��� ���
		calc.sum( '��' );
		calc.sum( "dog" );
		calc.view();
		
		//method�� ȣ���Ͽ� �̸��� ���̸� ����ϼ���
		// �Ű����� ���� method, Ű���� �Է�X
		
		calc.person(); 
		// instance method, ������ class�� ��ü(instance)�� ���� ȣ���ؾ��Ѵ�.
		// class method, ������ class �̸��� ���� ȣ�� -> static�� ���� ���
		
		
		// method�� ȣ���Ͽ� �Ʒ��� �����͸� ����ϼ���
		String animal = "��帮Ʈ����";
		String ������ = "2024-07-01";
		
		TestMethod testMethod = new TestMethod();
		
		testMethod.animalStray( animal , ������ );
		
		
		// ���� ��¥�߿��� ���� �ϸ� ����ϼ���
		// ���ڿ� method substring �Ǵ� split ���
		String examDate = "2024-08-13";
		testMethod.split(examDate);
		testMethod.substring(examDate);
		
		// �� ����� ���� ��� ���� ���Ͽ� ����ϼ���
		// ��հ��� �����Դϴ�
		int ��� = 31, ���� = 23, ���� = 28, ��� = 37;
		
		testMethod.avg(���, ����, ����, ���);
		
	}

}

class Calc{
	
	void sum( int num1 , int num2 ) {
		int result = num1 + num2;
		System.out.printf( "�� ������ �� : %d\n" , result );
	}
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.println( "ù��° ���� : " );
		int num1 = scan.nextInt();
		System.out.println( "�ι�° ���� : " );
		int num2 = scan.nextInt();
		int result = num1 + num2;
		System.out.printf( "�� ������ �� : %d\n" , result );
	}
	
	void sum( int kor , int eng , int mat) {
		int result = kor + eng + mat;
		System.out.printf( "�� ������ ���� : %d\n" , result );
	}
	
	void sum( char dog ) {
		System.out.printf( "�޼��� %c����~ \n" , dog );
	}
	
	void sum( String dog ) {
		System.out.printf( "�޼��� %s����~ \n", dog );
	}
	
	void view() { // ���� a,b�� �� ����ϴ� method
		int a = 10 , b = 20;
		System.out.printf( " a : %d, b : %d \n" , a , b  );
	}
	
	void person() {
		String name = "�̼���";
		int age = 35;
		System.out.printf( "�̸� : %s, ���� : %d\n" , name , age );
	}
	
}


class TestMethod{
	void animalStray( String animal , String date) {
		System.out.printf( "\n���� : %s \n������ : %s\n" , animal , date );
	}
	
	
	void split( String date ) {
		String[] day  = date.split("-"); // split("������ǥ") -> ������ǥ�� Ư������ ���� �����ʹ� �迭
		System.out.println( day[1] + "��" + day[2] + "��");
	}
	
	
	void substring( String date ) {
		String day = date.substring( 5 , date.length() );
		System.out.println( day );
	}
	
	void avg( int ��� , int ���� , int ���� , int ��� ) {
		int total = ��� + ���� + ���� + ���;
		int avg = total / 4;
		System.out.printf( "�� ����� ��� ���� : %d ", avg );
	}
}















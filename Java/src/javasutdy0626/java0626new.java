package javasutdy0626;

import java.util.Scanner;

public class java0626new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("�ڹ����");
		// System.in -> �Է� 
		// �Է¹����� �ִ� ���� Ŭ���� Scanner
		Scanner scan = new Scanner(System.in);
		// �ٸ� ��Ű���� ������� ��θ� ������ �����
		// new�� ���� �����ϸ� �޸� �ּҸ� ���� 
		// �޸� �ּҸ� ���� ������ �������������
		// float Ÿ�� - .nextfloat , double - /nextdouble
		// .next���� ���� ������Ÿ���� �־���
		// char�� ����. ���ڸ� ������ ���� ���ڿ��� �޾ƾ���
		// ���ڿ� .nextLine() , next() 
		
//		System.out.print( "���� �Է� : " );
//		int a = scan.nextInt();
//		
//		System.out.printf( "%d\n", a );
		
		
		// ö���� ������ �Ա����� �������� ����.
		// ��Զ��� �ﰢ���, �ٳ��������� �Ծ���.
		// ö���� ���ɰ����� ������ �ݾ��� ���ΰ�?
		// int ��Զ��, �ﰢ���, �ٳ�������; -> ������Ÿ���� �����༭ �ʱⰪ�� ���ְ� �������� ������ ���� ����� ����
		
//		System.out.print( "��Զ�� �� : ");
//		int noodle = scan.nextInt();
//		System.out.print( "\n�ﰢ��� �� : ");
//		int kimbab = scan.nextInt();
//		System.out.print( "\n�ٳ������� �� : ");
//		int milk = scan.nextInt();
//		int amount = noodle + kimbab + milk;
//		//System.out.print( "\n���ɰ��� " + amount + "��\n" );
//		System.out.printf( "\n���ɰ��� %d�� \n" , amount); 
		
		// �μ��� ģ������ ���������� ���Դ�.
		// ���ͼ����� ������ ���� �ͼ� ���� ���ٿԴ�.
		// �̹����� �Ź��� ¦¦�̷� �ž �ٽ� ���� ���ٿԴ�.
		// �μ��� ���� 5���̴�. �μ��� 1�� �ö󰡴µ� 3.4�ʰ� �ɸ���.
		// �μ��� ���� ���� ���Դ� �ϴµ� �ɸ� �� �ð��� �� ��?
//		float sec = 3.4f;
//		int floor = 4; // 5
//		int much = 4;
//		float howLong = sec * floor * much; // 5�� ������ (floor-1)
//		System.out.printf( "�� %.1f�� �ɷȽ��ϴ�.\n" , howLong);

		// ���α׷� �ڵ�� �⺻������ ��������
		// if(���ǹ�), �Լ�(�޼���), �ݺ���, goto��(�̸��ִ�for��) ���������� �ƴ϶� �б�����
		
		
		
		
		/* 
		 �������� ������ ����, �Ǽ�, ����, boolean(true,false)
		 ������Ÿ��
		 	���� - byte, short, int, long
		 	���� - char
		 	�Ǽ� - float, double
		 	������ - boolean
		 �� ���� �տ� �Ἥ ������ ������ �Ѵ�.
		 
		 ���� ���� ���
		 (������Ÿ��) (������);
		 int num; ���� Ÿ�� ���� ����
		 double dnum; �Ǽ� Ÿ�� ���� ����
		 char ch; ���� Ÿ�� ���� ����
		 boolean bool; �� ���� ���� ����
		 
		 ������ �ʱ�ȭ
		 int num = 10; ���� ����� �Բ� �����͸� ����
		 
		 ��� ��� 
		 System.out.println( ��³��� );
		 System.out.print( ��³��� );
		 System.out.printf( ��³��� , ����(�ְ����ϴ� ������), ����(�������� �����͸� �������� ������ �÷��ָ� �ȴ�. �� ������ ������ Ÿ�Կ� �´� ���� ������ ��� ) );
		 
		 printf ���� �Բ� ����ϴ� ����������
		 	%d, %u - ���� / %f - �Ǽ� / %c - ���� / %s - ���ڿ�
		 
		 int age = 28;
		 System.out.printf( "%s ������ ���̰� %d���� ���������� %c��" , "�ڵ���" , age , '��' );
		 
		 �Է¹��
		 Scanner Ŭ���� ��ü �ʿ�
		 Scanner ������ = new Scanner(System.in);
		 *Scanner Ŭ������ ����ܺ�Ŭ�����̹Ƿ� import �ؾ��Ѵ�. 
		 ������.nextInt(); intŸ�� ������ �Է°���
		 ������.nextByte(); byteŸ�� ������ �Է°���
		 .nextLong(); longŸ�� ������ �з�
		 .nextShort(); shortŸ�� ������ �Է�
		 .nextFloat(); floatŸ�� �Ǽ��� �Է�
		 .nextDouble(); doubleŸ�� �Ǽ��� �Է�
		 .next(); ���ڿ� �Է�
		 .nextLine(); ���ڿ� �Է�
		 
		 */
			
		// c���, �ڹ�, �����а��� ���輺���� �Է��ϼ���.
		// �������� ������ ����� ���� ����ϼ���.
		Scanner score = new Scanner(System.in);
		
		System.out.printf( "c��� ���� : " );
		float cLang = score.nextFloat();
		System.out.printf( "�ڹ� ���� : " );
		float java = score.nextFloat();
		System.out.printf( "�����а��� ���� : " );
		float arch = score.nextFloat();
		
		float total = cLang + java + arch;
		float avg = total/3;
		
		System.out.printf( "�� ������ ���� : %.0f �� \n�� ������ ��� : %.2f ��" , total , avg );

		//test

	}

}

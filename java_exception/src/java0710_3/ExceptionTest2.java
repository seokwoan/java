package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		int num = 0;
		boolean is = true;
		Scanner scan = new Scanner(System.in);

		do {
			try {
				System.out.print( "���� �Է� : " );
				num = scan.nextInt();
				// int num = scan.nextInt(); -> {}�߰�ȣ �ȿ��� ������� ������ ���������� {}�ȿ����� ��밡��
				// try�ȿ��� �������� ����
				is = false;
			}
			catch( InputMismatchException e ) { // �Ϻδ� import�� �ʿ��ϴ� 
				System.out.println( "������ �Է��ϼ���" );
			}
			finally { // try-catch������ ����ó���� �Ҷ� ���� ���ο� ������� ����
				// ���� ������ -> try - finally ����
				// ���� ������ -> catch - finally ����
				// ������ �ְ� ���� ������ �ڵ带 finally�� ���� ����
				// ����, database�� ����Ҷ� ���
				// ���� ���⸦ �õ������� �ݾ������ -> ������ ���� �Է¹��۸� ��� -> �ݾƼ� �Է¹��۸� ������ 
				// �Է¹��۰� ������ �ٸ� ������ ���� ������ ��������
				scan.nextLine();
			}
		}while( is );
		
		
		System.out.println( num + 100 );
		
		System.out.print( "�̸� : " );
		String name = scan.nextLine();
		System.out.println( name );
		
		
		
		
	}

}

package java0718;

import java.util.Scanner;

public class JavaThread_2 {

	public static void main(String[] args) throws InterruptedException {
		
		Th1 th = new Th1(); 
		// �Ϲ� class�� ��ü ���� -> Runnable�� implement�� class�� ��ü
		// Thread��ü�� �ƴ� 
		
		// th.run(); -> thread�� ��ü�� �ƴ϶� �Ϲݰ�ü�� run�� ȣ���Ѱ��̹Ƿ� 
		// thread�� �������� �ʰ� stack���� ����ȴ�
		
		new Thread(th).start();
		// Runnable�� implement�� ��ü�� Thread class�� ��ü�� �������
		
		
		for( int i = 1 ; i <= 5 ; i++ ) {
			System.out.println( "��� ��� ������ " + i );
			Thread.sleep(2000);
			// add throws declaration
		}

	}

}


class Th1 implements Runnable{
	
	
	@Override
	public void run() { // Thread���� ������ run method�� main methodó�� ���
		Scanner sc = new Scanner(System.in);
		System.out.print( "���� �Է� : " );
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println( "�Է� ���� : " + num );
		
	}
}
















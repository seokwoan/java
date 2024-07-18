package java0718;

import java.util.Scanner;

public class JavaThread_1 {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		// Thread class�� ����� class�� ��ü�� ������ �Ѵ�
		th.start();
		// ��ü�� ����� .start()�� ���� ������Ѿ� �Ѵ�
		// ���ο� thread��ü�� ����� .start���ϸ� ������� run method�� �����ؼ� 
		// ���� method�� �������� �ʾƵ� �ȴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print( "���� �Է�" );
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println( num );
		
		// thread��ü�� run()�� ����Ǹ鼭 ���ÿ� ���� �Է��� ����
		
		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.println( "    ���� Main " + i );
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}


/*
	���μ���	- cpu������ �޸�(ram)�� �ε�Ǿ��ִ� ���α׷��� ���Ѵ�
			  ��, �������� ���α׷����� ���μ����̴�
			  102���� ���μ����� �ִٶ�� �̾߱�� 102���� ���α׷��� �������̴� ��� �̾߱��
			  cmd -> tasklist, �۾������ڷ� Ȯ�� ���� 
			  ���μ��� ���� - taskkill /pid[pid��]

	thread	- ���μ����ȿ��� ������ ������ �����ϴ� ����
			  thread�� �߰��ϸ� ���ÿ� �������� ������ ���� �� �� �ִ�.

	�ڹ� thread
	thread ������
	Thread() : ���ο� thread ��ü �Ҵ�
	Thread("�̸�") : ���ο� thread ��ü�� �����ϸ鼭 �̸� �ο�
	Runnable interface�� implement
	
*/


class MyThread extends Thread{
	// Thread�� ����� class�� �������
	
	@Override
	public void run() { // ��ü�� ����� ���� ���� �����
		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.println( "�� �������~~" + i );
			try {
				Thread.sleep(1000); // sleep�� try catch�� �־����
				// Thread class�� method .sleep(ms) -> ms�� ������ ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// thread�� �̿��� �۵��� ������ �������
	// run() method�� �̿��ؾ��Ѵ�
	// Runnable interface�� ���ǵ� run() method�� Thread class�� ������ �ִ�
	// run() method�� Override�� ����Ѵ� 
}
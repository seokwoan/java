package java0718_2;

import java.util.Scanner;

public class NormalTh extends Thread{

	private String name;
	
	public NormalTh( String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println( "������� : " + name );
		DaemonTh th = new DaemonTh();
		// main method�� �ƴ� �ٸ� thread���� ����� ��� �۵��ϴ°�
		th.setDaemon( true );
		th.start();
		
		Scanner sc = new Scanner(System.in);
		for( int i = 0 ; i < 3  ; i++ ) {
			System.out.print( "�ƹ��ų� �Է� : " );
			String word = sc.nextLine();
			System.out.println( word );
		}
	}
}

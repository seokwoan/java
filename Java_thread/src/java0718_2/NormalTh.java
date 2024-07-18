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
		System.out.println( "쓰레드명 : " + name );
		DaemonTh th = new DaemonTh();
		// main method가 아닌 다른 thread에서 만들면 어떻게 작동하는가
		th.setDaemon( true );
		th.start();
		
		Scanner sc = new Scanner(System.in);
		for( int i = 0 ; i < 3  ; i++ ) {
			System.out.print( "아무거나 입력 : " );
			String word = sc.nextLine();
			System.out.println( word );
		}
	}
}

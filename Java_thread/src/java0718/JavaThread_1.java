package java0718;

import java.util.Scanner;

public class JavaThread_1 {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		// Thread class를 상속한 class의 객체를 만들어야 한다
		th.start();
		// 객체를 만들고 .start()를 통해 실행시켜야 한다
		// 새로운 thread객체를 만들고 .start를하면 가장먼저 run method를 실행해서 
		// 따로 method를 실행하지 않아도 된다
		
		Scanner sc = new Scanner(System.in);
		System.out.print( "숫자 입력" );
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println( num );
		
		// thread객체의 run()이 실행되면서 동시에 숫자 입력이 실행
		
		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.println( "    나는 Main " + i );
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}


/*
	프로세스	- cpu에의해 메모리(ram)에 로드되어있는 프로그램을 말한다
			  즉, 실행중인 프로그램들이 프로세스이다
			  102개의 프로세스가 있다라는 이야기는 102개의 프로그램이 실행중이다 라는 이야기다
			  cmd -> tasklist, 작업관리자로 확인 가능 
			  프로세서 종료 - taskkill /pid[pid값]

	thread	- 프로세스안에서 실제로 동작을 수행하는 단위
			  thread를 추가하면 동시에 여러개의 동작을 수행 할 수 있다.

	자바 thread
	thread 생성자
	Thread() : 새로운 thread 객체 할당
	Thread("이름") : 새로운 thread 객체를 생성하면서 이름 부여
	Runnable interface를 implement
	
*/


class MyThread extends Thread{
	// Thread를 상속한 class를 만들어줌
	
	@Override
	public void run() { // 객체를 만들면 가장 먼저 실행됨
		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.println( "나 쓰레드야~~" + i );
			try {
				Thread.sleep(1000); // sleep은 try catch가 있어야함
				// Thread class의 method .sleep(ms) -> ms의 단위를 가짐
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// thread를 이용해 작동할 내용을 만들어줌
	// run() method를 이용해야한다
	// Runnable interface에 정의된 run() method를 Thread class가 가지고 있다
	// run() method를 Override해 사용한다 
}
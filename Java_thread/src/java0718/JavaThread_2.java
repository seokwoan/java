package java0718;

import java.util.Scanner;

public class JavaThread_2 {

	public static void main(String[] args) throws InterruptedException {
		
		Th1 th = new Th1(); 
		// 일반 class의 객체 생성 -> Runnable이 implement된 class의 객체
		// Thread객체가 아님 
		
		// th.run(); -> thread의 객체가 아니라 일반객체의 run을 호출한것이므로 
		// thread가 생성되지 않고 stack으로 실행된다
		
		new Thread(th).start();
		// Runnable이 implement된 객체를 Thread class의 객체로 만들어줌
		
		
		for( int i = 1 ; i <= 5 ; i++ ) {
			System.out.println( "비야 비야 오지마 " + i );
			Thread.sleep(2000);
			// add throws declaration
		}

	}

}


class Th1 implements Runnable{
	
	
	@Override
	public void run() { // Thread에서 생성한 run method는 main method처럼 사용
		Scanner sc = new Scanner(System.in);
		System.out.print( "숫자 입력 : " );
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println( "입력 숫자 : " + num );
		
	}
}
















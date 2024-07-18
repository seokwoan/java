package java0718;

public class JavaThread_3 {

	public static void main(String[] args) {
		
		MeThread th1 = new MeThread( 2000 , "이천" );
		MeThread th2 = new MeThread( 3000 , "삼천" );
		
		// 순차적으로 thread실행
		th1.start();
		// th1이 끝나면 th2를 실행
		// main에의해 실행되지만 main으로 제어 불가
		
		try {
			th1.join(); // 해당 thread다음에 실행되는 thread를 대기상태로 만들어줌
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		
		
		

		
		
		// while문을 통해 thread제어
//		while(true) {
//			System.out.print(""); // main method가 계속 실행되게 해줌
//			int num = MeThread.num;
//			if( num == 15) {
//				th1.stop(); // .stop은 예전사용법 
//				th2.stop();
//				break;
//			}
//		}

	}

}

/*
	Thread class의 method
	
	sleep(ms)			
		- 지정된 시간 만큼 대기
		
	start()
		- thread시작 run method실행
		
	join()
		- 해당 thread가 끝날때까지 다음 thread 대기
		
	run()				
		- thread가 실행하는 method
		
	stop()				
		- thread 중단 (사용 권장하지 않음)
		
	interrupt()			
		- thread 중단
		
	setPriority(정수값)	
		- thread우선순위 
	
	getPriority()
		- 설정된 쓰레드 우선 순위값
		
	isAlive() 
		- 현재 thread가 살아있냐 -> 종료가 되었냐 살아있다면 true, 종료되었다면 false
	
	suspend()
		- thread를 일시정지 시킨다 ( 사용 권장x )
		
	resume()
		- 일시정지된 thread를 실행< 사용 권장x )
		
	yield() 
		- 다른 thread에게 실행 상태를 양보하고 대기
	
	notify() 
		- 대기 상태에 있는 thread 실행대기로 변환
		  실행대기에 았는 thread는 실행 상태로 변환 된다
	
	
	
 */
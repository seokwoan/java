package java0719;

import java.lang.Thread.State;

public class ThreadState {

	private static Thread thread;
	private static Thread stateThread;
	
	public static void main(String[] args) {
		stateThread = new Thread(() -> {  // 익명 class객체 생성 thread의 상태 확인하기 위함
			// 익명class는 run method가 없음
			while( true ) {
				State state = thread.getState(); // thread객체의 상태
				System.out.println( thread.getName() + " - 쓰레드... 상태 : " + state );
				if( state == State.NEW ) {
					System.out.println( "쓰레드 실행 준비 단계" );
					thread.start();
				}
				
				if( state == State.WAITING ) {
					System.out.println( "쓰레드 대기 단계" );
					thread.interrupt();
					// thread를 종료시키는 동작, 대기상태의 thread가 실행 가능한상태로 바꾸는 동작
					// 2가지의 동작 가능
					// WAITING 상태에서 interrupt를 해야 실행
					// RUNNABLE상태에서는 종료
				}
				
				if( state == State.TERMINATED ) {
					System.out.println( thread.getName() + " - 쓰레드... 상태 : " + state );
					break; // terminated 상태라면 thread가 종료된 상태이다.
				}
				
//				try {
//					Thread.sleep( 500 );
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				
			}
			
		});
	

		thread = new My( " 쓰레드 1번 " , stateThread );
		stateThread.start();
		
	}

}

package java0719;

import java.lang.Thread.State;

public class ThreadState {

	private static Thread thread;
	private static Thread stateThread;
	
	public static void main(String[] args) {
		stateThread = new Thread(() -> {  // �͸� class��ü ���� thread�� ���� Ȯ���ϱ� ����
			// �͸�class�� run method�� ����
			while( true ) {
				State state = thread.getState(); // thread��ü�� ����
				System.out.println( thread.getName() + " - ������... ���� : " + state );
				if( state == State.NEW ) {
					System.out.println( "������ ���� �غ� �ܰ�" );
					thread.start();
				}
				
				if( state == State.WAITING ) {
					System.out.println( "������ ��� �ܰ�" );
					thread.interrupt();
					// thread�� �����Ű�� ����, �������� thread�� ���� �����ѻ��·� �ٲٴ� ����
					// 2������ ���� ����
					// WAITING ���¿��� interrupt�� �ؾ� ����
					// RUNNABLE���¿����� ����
				}
				
				if( state == State.TERMINATED ) {
					System.out.println( thread.getName() + " - ������... ���� : " + state );
					break; // terminated ���¶�� thread�� ����� �����̴�.
				}
				
//				try {
//					Thread.sleep( 500 );
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				
			}
			
		});
	

		thread = new My( " ������ 1�� " , stateThread );
		stateThread.start();
		
	}

}

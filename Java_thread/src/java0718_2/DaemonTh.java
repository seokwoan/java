package java0718_2;

public class DaemonTh extends Thread{

	@Override
	public void run() {
		System.out.println( "���� ������ ����" );
		
		while( true ) {
			System.out.println( "�ڵ�����" );
			
			try {
				Thread.sleep( 1000 );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}


/*
	���� thread
		��thread�� �����ϴ� thread
		��thread�� ����Ǹ� ����thread�� ����ȴ�

	��thread�� ���� ��� �ؾ������� ����thread�� ��thread�� ������ �ޱ� ������ 
	������ ��� ���� �ʾƵ� �ȴ�
	


*/
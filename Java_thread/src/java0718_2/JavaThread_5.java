package java0718_2;

public class JavaThread_5 {

	public static void main(String[] args) throws InterruptedException {
		
//		DaemonTh dm = new DaemonTh();
//		
//		dm.setDaemon( true );
//		// main thread�� ������ �ްԵ� -> main�� ����Ǹ� ���� �����
//		
//		dm.start();
		
		
		NormalTh th = new NormalTh("�Ϲ�");
		th.start();
		// main�� �ƴ� �ٸ� thread�� ����thread�� ������ ��thread�� ���������� ��� ����
		// main�� ������ ��thread�� ������ �ʾ����� ��� ����
		
		
		
		Thread.sleep( 6000 );
		// main�� 6�ʵ��� ��������ָ� ����thread�� 6�ʵ��� ���� -> main����� ���� ����
		
		System.out.println( "main ����" );
			

	}

}

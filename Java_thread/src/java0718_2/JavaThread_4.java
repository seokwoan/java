package java0718_2;

public class JavaThread_4 {
	

	public static void main(String[] args) {

		Web th1 = new Web("ù°");
		
		Web th2 = new Web(" ��°");
		
		Web th3 = new Web("  ��°");
		
		Web th4 = new Web("    ��°");
		
		th1.setPriority( Thread.MAX_PRIORITY );
		th2.setPriority( Thread.NORM_PRIORITY );
		th3.setPriority( Thread.MIN_PRIORITY );
		th4.setPriority( Thread.MAX_PRIORITY );
		
		// ����Ǵ� ������ MAX - NORM - MIN
		// thread�� �켱���� �ο��� �� ���� thread�� �������� ���� ó���� ���� ���ִ°�
		// ���� �ڵ忩�� ó�� �ð��� �ٸ��� -> �켱������ ���̸� �ð��Ҵ��� ���� ���༭ ���� ���� Ȯ���� ������
		// �켱������ ���Ƶ� ó���ð��� ��� �� �ʰ� ������
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
	}
	
}
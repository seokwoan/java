package java0718;

public class MeThread extends Thread{

	public static int num = 10; // class ���� MeThread�� ��ü���� ����
	private int time; // sleep�� ������ �ð�
	
	public MeThread( int time , String name ) {
		
		super( name );
		this.time = time;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName(); // thread�� ������ �ִ� �⺻ �̸��� ���� 
		for( int i = 1 ; i <= 5 ; i++ ) {
			System.out.println( "������� : " + name + " ����num : " + num );
			
			num++;
			if( num == 17) break;
			
			// ���� thread class�� ��ü��� �������� thread�� �۵���Ű�� 
			// thread�� ���࿡�� ������ �Ѱ� ��� ����� -> ������ thread���� ������ num�� ���� �Ѿ�ͼ� 
			// ���ǽ��� �������ְų� main method���� class������ ���� while������ Ȯ���ϰų�
			// �ٸ� class�� thread��ü�� �������
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

package java0719;

public class My extends Thread{

	private Thread target;
	
	public My( String  name , Thread target ) {
		super(name);
		this.target = target;
	}
	
	@Override
	public void run() {
		for( int i = 0 ; i < 200000000 ; i++ ) {}
		for( int i = 0 ; i < 200000000 ; i++ ); // �߰�ȣ�� ������ ������ �����ݷ����� for���� ������ �ִ�
		
		try {
			Thread.sleep( 2000 );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			target.join(); // target�� thread�� ����� ������ �ٸ� thread�� ���
			// �������� thread���� �켱������ �ִ°ͺ��� join�� ����ǰ� �������� ���� �� ����
		}
		catch( InterruptedException e ) {
			for( int i = 0 ; i < 200000000 ; i++ );
			for( int i = 0 ; i < 200000000 ; i++ ); 
		}
		
	}
}





















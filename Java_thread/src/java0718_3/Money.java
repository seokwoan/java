package java0718_3;

public class Money {

	private int myMoney = 10000;
	
	public int getMyMoney() {
		return myMoney;
	}
	
	// widhdraw method�� �Ӱ迵������ ����
	// �������� thread�� �ϳ��� ���� Ȥ�� method�� ���� ����Ҷ� ����ȭ�� ������ ����
	// �Ӱ迵���� ������ �ϳ��� thread�� ���������� ����ǰ� ���ش�
	public synchronized boolean widhdraw( int money ) {
		// ������ synchronized Ÿ�� method�� -> �����ڿ� Ÿ�� ���̿� synchronized�� �Է��ؼ� 
		// �Ӱ迵������ �������ش�
		if( myMoney >= money ) { // ��ݱݾװ� �����ݾ��� ���� �۰ų� ������ ���
			try {
				Thread.sleep( 1000 ); // 1���� Ÿ�� ������ ����
			}
			catch( Exception e ) {}
			
			// ���
			myMoney -= money; // 1���� Ÿ�� �����̿��� �ڹ����� �̼����� ����� ���ÿ� �Ͼ �ܾ��� ���ÿ� ����
			// �Ӱ迵���� �������� �ϳ��� thread�� �۵��ǰ� ����� �Ѵ�.
			// �Ӱ迵���� thread class�� �ƴ� thread�� �������� �۵��ϴ� class�� method�� ����������Ѵ�
			return true;
		}
		return false; // �����ݾ� �������� ��� ����
		
	}
	
	
}

package java0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		
		// ��ȭ ���� 5�� �Է�
		
		Movie[] mv = new Movie[5];
		
//		mv[0].setTitle( "���˵���" ); // �������� �ȶ� ������ ��������� �����ϸ� ����
//		System.out.println( mv[0].getTitle() ); // NullPointer ���� -> ��ü�� ����
		
		
		mv[0] = new Movie( "���˵���" , "������" , 18 );
		mv[1] = new Movie( "�λ��̵�ƿ�2" , "Ķ��" , 1 );
		mv[2] = new Movie( "Ż��" , "������" , 12 );
		mv[3] = new Movie( "������ŷ" , "�輺��" , 12 );
		mv[4] = new Movie( "Ȥ��Ż��" , "����" , 12 );
		
		for( int i = 0 ; i < mv.length ; i++ ) {
			System.out.println( mv[i] ); // toString method�� ���� mv[i]������ ��°���
		}
		
		for( Movie movie : mv ) {
			System.out.println( movie );
		}
	}

}


/*
	�迭�� ����
	������Ÿ��[] ���������� = new ������Ÿ��[�迭ũ��] -> 1���� �迭 
	������Ÿ��[][] ���������� = new ������Ÿ��[�迭ũ��][�迭ũ��] -> 2���� �迭
	
	String name = new String("�̼���"); -> String�� �⺻������ Ÿ���� �ƴ� char�� �迭������
	���� ����� �������� ���Ǹ� ���� ���� ����
	
	class�� - Movie�� ��ü�� ������ �� �ִ� �迭 ���� 
	Movie[] mv = new Movie[10]; -> Movie t; �� 10���� ���� -> �⺻ ������Ÿ���� �ƴ϶� ��������
	-> Movie t = new Movie(); �� ��ü�� �����ؾ��� ��ü�� �����ϱ� ������ ���������� �Ұ�
	Movie class�� �������� 10�� ����( ��ü�� �����Ȱ� �ƴ� )
	mv[0] = new Movie();�� �� index�� ���������� ��ü�� ������ �����
	
	
	int[] arr = new int[10]; int a; 10�� ���� -> �⺻ ������Ÿ���̶� ���� ������ �Է� ����
	intŸ���� ���� 10�� ( intŸ������ ����� ���� 10���� �ִ°Ͱ� ���ٰ� �����ȴ� )
	arr[0] = 100; -> arr[index]�� ���� ������ ������ ������
	
 */






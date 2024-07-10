package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		try { // ������ ����Ǵ� �κп� try�� �Ἥ ����ó���� ����
			  // ����ó���� �ڵ���� ������ ȸ���ϱ� ���� ��� -> �Է°� ���, �����ͺ��̽�, ������ �ٷ궧 ���� �߻� 
			
			System.out.println( 10/2 ); // 0���� ������ ���� -> ArithmeticException
			// ������ �߻��ϸ� ������ �ý������� ������ �ý����� ���α׷� ����

			String name = null;
			String a = "aaa";
			String b = "bbb";
			String c = null;
			name.length(); // -> NullPointerException ��ü�� �ȸ��� ������ �����޼���
			a.length();
			b.length();
			c.length();
			
		}
		catch( ArithmeticException e ) { // �ý������� ���� ������ catch���� �����
			// catch( ��Ÿ���� ���� ) -> try���� ��Ÿ���� ������ �˾ƾ���
			// ������ ������ ��Ÿ���� ������ Ȯ���ؾ���
			// Exception -> ������ �ֻ��� interface�� ���������� ���� ���� ���� ĳġ����
			// ����ó������ catch������ �ۼ�����( else ifó��)
			// �ڵ忡�� ���� ������ �߻� �� �� �ִٸ� catch�� ������ �ۼ��� �� �������� �ٸ� ���� ������� 
			System.out.println( "0���� ������ �ϸ� ����" );
		}
		catch( NullPointerException e ) {
			e.printStackTrace(); // �����޼��� Ȯ�� - �׽�Ʈ�� -> �����޽����� ���� ��ġ Ȯ��
			System.out.println( e.getMessage() ); // ������ ������ �˷���
			System.out.println( e.getClass() ); // ������ �Ͼclass�� Ȯ��
			System.out.println( "���ڿ� �Է��ض�!" );
		}
		catch( Exception e) { 
//			System.out.println( e.getClass() ); // -> Exception���� ��ó ó���ϰ� ������ �Ͼ classȮ�ΰ��� 
			// Exception�� ����ó���� �ֻ��� interface�̹Ƿ� ��� ������ ĳġ�� 
			// Exception�� ù���� catch������ �ٸ� catch�� �Ѿ�� ����
			// catch�� ������ �� ������� -> �׳� �����ؼ� ������ �̸��� Ȯ���ϰ� catch���ִ°� ����
			System.out.println( "~~" );
		}
		

		System.out.println( "���Ⱑ ���α׷� ��" );
	}

}

/*
	����ó��
		- ���α׷� �����߿� ���� �߻��ϸ� ��� ���α׷� ���� 
		  ����ó���� ���ָ� ������ �߻��ص� ���α׷��� ���� ���� �ʴ´�
		
		- ����ڰ� �߸��� ���� �Է��ϴ� ��쿡 �˷��� �� �ִ�
		
		- ������ ������ �ذ��ϴ� ����� �ƴϰ� ȸ���ϴ� ���
		
 */













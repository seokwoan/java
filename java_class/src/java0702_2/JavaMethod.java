package java0702_2;

public class JavaMethod {

	public static void main(String[] args) {
		
		//output(); 
		// static main�� ���� ����ż� outputȣ���� �����ǰ� output method�� �ڿ� �������
		// static�� ������ �ڹ� �����loading���� ��������� 
		// �ν��Ͻ��� �����ϰ������� ��������� ������ �Ұ���
		// class method�� ���� class������ class method�� ����
		// ���� - �޸𸮿� �ε�(����)�Ǵ� ���� �ν��Ͻ����� ���� �̷������ ������
		// �ν��Ͻ� ������ �ν��Ͻ� method������ �ȵȴ�. 
		a.out();
		
		int num = 300; // main�ȿ��� ������� �������� - class����, �ν��Ͻ������� �ƴ�
		output( num );

	}
	
//	void output() { // static�� ���� �ν��Ͻ��� ���� - > static main���� ����Ұ�
//		System.out.println( "���� method �Դϴ�." );
//	}
	
	static void output( int a ) { // static�� �ٿ��ָ� ���� ���� �Ű������� ������ �������� ������ Ÿ���� �������� 
		System.out.println( a );
		System.out.println( "���� method �Դϴ�." );
	}

}

class a {
	int num = 10;
	
	static void out() {
		System.out.println( "���� method �Դϴ�." );
	}
}




// main method -> JVM�� ���� ���� �����ϴ� method�� �ݵ�� �־���� 
// JVM  �ü�� ��� ���� �����ϱ� ���� ������ ��ǻ��
// java���� �������ϸ� -> JVM�� ����ϴ� ���� ���� -> JVM�� �����ؼ� �ü���� �Ѱ���




// �ڹ� method
// ��ȯŸ�� method��(�Ű�����){ ���� }

// ��ȯŸ�� - int , short , float , double , byte , char , boolean , void , 
//			String
// method�� return ������ Ÿ��
// return 10; -> ��ȯŸ���� int, short, byte, long 10�� �����̹Ƿ� ������ �����ϴ� ������ Ÿ��
// return income; -> income�̶�� ������ Ÿ���� ��ȯŸ������ �ۼ�
// ��ȯ���� ������ Ÿ���� ���ƾ��Ѵ� -> if �� ���� if ���� ���ڿ� -> �Ұ�

// void Ÿ���� ��ȯ���� ���ٴ� �ǹ� return�� ����.


/*
	990101-1234567
	�ֹε�Ϲ�ȣ�� �������� �������� ����
	String gender( String jumin ){
		
		String gen = jumin.substring( 7 , 8 );
		if( gen.equals("1") || gen.equals("3") ){
			return "����";	
		}
		else if( gen.equals("2") || gen.equals("4") ){
			return "����";
		}
		return "�߼�";
	}

*/


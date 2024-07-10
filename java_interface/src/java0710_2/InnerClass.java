package java0710_2;

public class InnerClass {

	public static void main(String[] args) {
		
		Out out = new Out();
		
		out.num = 100;
		
//		out.obj.age = 34;
		
//		out.obj.setName( "�̼���" );
		
		
		// class�� �ۿ��� ����class��� -> ����class�� private�����ڸ� ����� ���ο����� ����ϰ� ����
//		Out.�ν��Ͻ�����Ŭ���� in = out.new �ν��Ͻ�����Ŭ����();
//		// �ܺ�class.����class ��ü�� = �ܺ�class��ü.new ����class();
//		// �ܺ�class�� ��ü�� �־�� ����class�� ��ü�� ����� �ִ�.
//		in.age = 20;
//		in.setName( "������" );
		
	}

}


// static���� ���� �� ������ ������ method�� instance method���� ��밡��
// instance ����, method�� static method���� ��� �Ұ� -> static�� ���� �����Ǿ� instance ���Ұ�

// static ������ ���α׷� �����Ҷ� ����
// �������� ���α׷� �����߿� ���� 


class Out{
	static int count; // class���� 
	int num; // instance ����
	private String job; // instance ����
	�ν��Ͻ�����Ŭ���� obj = new �ν��Ͻ�����Ŭ����(); // ����class�� ��ü�� �ܺ�class�� ����� ���

	// instance ���� class -> instance������ ���� ��ġ�� ���� 
//	class �ν��Ͻ�����Ŭ����{ // class���� class
//		public int age; // ����class�� ������ �ܺ�class�� ������ �ٸ������� ��� �Ұ�
//		private String name;
//		void setName( String name ) {
//			this.name = name;
//		}
//	}
	// class���ο����� ��밡�� �ٸ��������� ��� �Ұ� private�� ����� ����
	// ���԰��迡 �ִ� class�� ���԰��迡���� ���Ǵ� class�� ��� ���԰���� �δ°��� �ƴ� 
	// ����class�� ����°��� ����
	
	private class �ν��Ͻ�����Ŭ����{ // private�� �ٿ��ָ� ���ο����� ���
		// Out(�ܺ�class)�� ��ü�� ���鶧 ���� -> static����, method ���� �Ұ� 
		public int age; 
		
		private String name;
		
		void setName( String name ) {
			this.name = name;
		}
		
//		static void create() {
//			count = 10;
//		}
		// ����class�� instance class�� static�� ������ ���� instance���� static��
		// ���� �����Ǿ�� �ϴµ� instance�� �������� ���� ���¿���instance������ static ������ �Ұ�
		
	}
	
	static class ����Ŭ����{ 
		// static�� �پ��ִ� ����Ŭ�����̱� ������ static����, method ��������
		// Out(�ܺ�class) ��ü�� ���� ���� �޸𸮿� �����
		// Out(�ܺ�class) ��ü�� ������ �ʴ´�
		static int birth;
		
		static void update() {
			
		}
	}
	
	void buyComputer() {
		
		// byComputer������ ��밡��
		class ����Ŭ����{	// method�ȿ� �����ϴ� class�� ����class
						// method�� ����ɶ� �޸𸮿� ����
						// method�� ����Ǹ� method�� ���� �޸𸮿��� �����
						// ����Ŭ������ �����ڸ� ������� ����
			int weight;	// method�� ����Ǿ�߸� ���� static ��� �Ұ�
			void del() {
				
			}
		}
		
		����Ŭ���� ob = new ����Ŭ����();
		// ����Ŭ������ ��ü�� ����Ŭ������ �ִ� method������ ���� ����
	}
	
//	�����͸�class ����¹�
//	1. ���� interface�� �̿�
	interface Car{ // ���� interface
		void make();
	}
	
	void makeCar() {

		Car c = new Car() { 
			@Override
			public void make() {
				System.out.println( "�͸�class�� ���� �����" );
			}
		};
		// interface�� ��ü ������ �����ϰ� ���ִ°� �͸�class
		// interface�� ���� ������� ��ü�� class �̸��� ����
		c.make();
	}
	
}






/*
	����class - class���ο����� ��� ������ class
		1. instance ����class
		2. ���� ���� class
		3. ���� ���� class
		4. �͸� ���� class

 */






































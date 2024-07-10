package java0710;

abstract class animal{ // �θ�class -> �߻�method�� �־� �߻�class�� ���� 
	
	// �ڽ�class������ override�� ������ ����� ���� �������ִ� method�� �޸𸮰����� ������ �ʿ䰡 ����	
//	public void sound() {
//		System.out.println( "�����Ҹ�" );  
//	}
	
	// -> �߻�method�� ����
	public abstract void sound(); 
	// public abstract void fly(); -> �θ� �߻�class�� ������
	// �ڽ�class�� �θ��� �߻�method�� �������ؾ��Ѵ�. ���������� �������� �߻�class�� �Ǿ���Ѵ�.
	// �ڽ�class�� �θ�class�� ������ü�� ��ӹ޴´�. �ڽ�class���� ������ ��� �Ұ�
	// fly�� ������ dog, cat�� �����ؾ��ϴµ� dog, cat�� ���� ����
	
}


class dog extends animal{ // �ڽ�class
	
	@Override
	public void sound() {
		System.out.println( "�۸�" );
	}
}


class cat extends animal{ // �ڽ�class
	
	@Override
	public void sound() {
		System.out.println( "�Ŀ�" );
	}
	
}


public class InterfaceTest {

	public static void main(String[] args) {
		
		animal d = new dog();
		animal c = new cat();
		
		d.sound();
		c.sound();
		
	}

}


/*
	�������� �Ҹ��� ����Ѵ�
	��, �����, ��, ��ѱ�, �� ���
	�� ������ ���� �ٸ� ��ü�̱� ������ �� ���� Ŭ������ ����
	������ ��, �����, ��, ��ѱ�, �ҵ��� ������ ������ �����ϹǷ� 
	animal�̶�� �θ� class�� �ΰڴ�


*/
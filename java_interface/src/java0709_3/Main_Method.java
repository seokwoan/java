package java0709_3;

public class Main_Method {

	public static void main(String[] args) {
		
		move d = new dog();
		move c = new cat(); // interface�� ���� dog�� cat class��ü�� ������ �� ����
		c.moving();
		d.moving();

	}

}

class dog implements move{
	
	@Override
	public void moving() {
		System.out.println( "��ŭ ��ŭ �̵��Ѵ�" );
	}
}


class cat implements move{ // class�� interface�� ������ cat class�� move interface�� ���� , method ��� ����
	 
	@Override
	public void moving() { 
		System.out.println( "��� ��� �̵��Ѵ�" );
	}
}



interface move{ // method ��ȯ��, �̸��� ���ؼ� �����ּ� �⺻Ʋ�� ����
				// class���� ���� ����� �Ұ��� interface�� ���� ���(?)�� ����
	
	static int a = 10; // static�����ڸ� ���̸� ���� ���� ���� 
	public void moving(); // ������ ���� �߻�method�� ���� ���� 
	
	
}





/*
	class��ŭ ���� �����
	interface - �߻�class�� �� ����
		- �߻�method�� ����
		- instance���� �Ұ�
		- static ����, static method ���� ����
		- ��ü ���� �Ұ���
		- class�� ����Ǿ� ���ȴ�
		- ������ ������ ���� ����Ѵ�
		- ���α׷��� �⺻Ʋ�� ������ �� �ִ�
		- interface�� �̿��ϸ� ����� �̿��ϴ°� ���� ���Ӽ��� ���� -> class�� �������� ����
		- Ư�� class�� ������ ���� ������ �� class�� Ȯ���ϸ� �ȴ� -> interface������ class�� ���� ����
		- �θ��� �߰����� �ڵ尡 �ʿ����� �ʴ�.

	�������� Ŭ���̾�Ʈ���� �������� �����Ѵ�.
	Ŭ���̾�Ʈ�� ��û�� �޾��ִ� method 
	Ŭ���̾�Ʈ�� ���ϴ� �������� �����ϴ� method
	
 */













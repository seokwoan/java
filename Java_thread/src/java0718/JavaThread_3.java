package java0718;

public class JavaThread_3 {

	public static void main(String[] args) {
		
		MeThread th1 = new MeThread( 2000 , "��õ" );
		MeThread th2 = new MeThread( 3000 , "��õ" );
		
		// ���������� thread����
		th1.start();
		// th1�� ������ th2�� ����
		// main������ ��������� main���� ���� �Ұ�
		
		try {
			th1.join(); // �ش� thread������ ����Ǵ� thread�� �����·� �������
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		
		
		

		
		
		// while���� ���� thread����
//		while(true) {
//			System.out.print(""); // main method�� ��� ����ǰ� ����
//			int num = MeThread.num;
//			if( num == 15) {
//				th1.stop(); // .stop�� �������� 
//				th2.stop();
//				break;
//			}
//		}

	}

}

/*
	Thread class�� method
	
	sleep(ms)			
		- ������ �ð� ��ŭ ���
		
	start()
		- thread���� run method����
		
	join()
		- �ش� thread�� ���������� ���� thread ���
		
	run()				
		- thread�� �����ϴ� method
		
	stop()				
		- thread �ߴ� (��� �������� ����)
		
	interrupt()			
		- thread �ߴ�
		
	setPriority(������)	
		- thread�켱���� 
	
	getPriority()
		- ������ ������ �켱 ������
		
	isAlive() 
		- ���� thread�� ����ֳ� -> ���ᰡ �Ǿ��� ����ִٸ� true, ����Ǿ��ٸ� false
	
	suspend()
		- thread�� �Ͻ����� ��Ų�� ( ��� ����x )
		
	resume()
		- �Ͻ������� thread�� ����< ��� ����x )
		
	yield() 
		- �ٸ� thread���� ���� ���¸� �纸�ϰ� ���
	
	notify() 
		- ��� ���¿� �ִ� thread ������� ��ȯ
		  �����⿡ �Ҵ� thread�� ���� ���·� ��ȯ �ȴ�
	
	
	
 */
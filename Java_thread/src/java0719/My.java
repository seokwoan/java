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
		for( int i = 0 ; i < 200000000 ; i++ ); // 중괄호의 내용이 없을땐 세미콜론으로 for문을 끝낼수 있다
		
		try {
			Thread.sleep( 2000 );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			target.join(); // target의 thread가 종료될 때까지 다른 thread는 대기
			// 여러개의 thread에서 우선순위를 주는것보다 join만 실행되고 나머지는 대기라 더 빠름
		}
		catch( InterruptedException e ) {
			for( int i = 0 ; i < 200000000 ; i++ );
			for( int i = 0 ; i < 200000000 ; i++ ); 
		}
		
	}
}





















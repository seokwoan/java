package java0718;

public class MeThread extends Thread{

	public static int num = 10; // class 변수 MeThread의 객체끼리 공유
	private int time; // sleep에 적용할 시간
	
	public MeThread( int time , String name ) {
		
		super( name );
		this.time = time;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName(); // thread가 가지고 있는 기본 이름이 나옴 
		for( int i = 1 ; i <= 5 ; i++ ) {
			System.out.println( "쓰레드명 : " + name + " 공유num : " + num );
			
			num++;
			if( num == 17) break;
			
			// 같은 thread class의 객체들로 여러개의 thread를 작동시키면 
			// thread의 실행에서 조건을 넘겨 계속 진행됨 -> 이전의 thread에서 증가한 num의 값이 넘어와서 
			// 조건식을 조절해주거나 main method에서 class변수의 값을 while문으로 확인하거나
			// 다른 class의 thread객체를 만들어줌
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

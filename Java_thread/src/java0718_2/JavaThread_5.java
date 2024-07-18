package java0718_2;

public class JavaThread_5 {

	public static void main(String[] args) throws InterruptedException {
		
//		DaemonTh dm = new DaemonTh();
//		
//		dm.setDaemon( true );
//		// main thread에 영향을 받게됨 -> main이 종료되면 같이 종료됨
//		
//		dm.start();
		
		
		NormalTh th = new NormalTh("일반");
		th.start();
		// main이 아닌 다른 thread에 데몬thread를 넣으면 주thread가 끝날때가지 계속 실행
		// main이 끝나도 주thread가 끝나지 않았으면 계속 실행
		
		
		
		Thread.sleep( 6000 );
		// main을 6초동안 실행시켜주면 데몬thread도 6초동안 실행 -> main종료와 같이 종료
		
		System.out.println( "main 종료" );
			

	}

}

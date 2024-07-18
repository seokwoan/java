package java0718_2;

public class JavaThread_4 {
	

	public static void main(String[] args) {

		Web th1 = new Web("첫째");
		
		Web th2 = new Web(" 둘째");
		
		Web th3 = new Web("  셋째");
		
		Web th4 = new Web("    넷째");
		
		th1.setPriority( Thread.MAX_PRIORITY );
		th2.setPriority( Thread.NORM_PRIORITY );
		th3.setPriority( Thread.MIN_PRIORITY );
		th4.setPriority( Thread.MAX_PRIORITY );
		
		// 종료되는 순서는 MAX - NORM - MIN
		// thread의 우선순위 부여는 각 각의 thread가 끝났을때 다음 처리를 먼저 해주는것
		// 같은 코드여도 처리 시간이 다르다 -> 우선순위를 높이면 시간할당을 많이 해줘서 빨리 끝날 확률을 높여줌
		// 우선순위가 높아도 처리시간이 길면 더 늦게 끝난다
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
	}
	
}
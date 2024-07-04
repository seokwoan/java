package java0703;

public class JavaMethod4 {

	public static void main(String[] args) {
		
		// method를 통해서 숫자 10을 받아 출력하기
		ReturnMth rm = new ReturnMth(); // instance method를 실행하기위한 객체 생성
		int num = rm.get(); // instance method를 호출해 변수에 저장
		System.out.printf( "%d\n" , num );

		
		// method로부터 두 정수의 더하기 결과 받아서 출력하기
		int result = rm.sum();
		// return값이 있는 method의 값을 받을 변수는 return의 데이터타입과 같은 데이터타입이어야 한다
		System.out.printf( "%d\n" , result );
		
		// 다음의 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게하기
		String userName = rm.getName();
		int age = 34;
		System.out.println( userName + " " + age );
		System.out.printf( "%s %d\n" , userName , age );
		
		// 출력은 method가 아닌 main에서 할 것
		// 국어(89), 영어(78), 수학(50) 세 과목의 총점을 구하는 method
		// 세 과목의 평균을 구하는 method
		// 총점과 평균을 출력하세요
		int total = rm.total(); // method에서 총점 계산해서 return값 받기
		int avg = rm.avg(total); // return 받은 값 매개변수로 method에 넘겨 평균값 return
		System.out.printf( "총점 : %d \n평균 : %d\n", total , avg );
		
		Dice game = new Dice();
		int 형준 = game.chance();
		int 석완 = game.chance();
		game.winner( 형준 , 석완 );
	}

}

/*
	주사위 게임
	
	j형준과 s석완이가 주사위 게임을 한다.
	주사위는 하나, 육면이다
	주사위의 값이 큰 사람이 이긴다.
	
	주사위의 값 구하는 method
	
	주사위 값을 비교하여 누가 이겼는지 출력하는 method 
 
*/


class ReturnMth{
	
	int get() {
		return 10; // return은 method 내부의 데이터값을 외부로 넘겨줄때 사용
		// 10은 get method내부에 있음
	}
	
	int sum() {
		int num1 = 30, num2 = 45;
		int result = num1 + num2 ;
		return result; 
		// method에서 출력을 하지 않으면 값을 return해 외부에서 사용해야한다
		// 내부와 외부 모두 사용하지 않으면 method를 만드는 이유가 없다
	}
	
	String getName() {
		String name = "이순신";
		return name;
	}
	
	int total() {
		int 국어 = 89 , 영어 = 78 , 수학 = 50;
		int plus = 국어 + 영어 + 수학;
		return plus;
	}
	
	int avg( int total ) {
		int avg = total / 3;
		return avg;
	}
	
}

class Dice{
	
	int chance() {
		int roll = (int) ( Math.random() * 6 + 1 );
		return roll;		
	}
	
	void winner( int 형준 , int 석완 ) {
		String lose = null;
		if( 형준 > 석완 ) {
			lose = "형준 승";
		}
		else if( 형준 < 석완) {
			lose = "석완 승";
		}
		else {
			lose = "무승부";
		}
		System.out.printf( "형준 주사위 : %d \n석완 주사위 : %d\n결과 : %s" , 형준, 석완, lose );	
	}
}












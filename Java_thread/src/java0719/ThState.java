package java0719;

public enum ThState {

	NEW, RUNNALBE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED
	// 이름으로 사용되면서 값으로도 표현이 된다
	// 만들어진 순서에따라 정수 0부터 값을 같는다. -> 생성자method를 이용해 원하는 값을 넣을수 있음
	// 상수를 만들기 위한 구조
	// 상수들의 class처럼 사용할 수 있는 방법 - Enum
	
	
//	int num;
//	
//	ThState( int num ){
//		this.num = num;
//	}
//	
//	int getNum() {
//		return this.num;
//	}
	
}


/*
	자바
	Final int num = 20; //Fianl을 붙여 변경불가능한 상수로 만드는법
	
	자바스크립트
	const num = 10;
	num = 30; -> 오류




	Enum Menu{
		파일열기, 파일저장, 다른이름저장, 설정, 종료
	}
	
	Scanner sc = new Scanner(System.in);
	int menu = scan.nextInt();
	
	Switch( menu ){
		case Menu.파일열기 
		// Enum이 갖는 정수값을 이용해 스위치문의 case조건을 만들면 작업내용 알기 쉽다
		case Menu.파일저장
		case Menu.다른이름저장
	
	}






*/














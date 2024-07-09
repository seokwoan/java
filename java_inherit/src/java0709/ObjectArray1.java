package java0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		
		// 영화 정보 5개 입력
		
		Movie[] mv = new Movie[5];
		
//		mv[0].setTitle( "범죄도시" ); // 빨간줄이 안떠 오류가 없어보이지만 실행하면 오류
//		System.out.println( mv[0].getTitle() ); // NullPointer 오류 -> 객체가 없음
		
		
		mv[0] = new Movie( "범죄도시" , "강윤성" , 18 );
		mv[1] = new Movie( "인사이드아웃2" , "캘시" , 1 );
		mv[2] = new Movie( "탈주" , "이종필" , 12 );
		mv[3] = new Movie( "하이재킹" , "김성한" , 12 );
		mv[4] = new Movie( "혹성탈출" , "웨스" , 12 );
		
		for( int i = 0 ; i < mv.length ; i++ ) {
			System.out.println( mv[i] ); // toString method를 만들어서 mv[i]만으로 출력가능
		}
		
		for( Movie movie : mv ) {
			System.out.println( movie );
		}
	}

}


/*
	배열의 생성
	데이터타입[] 참조변수명 = new 데이터타입[배열크기] -> 1차원 배열 
	데이터타입[][] 참조변수명 = new 데이터타입[배열크기][배열크기] -> 2차원 배열
	
	String name = new String("이순신"); -> String은 기본데이터 타입이 아닌 char의 배열이지만
	많이 사용해 개발자의 편의를 위해 생략 가능
	
	class명 - Movie의 객체를 저장할 수 있는 배열 생성 
	Movie[] mv = new Movie[10]; -> Movie t; 가 10개가 생김 -> 기본 데이터타입이 아니라 참조변수
	-> Movie t = new Movie(); 로 객체를 생성해야함 객체를 생성하기 전에는 데이터저장 불가
	Movie class의 참조변수 10개 생성( 객체가 생성된게 아님 )
	mv[0] = new Movie();로 각 index의 참조변수에 객체를 생성해 줘야함
	
	
	int[] arr = new int[10]; int a; 10개 생성 -> 기본 데이터타입이라 직접 데이터 입력 가능
	int타입의 공간 10개 ( int타입으로 선언된 변수 10개가 있는것과 같다고 봐도된다 )
	arr[0] = 100; -> arr[index]에 직접 데이터 저장이 가능함
	
 */






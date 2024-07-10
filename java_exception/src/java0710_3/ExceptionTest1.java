package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		try { // 오류가 예상되는 부분에 try를 써서 예외처리를 해줌
			  // 예외처리는 코드상의 오류를 회피하기 위해 사용 -> 입력과 계산, 데이터베이스, 파일을 다룰때 많이 발생 
			
			System.out.println( 10/2 ); // 0으로 나누면 오류 -> ArithmeticException
			// 오류가 발생하면 오류를 시스템으로 보내고 시스템이 프로그램 종료

			String name = null;
			String a = "aaa";
			String b = "bbb";
			String c = null;
			name.length(); // -> NullPointerException 객체를 안만들어서 나오는 에러메세지
			a.length();
			b.length();
			c.length();
			
		}
		catch( ArithmeticException e ) { // 시스템으로 가는 오류를 catch에서 잡아줌
			// catch( 나타나는 오류 ) -> try에서 나타나는 오류를 알아야함
			// 오류를 내보고 나타나는 오류를 확인해야함
			// Exception -> 오류의 최상위 interface라 다형성으로 하위 오류 전부 캐치가능
			// 예외처리에서 catch여러개 작성가능( else if처럼)
			// 코드에서 여러 오류가 발생 할 수 있다면 catch를 여러개 작성해 각 오류별로 다른 내용 출력해줌 
			System.out.println( "0으로 나누기 하면 오류" );
		}
		catch( NullPointerException e ) {
			e.printStackTrace(); // 에러메세지 확인 - 테스트용 -> 에레메시지가 나온 위치 확인
			System.out.println( e.getMessage() ); // 에러의 원인을 알려줌
			System.out.println( e.getClass() ); // 오류가 일어난class를 확인
			System.out.println( "문자열 입력해라!" );
		}
		catch( Exception e) { 
//			System.out.println( e.getClass() ); // -> Exception으로 먼처 처리하고 오류가 일어난 class확인가능 
			// Exception은 예외처리의 최상위 interface이므로 모든 오류를 캐치해 
			// Exception이 첫번재 catch에오면 다른 catch로 넘어가지 않음
			// catch의 순서를 잘 써줘야함 -> 그냥 실행해서 오류의 이름을 확인하고 catch해주는게 좋다
			System.out.println( "~~" );
		}
		

		System.out.println( "여기가 프로그램 끝" );
	}

}

/*
	예외처리
		- 프로그램 실행중에 오류 발생하면 즉시 프로그램 종료 
		  예외처리를 해주면 오류가 발생해도 프로그램은 종료 되지 않는다
		
		- 사용자가 잘못된 값을 입력하는 경우에 알려줄 수 있다
		
		- 에러나 오류를 해결하는 방법이 아니고 회피하는 방법
		
 */













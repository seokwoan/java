package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		int num = 0;
		boolean is = true;
		Scanner scan = new Scanner(System.in);

		do {
			try {
				System.out.print( "정수 입력 : " );
				num = scan.nextInt();
				// int num = scan.nextInt(); -> {}중괄호 안에서 만들어진 변수는 지역변수라 {}안에서만 사용가능
				// try안에서 변수생성 지양
				is = false;
			}
			catch( InputMismatchException e ) { // 일부는 import가 필요하다 
				System.out.println( "정수만 입력하세요" );
			}
			finally { // try-catch문으로 예외처리를 할때 오류 여부와 관계없이 실행
				// 오류 없을때 -> try - finally 실행
				// 오류 있을때 -> catch - finally 실행
				// 오류가 있건 없건 동작할 코드를 finally를 통해 실행
				// 파일, database를 사용할때 사용
				// 파일 열기를 시도했으면 닫아줘야함 -> 파일을 열때 입력버퍼를 사용 -> 닫아서 입력버퍼를 지워줌 
				// 입력버퍼가 있으면 다른 파일을 열때 오류가 날수있음
				scan.nextLine();
			}
		}while( is );
		
		
		System.out.println( num + 100 );
		
		System.out.print( "이름 : " );
		String name = scan.nextLine();
		System.out.println( name );
		
		
		
		
	}

}

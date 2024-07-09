package java0708;

import java.util.Scanner;

public class DBtest {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Dao dao = new Dao(); // database에 접근하기 위한 객체 생성
		Member[] list; // Member class 타입 배열 주소를 저장할 참조변수 생성
		
		System.out.print( "1. 입력  2. 출력 " );
		int menu = scan.nextInt();
		scan.nextLine();
		
		switch( menu ) {
			case 1:
				System.out.print( "학생이름 : " );
				String name = scan.nextLine();
				System.out.print( "국어 성적 : " );
				int kor = scan.nextInt();
				System.out.print( "영어 성적 : " );
				int eng = scan.nextInt();
				System.out.print( "수학 성정 : " );
				int mat = scan.nextInt();
				scan.nextLine();
				
				// 데이터값 입력
				Member member = new Member( name, kor, eng, mat);
				total_avg( member );
				System.out.println( member );
				
				// 데이터베이스 저장
				dao.insert( member ); // database에 데이터를 저장하기 위한 method 실행
				break;
				
			case 2: // 데이터 전부 출력 database의 데이터를 전부 불러와 출력
				list = dao.select(); // 
				for( Member data : list ) {
					System.out.println( data );
				}
				break;
		
		}
		
		
	}
	
	static void total_avg ( Member m ) {
		int total = m.getKor() + m.getEng() + m.getMat(); 
		// kor이 private라 getkor로 값을 가져옴
		m.setTotal( total );
		m.setStd_avg( total / 3 );
		
	}
}
















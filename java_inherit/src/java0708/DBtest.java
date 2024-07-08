package java0708;

import java.util.Scanner;

public class DBtest {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print( "학생이름 : " );
		String name = scan.nextLine();
		System.out.print( "국어 성적 : " );
		int kor = scan.nextInt();
		System.out.print( "영어 성적 : " );
		int eng = scan.nextInt();
		System.out.print( "수학 성정 : " );
		int mat = scan.nextInt();
		scan.nextLine();
		
		Member member = new Member( name, kor, eng, mat);
		total_avg( member );
		System.out.println( member );
		
		
	}
	
	static void total_avg ( Member m ) {
		int total = m.getKor() + m.getEng() + m.getMat(); 
		// kor이 private라 getkor로 값을 가져옴
		m.setTotal( total );
		m.setStd_avg( total / 3 );
		
	}
}
















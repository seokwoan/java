package java0708;

import java.util.Scanner;

public class DBtest {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print( "�л��̸� : " );
		String name = scan.nextLine();
		System.out.print( "���� ���� : " );
		int kor = scan.nextInt();
		System.out.print( "���� ���� : " );
		int eng = scan.nextInt();
		System.out.print( "���� ���� : " );
		int mat = scan.nextInt();
		scan.nextLine();
		
		Member member = new Member( name, kor, eng, mat);
		total_avg( member );
		System.out.println( member );
		
		
	}
	
	static void total_avg ( Member m ) {
		int total = m.getKor() + m.getEng() + m.getMat(); 
		// kor�� private�� getkor�� ���� ������
		m.setTotal( total );
		m.setStd_avg( total / 3 );
		
	}
}
















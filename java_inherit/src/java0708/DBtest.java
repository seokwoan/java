package java0708;

import java.util.Scanner;

public class DBtest {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Dao dao = new Dao(); // database�� �����ϱ� ���� ��ü ����
		Member[] list; // Member class Ÿ�� �迭 �ּҸ� ������ �������� ����
		
		System.out.print( "1. �Է�  2. ��� " );
		int menu = scan.nextInt();
		scan.nextLine();
		
		switch( menu ) {
			case 1:
				System.out.print( "�л��̸� : " );
				String name = scan.nextLine();
				System.out.print( "���� ���� : " );
				int kor = scan.nextInt();
				System.out.print( "���� ���� : " );
				int eng = scan.nextInt();
				System.out.print( "���� ���� : " );
				int mat = scan.nextInt();
				scan.nextLine();
				
				// �����Ͱ� �Է�
				Member member = new Member( name, kor, eng, mat);
				total_avg( member );
				System.out.println( member );
				
				// �����ͺ��̽� ����
				dao.insert( member ); // database�� �����͸� �����ϱ� ���� method ����
				break;
				
			case 2: // ������ ���� ��� database�� �����͸� ���� �ҷ��� ���
				list = dao.select(); // 
				for( Member data : list ) {
					System.out.println( data );
				}
				break;
		
		}
		
		
	}
	
	static void total_avg ( Member m ) {
		int total = m.getKor() + m.getEng() + m.getMat(); 
		// kor�� private�� getkor�� ���� ������
		m.setTotal( total );
		m.setStd_avg( total / 3 );
		
	}
}
















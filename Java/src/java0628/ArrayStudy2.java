package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy2 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// ���� �迭�� �����ϴ� ������ �ǸŰ����� Ű����� �Է��Ͽ� ����
		// ���� �迭�� ����� �ǸŰ��ݵ��� �� �հ� ����� ���ϼ���
//		int[] ���� = new int[5];
//		for ( int i = 0 ; i < ����.length ; i++ ) {
//			System.out.printf( "%d��° ������ �ǸŰ��� : " , (i+1) );
//			����[i] = scan.nextInt();
//		}
//		
//		int sum = 0;
//		int avg = 0;
//		for( int i = 0 ; i < ����.length ; i++ ) {
//			sum += ����[i];
//			
//		}
//		avg = sum / ����.length ;
//		System.out.printf( "���� �Ǹűݾ��� ���� : %d \n���� �Ǹűݾ��� ��� : %d", sum , avg );
		
		
		// 6���� Ű�� tall�迭�� �����Ͽ���.
		// Ű 175 �̸��� ����ϼ���
		
//		float[] tall = new float[] {173.4f, 175.1f, 169.5f, 181.4f, 178.8f, 185.3f};
//		
//		for ( int i = 0 ; i < tall.length ; i++ ) {
//			if( tall[i] < 175 ) {
//				System.out.println( tall[i] );
//			}
//		}
		
		// name �迭�� ���ڿ��߿��� �̼���, ������, ������, �ֿ���
		// ���ߴ� �迭�� �����ϰ� ����ϼ���
//		String[] name = new String[] {
//				"�̼���" , "������" , "�庸��" , "�̼���" , "������" , "������" , 
//				"�ֿ�" , "�縸��"
//		};
//		
//		String[] ���ߴ� = new String[4];
//		
//		System.arraycopy( name , 3 , ���ߴ� , 0 , 4 );
//		System.out.println( Arrays.toString(���ߴ�) );
		
		
//		String word = "i like banana";
//		// String�� class, word�� ����� ���� String class�� ��ü
//		System.out.println( word.indexOf(" ") );
//		// ��ü�� indexOf ��� ����
//		// ��ġ�� ã������ ���
//		
//		word.contains( "orange" );
//		System.out.println( word.contains("bn") );
//		// ���ڿ����� Ư�� ���ڳ� ���ڿ��� �������� - true, false
//		// ���� ������ �Ǵ��� ���� ���
//		
//		String[] a = new String[] { "banana" , "orange" };
//		// a.indexOf(); ��� �Ұ�
//		// a�� �迭�ϻ����� String class�� ��ü�� �ƴϴ�.
//		// a[i]�� ���� ���ڿ��̹Ƿ�? String�� ��ü?�� �� �� �ִ�? 
//		a[0].indexOf( "na" ); // n�� ������ 2�� ����
//		a[1].contains( "ge" ); // ge�� �����ϰ� �־� true
		// 
		
//		String[] name = new String[] {
//				"������" , "�Ѽ���" , "�縸��" , "������" , "������" , "�����" , 
//				"�̼���" , "�̻��" , "�̻��" , "�Ѱ���"
//		};
//		
//		System.out.print("�̸��˻� : ");
//		String search = scan.nextLine();
//		
//		for( int i = 0 ; i < name.length ; i++) {
//			if( name[i].contains(search) ) {
//				System.out.println( "�˻� ��� : " + name[i] );
//			}
//		}
		
		
		// ���� �˻��Ͽ� �����̸��� �ݾ��� ��µǰ� �ϼ���
		// ī�� �迭�� ���� ���� �˻��� �˼��մϴ�. �غ����Դϴ�. ��� ���
		String[] ī�� = new String[] {
				"�Ƹ޸�ī�� : 2000��" , "ȭ��Ʈ �Ƹ޸�ī�� : 2800��" , "ī��� : 3000��" , 
				"��ü�� : 3800��" , "ī���ī : 3800��" , "�����ֽ� : 4000��" , 
				"��Ӿ��̽�Ƽ : 2900��" , "�����ƾ��̽�Ƽ : 2800��" , 
				"�ڵξ��̽�Ƽ : 2800��" , "���ڿ��̵� : 3500��" , "�����̵�  : 3500��" , 
				"û�������̵� : 3500��"
		};
		
		System.out.print( "���� �˻� : " );
		String coffee = scan.nextLine();
		
		boolean isDrink = true;
		for( int i = 0 ; i < ī��.length ; i++ ) {
			if( ī��[i].indexOf( coffee ) != -1 ) {
				System.out.printf( "%s\n", ī��[i] );
			}
		}
		for( int i = 0 ; i < ī��.length ; i++  ) {
			if( ī��[i].indexOf( coffee ) == -1)
				System.out.print( "�˼��մϴ�. �غ����Դϴ�." );
				break;
				// �ȿ� ������ ��� �ݺ���. �ۿ� �־����
		}

		
//		for( int i = 0 ; i < ī��.length ; i++ ) {
//			if( ī��[i].indexOf( coffee ) != -1 ) {
//				System.out.println( ī��[i] );
//				isDrink = false;
//			}
//		}
//		if( isDrink) {
//			System.out.println( "�˼��մϴ�. �غ����Դϴ�." );
//		}
		
		
	}

}

// 



















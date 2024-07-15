package java0715_2;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {

		TreeSet<Integer> tree= new TreeSet<>();
		tree.add( 34 );
		tree.add( 45 );
		tree.add( 20 ); 
		tree.add( 9 );
		tree.add( 40 );
		tree.add( 15 );
		tree.add( 48 );
		tree.add( 2 );
		tree.add( 11 );
		tree.add( 39 );
		tree.add( 40 );
		
		System.out.println( tree );
		// ���������� ������� �ʰ� ������������ ���ĵǾ� ��µ�
		// root -> ���� ó�� ����Ǵ� �����ʹ� ������ root�� ��
		// root�� �� �����͸� ������ ������ ���� ���� -> ū���� ������, �������� �������� ����
		// 45�� 34���� ũ�ϱ� ���������� ��
		
		System.out.println( tree.first() );
		// HashSet�� ���������� get() method�� �����͸� �ϳ��� �ҷ��� �� ����.
		// .first() -> ������ ���� ù��° ���� ����
		System.out.println( tree.last() );
		// .last() -> ������ ���� ������ ���� ����
		
		System.out.println( tree.higher( 20 ) );
		// �Է°����� ū ���� ���� ������ 
		
		System.out.println( tree.lower( 19 ) );
		// �Է°����� ���� ���� ���� ������
		
		System.out.println( tree.headSet(35) );
		// �Է°����� ���� ��� ���� ������
		
		System.out.println( tree.tailSet(30) );
		// �Է°����� ū ��� ���� ������
		
		System.out.println( tree.subSet( 9 , 39) );
		// �ΰ��� �Է°� ������ ���� ������ -> ���� ���ڴ� ����, ���� ���ڴ� ������
		// 9�� �������� 39�� ��������
		
		
		
		
		// ���ڿ��� ���
		TreeSet<String> word = new TreeSet<>();
		word.add( "�̼���" );
		word.add( "������" );
		word.add( "�庸��" );
		word.add( "������" );
		word.add( "������" );
		word.add( "���س�" );
		word.add( "����" );
		word.add( "������" );
		word.add( "���ƾ�" );
		
		System.out.println( word );
		
		System.out.println( word.higher( "��" ) );
		// ������ ���������� ���
		
		System.out.println( word.headSet( "���" ) );
		
		System.out.println( word.subSet( "��" , "��" ) );
		
		System.out.println( word.subSet( "��" , "��" ) );
		// ���������δ� �ѱ� �˻��� �Ұ� ������ ���� �������� ����
		
		
		// 90�� �̻� - ���� 10%, 70�� �̻� - ���� 30%
		// 40�� �̻� - ���� 80%
		
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90); 
		rank.add(70);
		rank.add(40);
		
		// ���� ������ �Է��Ͽ� ���� ���������� ���
		
		System.out.println( "������ �Է��ϼ��� : " );
		Integer my = sc.nextInt();
		sc.nextLine();
		
//		if( rank.higher(my) == null ) {
//			System.out.println( "���� 10%" );
//		}
//		else if( rank.higher(my) == 90 ) {
//			System.out.println( "���� 30%" );
//		}
//		else if( rank.higher(my) == 70 ){
//			System.out.println( "���� 80%" );
//		}
		
		
		switch( rank.lower(my+1) ) {
			case 90 :
				System.out.println( "���� 10%" );
				break;
			case 70 : 
				System.out.println( "���� 30%" );
				break;
			case 40 : 
				System.out.println( "���� 80%" );
		}
		
		
		
		
		
		
		
		// �� ������ �Է��ϰ� ������ ������ ���� ����� ���
		
		TreeSet<String> score = new TreeSet<>();
		
		score.add( "89�� �̼���" );
		score.add( "67�� ������" );
		score.add( "45�� ������" );
		score.add( "98�� �Ѽ���" );
		score.add( "72�� �ڹ���" );
		score.add( "81�� ������" );
		score.add( "59�� �̼���" );
		score.add( "32�� �����" );
		
		System.out.println( "������ �Է��ϼ��� : " );
		String myScore = sc.nextLine();
		
		
		
		System.out.println( score.tailSet( myScore) );
		
	
	}	

}

/*
	Tree ������ �̿��Ͽ� ���� �����Ű�� TreeSet
	LinkedListó�� �ּҸ� ������ ���� �̾���
	�ڹٿ��� ���Ǵ� tree������ ���� tree���� - ���� node�� �ִ� 2���� ����
	�θ� - ���� - �ڽ����� ǥ���Ǵ� tree������ ������ �� ����
		- �����͸� ���������� �������� ����
		- �ߺ� ������� ����
		- ����Ʈ���� ����ϱ� ������ �����Ͱ� ���ĵǾ� ��µȴ�.
		- �����˻� �Ǵ� ������ �ߺ����� �� ���Ŀ� �����ϴ�.
		
	

*/
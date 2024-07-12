package java0711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionStudy {

	public static void main(String[] args) {
		
		//a
		// Byte - byte
		// Short - short
		// Integer - int
		// Long- long
		// Float - float
		// Double - double
		// Character = char
		// Boolean = boolean
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		// ArrayList<������Ÿ��> ��ü�� = new ArrayList<������Ÿ��>();
		//                                           ��������
		// ������ Ÿ���� classŸ���� ���;��Ѵ�.
		
		// ArrayList�� �迭�� ���鶧�� ũ�⸦ �������� �ʾƵ� �ȴ�
		// �߰��ϴ� ��ŭ ������ �þ�� �����迭
		
		list1.add( 89 ); // �����͸� �߰��ϴ� ����� ��ü��.add(); , Ÿ�������� ���ϸ� �����
		list1.add( 230 ); // Ÿ�� ������ ���ϸ� ArrayList�� object class�� Ÿ������ ����
		list1.add( 4542 );
		list1.add( 3434 );
		list1.add( 2 );
//		list1.add( 45.78 );
//		list1.add( "�̼���" );
		// ����, �Ǽ�, ���ڿ� ���� ���� ����
		// ������ Ÿ���� �����ؼ� ���� Ÿ���� �����͸� �����ؾ� ����ϱ� ����
		// 
		
		System.out.println( list1 ); // ��ü���� ���� �迭�� ���� ���� -> toString method�� �����Ǿ�����  
		System.out.println( list1.get(2) );
		// �迭�̱������� class�� ��ü�̹Ƿ� method���? 
		
		for( int i = 0 ; i < list1.size() ; i++ ) {
			// �迭��.length�� �ƴ� ArrayList�� method�� ��� .size() -> 
			System.out.println( list1.get(i) );
		}
		
		System.out.println( list1.indexOf( 232 ) );
		// indexOf( ã�� ��) -> �迭�� ���������� ������ index�� , ������ -1
		
		System.out.println( list1.contains( 3434 ) );
		// contains method�� ���� �迭�� ���� ������ true ������ false
		
		list1.remove(3); // list1.remove( index ) index�� ���� ����
		System.out.println( list1 );
		
		System.out.println( list1.isEmpty() );
		// �迭�� ����ֳ��� Ȯ�� �����Ͱ� ������ false �ϳ��� ������ true
		
		list1.add( 1 , 450 );
		// .add( index , data ) -> index�� �ش� ��ġ�� data���� .add�� index�� ������� ����
		// index���Ŀ� ���� �ִٸ� index+1
		System.out.println( list1 );
		
		System.out.println( list1.lastIndexOf(230) );
		// index�� �ڿ������� ã��
		
		list1.forEach( n -> System.out.println( n ) );
		// �ݺ����� ���� ����ϱ� ���� ���
		// .forEach( n -> method(n) ); -> n�� �ݺ����� �迭��
		
		for( Integer n : list1 ) {
			System.out.println( n );
		}
		// for each�� ���� ������� ���� ��� 
		
		list1.set( 3 , 15 );
		// .set( index , data ) -> index�� ��ġ�� ���� data�� �ٲ���
		System.out.println( list1 );
		
		Integer[] number = list1.toArray( new Integer[list1.size()]);
		// ArrayList������Ÿ��[] �迭�� = ArrayList��.toArray( new ArrayList������Ÿ��[ArrayList��.size()]
		//                 ������ �迭   �迭�� �ٲ� ArrayList                            ũ��
		// ArrayList�� ����� ���� �迭�� ������� 
		
		Integer[] aa = new Integer[3];
		
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(aa));
		// ArrayList<������Ÿ��> ArrayList�� = new ArrayList<������Ÿ��>(Arrays.asList(�迭��));
		// ArrayList���� ���� ����� ArrayList�� �̸� , �迭���� ArrayList�� �ٲ��� �迭�� �̸�
		// �迭�� ���� ArrayList�� ���� 
		
		Collections.sort( list1 );
		// Collections.sort( ��ü�� ) ->ArrayList�� ���� ������������ ����
		System.out.println( list1 );
		
		// ������, �念��, �̼���, ������, ������, ����ȣ
		// �� �̸��� ArrayList�� �����ϰ� ����ϼ���
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add( "������" );
		nameList.add( "�念��" );
		nameList.add( "�̼���" );
		nameList.add( 3 , "������" );
		nameList.add( 4 , "������" );
		nameList.add( "������" );
		nameList.set( 5 , "����ȣ" );
		System.out.println( nameList );
		
		ArrayList<String> names2 = new ArrayList<>(Arrays.asList( new String[] {
				"������" , "�念��" , "�̼���" , "������" , "������" , "����ȣ"
		}));
		
		for( String name : nameList ) {
			System.out.println( name );
		}
		
		names2.forEach( name -> System.out.println( name ) );
		
		
		// �̸��� ����Ǿ� �ִ� ArrayList�� �̼����� ������ �߰������ϰ�
		// ������ ������ϱ�
		
		
		
		
		if( !names2.contains( "�̼���" ) ) {
			names2.add( "�̼���" );
		}
		
		System.out.println( names2 );
		
		
		if( names2.indexOf( "�̼���" ) == -1 ) {
			names2.add( "�̼���" );
		}
		
		System.out.println( names2 );
		
		
	}

}


/*
	�ڹ� collection �����ӿ�ũ 
	
	�����͸� ����, ���� �ϱ� ���� �ڷᱸ���� �����͸� ó��, �����ϴ� �˰����� �����Ǿ��ִ� class���� ����ü
	
	Collection , Map interface 2������ �ִ�
	
	Collection interface
	
		- List interface -> implements Collection
		 	
			- ArrayList class // ������ ������ ����  -> implement List
			- vector // ������ ������ ����
			- LinkedList // ������ ������ ����
			- Stack // �迭���� 
			- Queue // LinkedList����
			// ���� interface �ؿ� �ֱ� ������ method�� �̸��� �� ���� 
			
		- Set interface
			- HashSet // �迭���� ������ �׷�ȭ
			- TreeSet // LinkedList���� , �˻�, ���� Ưȭ
			- LinkedHashSet // �ݹ�? ��� ���
			
	Map interface
		- HashMap class // �迭���� ������ �׷�ȭ 
		- TreeMap Class // LinkedList���� , �˻�, ���� Ưȭ
		- LinkedHashMap class // �ݹ�? ��� ���
		
	interface �ؿ��ִ� class���� Ư¡�� �˾߾� �Ѵ�.	

 */





















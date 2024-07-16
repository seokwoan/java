package Control;

import Service.SelectDrink;

import java.util.TreeMap;

import Service.Kiosk;

public class MainControl {

	public static void main(String[] args) {

		System.out.println( "=== DW ī�� �ֹ� Ű����ũ ===\n" );
		System.out.println( "=== ȭ���� ��ġ���� ������ ===\n" );
		
		Kiosk kiosk = new SelectDrink();
		// package�� �ٸ��� import�� �������
		
//		kiosk.action();
		
		TreeMap< Integer , String > tree = new TreeMap<>();
		// TreeMap< keyŸ�� , valueŸ�� > ������ = new TreeMap<>();
		
		tree.put( 20 , "�ڵ�" );
		tree.put( 53 , "���" );
		tree.put( 9 , "����" );
		tree.put( 33 , "����" );
		tree.put( 5 , "�丶��" );
		
		System.out.println( tree );
		// TreeMap�� key������ ���ĵǼ� ���
		// ���İ� �˻��� ���
		
		System.out.println( tree.headMap(21) );
		// .headMap(key) - �Է��� key���� ���� key�� ���� ���� - �̸�
		System.out.println( tree.tailMap(20) );
		// .tailMap(key) - �Է��� key���� ū key�� ���� ���� - �̻�
		System.out.println( tree.floorKey(15) );
		// .floorKey - �Է��� key�� �Ȱ��� key���� ã�� ������ ���� ����� ������
		System.out.println( tree.floorKey(33) );
	
		System.out.println( tree.floorEntry(15) );
		// .floorEntry - �Է��� key�� �Ȱ��� ���� key�� value ������ ���� ����� ������
	
		System.out.println( tree.subMap( 10 , 40 ) );
		// .subMap( key1 , key2 ) - key1�� key2 ������ key��
		
		System.out.println( tree.lowerKey(25) );
		// .lowerKey(key) - �Է��� key���� ���� ����� ���� key�� - �̸�
		
		System.out.println( tree.higherKey(40) );
		// .higherKey(key) - �Է��� key���� ���� ����� ū key�� - �ʰ�

	}

}

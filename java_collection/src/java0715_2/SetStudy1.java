package java0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<>();
		
		hash.add( "¥���" );
		hash.add( "«��" );
		hash.add( "���뱹��" );
		hash.add( "�������" );
		hash.add( "��������" );
		hash.add( "¥���" ); // �����Ͱ� �̹� �����ϸ� ��������� ������ �ƴ�
		// �����Ͱ� �ߺ����� �����Ƿ� �ߺ�Ȯ���� ���ϰ� �����͸� �־��

		System.out.println( hash );
		// �Է��� ������� ������� �ʴ´�.
		
		hash.remove( "«��" );
		// ����� �����͸� �ϳ��� ����°� ����
		System.out.println( hash );
		// Set�� �ϳ��� �׷����� �ٷ�⶧���� �����͸� �ϳ��� �������� method�� ������������

		for( String food : hash ) {
			System.out.println( food );
		}
		// �ϳ��� ������ ���� method�� ������ ������ ����
		// �ߺ��� ���� �׷����� ������ ����ϱ� ���� �����̹Ƿ� �ϳ��� ���� ������� ����
		
		ArrayList<String> list = new ArrayList<>(hash);
		// ArrayList<classŸ��> ������ = new ArrayList<>(�ٲ�HashSet��);
		// LinkedList�� ��ȯ����
		System.out.println( list );
		System.out.println( list.get(3) ); // ArrayList�� ��ȯ�Ǿ� �ϳ��� ������ method���
		System.out.println( "=====================" );
		// HastSet�� ������, ������, ������ ��� ����
		
		HashSet<String> ���� = new HashSet<>();
		HashSet<String> ��� = new HashSet<>();
		
		����.add( "¥���" );
		����.add( "������" );
		����.add( "���" );
		����.add( "�޲ٹ̺���" );
		
		���.add( "��ġ������" );
		���.add( "������" );
		���.add( "¥���" );
		���.add( "���" );
		
		System.out.println( ���� );
		System.out.println( ��� );
		// ������ - �� �� �̻��� �׷쿡 �������� ���� ����
		HashSet<String> ���� = new HashSet<>();
		
		Iterator<String> it = ����.iterator();
		// collection framework������ ��밡���� ��� ������ ó���� ���ֱ� ���� interface
		// ��ȸ������ �� �� ����ϰ� �ٽ� ������� ����
		// Iterator<classŸ��> ������ = HashSet��.iterator();
		// -> HashSet�� �����͸� �����ϰ� �������� ����ִ� ������ ���� -> ����ִ� ������ �ּҰ�
		// ������ ����� -> �ּҸ� �̵����� ���� ����
		// �ڵ带 �߸�¥�� HashSet�� �����Ͱ� �ջ�Ǵ� ���� ������
		
		while( it.hasNext( )) { // .hasNext() -> ���� ���� �ֳ� ���� Ȯ��
			String ����food = it.next(); // ����food�� �ϳ��� ������
			if( ���.contains( ����food ) ) { // ������ �����Ͱ� ��ο� �ֳ� Ȯ��
				����.add( ����food ); // ������ ���뿡 �־� ������HashSet�� �־���
			}
		}
		
		System.out.println( ���� );
		
		
		// ������ - A���տ��� B���հ��� ������ �����͸� ������ ������
		
		HashSet<String> ������ = new HashSet<>();
		it = ����.iterator(); // interator�� �ٽ� ����ϱ� ���ؼ��� ���� �ٽ� ����Ѵ�
		while( it.hasNext() ) {
			String ����food = it.next();
			if( !���.contains( ����food ) ) {
				������.add( ����food );
			}
		}
		
		System.out.printf( "��ο� ���� ������ ������ : %s\n" , ������ );
		
		
		// ������ - A���հ� B������ ��(�ߺ�����)
		
		HashSet<String> �� = new HashSet<>();
		�� = (HashSet<String>) ����.clone(); // clone�� ��ȯŸ���� HashSet<classŸ��>�� �ƴ϶� ���� ����ȯ
		��.addAll( ��� ); // HashSet�� �ߺ��� ��������ʾ� �ߺ��Ǵ� ���� ������ �ϳ��� ����
		System.out.println( �� );
		
		// ������ .addAll
		// ������ .retainAll	����.retainAll(���);
		// ������ .removeAll	����.removeAll(���);
		
//		HashSet<Integer> num1 = new HashSet<>();
//		
//		while( num1.size() < 10 ) {
//			num1.add( Integer.valueOf( (int)(Math.random() * 50 ) ) );
//		}
//		
//		System.out.println( num1 );
		
		// num1 , num2, num3 �� ���� ������ ����� ���� 1~50������ ������ 15���� �����ϼ���
		// num1�� num3�� ������
		// num1�� num2�� ������
		// num2�� num3�� ������
		// num1, num2, num3�� ������
		
		
		HashSet<Integer> num1 = new HashSet<>();
		HashSet<Integer> num2 = new HashSet<>();
		HashSet<Integer> num3 = new HashSet<>();
		HashSet<Integer> num1_3n = new HashSet<>();
		HashSet<Integer> num1_2m = new HashSet<>();
		HashSet<Integer> num2_3n = new HashSet<>();
		HashSet<Integer> num1_2_3u = new HashSet<>();
		
		while( num1.size() < 15 ) {
			num1.add( Integer.valueOf( (int)(Math.random() * 50 + 1 ) ) );
		}
		
		while( num2.size() < 15 ) {
			num2.add( Integer.valueOf( (int)(Math.random() * 50 + 1 ) ) );
		}
		
		while( num3.size() < 15 ) {
			num3.add( Integer.valueOf( (int)(Math.random() * 50 + 1 ) ) );
		}
		
		System.out.println( num1 );
		System.out.println( num2 );
		System.out.println( num3 );
		
		num1_3n = (HashSet<Integer>)num1.clone();
		
		num1_3n.retainAll(num3);
		
		System.out.println( num1_3n );
		
		num1_2m = (HashSet<Integer>)num1.clone();
		num1_2m.removeAll( num2 );
		System.out.println( num1_2m );
		
		num2_3n = (HashSet<Integer>)num2.clone();
		num2_3n.remove( num3 );
		System.out.println( num2_3n );
		
		num1_2_3u = (HashSet<Integer>)num1.clone();
		num1_2_3u.addAll( num2 );
		num1_2_3u.addAll( num3 );
		
		System.out.println( num1_2_3u );
		
		// ���� ���� class���� addAll, retainAll, removeAll�� ����Ϸ��� equals�� ��������
		// hashcode��� method�� ������ �Ѵ�
		
		
		
	}

}

/*
	Set interface
		- HashSet, TreeSet
		- ������� ������� �ʴ´�
		- �ߺ� �����������!
		- index�� ����
		- Set�� ����(�������� �׷�)�� �ٷ궧 ���ȴ�.!
		- HashSet -> ������ ǥ��
		- TreeSet -> �˻��� Ưȭ

*/
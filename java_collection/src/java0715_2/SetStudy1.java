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
			String food = it.next();
			System.out.println( food );
		}
		
		
	}

}

/*
	Set interface
		- HashSet, TreeSet
		- ������� ������� �ʴ´�
		- �ߺ� �����������
		- index�� ����
		- Set�� ����(�������� �׷�)�� �ٷ궧 ���ȴ�.
		- HashSet -> ������ ǥ��
		- TreeSet -> �˻��� Ưȭ

*/
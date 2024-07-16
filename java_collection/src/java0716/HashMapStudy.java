package java0716;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy {

	public static void main(String[] args) {

		HashMap< String , Integer > map = new HashMap<>();
		// HashMap< keyŸ�� , valueŸ�� > = ������ = new HashMap<>();
		
		map.put( "�̼���" , 19990405 );
		// HashMap�� Map interface�� ���� �׸��̶� put���� �����͸� ����
		map.put( "������" , 19990101 );
		map.put( "�念��" , 20110718 );
		map.put( "�̵�" , 20051103 );
		map.put( "������" , 20091010 );
		// key�� ���� �ߺ��̸� ���߿� ���� �������� value�� ���� ����
		map.put( "�̼���" , 19990405);
		// value�� ���� �ߺ��̾ ����
		
		map.putIfAbsent( "�念��" , 1222 );
		// putIfAbsent( key , value ); -> map�� Ű�� �����Ѵٸ� �������� ���� 
		
		
		System.out.println( map );
		
		System.out.println( map.get( "�̵�" ) );
		// .get( key )�� key�� value�� ������
		
		
		map.replace( "�̼���" , 19760505 );
		// .replace( key , value )�� key�� value�� �ٲ���
		
		System.out.println( map );
		
		System.out.println( map.containsKey( "����ȣ" ) );
		System.out.println( map.containsValue(1222) );
		// .containsKey, Value�� ���� key�� ��, value�� ���� �����ϴ��� Ȯ�� ����
		
		System.out.println( map.isEmpty() );
		
		System.out.println( map.size() );
		// map�� size -> key : value�� �� 
		
		// set �Ǵ� collection ��ȯ
		Set<String> keys = map.keySet();
		// key���� ������ Set interface�� ���� ����
		// key�� Set���� �ٲ��ְ� �ݺ����� ������ ->  key : value�� ���·� ����Ǿ� �ֱ⶧��
		System.out.println( keys );
		
		for( String name : keys ) { 
			// key�� set�� �����ϰ� ������ ���� .get�� ���� value�� ���� ���� 
			System.out.println( map.get( name ) );
		}
		
		
		List<Integer> birth = new ArrayList<Integer>( map.values() );
		// value�� ArrayList�� ����
		// List<Ÿ��> ������ = new ArrayList<Ÿ��>( map.value() );
		System.out.println( birth );
		
		Set< Map.Entry< String , Integer > > entry = map.entrySet();
		// Set< Map.Entry< key Ÿ��, value Ÿ�� > > ������ = map.entrySet();
		// map�� key���� value�� �ϳ��� ���� Set�� ����
		System.out.println( entry );
		
		map.forEach( ( k , v ) -> System.out.println( k + " " + v ) );
		// forEach�� ����� key�� value�� ��°���
		
		
	}

}

/*
	HashMap
		- ���������� ��������ʴ´�
		- Key : value�� �̿����� �ִ�
		- key �ߺ� ��� ���� �ʴ´�
		- value �ߺ� ���
		- Map�� ���ΰ˻��� Ưȭ�Ǿ��ִ�
		- �޸� ������ ���� �Һ��Ѵ�

*/
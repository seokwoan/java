package java0711;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		// ArrayList�� class�� ��ü�� �־���
		ArrayList<Member> list = new ArrayList<>();
		
		list.add( new Member( "�̼���" , 34 , "19900405" ) );
		list.add( new Member( "������" , 25 , "19991208" ) );
		list.add( new Member( "�庸��" , 28 , "19960712" ) );
		list.add( new Member( "�Ѽ���" , 31 , "19930120" ) );
		list.add( new Member( "�豤��" , 39 , "19851010" ) );
		
		// ArrayList�� ������ list���� Member�� ��ü�� ����ִ°� �ƴ� ��ü�� �ּҰ� ����
		// ArrayList�� ��ü�� ��Ƶ����� indexOf, contains, lastIndexOf ���Ұ�
		// ��ü�� �ּҰ� ����־� ���� ã�� ���� -> Member class�� equals method�� ������ָ� ��밡��
		
		System.out.println( list ); // Member�� ��ü�� toString�� �־��༭ �ּҰ� �ƴ� ���� ����
//		System.out.println( list.get(1) );
		
		// ���������� ǥ���ϱ� ���� 
		for( Member m : list ) {
			if( m.getAge() >= 30) {
				System.out.println( m );
			}	
		}
		
		System.out.println( "====1995�����Ŀ� �¾ �����=====" );
		
		for( Member m : list ) {
			String temp = m.getBirth().substring( 0 , 4 );
			int year = Integer.parseInt( temp );
			if( year > 1995 ) {
				System.out.println( m );
			}
		}
		

		// 8��, 9��, 10��, 11���� �¾ ����� ���
		
		for( Member m : list ) {
			String temp = m.getBirth().substring( 4 , 6 );
			int month = Integer.parseInt( temp );
			if( month < 12 && month > 7 ) {
				System.out.println( m );
			}
		}
		
		
		list.add( 2 , new Member( "�念��" , 34 , "" ) );
		
		System.out.println( list );
		
		
		// ��������� ���� ����� ã�Ƽ� �� ����� ���̸� ���� �⵵�� �ְ� 0��0�Ϸ� ����ǰ��϶�
		
		for( Member m : list ) {
			if( m.getBirth().isBlank() ) {
				int year = 2024 - m.getAge();
				m.setBirth( year + "0000" );
			}	
		}
		
		System.out.println( list );

		
		Member t = new Member( "�庸��" , 0 , "0");
		
		list.indexOf( t );
		// ArrayList�� ��ü�� ��Ƶ����� indexOf, contains, lastIndexOf ���Ұ�
		// ��ü�� class�� equals�� Override�ؼ� ��� ������
		// indexOf( classŸ���� ��ü ) -> indexOf�� �� �Ű�������
		// ArrayList�� ������ ��ü�� classŸ�Ը� �Ű������� �̿밡��
		
		
	}

}



















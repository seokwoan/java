package java0711;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		// ArrayList에 class의 객체를 넣어줌
		ArrayList<Member> list = new ArrayList<>();
		
		list.add( new Member( "이순신" , 34 , "19900405" ) );
		list.add( new Member( "김춘추" , 25 , "19991208" ) );
		list.add( new Member( "장보고" , 28 , "19960712" ) );
		list.add( new Member( "한석봉" , 31 , "19930120" ) );
		list.add( new Member( "김광식" , 39 , "19851010" ) );
		
		// ArrayList로 생성한 list에는 Member의 객체가 들어있는게 아닌 객체의 주소가 있음
		// ArrayList에 객체를 담아뒀으면 indexOf, contains, lastIndexOf 사용불가
		// 객체의 주소가 들어있어 값을 찾지 못함 -> Member class에 equals method를 만들어주면 사용가능
		
		System.out.println( list ); // Member의 객체에 toString을 넣어줘서 주소가 아닌 값이 나옴
//		System.out.println( list.get(1) );
		
		// 순차적으로 표현하기 위해 
		for( Member m : list ) {
			if( m.getAge() >= 30) {
				System.out.println( m );
			}	
		}
		
		System.out.println( "====1995년이후에 태어난 사람들=====" );
		
		for( Member m : list ) {
			String temp = m.getBirth().substring( 0 , 4 );
			int year = Integer.parseInt( temp );
			if( year > 1995 ) {
				System.out.println( m );
			}
		}
		

		// 8월, 9월, 10월, 11월에 태어난 사람만 출력
		
		for( Member m : list ) {
			String temp = m.getBirth().substring( 4 , 6 );
			int month = Integer.parseInt( temp );
			if( month < 12 && month > 7 ) {
				System.out.println( m );
			}
		}
		
		
		list.add( 2 , new Member( "장영실" , 34 , "" ) );
		
		System.out.println( list );
		
		
		// 생년월일이 없는 사람을 찾아서 그 사람의 나이를 보고 년도를 넣고 0월0일로 저장되게하라
		
		for( Member m : list ) {
			if( m.getBirth().isBlank() ) {
				int year = 2024 - m.getAge();
				m.setBirth( year + "0000" );
			}	
		}
		
		System.out.println( list );

		
		Member t = new Member( "장보고" , 0 , "0");
		
		list.indexOf( t );
		// ArrayList에 객체를 담아뒀으면 indexOf, contains, lastIndexOf 사용불가
		// 객체의 class에 equals를 Override해서 사용 가능함
		// indexOf( class타입의 객체 ) -> indexOf에 들어갈 매개변수는
		// ArrayList에 저장한 객체의 class타입만 매개변수로 이용가능
		
		
	}

}



















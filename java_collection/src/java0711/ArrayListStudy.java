package java0711;

import java.util.ArrayList;
import java.util.Collections;

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

		
		Member t = new Member( "장보고" , 28 , "19960712");
		
		list.indexOf( t );
		// ArrayList에 객체를 담아뒀으면 indexOf, contains, lastIndexOf 사용불가
		// 객체의 class에 equals를 Override해서 사용 가능함
		// indexOf( class타입의 객체 ) -> indexOf에 들어갈 매개변수는
		// ArrayList에 저장한 객체의 class타입만 매개변수로 이용가능
		
		// 개발자가 정의한 class 를 collection에 사용하는 경우 collection의 method들을
		// 온전히 사용하려면 필요한 method를 구현해야한다.
		// 필요한 method는 최상위 class인 Object가 가지고 있다
		// 추가로 collection에 관련된 interface를 implements 하기도 한다. 
		

		System.out.println( list.indexOf( t ) ); 
		// Member class의 객체를 indexOf에 넣어서 찾기
//		list.indexOf( "장보고" ); -> String의 객체라 사용불가
		System.out.println( list.contains( t ) );
		// equals method를 만들어서 indexOf, contains 사용 가능 
		
		list.remove( t ); // remove도 equals가 있어야 사용 가능
		System.out.println( list );
		
		
		list.forEach( m -> System.out.println( m ) );
		
		
		// equals는 for문과 if문으로 동작 (아래와 비슷하게)
//		Integer[] a = new Integer[]	{ 10 , 20 , 30 , 40, 50 ,60 };
//		
//		int i = 0;
//		for(  ; i < a.length ; i++ ) {
//			if( a[i] == 30 ) break; // 찾고자하는 값이면 for문이 멈춤
//		}
//		if( i == a.length ) { // i가 a.length랑 같으면 찾고자하는 값이 없음 i에 -1저장
//			i = -1;
//		}
		
		// -- equals
		
		
		
		Member[] mem = list.toArray( new Member[list.size()] );
		// ArrayList를 정적배열로 만들어줌
		// 자바에서 다른언어로 데이터를 보낼때 일부 언어는 ArrayList형태를 받지못해 변환이 필요하다
		for( Member mm : mem) {
			System.out.println( mm );
		}
		
		System.out.println( "====================================" );
		// 정렬
		Collections.sort( list ); 
		for( Member l : list) {
			System.out.println( l );
		}
		// Member class에 정렬을 위한 method가 필요함
		// implements Comparable<Member> -> Comparable interface를 implement해줌
		// implements Comparable<class타입>
		// @Override public int compareTo(Member o) -> method를 Override하고 return값을 줌 
		
		
	}

}
//a


















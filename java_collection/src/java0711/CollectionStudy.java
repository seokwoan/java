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
		// ArrayList<데이터타입> 객체명 = new ArrayList<데이터타입>();
		//                                           생략가능
		// 데이터 타입은 class타입이 들어와야한다.
		
		// ArrayList로 배열을 만들때는 크기를 지정하지 않아도 된다
		// 추가하는 만큼 공간이 늘어난다 동적배열
		
		list1.add( 89 ); // 데이터를 추가하는 방법은 객체명.add(); , 타입지정을 안하면 노란줄
		list1.add( 230 ); // 타입 지정을 안하면 ArrayList는 object class의 타입으로 받음
		list1.add( 4542 );
		list1.add( 3434 );
		list1.add( 2 );
//		list1.add( 45.78 );
//		list1.add( "이순신" );
		// 정수, 실수, 문자열 전부 저장 가능
		// 데이터 타입을 지정해서 같은 타입의 데이터를 저장해야 사용하기 편함
		// 
		
		System.out.println( list1 ); // 객체명을 쓰면 배열의 값이 나옴 -> toString method가 구현되어있음  
		System.out.println( list1.get(2) );
		// 배열이긴하지만 class의 객체이므로 method사용? 
		
		for( int i = 0 ; i < list1.size() ; i++ ) {
			// 배열의.length가 아닌 ArrayList의 method를 사용 .size() -> 
			System.out.println( list1.get(i) );
		}
		
		System.out.println( list1.indexOf( 232 ) );
		// indexOf( 찾을 수) -> 배열과 마찬가지로 있으면 index값 , 없으면 -1
		
		System.out.println( list1.contains( 3434 ) );
		// contains method도 존재 배열과 같이 있으면 true 없으면 false
		
		list1.remove(3); // list1.remove( index ) index의 값을 지움
		System.out.println( list1 );
		
		System.out.println( list1.isEmpty() );
		// 배열이 비어있나를 확인 데이터가 있으면 false 하나도 없으면 true
		
		list1.add( 1 , 450 );
		// .add( index , data ) -> index의 해당 위치에 data저장 .add는 index의 순서대로 저장
		// index이후에 값이 있다면 index+1
		System.out.println( list1 );
		
		System.out.println( list1.lastIndexOf(230) );
		// index의 뒤에서부터 찾음
		
		list1.forEach( n -> System.out.println( n ) );
		// 반복문을 쉽게 사용하기 위해 사용
		// .forEach( n -> method(n) ); -> n은 반복문의 배열값
		
		for( Integer n : list1 ) {
			System.out.println( n );
		}
		// for each문 위의 방식으로 쉽게 사용 
		
		list1.set( 3 , 15 );
		// .set( index , data ) -> index에 위치한 값을 data로 바꿔줌
		System.out.println( list1 );
		
		Integer[] number = list1.toArray( new Integer[list1.size()]);
		// ArrayList데이터타입[] 배열명 = ArrayList명.toArray( new ArrayList데이터타입[ArrayList명.size()]
		//                 생성할 배열   배열로 바꿀 ArrayList                            크기
		// ArrayList에 저장된 값을 배열로 만들어줌 
		
		Integer[] aa = new Integer[3];
		
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(aa));
		// ArrayList<데이터타입> ArrayList명 = new ArrayList<데이터타입>(Arrays.asList(배열명));
		// ArrayList명은 새로 만드는 ArrayList의 이름 , 배열명은 ArrayList로 바꿔줄 배열의 이름
		// 배열의 값을 ArrayList로 저장 
		
		Collections.sort( list1 );
		// Collections.sort( 객체명 ) ->ArrayList의 값을 오름차순으로 정렬
		System.out.println( list1 );
		
		// 김춘추, 장영실, 이성계, 정몽주, 정도전, 김정호
		// 위 이름을 ArrayList에 저장하고 출력하세요
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add( "김춘추" );
		nameList.add( "장영실" );
		nameList.add( "이성계" );
		nameList.add( 3 , "정몽주" );
		nameList.add( 4 , "정도전" );
		nameList.add( "정도전" );
		nameList.set( 5 , "김정호" );
		System.out.println( nameList );
		
		ArrayList<String> names2 = new ArrayList<>(Arrays.asList( new String[] {
				"김춘추" , "장영실" , "이성계" , "정몽주" , "정도전" , "김정호"
		}));
		
		for( String name : nameList ) {
			System.out.println( name );
		}
		
		names2.forEach( name -> System.out.println( name ) );
		
		
		// 이름이 저장되어 있는 ArrayList에 이순신이 없으면 추가저장하고
		// 있으면 저장안하기
		
		
		
		
		if( !names2.contains( "이순신" ) ) {
			names2.add( "이순신" );
		}
		
		System.out.println( names2 );
		
		
		if( names2.indexOf( "이순신" ) == -1 ) {
			names2.add( "이순신" );
		}
		
		System.out.println( names2 );
		
		
	}

}


/*
	자바 collection 프레임워크 
	
	데이터를 저장, 관리 하기 위한 자료구조와 데이터를 처리, 가공하는 알고리즘이 구현되어있는 class들의 집합체
	
	Collection , Map interface 2가지가 있다
	
	Collection interface
	
		- List interface -> implements Collection
		 	
			- ArrayList class // 데이터 순차적 저장  -> implement List
			- vector // 데이터 순차적 저장
			- LinkedList // 데이터 순차적 저장
			- Stack // 배열구조 
			- Queue // LinkedList구조
			// 같은 interface 밑에 있기 때문에 method의 이름이 다 같다 
			
		- Set interface
			- HashSet // 배열구조 데이터 그룹화
			- TreeSet // LinkedList구조 , 검색, 정렬 특화
			- LinkedHashSet // 반반? 섞어서 사용
			
	Map interface
		- HashMap class // 배열구조 데이터 그룹화 
		- TreeMap Class // LinkedList구조 , 검색, 정렬 특화
		- LinkedHashMap class // 반반? 섞어서 사용
		
	interface 밑에있는 class들의 특징을 알야아 한다.	

 */





















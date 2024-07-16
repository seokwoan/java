package java0716;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy {

	public static void main(String[] args) {

		HashMap< String , Integer > map = new HashMap<>();
		// HashMap< key타입 , value타입 > = 변수명 = new HashMap<>();
		
		map.put( "이순신" , 19990405 );
		// HashMap은 Map interface의 하위 항목이라 put으로 데이터를 저장
		map.put( "김춘추" , 19990101 );
		map.put( "장영실" , 20110718 );
		map.put( "이도" , 20051103 );
		map.put( "김춘추" , 20091010 );
		// key의 값이 중복이면 나중에 넣은 데이터의 value로 덮어 씌움
		map.put( "이성계" , 19990405);
		// value의 값은 중복이어도 가능
		
		map.putIfAbsent( "장영실" , 1222 );
		// putIfAbsent( key , value ); -> map에 키가 존재한다면 저장하지 않음 
		
		
		System.out.println( map );
		
		System.out.println( map.get( "이도" ) );
		// .get( key )로 key의 value를 가져옴
		
		
		map.replace( "이성계" , 19760505 );
		// .replace( key , value )로 key의 value를 바꿔줌
		
		System.out.println( map );
		
		System.out.println( map.containsKey( "김정호" ) );
		System.out.println( map.containsValue(1222) );
		// .containsKey, Value를 통해 key의 값, value의 값을 포함하는지 확인 가능
		
		System.out.println( map.isEmpty() );
		
		System.out.println( map.size() );
		// map의 size -> key : value의 수 
		
		// set 또는 collection 변환
		Set<String> keys = map.keySet();
		// key값을 추출해 Set interface에 저장 가능
		// key를 Set으로 바꿔주고 반복문을 돌린다 ->  key : value의 형태로 저장되어 있기때문
		System.out.println( keys );
		
		for( String name : keys ) { 
			// key를 set에 저장하고 저장한 값을 .get을 통해 value의 값을 얻음 
			System.out.println( map.get( name ) );
		}
		
		
		List<Integer> birth = new ArrayList<Integer>( map.values() );
		// value를 ArrayList로 변경
		// List<타입> 변수명 = new ArrayList<타입>( map.value() );
		System.out.println( birth );
		
		Set< Map.Entry< String , Integer > > entry = map.entrySet();
		// Set< Map.Entry< key 타입, value 타입 > > 변수명 = map.entrySet();
		// map의 key값과 value를 하나로 합쳐 Set에 저장
		System.out.println( entry );
		
		map.forEach( ( k , v ) -> System.out.println( k + " " + v ) );
		// forEach를 사용해 key와 value를 출력가능
		
		
	}

}

/*
	HashMap
		- 순차적으로 저장되지않는다
		- Key : value로 이우루어져 있다
		- key 중복 허용 되지 않는다
		- value 중복 허용
		- Map은 색인검색에 특화되어있다
		- 메모리 공간을 많이 소비한다

*/
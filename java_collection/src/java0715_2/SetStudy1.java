package java0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<>();
		
		hash.add( "짜장면" );
		hash.add( "짬뽕" );
		hash.add( "순대국밥" );
		hash.add( "들깨국수" );
		hash.add( "맑은곰탕" );
		hash.add( "짜장면" ); // 데이터가 이미 존재하면 덮어쓰기해줌 오류는 아님
		// 데이터가 중복되지 않으므로 중복확인을 안하고 데이터를 넣어도됨

		System.out.println( hash );
		// 입력한 순서대로 저장되지 않는다.
		
		hash.remove( "짬뽕" );
		// 저장된 데이터를 하나씩 지우는건 가능
		System.out.println( hash );
		// Set은 하나의 그룹으로 다루기때문에 데이터를 하나씩 꺼내오는 method가 존재하지않음

		for( String food : hash ) {
			System.out.println( food );
		}
		// 하나씩 꺼내는 전용 method가 없을뿐 꺼낼수 있음
		// 중복이 없고 그룹으로 묶으서 사용하기 위한 목적이므로 하나씩 꺼내 사용하지 않음
		
		ArrayList<String> list = new ArrayList<>(hash);
		// ArrayList<class타입> 변수명 = new ArrayList<>(바꿀HashSet명);
		// LinkedList도 변환가능
		System.out.println( list );
		System.out.println( list.get(3) ); // ArrayList로 변환되어 하나씩 꺼내는 method사용
		System.out.println( "=====================" );
		// HastSet은 교집합, 합집합, 차집합 사용 가능
		
		HashSet<String> 재학 = new HashSet<>();
		HashSet<String> 상민 = new HashSet<>();
		
		재학.add( "짜장면" );
		재학.add( "볶음밥" );
		재학.add( "돈까스" );
		재학.add( "쭈꾸미볶음" );
		
		상민.add( "김치볶음밥" );
		상민.add( "떡볶이" );
		상민.add( "짜장면" );
		상민.add( "돈까스" );
		
		System.out.println( 재학 );
		System.out.println( 상민 );
		// 교집합 - 두 개 이상의 그룹에 공통적인 값의 집함
		HashSet<String> 공통 = new HashSet<>();
		
		Iterator<String> it = 재학.iterator();
		// collection framework에서만 사용가능한 방법 순차적 처리를 해주기 위한 interface
		// 일회용으로 한 번 사용하고 다시 사용하지 못함
		// Iterator<class타입> 변수명 = HashSet명.iterator();
		// -> HashSet의 데이터를 복사하고 가장위에 비어있는 공간을 만듬 -> 비어있는 공간의 주소가
		// 변수명에 저장됨 -> 주소를 이동시켜 값을 얻음
		// 코드를 잘못짜서 HashSet의 데이터가 손상되는 것을 막아줌
		
		while( it.hasNext( )) { // .hasNext() -> 다음 값이 있나 없나 확인
			String food = it.next();
			System.out.println( food );
		}
		
		
	}

}

/*
	Set interface
		- HashSet, TreeSet
		- 순차대로 저장되지 않는다
		- 중복 허용하지않음
		- index가 없다
		- Set은 집합(데이터의 그룹)을 다룰때 사용된다.
		- HashSet -> 집합을 표현
		- TreeSet -> 검색에 특화

*/
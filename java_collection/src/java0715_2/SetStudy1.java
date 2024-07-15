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
			String 재학food = it.next(); // 재학food를 하나씩 꺼내옴
			if( 상민.contains( 재학food ) ) { // 꺼내온 데이터가 상민에 있나 확인
				공통.add( 재학food ); // 있으면 공통에 넣어 교집합HashSet에 넣어줌
			}
		}
		
		System.out.println( 공통 );
		
		
		// 차집합 - A집합에서 B집합과의 교집합 데이터를 제외한 데이터
		
		HashSet<String> 차집합 = new HashSet<>();
		it = 재학.iterator(); // interator를 다시 사용하기 위해서는 값을 다시 줘야한다
		while( it.hasNext() ) {
			String 재학food = it.next();
			if( !상민.contains( 재학food ) ) {
				차집합.add( 재학food );
			}
		}
		
		System.out.printf( "상민에 대한 재학의 차집합 : %s\n" , 차집합 );
		
		
		// 합집합 - A집합과 B집합의 합(중복없이)
		
		HashSet<String> 합 = new HashSet<>();
		합 = (HashSet<String>) 재학.clone(); // clone의 반환타입이 HashSet<class타입>이 아니라 강제 형변환
		합.addAll( 상민 ); // HashSet은 중복을 허용하지않아 중복되는 값은 덮어쓰기로 하나만 남음
		System.out.println( 합 );
		
		// 합집합 .addAll
		// 교집합 .retainAll	재학.retainAll(상민);
		// 차집합 .removeAll	재학.removeAll(상민);
		
//		HashSet<Integer> num1 = new HashSet<>();
//		
//		while( num1.size() < 10 ) {
//			num1.add( Integer.valueOf( (int)(Math.random() * 50 ) ) );
//		}
//		
//		System.out.println( num1 );
		
		// num1 , num2, num3 세 개의 집합을 만들고 각각 1~50까지의 랜덤값 15개를 저장하세요
		// num1과 num3의 교집합
		// num1과 num2의 차집합
		// num2와 num3의 교집합
		// num1, num2, num3의 합집합
		
		
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
		
		// 직접 만든 class에서 addAll, retainAll, removeAll을 사용하려면 equals를 만들어야함
		// hashcode라는 method도 만들어야 한다
		
		
		
	}

}

/*
	Set interface
		- HashSet, TreeSet
		- 순차대로 저장되지 않는다
		- 중복 허용하지않음!
		- index가 없다
		- Set은 집합(데이터의 그룹)을 다룰때 사용된다.!
		- HashSet -> 집합을 표현
		- TreeSet -> 검색에 특화

*/
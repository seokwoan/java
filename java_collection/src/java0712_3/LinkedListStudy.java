package java0712_3;

import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		// LinkedList는 ArrayList와 같은 interface를 사용해 method가 같다
		// 배열이 아니라 index가 없어야하지만 ArrayList와 통일성을 위해 추가함 
		
		list.add( "제주도" );
		list.add( "독도" );
		list.add( "울릉도" );
		list.add( "백령도" );
		list.add( "마라도" );
		
		list.indexOf( "울릉도" );
		System.out.println( list.get(3) );
		list.forEach( 도 -> System.out.println( 도 ) );
		
		// list. peek(), peekFirst(), peekLast(), poll(), pollFirst(), pollLast(), pop(), push()
		// 는 ArrayList에 없는 method
		
		
	}

}

// index를 가지려면 동일한 크기의 공간이 연속적으로 있어야한다
// 0에서 시작해서 1의 크기만 큼 이동
// 배열의 단점 중간데이터의 삽입, 삭제의 시간이 오래 걸린다

// 이 단점을 보안하기위해 만들어진게 LinkedList

// LinkedList는 첫번째 데이터의 공간에 2번째 데이터의 주소를 가지고 있음 
// 2번째 데이터의 공간에는 3번째 데이터의 주소가 있음 
// 데이터가 연속적으로 저장되는게 아니라 각자 따로 저장되고 각 저장된 공간에 다음 데이터의 주소를 가지고있는 형식으로 연결됨

// LinkedList는 3가지 종류가 있음

// 싱글링크드, 더블링크드, 환형링크드
// 싱글링크드 - 하나와 연결됨 -> 다음 데이터 값
// 더블링크드 - 두개와 연결됨 -> 이전 데이터 값, 다음 데이터 값
// 환형링크드 - 처음 데이터와 마지막 데이터가 연결되어있음

// 자바에서는 더블링크드 사용




















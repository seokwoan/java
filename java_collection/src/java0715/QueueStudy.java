package java0715;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		// Queue<class타입> 변수명 = new LinkedList<>();
		// Queue는 LinkedList를 이용해 만들어줌
		
		q.add( "자두" );
		q.offer( "수박" );
		q.offer( "참외" );
		q.offer( "살구" );
		
		System.out.println( q.poll() );
		// .poll() - 첫번째 데이터를 가져옴 
		System.out.println( q );
		
		System.out.println( q.peek() );
		// .peek() - 첫번째 데이터를 확인 -> q가 비어있을때 null값 나옴
		// if문으로 조건을 설정하려면 .peek()으로
		System.out.println( q.element() );
		// .element() - 첫번째 데이터 확인 -> q가 비어있을때 error가 나옴
		// try catch문으로 조건을 설정하면 .element()로 조건식을 만듬 
		System.out.println( q.size() );
		
		System.out.println( q.contains("복숭아") );
		
		
		// 우선순위가 있는 Queue
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer( 56 );
		pq.offer( 100 );
		pq.offer( 5 );
		pq.offer( 30 );
		pq.offer( 2 );
		
		System.out.println( pq );
		// offer를 통해 넣은 순서와 다르게 나옴
		
		for( int i = 1 ; i <= 5 ; i++ ) {
			System.out.println( pq.poll() );
		}
		// 숫자의 값이 낮을수록 우선도가 높아 마지막에 넣은 2가 가장 먼저 나옴
		
		// 개발자가 정의한 class의 객체에서 우선순위를 정하려면
		// compare method를 구현해야한다.
		// interface Comparator를 implements해야 한다.
		// 빼기를 했을때 양수면 자리를 바꿈 -> 작은 수가 우선순위가 높다
		// 문자열은 사전적 순서가 앞일수록 우선순위가 높다
		
		// 크기가 정해진 원형 Queue도 존재함
		// 입력토큰, 출력토큰이 존재 두 개의 토근이 만나면 Queue에 데이터 꽉찬 상태
		// 각 토큰을 통해 입력, 출력 위치를 정함
		
	}

}

/*
	Queue - 큐
		FIFO - First In First Out 선입선출
		모든 프로그램에 사용됨 - 먼저 입력된 값을 먼저 처리
		우선순위를 설정한 queue도 존재 우선순위가 높은 값 먼저 처리
		입구와 출구가 달라 입력과 출력을 동시에 할 수 있다.

*/
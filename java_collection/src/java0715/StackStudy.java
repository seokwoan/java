package java0715;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {

		Stack<String> st = new Stack<>();
		// Stack<class타입> 변수명 = new Stack<>();
		
		st.add( "이순신" );
		// ArrayList, LinkedList와 같은 interface사용
		st.push( "김유신" ); // Stack은 데이터저장을 위한 방법이으로 push를 사용
		// push는 Stack 전용
		st.push( "김춘추" );
		st.push( "장보고" );
		st.push( "김종서" );
		
		System.out.println( st );
		// Stack은 배열 구조
		System.out.println ( st.pop() );
		// .pop() -> 가장위의 데이터를 꺼내는 method
		System.out.println( st );
		// .pop()으로 데이터를 꺼내면 Stack에서 데이터가 사라짐
		System.out.println( st.search( "김춘추" ) );
		// .search( 찾을데이터 ) -> 찾을 데이터가 있는 index를 알려주는 method
		System.out.println( st.size() );
		
		// st.size() - st.search( "김춘추" ) 만큼 pop method를 실행
		// -> 4 -2 == 2 -> pop을 2번 실행하면 2번째 실행에서 김춘추를 꺼네옴
		
		// Stack에서 데이터를 보전하려면 2개의 Stack을 사용해 .pop()으로 꺼낸 데이터를 서로 주고 받게
		
		System.out.println( st.isEmpty() ); // Stack이 비어있는지 아닌지 확인
		
		
		
		// 뒤로가기 앞으로 가기
		
		Stack<String> pre = new Stack<>();
		Stack<String> back = new Stack<>();
		String now = "네이버";
		
		Scanner sc = new Scanner(System.in);
		
		while( true ) {
			System.out.print( "이동페이지 입력 ( 1.뒤 2.앞 ) : " );
			String temp = sc.nextLine();
			if( temp.equals( "1" ) && !back.isEmpty() ) { 
				// 1이 입력되어야하고 back이 비어있지 않아야 뒤로가기 동작
				pre.push( now ); // 현재 페이지는 pre Stack에 저장
				now = back.pop(); // back의 가장 위의 데이터를 now로 꺼내욤
				
			}
			else if( temp.equals( "2" ) && !pre.isEmpty() ) {
				// 2가 입력되어야하고 pre가 비어있지 않아야 앞으로 가기 동작
				back.push( now );
				now = pre.pop();
			}
			else if( !temp.equals("1") && !temp.equals("2") ) { 
				// 새 페이지 이동 1 또는 2를 안눌렀을때 동작해야함
				back.push( now );
				now = temp;
				pre.clear(); // Stack은 Vector class의 method를 사용
				// 앞으로 가기가 아닌 새로운 페이지로 이동하면 다른 경로이므로 
				// pre가 없어야 함
			}
			
			System.out.println( "현재 페이지 : " +now );
			System.out.println( "back 페이지 목록 : " + back );
			System.out.println( "pre 페이지 목록 : " + pre );
		}
		

	}

}


/*
	데이터를 저장하기 위한 입구와 출력하기 위한 출구가 같다.
	한 곳을 통해 저장과 출력이 이루어지는 구조이다.
	들어오는 곳과 나가는 곳이 같아 하나의 작업만 한다 - 입력 or 출력
	FILO - First In Last Out -> 가장 처음 들어온 데이터가 가장 마지막에 나옴
		입구와 출구가 같아 먼저 들어온 데이터가 밑에 있고 뒤에 들어온 데이터가 그 위에 들어가고
		가장 늦게 들어온 데이터가 가장 먼저 나옴
		계산에서 많이 사용되는 구조
		인터넷 방문기록 -> 뒤로가기를 하면 최근에 본 페이지가 먼저 나옴 
		
*/
package java0712_3;

public class LinkedList2 {
	
	
	Node head = null; // 링크드 리스트의 첫번째 노드 
	Node tail; // 링크드 리스트의 마지막 노드
	// head와 tail은 연결을 위해 생성해준 변수
	// tail값을 통해 새로 추가되는 값의 주소를 넣어줌
	// head값은 변하면 안된다

	void add( int n ) { // 새 데이터 
		Node temp = new Node(n);
		if( head == null ) { // head가 null이면 첫번째이므로 head와 tail둘다 해당
			head = temp;
			tail = temp;
		}
		else {
			tail.next = temp; // 현재 tail에 다음 값의 주소를 넣어줌
			tail = temp; // tail을 현재 값으로 변경해줌
		}
	}
	
	
	// 새 데이터 저장 - add
	// 데이터 삭제 - remove
	// 전체 출력 - toString
	// 데이터 하나 출력 - get
	
	
	@Override
	public String toString() { // 전체 출력
		// linkedList의 경우는 for문보다 while문이 적합하다.
		Node move = head; // head의 값이 변하면 안되므로 다른 변수를 사용 head의 값이 변하면 연결된 데이터를 잃게된다
		String out = "[";
		while( move != null ) {
			out += move.num + ", ";
			move = move.next;
		}
		out = out.substring( 0 , out.length()-2 );
		out += "]";
		return out;
	}
	
	int get( int index ) { // 지정된 위치의 데이터 출력
		return 0;
	}
	
	void remove( int index ) { // 지정된 위치의 데이터 삭제
		
	}


}

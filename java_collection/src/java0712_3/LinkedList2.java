package java0712_3;

public class LinkedList2 {
	
	
	Node head = null; // ��ũ�� ����Ʈ�� ù��° ��� 
	Node tail; // ��ũ�� ����Ʈ�� ������ ���
	// head�� tail�� ������ ���� �������� ����
	// tail���� ���� ���� �߰��Ǵ� ���� �ּҸ� �־���
	// head���� ���ϸ� �ȵȴ�

	void add( int n ) { // �� ������ 
		Node temp = new Node(n);
		if( head == null ) { // head�� null�̸� ù��°�̹Ƿ� head�� tail�Ѵ� �ش�
			head = temp;
			tail = temp;
		}
		else {
			tail.next = temp; // ���� tail�� ���� ���� �ּҸ� �־���
			tail = temp; // tail�� ���� ������ ��������
		}
	}
	
	
	// �� ������ ���� - add
	// ������ ���� - remove
	// ��ü ��� - toString
	// ������ �ϳ� ��� - get
	
	
	@Override
	public String toString() { // ��ü ���
		// linkedList�� ���� for������ while���� �����ϴ�.
		Node move = head; // head�� ���� ���ϸ� �ȵǹǷ� �ٸ� ������ ��� head�� ���� ���ϸ� ����� �����͸� �ҰԵȴ�
		String out = "[";
		while( move != null ) {
			out += move.num + ", ";
			move = move.next;
		}
		out = out.substring( 0 , out.length()-2 );
		out += "]";
		return out;
	}
	
	int get( int index ) { // ������ ��ġ�� ������ ���
		return 0;
	}
	
	void remove( int index ) { // ������ ��ġ�� ������ ����
		
	}


}

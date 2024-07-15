package java0715;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		// Queue<classŸ��> ������ = new LinkedList<>();
		// Queue�� LinkedList�� �̿��� �������
		
		q.add( "�ڵ�" );
		q.offer( "����" );
		q.offer( "����" );
		q.offer( "�챸" );
		
		System.out.println( q.poll() );
		// .poll() - ù��° �����͸� ������ 
		System.out.println( q );
		
		System.out.println( q.peek() );
		// .peek() - ù��° �����͸� Ȯ�� -> q�� ��������� null�� ����
		// if������ ������ �����Ϸ��� .peek()����
		System.out.println( q.element() );
		// .element() - ù��° ������ Ȯ�� -> q�� ��������� error�� ����
		// try catch������ ������ �����ϸ� .element()�� ���ǽ��� ���� 
		System.out.println( q.size() );
		
		System.out.println( q.contains("������") );
		
		
		// �켱������ �ִ� Queue
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer( 56 );
		pq.offer( 100 );
		pq.offer( 5 );
		pq.offer( 30 );
		pq.offer( 2 );
		
		System.out.println( pq );
		// offer�� ���� ���� ������ �ٸ��� ����
		
		for( int i = 1 ; i <= 5 ; i++ ) {
			System.out.println( pq.poll() );
		}
		// ������ ���� �������� �켱���� ���� �������� ���� 2�� ���� ���� ����
		
		// �����ڰ� ������ class�� ��ü���� �켱������ ���Ϸ���
		// compare method�� �����ؾ��Ѵ�.
		// interface Comparator�� implements�ؾ� �Ѵ�.
		// ���⸦ ������ ����� �ڸ��� �ٲ� -> ���� ���� �켱������ ����
		// ���ڿ��� ������ ������ ���ϼ��� �켱������ ����
		
		// ũ�Ⱑ ������ ���� Queue�� ������
		// �Է���ū, �����ū�� ���� �� ���� ����� ������ Queue�� ������ ���� ����
		// �� ��ū�� ���� �Է�, ��� ��ġ�� ����
		
	}

}

/*
	Queue - ť
		FIFO - First In First Out ���Լ���
		��� ���α׷��� ���� - ���� �Էµ� ���� ���� ó��
		�켱������ ������ queue�� ���� �켱������ ���� �� ���� ó��
		�Ա��� �ⱸ�� �޶� �Է°� ����� ���ÿ� �� �� �ִ�.

*/
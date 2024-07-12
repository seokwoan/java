package java0712_3;

import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		// LinkedList�� ArrayList�� ���� interface�� ����� method�� ����
		// �迭�� �ƴ϶� index�� ����������� ArrayList�� ���ϼ��� ���� �߰��� 
		
		list.add( "���ֵ�" );
		list.add( "����" );
		list.add( "�︪��" );
		list.add( "��ɵ�" );
		list.add( "����" );
		
		list.indexOf( "�︪��" );
		System.out.println( list.get(3) );
		list.forEach( �� -> System.out.println( �� ) );
		
		// list. peek(), peekFirst(), peekLast(), poll(), pollFirst(), pollLast(), pop(), push()
		// �� ArrayList�� ���� method
		
		
	}

}

// index�� �������� ������ ũ���� ������ ���������� �־���Ѵ�
// 0���� �����ؼ� 1�� ũ�⸸ ŭ �̵�
// �迭�� ���� �߰��������� ����, ������ �ð��� ���� �ɸ���

// �� ������ �����ϱ����� ��������� LinkedList

// LinkedList�� ù��° �������� ������ 2��° �������� �ּҸ� ������ ���� 
// 2��° �������� �������� 3��° �������� �ּҰ� ���� 
// �����Ͱ� ���������� ����Ǵ°� �ƴ϶� ���� ���� ����ǰ� �� ����� ������ ���� �������� �ּҸ� �������ִ� �������� �����

// LinkedList�� 3���� ������ ����

// �̱۸�ũ��, ����ũ��, ȯ����ũ��
// �̱۸�ũ�� - �ϳ��� ����� -> ���� ������ ��
// ����ũ�� - �ΰ��� ����� -> ���� ������ ��, ���� ������ ��
// ȯ����ũ�� - ó�� �����Ϳ� ������ �����Ͱ� ����Ǿ�����

// �ڹٿ����� ����ũ�� ���




















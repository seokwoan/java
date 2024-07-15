package java0715;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {

		Stack<String> st = new Stack<>();
		// Stack<classŸ��> ������ = new Stack<>();
		
		st.add( "�̼���" );
		// ArrayList, LinkedList�� ���� interface���
		st.push( "������" ); // Stack�� ������������ ���� ��������� push�� ���
		// push�� Stack ����
		st.push( "������" );
		st.push( "�庸��" );
		st.push( "������" );
		
		System.out.println( st );
		// Stack�� �迭 ����
		System.out.println ( st.pop() );
		// .pop() -> �������� �����͸� ������ method
		System.out.println( st );
		// .pop()���� �����͸� ������ Stack���� �����Ͱ� �����
		System.out.println( st.search( "������" ) );
		// .search( ã�������� ) -> ã�� �����Ͱ� �ִ� index�� �˷��ִ� method
		System.out.println( st.size() );
		
		// st.size() - st.search( "������" ) ��ŭ pop method�� ����
		// -> 4 -2 == 2 -> pop�� 2�� �����ϸ� 2��° ���࿡�� �����߸� ���׿�
		
		// Stack���� �����͸� �����Ϸ��� 2���� Stack�� ����� .pop()���� ���� �����͸� ���� �ְ� �ް�
		
		System.out.println( st.isEmpty() ); // Stack�� ����ִ��� �ƴ��� Ȯ��
		
		
		
		// �ڷΰ��� ������ ����
		
		Stack<String> pre = new Stack<>();
		Stack<String> back = new Stack<>();
		String now = "���̹�";
		
		Scanner sc = new Scanner(System.in);
		
		while( true ) {
			System.out.print( "�̵������� �Է� ( 1.�� 2.�� ) : " );
			String temp = sc.nextLine();
			if( temp.equals( "1" ) && !back.isEmpty() ) { 
				// 1�� �ԷµǾ���ϰ� back�� ������� �ʾƾ� �ڷΰ��� ����
				pre.push( now ); // ���� �������� pre Stack�� ����
				now = back.pop(); // back�� ���� ���� �����͸� now�� ������
				
			}
			else if( temp.equals( "2" ) && !pre.isEmpty() ) {
				// 2�� �ԷµǾ���ϰ� pre�� ������� �ʾƾ� ������ ���� ����
				back.push( now );
				now = pre.pop();
			}
			else if( !temp.equals("1") && !temp.equals("2") ) { 
				// �� ������ �̵� 1 �Ǵ� 2�� �ȴ������� �����ؾ���
				back.push( now );
				now = temp;
				pre.clear(); // Stack�� Vector class�� method�� ���
				// ������ ���Ⱑ �ƴ� ���ο� �������� �̵��ϸ� �ٸ� ����̹Ƿ� 
				// pre�� ����� ��
			}
			
			System.out.println( "���� ������ : " +now );
			System.out.println( "back ������ ��� : " + back );
			System.out.println( "pre ������ ��� : " + pre );
		}
		

	}

}


/*
	�����͸� �����ϱ� ���� �Ա��� ����ϱ� ���� �ⱸ�� ����.
	�� ���� ���� ����� ����� �̷������ �����̴�.
	������ ���� ������ ���� ���� �ϳ��� �۾��� �Ѵ� - �Է� or ���
	FILO - First In Last Out -> ���� ó�� ���� �����Ͱ� ���� �������� ����
		�Ա��� �ⱸ�� ���� ���� ���� �����Ͱ� �ؿ� �ְ� �ڿ� ���� �����Ͱ� �� ���� ����
		���� �ʰ� ���� �����Ͱ� ���� ���� ����
		��꿡�� ���� ���Ǵ� ����
		���ͳ� �湮��� -> �ڷΰ��⸦ �ϸ� �ֱٿ� �� �������� ���� ���� 
		
*/
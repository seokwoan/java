package java0701;

import java.util.Arrays;

public class ArrayStudy4 {

	public static void main(String[] args) {
	
		// ���� ���� �����͸� �ٷ궧�� �迭�� ����Ѵ�.
		// ��Ȳ�� ���󼭴� �迭�� ���� �ȵǴ� ��쵵 ������
		// ������ �迭�� ������ �����͸� �����Ѵ�. 
		
		// ���� �迭 �����
		// �ڹٿ����� �迭�� ũ�Ⱑ ������ ����. ���ϰ� ���̴°�ó�� �������
		// ũ�Ⱑ ���ϴ� �ڷᱸ���� ���� ���� 
		
		// ���� �迭
		// ������ �迭 ũ�⸦ �ø��ų� �ٿ��� ����ϴ� �迭
		
//		int[] a = new  int[5];
//		
//		a[0] = 10; 
//		a[1] = 20;
//		
//		System.out.println( Arrays.toString(a) );
//		
//		
//		a = new int[7]; 
//		// new�� ���� �迭�� ũ�⸦ �ø��� ���ο� ������ ���� ���� �迭�� ���� �Ѿ���� ���� 
//		a[5] = 100;
//		System.out.println( Arrays.toString(a) );
		
		int[] num = new int[] { 10, 20, 30, 40, 50 };
		
		// �����͸� �߰��� �� �����Ϸ��� �迭�� ũ�⸦ �÷����Ѵ�.
		int size = num.length; // ���� �迭�� ũ��
		
		int[] temp = new int[ size+1 ]; // ���� �迭+1�� ũ��, ������� ����
		
		for( int i = 0 ; i < size ; i++) {
			temp[i] = num[i];  // ���� �迭�� ���� �־���
		}
		
		num = temp; // �迭�� ����?
		num[5] = 60;
		System.out.println( Arrays.toString( num ) );
		
		// ���ڿ����� ���� �񱳴� .equals()�� �Ѵ�. 
		// ���ڿ��� Ư�����ڳ� ���ڿ� ���Կ��δ� .contains()
		// ���� �ּ��� ��ȭ���� �ּҸ� �����Ͽ� �迭�� �����ϼ���
		// �迭�� �� ����Ǿ����� Ȯ�� ����� Arrays �̿��Ͽ� ���
		
		String[] addr = new String[] {
				"���� �߱� ��ȭ�� 25" , "���� �߱� ��ȭ�� 92" , "���� ���� �л굿 11" , 
				"���� ���� �л굿 1023" , "���� ������ ������ 93" , "���� �߱� ���ﵿ 932" , 
				"���� ���� ���絿 945" , "���� �߱� ��ȭ�� 1234" , "���� �߱� ���ﵿ 23" , 
				"���� �߱� ��ȭ�� 984"
		};
		
		System.out.println( addr[1].contains( "��ȭ��" ) );
		
		
		int length = 0; 
		
		for( int i = 0 ; i < addr.length ; i++) {
			if( addr[i].contains("��ȭ��") ) {
				length++;
			}
		}
		
		String[] ��ȭ�� = new String[length];
		

		
		System.out.println( Arrays.toString(��ȭ��) );
		
		
		
	}

}























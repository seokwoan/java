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
		
		num = temp; // �迭�� ����? �迭�� �ε��� ������ ���� ����.
		// num�� temp�� �ּҰ��� ����Ǿ� temp�� �ּҰ��� �������µ� 
		// num�迭�� �ε����� temp�迭�� �ε����� ���� ���� �־��ִ� for���� ������ 
		// temp�� �ּҰ��� �����͵� ���� �ε����� ���� ���� ������ �־ �迭�� ũ�Ⱑ �þ��ó�� ���δ�. 
		num[5] = 60;
		System.out.println( Arrays.toString( num ) );
		
		// ���ڿ����� ���� �񱳴� .equals()�� �Ѵ�. - ���ڿ�.equals(�񱳹��ڿ�)
		// ���ڿ��� Ư�����ڳ� ���ڿ� ���Կ��δ� .contains() - ���ڿ�.contains(Ÿ�ٹ��ڿ�)
		// ���� �ּ��� ��ȭ���� �ּҸ� �����Ͽ� �迭�� �����ϼ���
		// �迭�� �� ����Ǿ����� Ȯ�� ����� Arrays �̿��Ͽ� ���
		
		String[] addr = new String[] {
				"���� �߱� ��ȭ�� 25" , "���� �߱� ��ȭ�� 92" , "���� ���� �л굿 11" , 
				"���� ���� �л굿 1023" , "���� ������ ������ 93" , "���� �߱� ���ﵿ 932" , 
				"���� ���� ���絿 945" , "���� �߱� ��ȭ�� 1234" , "���� �߱� ���ﵿ 23" , 
				"���� �߱� ��ȭ�� 984"
		};

		int length = 0; 
		int ��ȭ = 0;
		
		for( int i = 0 ; i < addr.length ; i++) {
			if( addr[i].contains("��ȭ��") ) {
				length++;
			}
		}
		
		String[] ��ȭ�� = new String[length];
		
		for ( int i = 0 ; i < addr.length ; i++ ) {
			if( addr[i].contains("��ȭ��") ) {
				��ȭ��[��ȭ++] = addr[i]; // ++�� �ڿ� ������ �켱������ ���� ���Կ����� �����۵� 
				//��ȭ++;
			}
		}
		
		System.out.println( Arrays.toString(��ȭ��) );
		
		
		// 2���� �迭 
		// 1���� �迭�� ������ 1���� �迭�� �����س��� ����
		
		int[][] arr = new int[2][3];
		// java���� 2�����迭�� index�� 2���̱� ������ []�� 2�� �־��ش�
		// int[][] ������ = new int[length][length];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		
		// System.out.println( Arrays.toString(arr) ); 
		// 2���� �迭�� ��� index�� �Է����� ������ �� 1���� �迭�� �ּҰ� ���´�.
		
		// ����б� 1�г� �л����� ����
		// 1�г��� 1�ݺ��� 6�ݱ��� �ִ�.
		
		// new int[6][30];
		// �������� ������ �پ��ϸ� �迭�� ������� ����
		// 3���� �迭������ ��� 4���� �̻��� ���� ������� ����
		// 1~3�г������ �ϸ� 3���� �迭
		// ���� ����б������ϸ� 4���� �迭
		// ���� ����б��� 5���� �迭
		// ������ ���庸�ٴ� ȭ�� ǥ�ø� ���� ���
		
		
		int[] a = new int[] {
				10, 20 ,30 ,40 ,50, 60, 70 ,80, 90, 100
		};
		
		for( int data : a ) { // for-each�� // javascript for-each��, jquery each��
			System.out.println( data );
		}// �迭 ���� for��
		// for( int ������ : �迭��){ (������) } �迭���� �����Ͱ��� ���������� ���ö� ���
		// index���� �����͸� ǥ������ indexǥ���� ���� index�� ���� �˼� ����
		
		
		int[][] array1 = new int[2][3];
		System.out.println( array1.length ); // ���� ���� 2
		System.out.println( array1[0].length ); // index0(1��)�� ���� ���� 3
		System.out.println( array1[1].length); // index1(2��)�� ���� ���� 3
		System.out.println();
		
		int[][] array2 = new int[][] { { 1 , 2 } , { 3 , 4 , 5 } };
		System.out.println( array2.length ); // ���� ���� 2
		System.out.println( array2[0].length ); // index0(1��)�� ���� ���� 2
		System.out.println( array2[1].length ); // index1(2��)�� ���� ���� 3
		System.out.println();
		
		System.out.print( array2[0][0] + " " ); // array2�� 0,0 index 1
		System.out.print( array2[0][1] + " " ); // array2�� 0,1 index 2
		System.out.println();
		System.out.print( array2[1][0] + " " ); // array2�� 1,0 index 3
		System.out.print( array2[1][1] + " " ); // array2�� 1,1 index 4
		System.out.print( array2[1][2] + " " ); // array2�� 1,2 index 5
		System.out.println();
		System.out.println();
		
		for( int i = 0 ; i < array2.length ; i++ ) {  // ���� index
			for( int j = 0 ; j < array2[i].length ; j++ ) { // i���� j index
				System.out.print( array2[i][j] + " " ); // 
			}
			System.out.println();
		}
		System.out.println();
		
		for ( int[] array : array2 ) { // for-each�� ���� array2�� ���� ���� array�� ������ ����
									   // array2�� �� ���� �迭�̶� int[]�� �迭����
			for ( int k : array) { // array�� ����� ���� ������ ������ ����
								   // array�� �� ���� ������ ������ ����
				System.out.print( k + " " ); // ���
			}
			System.out.println();
		}
		
	}

}
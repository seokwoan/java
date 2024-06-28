package java0628;

import java.util.Arrays;

public class ArrayStudy {

	public static void main(String[] args) {
		// �迭 - ���� ������Ÿ���� �����Ͱ� ����Ǵ� ������ ���������� �Ǿ��ִ� ����
		// �迭�� ���鶧 ������ ������Ÿ���� �����͸� ������ ����
		//  int -> ������ ���� ����
		
		int[] a = { 10, 20, 30 }; 
		// ������Ÿ��[] ������ = { ������ ������ };
		// �迭�� ���鶧 ������Ÿ�Կ��� ���ȣ�� �Է��� ������ ������ �߰�ȣ
		// ������Ÿ��[���ȣ] ������ = {�߰�ȣ};
		System.out.println( a[0] + " " + a[1] );
		// �迭�� �ε��� ǥ���� [���ȣ]
		
		int b[] = { 30, 40, 50 };
		// ������ ���� [���ȣ]�� �ٿ��� �迭�� �������
		
		// java�� �迭�� ������ �߰�, ���Ű� �Ұ����� ������� �迭�� �����Ͱ� ������
		System.out.println( a );
		// java���� �迭�� ������ �Է��ϸ� ������ �޸��ּҰ� ����
		System.out.println( Arrays.toString(a) );
		// Arrays.toString �迭�� ���� ���ڿ��� ������
		
		int[] arr = new int[10];
		// int[] ������ = new int[�迭�� ����];
		// �迭�� ���� 10�� ����
		
		int[] brr = new int[]{10,20,30,40};
		// �̹� �����Ͱ� �ִ� �迭�� ���鶧�� �̷��� �������
		
		int size = 15;
		
		int[] arr2 = new int[size];
		// ������ ���� �迭�� ũ�⸦ ���Ҽ� ����
		
		System.out.println( arr2[0] );
		// ������ �迭���� 0�� �������
		
		// int[] arr2 = new int[];
		// �迭�� ������ �־������ �������� ����� ����
		
		// ���� ���� �迭�� ũ�Ⱑ ������ �����迭 ũ�Ⱑ ������ �־� �����Ͱ��� �߰�, ���� �Ұ���
		
		// �迭 ���� ���
		// ������Ÿ��[] �迭�̸� = new ������Ÿ��[�迭ũ��];
		int[] money = new int[5]; // 5���� intŸ�� ������ ���� �迭
		money[0] = 5000;
		money[1] = 12000;
		money[2] = 4000;
		money[3] = 43000;
		money[4] = 50000;
		
		for( int i = 0 ; i < money.length ; i++ ) {
			if ( money[i] >= 10000 ) {
			System.out.println( money[i] );
			}
		}
		
		
		int[] A�� = new int[3];
		
		A��[0] = 89;
		A��[1] = 78;
		A��[2] = 93;
		
		int[] B�� = new int[3];
		B��[0] = 56;
		B��[1] = 84;
		B��[2] = 72;
		
		System.out.println( "A�� ���� : " + Arrays.toString(A��) );
		System.out.println( "B�� ���� : " + Arrays.toString(B��) );
		
		// A��, B�� �����߿��� 80�� �̻� ���
		for( int i = 0 ; i < A��.length ; i++ ) {
			if( A��[i] >= 80 ) {
				System.out.println( A��[i] );
			}
			if( B��[i] >= 80 ) {
				System.out.println( B��[i] );
			}
		}
		
		// �ΰ��� �迭�� ������
		int[] ���г� = new int[ A��.length + B��.length ]; // �迭�� ũ�⸦ ����
		
		// 3�� �ݺ�
//		for( int i = 0 ; i <  A��.length ; i++ ) {
//			���г�[i] = A��[i];
//			���г�[i+3] = B��[i];
//		}
		
		// 6�� �ݺ�
//		for( int i = 0 ; i < ���г�.length ; i++ ) {
//			if ( i < 3) {
//				���г�[i] = A��[i];
//			}
//			else {
//				���г�[i] = B��[i-3];
//			}	
//		}
		
		// method��� 
		System.arraycopy( A�� , 0 , ���г� , 0 , A��.length );
		System.arraycopy( B�� , 0 , ���г� , 3 , B��.length ); // A���� �����Ͱ� ���г⿡ �̹� ����ֱ⶧��
		// �迭���� -> �迭�� ���� �����ؼ� �ٸ� �迭�� �־��ִ� method
		// ���� Ÿ���� �迭�� ����
		// System.arraycopy (�����ҹ迭(a), a���� ���縦 ������ �ε��� , ������ �迭(b) , b���� ���� ���� ��ġ�� �ε���, ������ ������ ��( a���� �ε������� ��� �ε������� ));
		
		for ( int i = 0 ; i < ���г�.length ; i++) {
			if( ���г�[i] >= 80 ) {
				System.out.println( ���г�[i] );
			}
		}
		
		Arrays.sort( ���г� );  // �迭�� �����Ͱ� ���� ��������
		System.out.println( Arrays.toString( ���г� ) );
		boolean same = Arrays.equals( A�� , B�� ); // �迭�� ���� �迭���� Ȯ���ϴ� method
		System.out.println( "A��, B�� �迭�� ������? " + same );

	}

}






































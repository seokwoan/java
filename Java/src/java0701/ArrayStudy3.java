package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy3 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
//		// �迭�� 20���� ���� ���� (���� ���� 1~30)
//		// �迭�� ����� ������ �߿��� 5�� ����� ����� ����ϱ�
//		
//		int[] number = new int[20];
//		// �迭�� ũ�⸦ �ڵ忡�� �����ִ°ͺ��ٴ� ���α׷� ����� ���ϰ� ���ִ°� ����
//		// ������ ũ�⸦ ���ϸ� �������� �ٽ��ϰ� �׽�Ʈ�� �ٽ� �ؾ���
//		// ���� �Ǵ� �޼ҵ带 �̿��� ����� ���ϰ� ���ִ� ����� ���� ���
//		int five = 0;
//		
//		for ( int i = 0 ; i < number.length ; i++ ) {
//			number[i] = (int) (Math.random() * 30 + 1) ;
//			// ��������ȯ�� �ϴ� ���� ������Ÿ���� ū �ʿ��� ���������� ����ɶ� ���ش�. 
//		}
//		
//		for( int i = 0 ; i < number.length ; i++ ) {
//			if( number[i]%5 == 0) {
//				five++;
//			}
//		}
//		
//		System.out.println( Arrays.toString(number));
//		System.out.printf( "5�� ����� %d�� �Դϴ�" , five );
		
		// �迭 �������, �迭 ������ ���� ���, �迭�� ����� ������ ���� �Ǵ� ���
		// �迭�� ������ ���������� ����Ǿ��־� ���������� ����Ҷ� �ӵ��� ������.
		// �������� �ƴ� �۾��� ���� ���ǹ��� �ӵ��� ������ �ʴ´�.
		
		
		
		// ����
		
		// ���� ���� ����� 
		// 1. 25ũ���� �迭 ����
		// 2. �𿭿� �������� ����
		// 3. �ߺ����� �����ϰ� �����
		// 4. 25���� ���ڸ� ȭ�鿡 ���
		// 5. ���ӽ��� - ���� ����( �Է�)
		// 6. ������ ���� ��ġ�� ǥ���ϱ�
		// 7. �� �� �������� Ȯ���ϱ�
		// 8. ������ ȭ�鿡 ���
		// 9. 5~8�� �ݺ�
		
		
		int[] bingo = new int[25];
		
		// 25���� ���� �ߺ�����
		for ( int i = 0 ; i < bingo.length ; i++ ) {
			bingo[i] = (int) ( Math.random() * 50 + 1 );
			for( int k = 0 ; k < i ; k++ ) {
				if( bingo[k] == bingo[i] ) {
					i--; // �ߺ��̸� i�� ���� 1���� ���� i++�� �������� ������
					// �ߺ��� index�� ���� �ٽ� �����ϰ� ��
					// for�� ���� if������ �������� ����ŭ ���ҽ��� for���� ��� ����
					break;
				}
			}
		}
		
		while(true) {
		// 5�� 5ĭ ���
			for( int i = 0 ; i < bingo.length ; i++ ) {
				if( i % 5 == 0 ) {
					System.out.println();
				}
				if( bingo[i] == 0 ) {
					System.out.printf( " %2c ", '��' );
				}
				else {
					System.out.printf( " %2d " , bingo[i]); // %2d���� 2�� �ڸ��� 
				}
			}
			
			System.out.print( "\n���� ���� �Է� : " );
			int num = scan.nextInt();
			
			// ������ ���� ǥ���ϱ�
			for( int i = 0 ; i < bingo.length ; i++ ) {
				if( num == bingo[i] ) {
					bingo[i] = 0;
					break;
				}
			}
			
			// ���� �ټ� ǥ�� ���� �����
			int ���� = 0 , ���� = 0 , �밢��1 = 0 , �밢��2 = 0 , end = 0;
			
			for ( int i = 0 ; i < 5 ; i++ ) {
				for ( int k = 0 ; k < 5 ; k++ ) {
					if ( bingo[ i * 5 + k ] == 0 ) {
						����++;
					}
					if ( bingo[ i + k * 5 ] == 0 ) {
						����++;
					}
				}	
				
				if( i * 6 == 0 ) {
					�밢��1++;
				}
				
				if ( i * 4 + 4 == 0 ) {
					�밢��2++;
				}
					
				if( ���� == 5 ) { // ����⿡ 0�� 5����� 1�� ����
					end++;
				}
				
				if( ���� == 5 ) { // �����⿡ 0�� 5����� 1�� ����
					end++;
				}
				
				if( �밢��1 == 5) {
					end++;
				}
				
				if( �밢��2 == 5 ) {
					end++;
				}
				
				���� = 0;
				���� = 0;
				
			}
			
			if( end == 5 ) { // 5�� ����
				System.out.println( "5�� ���� �ϼ�!" );
				break;
			}
		}	

	}

}




























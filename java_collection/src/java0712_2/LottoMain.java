package java0712_2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {

		int[] �ϵ� = new int[] { 8, 12, 23, 29, 35, 41};
		
		ArrayList<Lotto> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print( "�ڵ� ����? : " );
		int howMany = scan.nextInt();
		
		for( int i = 0 ; i < howMany ; i++ ) {
			int[] temp = new int[6];
			for( int k = 0 ; k < temp.length ; k++ ) {
				temp[k] = (int) (Math.random() * 45 + 1 );
				for( int j = 0 ; j < k ; j++ ) {
					if( temp[k] == temp[j] ) {
						k--;
						break;
					}
				}
			}
			list.add( new Lotto(temp) );
		}

		list.forEach( It -> System.out.println(It) );
		
		// ���� ������ �ζ� ��ȣ���߿� 3��� 4���� ��ΰ�?
		// 3���� 5���� ���ڰ� ��ġ, 4���� 4���� ���ڰ� ��ġ
		
		for( Lotto a : list) {
			for( int i = 0 ; i < a.getNum().length ; i++ ) {
				System.out.println( a.getNum()[i] );
			}
		}
		
		
		
		
		int ��� = 0, ��� = 0;
		
		for( Lotto money : list ) {
			int[] temp = money.getNum();
			int cnt = 0;
			for( int i : temp ) {
				for( int k : �ϵ�) {
					if( i == k ) {
						cnt++;
					}
				}
			}
			if( cnt == 5 ) ���++;
			if( cnt == 4 ) ���++;
		}
		
		System.out.printf( "3�� %d��\n4�� %d��" , ��� , ��� );
		
	}

}




















package java0627;

import java.util.Scanner;

public class java0627_loop {
	
	static Scanner sc = new Scanner(System.in); // void main�� ���� ������ ����� static�� �ٿ������

	public static void main(String[] args) {

		// �ݺ��� for, while, do~while
		// for( �ʱⰪ ; ���ǽ� ; ������ ) { �ݺ����� }
		// ���ǽ��� ������ �ɋ����� �߰�ȣ���� ������ ��� ����ȴ�.
		// �ʱⰪ -> ���ǽĺ� -> �� -> �߰�ȣ���� -> ������ -> ���ǽĺ� -> �� -> �߰�ȣ���� -> ������ -> ���ǽĺ� -> ���� -> ��
//		for ( int i = 1 ; i < 10 ; i++ ) {
//			int k = 2 * i - 1;
//			System.out.printf( "��... �ݺ���....%d\n" , k );
//		}
//		
//		for ( int i = 1 ; i < 18 ; i += 2 ) {
//			System.out.println( "��... �ݺ���...." + i );
//		}
//		
//		for ( int i = 1 ; i < 18; i++) {
//			System.out.printf( "��... �ݺ���....%d\n" , i );
//			i++;
//		}
//		
//		for ( int i = 10 ; i > 0 ; i--) {
//			System.out.printf( "%d\n" , i );
//		}

		
//		int num = 1;
//		int a = 1;	
//		num += a; 
//		System.out.printf( "%d\n" , num );
//		a++;
//		num += a;
//		System.out.printf( "%d\n" , num );
//		a++;
//		num += a;
//		System.out.printf( "%d\n" , num );
		
		
//		for ( int a = 1 ; a < 4 ; a++) {
//			num += a;
//			System.out.printf( "%d\n" , num );
//		}
		
		
		// 1���� ���� �Է��� ���ڱ����� ������ ���ϼ���.
		
//		int sum = 0;
//		Scanner number = new Scanner(System.in);
//		System.out.print( "���ڸ� �Է��ϼ��� : " );
//		int calcNum = number.nextInt();
//		
//		for( int i = 1; i <= calcNum ; i++) {
//			sum += i;
//		}
//		
//		System.out.printf( "%d\n" , sum );
		
//		for( int i = 1; true ; i++) { // for���� ���ǽ��� ���� �ʰų� true�� �����ϸ� for���� ���ѷ����Ѵ�
//			if( i > 10000) break;  // if�� break;�� ������ ������ �����ָ� ���ѷ����� ������.
//				System.out.println(i);
//		}
		
		// �ݺ����� �ۼ��Ϸ��� ��� �ݺ��Ǵ°�, ���� �ݺ����� ����Ǿ�� �ϴ°�
		// �ݺ��� ��������� ���ؼ� ���� �����ؾ��Ѵ�.
		// for��, while��, do~while�� ��� ���� �ݺ��� �������ϴ°��� 
		// ã�� ���ϸ� �ۼ��� �� ����.(���ѷ���, n�� �ݺ����� ���ϴ� �ݺ�Ƚ���� ������ �� ����.)
		
		// ���ѷ����� �����Ű�� ���
		// 1. if���� ���ǽ��� ���̵Ǹ� break; ����
		// 2. for ( ; ���ǽ� ; ) �ݺ����� ���ǽ����� 
		// 3. return; �ݺ����ڵ尡 �ִ� �޼��带 �����Ű�� ������ �ݺ����� ����ȴ�.
		// 4. break; �ݺ���, switch ��밡�� , if�� �ܵ����� break ��� �Ұ�
		// if( 10 > 5 ) break; -> ���� �ݺ��� or switch���� �־�� ��밡�� 
		
		
		
		// if�� �ݺ��� ���ѷ��� ���� 1�� 
//		for( ; true ; ) {
//			System.out.print("�����Է� : ");
//			int num = sc.nextInt();
//			if( num == 10) {
//				break;
//			}
//		}
		
		// �ݺ����� ���ǽ����� ���ѷ��� ���� 2��
		
//		int num1 = -1;
//		for( ; num1 != 20 ; ) {
//			System.out.print("�����Է� : ");
//			num1 = sc.nextInt();
//		}

		
		// continue; �ݺ����� �帧�� ���� �ݺ����� �ѱ�
//		for ( int i = 1 ; i <= 10 ; i++ ) {
//			System.out.println( i + "��° �ݺ� ����" );
//			if( i%3 == 0 ) {
//				continue; 
//				// �ݺ��� continue;�� ������ ���� �ݺ��� ���� ������ �������� �ʰ� ���� �ݺ��� �����
//				// 
//			}
//			System.out.println( i + "��° �ݺ� ������" );
//			System.out.println( i + "��° �ݺ� ����������" );
//		}
		
		// �ڹ��� ����
//		int random = (int)Math.floor(Math.random() * 10 + 1);
		// �������� �����Ҷ� java�� ������Ÿ���� �־� random�Լ��� ���� �Ǽ��� ������ ������ ����ȯ�� ����
		// Math.random() -> �Ǽ��̱⶧���� Math.floor�� ���� �Ǽ�
		// int�� ������ ���� �����ϱ� ���� int�� ����ȯ
		
		
		
		// ������ ���� ( 1~50 ) 
		// ���� �� ��� ���
		// �������� 11�� ����� ��� �ݺ��� ����
		
//		for ( ; true ; ) {
//			// int random = (int)Math.floor(Math.random() * 50 + 1);
//			
//			// double random = Math.floor(Math.random() * 50 + 1);
//			// ����Ÿ���� double�� ����� ����ȯ�� �ʿ����.
//			
//			// int random = Integer.parseInt( Math.random() * 50 + 1 );
//			// java���� parseInt�� ���ڿ��� ������ ���鶧 ��� ���� ��� ����
//			int random = (int)( Math.random() * 50 + 1 );
//			// java�� Ÿ���� �����ؼ� �������� �ٷ� int�� ����ȯ ���ָ� Math.floor�� �ʿ� ����
//			
//			System.out.println( "�������� : " + random );
//			if( random%11 == 0 ) {
//				break;
//			}
//		}
		
		// up & down �����
		// ��ǻ�Ͱ� ������ ���� ���߱�
		// ��Ǫ�Ͱ� �����ϴ� ���ڴ� �������� ( �������� 20 ~ 100 )
		// ��ǻ�Ͱ� ������ ���ڰ� 74��� 
		// ���� �Է��� ���ڰ� 40�� ��� up�̶�� ���
		// ���� �Է��� ���ڰ� 80�� ��� down�̶�� ���
		
//		int comNum = (int)( Math.random() * 81 + 20 );
//		int userNum = 0;
//		for( ; true ; ) {
//			//if( userNum == 0 ) { // ������ ������ �˷���
//			//	System.out.println( "������ ������ 20~100 �Դϴ�. " );
//			//} -> ���ڸ� �Է� ������ ������ �˷��ָ� �ʿ� ���� �κ�
//			System.out.print( "���ڸ� �Է��ϼ��� : " );
//			userNum = sc.nextInt();
//			if( userNum < 20 || userNum > 100 ) {
//				System.out.println( "������ ������ 20~100 �Դϴ�. " );
//				userNum = -1; // 0�� ������ ������ ������ 2�� �����°� ��������
//				// ���ڸ� �Է¹����� ������ �˷��ָ� �ʿ� ���� ����
//				continue; // �������� ���ڸ� up, down, ���� ���� ����
//			}
//			if( userNum > comNum ) {
//				System.out.println( "Down" );
//			}
//			else if ( userNum < comNum ) {
//				System.out.println( "Up" );
//			}
//			else {
//				System.out.println( "����" );
//				break;
//			}
//		}
		
		
		// �̸��� �ִ� �ݺ��� 
		
		int sum = 0;
		
		// for���� �̸��� ���ϱ�� ����		
		���ϱ� : for( int i = 1 ; i <= 10 ; i++ ) {
			for ( int k = 1 ; k <= 4 ; k++) {
				if( sum + k >= 40) break ���ϱ�; // ���ϱ��� �̸��� ���� for���� ����
											   // continue�� ������
				sum += k;
				System.out.println( i + " " + k );
			} // for���� ��ø���� ���� for���� break�� ���絵 ����for���� ������ ����
			System.out.println( i );
			sum += i ;
		}
		
		if( sum < 40 ) {
			System.out.println( "sum ��� : " + sum );
		}

		// ����Ų��� 31
		// ��ǻ�Ϳ� ���ϰ� ���� �Ѵ�.
		// �ѹ��� ������ ���ִ�  ���ڴ� �ּ� 1��, �ִ� 3��
		// 31�� �Է��ϸ� �й�
		
		int num = 1;
		for( ; ; ) {
			System.out.print( "���� � : " );
			int user = sc.nextInt();
			System.out.print( "�� : ");
			for( int u = 1 ; u <= user ; u++) {
				System.out.println( num + " ");
				if ( num == 31 ) break;
				num++;
			}
			if ( num == 31 ) break;
			System.out.println();
			
			int com = (int)( Math.random() *3 + 1);
			System.out.print( "com : ");
			for( int c = 1 ; c <= com ; c++) {
				System.out.println( num + " ");
				if ( num == 31 ) break;
				num++;
			}
			if ( num == 31 ) break;
			System.out.println();
		}
		
//		����Ų : 
//		for( ; ; ) {
//			System.out.print( "���� � : " );
//			int user = sc.nextInt();
//			System.out.print( "�� : ");
//			for( int u = 1 ; u <= user ; u++) {
//				System.out.println( num + " ");
//				if ( num == 31 ) break ����Ų;
//				num++;
//			}
//			System.out.println();
//			
//			int com = (int)( Math.random() *3 + 1);
//			System.out.print( "com : ");
//			for( int c = 1 ; c <= com ; c++) {
//				System.out.println( num + " ");
//				if ( num == 31 ) break ����Ų;
//				num++;
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
	}

}
























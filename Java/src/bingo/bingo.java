package bingo;

import java.util.Arrays;
import java.util.Scanner;

public class bingo {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		String userNum;
//		userNum = number.nextLine();
		
		
		String base[] = new String[]{
			"01" , "02" , "03" , "04" , "05" , "06" , "07" , "08" , "09" , "10" , "11" , "12" , "13"
			 , "14" , "15" , "16" , "14" , "18" , "19" , "20" , "21" , "22" , "23" 
			 , "24" , "25" , "26" , "27" , "28" , "29" , "30" , "31" , "32" , "33" 
			 , "34" , "35" , "36" , "37" , "38" , "39" , "40" , "41" , "42" , "43" 
			 , "44" , "45" , "46" , "47" , "48" , "49" , "50"
		};
		
		String[] bingo = new String[] {
				"0" , "0" , "0" , "0" , "0" , "0" , "0" , "0" , "0" , "0" , "0" , "0" , 
				"0" , "0" , "0" , "0" , "0" , "0" , "0" , "0" , "0" , "0" , "0" , "0" , 
				"0"
		};
		String[] bingoRow1 = new String[5];
		String[] bingoRow2 = new String[5];
		String[] bingoRow3 = new String[5];
		String[] bingoRow4 = new String[5];
		String[] bingoRow5 = new String[5];
		String[] bingoCol1 = new String[5];
		String[] bingoCol2 = new String[5];
		String[] bingoCol3 = new String[5];
		String[] bingoCol4 = new String[5];
		String[] bingoCol5 = new String[5];
		String[] bingoCross1 = new String[5];
		String[] bingoCross2 = new String[5];
//		String bingoNum;
		int random = 0;
		int line = 0;
		boolean play = true;
		boolean numCheck = true;
		boolean show = true;
		String zero = "00";
		int row = 0;
		int col = 0;
		int cross = 0;
		int cross2 = 0;
		
		
		
		// �迭�� ������ �Է�
		for( int i = 0 ; i < bingo.length ; i++ ) {
			random = (int) (Math.random() * 50 );
			int search = bingo[i].indexOf( base[random]);
			if( search == -1 ){
				bingo[i] = base[random];
				base[random] = "";
			}
			else if( search != -1 ){
				while( true ) {
					random = (int) (Math.random() * 50 );
					if( base[random] != "" ) {
						bingo[i] = base[random];
						base[random] = "";
						break;
					}
				}	
			}
		}
		
		System.out.println( Arrays.toString(bingo) );
		// �迭 �и� ȭ��ǥ�ÿ�
		for( int i = 0 ; i < 5 ; i++) {
			// ����
			System.arraycopy(bingo, i, bingoRow1, i, 1);
			System.arraycopy(bingo, (i+5), bingoRow2, i, 1);
			System.arraycopy(bingo, (i+10), bingoRow3, i, 1);
			System.arraycopy(bingo, (i+15), bingoRow4, i, 1);
			System.arraycopy(bingo, (i+20), bingoRow5, i, 1);
			//����
			System.arraycopy(bingo, (i*5), bingoCol1, i, 1);
			System.arraycopy(bingo, (i*5+1), bingoCol2, i, 1);
			System.arraycopy(bingo, (i*5+2), bingoCol3, i, 1);
			System.arraycopy(bingo, (i*5+3), bingoCol4, i, 1);
			System.arraycopy(bingo, (i*5+4), bingoCol5, i, 1);
			// �밢��
			System.arraycopy(bingo, (i*6), bingoCross1, i, 1);
			System.arraycopy(bingo, (i*4+4), bingoCross2, i, 1);
		}
		
		System.out.println( "�����Դϴ�. ���ڸ� �Է��ϸ� �Է��� ���ڴ� 00���� ���ϰ�" );
		System.out.println( "����, ����, �밢������ 00�� ���̸� ���� \n5���� ���� ���弼��" );
//		System.out.println( Arrays.toString(bingo) );
		System.out.println( Arrays.toString(bingoRow1) );
		System.out.println( Arrays.toString(bingoRow2) );
		System.out.println( Arrays.toString(bingoRow3) );
		System.out.println( Arrays.toString(bingoRow4) );
		System.out.println( Arrays.toString(bingoRow5) );
		

		System.out.println( "���ڴ� ���ڸ��� �Է����ּ��� ex) 01");
		
		while ( play ) {
			numCheck = true;
			show = true;
			System.out.println( "01~50�� ���ϴ� ���ڸ� �Է��ϼ���" );
			userNum = number.nextLine();
			if ( userNum.length() != 2 ) {
				System.out.println( "���ڴ� ���ڸ��� �Է����ּ���");
				numCheck = false;
				show = false;
				continue;
			}
			for ( int k = 0 ; k < bingo.length ; k++ ) {
				if( bingo[k].indexOf(userNum) != -1 ) {
					bingo[k] = "00";
					numCheck = false;
					for( int i = 0 ; i < 5 ; i++ ) {
						// ����
						System.arraycopy(bingo, i, bingoRow1, i, 1);
						System.arraycopy(bingo, (i+5), bingoRow2, i, 1);
						System.arraycopy(bingo, (i+10), bingoRow3, i, 1);
						System.arraycopy(bingo, (i+15), bingoRow4, i, 1);
						System.arraycopy(bingo, (i+20), bingoRow5, i, 1);
						//����
						System.arraycopy(bingo, (i*5), bingoCol1, i, 1);
						System.arraycopy(bingo, (i*5+1), bingoCol2, i, 1);
						System.arraycopy(bingo, (i*5+2), bingoCol3, i, 1);
						System.arraycopy(bingo, (i*5+3), bingoCol4, i, 1);
						System.arraycopy(bingo, (i*5+4), bingoCol5, i, 1);
						// �밢��
						System.arraycopy(bingo, (i*6), bingoCross1, i, 1);
						System.arraycopy(bingo, (i*4+4), bingoCross2, i, 1);
					}
					if ( show ) {
						System.out.println( Arrays.toString(bingoRow1) );
						System.out.println( Arrays.toString(bingoRow2) );
						System.out.println( Arrays.toString(bingoRow3) );
						System.out.println( Arrays.toString(bingoRow4) );
						System.out.println( Arrays.toString(bingoRow5) ); //���డ��
						break;
					}
				}
			}
			
			if( numCheck ) {
				System.out.println("���� �����Դϴ�.");
				System.out.println( Arrays.toString(bingoRow1) );
				System.out.println( Arrays.toString(bingoRow2) );
				System.out.println( Arrays.toString(bingoRow3) );
				System.out.println( Arrays.toString(bingoRow4) );
				System.out.println( Arrays.toString(bingoRow5) ); // ���డ��
				continue;
			}
			line = 0;
			cross = 0;
			cross2 = 0;
			// ���� �ټ� Ȯ�� ���� ����
			for( int i = 0 ; i < 5 ; i++ ) {
				for( int k = 0 ; k < 5 ; k++ ) {
					if( bingo[i*5+k] == zero ){
				        row++;
				      }
				      if( bingo[k*5+i] == zero ){
				        col++;
				      }
				    }
				    if( row == 5 ){
				      line++;
				    }
				    if( col == 5){
				      line++;
				    }
				    if( bingo[6*i] == zero ){
				      cross++;
				      if( cross == 5 ) {
				    	  line++;
				      }
				    }
				    if( bingo[4*i+4] == zero ){
				      cross2++;
				      if( cross2 == 5 ) {
				    	  line++;
				      }
			    }
				row = 0;
				col = 0;
			}
			
			System.out.printf( "���� %d�� �ϼ�\n " , line );
	
			if( line == 5) {
				System.out.println( " ���� �ϼ�! ");
				break;
			}
			if( line > 5 ) {
				System.out.println( " Game over ");
			}
			
		}

		
		

				
	}

}
























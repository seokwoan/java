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
		
		
		
		// 배열에 랜덤수 입력
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
		// 배열 분리 화면표시용
		for( int i = 0 ; i < 5 ; i++) {
			// 가로
			System.arraycopy(bingo, i, bingoRow1, i, 1);
			System.arraycopy(bingo, (i+5), bingoRow2, i, 1);
			System.arraycopy(bingo, (i+10), bingoRow3, i, 1);
			System.arraycopy(bingo, (i+15), bingoRow4, i, 1);
			System.arraycopy(bingo, (i+20), bingoRow5, i, 1);
			//세로
			System.arraycopy(bingo, (i*5), bingoCol1, i, 1);
			System.arraycopy(bingo, (i*5+1), bingoCol2, i, 1);
			System.arraycopy(bingo, (i*5+2), bingoCol3, i, 1);
			System.arraycopy(bingo, (i*5+3), bingoCol4, i, 1);
			System.arraycopy(bingo, (i*5+4), bingoCol5, i, 1);
			// 대각선
			System.arraycopy(bingo, (i*6), bingoCross1, i, 1);
			System.arraycopy(bingo, (i*4+4), bingoCross2, i, 1);
		}
		
		System.out.println( "빙고입니다. 숫자를 입력하면 입력한 숫자는 00으로 변하고" );
		System.out.println( "가로, 세로, 대각선으로 00이 모이면 빙고 \n5줄의 빙고를 만드세요" );
//		System.out.println( Arrays.toString(bingo) );
		System.out.println( Arrays.toString(bingoRow1) );
		System.out.println( Arrays.toString(bingoRow2) );
		System.out.println( Arrays.toString(bingoRow3) );
		System.out.println( Arrays.toString(bingoRow4) );
		System.out.println( Arrays.toString(bingoRow5) );
		

		System.out.println( "숫자는 두자리로 입력해주세요 ex) 01");
		
		while ( play ) {
			numCheck = true;
			show = true;
			System.out.println( "01~50중 원하는 숫자를 입력하세요" );
			userNum = number.nextLine();
			if ( userNum.length() != 2 ) {
				System.out.println( "숫자는 두자리로 입력해주세요");
				numCheck = false;
				show = false;
				continue;
			}
			for ( int k = 0 ; k < bingo.length ; k++ ) {
				if( bingo[k].indexOf(userNum) != -1 ) {
					bingo[k] = "00";
					numCheck = false;
					for( int i = 0 ; i < 5 ; i++ ) {
						// 가로
						System.arraycopy(bingo, i, bingoRow1, i, 1);
						System.arraycopy(bingo, (i+5), bingoRow2, i, 1);
						System.arraycopy(bingo, (i+10), bingoRow3, i, 1);
						System.arraycopy(bingo, (i+15), bingoRow4, i, 1);
						System.arraycopy(bingo, (i+20), bingoRow5, i, 1);
						//세로
						System.arraycopy(bingo, (i*5), bingoCol1, i, 1);
						System.arraycopy(bingo, (i*5+1), bingoCol2, i, 1);
						System.arraycopy(bingo, (i*5+2), bingoCol3, i, 1);
						System.arraycopy(bingo, (i*5+3), bingoCol4, i, 1);
						System.arraycopy(bingo, (i*5+4), bingoCol5, i, 1);
						// 대각선
						System.arraycopy(bingo, (i*6), bingoCross1, i, 1);
						System.arraycopy(bingo, (i*4+4), bingoCross2, i, 1);
					}
					if ( show ) {
						System.out.println( Arrays.toString(bingoRow1) );
						System.out.println( Arrays.toString(bingoRow2) );
						System.out.println( Arrays.toString(bingoRow3) );
						System.out.println( Arrays.toString(bingoRow4) );
						System.out.println( Arrays.toString(bingoRow5) ); //압축가능
						break;
					}
				}
			}
			
			if( numCheck ) {
				System.out.println("없는 숫자입니다.");
				System.out.println( Arrays.toString(bingoRow1) );
				System.out.println( Arrays.toString(bingoRow2) );
				System.out.println( Arrays.toString(bingoRow3) );
				System.out.println( Arrays.toString(bingoRow4) );
				System.out.println( Arrays.toString(bingoRow5) ); // 압축가능
				continue;
			}
			line = 0;
			cross = 0;
			cross2 = 0;
			// 빙고 줄수 확인 압축 가능
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
			
			System.out.printf( "빙고 %d줄 완성\n " , line );
	
			if( line == 5) {
				System.out.println( " 빙고 완성! ");
				break;
			}
			if( line > 5 ) {
				System.out.println( " Game over ");
			}
			
		}

		
		

				
	}

}
























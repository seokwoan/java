package java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {

		ArrayList<Asset> account = new ArrayList<>();
		// String bank , int balance , String accountNum , String holder
		account.add( new Asset( "우리은행" , 3450000 , "1004-91-23455" , "이순신" ) );
		account.add( new Asset( "농협" , 513350 , "34-123-349393" , "김유신" ) );
		account.add( new Asset( "신한은행" , 891003 , "394-3412-2323" , "박팽년" ) );
		account.add( new Asset( "국민은행" , 899900 , "39-2384-19939" , "최무선" ) );
		account.add( new Asset( "우리은행" , 28300 , "1002-93-878888" , "문익점" ) );
		account.add( new Asset( "신한은행" , 98000 , "293-0123-1234" , "이율곡" ) );
		account.add( new Asset( "우리은행" , 1920000 , "1006-23-123456" , "김시민" ) );
		account.add( new Asset( "국민은행" , 932000 , "23-2555-29991" , "이율곡" ) );
		
		// 문제1. 우리은행을 이용하는 사람들 정보만 출력  getBank
		// 문제2. 잔액이 100만원 이상인 사람들 정보만 출력 getBalance
		// 문제3. 최무선이 우리은행 계좌를 가지고 있는지 확인하고 없으면 우리은행 계좌 개설( 1007-23-128954)
		
		
		for( Asset a : account ) {
			if( a.getBank().equals( "우리은행" ) ) {
				System.out.println( a );
			}
		}
		
		System.out.println( "===================" );
		
		
		account.forEach( 백만 -> {
			if( 백만.getBalance() >= 1000000 ) {
				System.out.println( 백만 );
			}
		});
		
		// ArrayList명.forEach( 변수 -> { 실행코드; 실행코드;} ); 
		// forEach로 동작할 코드가 여러개라면 중활호를 통해 실행 코드를 묶어줌
		
//		for( Asset a : account ) {
//			if( a.getBalance() >= 1000000 ) {
//				System.out.println( a );
//			}
//		}
		
		System.out.println( "===================" );
		
		
		Asset newAccount = new Asset( "우리은행" , 0 , "1007-23-128954" , "최무선" );

		if( !account.contains(newAccount) ) {
			account.add(newAccount);
		}
		
		for( Asset a : account ) {
			System.out.println( a );
		}

		

//		boolean bankCheck = true;
//	
//		for( Asset a : account ) {
//			if( a.getHolder() == "최무선" ) {
//				if( a.equals( tmp ) ) {
//					bankCheck = false;
//				}
//			}
//		}
//		
//		if( bankCheck ) {
//			account.add( new Asset( "우리은행" , 0 , "1007-23-128954" , "최무선" ) );
//		}
//		
//		for( Asset a : account ) {
//			System.out.println( a );
//		}

	}

}




























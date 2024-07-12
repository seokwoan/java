package java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {

		ArrayList<Asset> account = new ArrayList<>();
		// String bank , int balance , String accountNum , String holder
		account.add( new Asset( "�츮����" , 3450000 , "1004-91-23455" , "�̼���" ) );
		account.add( new Asset( "����" , 513350 , "34-123-349393" , "������" ) );
		account.add( new Asset( "��������" , 891003 , "394-3412-2323" , "���س�" ) );
		account.add( new Asset( "��������" , 899900 , "39-2384-19939" , "�ֹ���" ) );
		account.add( new Asset( "�츮����" , 28300 , "1002-93-878888" , "������" ) );
		account.add( new Asset( "��������" , 98000 , "293-0123-1234" , "������" ) );
		account.add( new Asset( "�츮����" , 1920000 , "1006-23-123456" , "��ù�" ) );
		account.add( new Asset( "��������" , 932000 , "23-2555-29991" , "������" ) );
		
		// ����1. �츮������ �̿��ϴ� ����� ������ ���  getBank
		// ����2. �ܾ��� 100���� �̻��� ����� ������ ��� getBalance
		// ����3. �ֹ����� �츮���� ���¸� ������ �ִ��� Ȯ���ϰ� ������ �츮���� ���� ����( 1007-23-128954)
		
		
		for( Asset a : account ) {
			if( a.getBank().equals( "�츮����" ) ) {
				System.out.println( a );
			}
		}
		
		System.out.println( "===================" );
		
		
		account.forEach( �鸸 -> {
			if( �鸸.getBalance() >= 1000000 ) {
				System.out.println( �鸸 );
			}
		});
		
		// ArrayList��.forEach( ���� -> { �����ڵ�; �����ڵ�;} ); 
		// forEach�� ������ �ڵ尡 ��������� ��Ȱȣ�� ���� ���� �ڵ带 ������
		
//		for( Asset a : account ) {
//			if( a.getBalance() >= 1000000 ) {
//				System.out.println( a );
//			}
//		}
		
		System.out.println( "===================" );
		
		
		Asset newAccount = new Asset( "�츮����" , 0 , "1007-23-128954" , "�ֹ���" );

		if( !account.contains(newAccount) ) {
			account.add(newAccount);
		}
		
		for( Asset a : account ) {
			System.out.println( a );
		}

		

//		boolean bankCheck = true;
//	
//		for( Asset a : account ) {
//			if( a.getHolder() == "�ֹ���" ) {
//				if( a.equals( tmp ) ) {
//					bankCheck = false;
//				}
//			}
//		}
//		
//		if( bankCheck ) {
//			account.add( new Asset( "�츮����" , 0 , "1007-23-128954" , "�ֹ���" ) );
//		}
//		
//		for( Asset a : account ) {
//			System.out.println( a );
//		}

	}

}




























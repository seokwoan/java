package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
			
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add( new Book( "B1234" , "�ڹٿ�������" , "�赿��" ) );
		book.add( new Book( "F9238" , "�����������ӿ�ũ" , "�̻��" ) );
		book.add( new Book( "A1002" , "���ϸ����������" , "������" ) );
		
		dvd.add( new DVD( "M3D232" , "���ϸ�ǻ�" , "������" ) );
		dvd.add( new DVD( "M9D123" , "�����̰����ʰ���Ǳ�" , "Ȳ����" ) );
		dvd.add( new DVD( "M1B001" , "�߳ʵ� ���� ���������־�" , "������" ) );
		
		// ArrayList�� Book, DVD ��ü ����
		
		
		// �뿩�ϱ�
		Library lib = new Library();
		
		lib.addRental( book.get(0) , "�̼���" );
		lib.addRental( dvd.get(0) , "������" );
		
		lib.showRentalList();
		
		
		
		
		// Rental class�� �̿�
//		Rental<DVD> rent = new Rental<>( dvd.get(0) , "�̼���" );
//		System.out.println( rent );
//		
//		Rental<Book> brent = new Rental<>( book.get(0) , "������" );
//		System.out.println( brent );
		
		

	}

}






/*
	���� method ���� class 
		book, dvd ��ü �߰� 
		Library ��ü �����ؼ� ��Ż���� ���

	Library	- addRental method ����
		Rental ��ü �����ϴ� method
		- �뿩 �׸� ������ ArrayList ����
		Rental��ü �����ϴ� method�� ��ü �����ϰ� ����
		- �뿩�׸� �����ִ� method ����
	
	Rantal	- ���׸�ǥ������ book�� dvd��ü �����ؼ�
		�뿩�� ���
	
	Media	- �������� ���� �θ�class
		�ĺ���ȣ, ���� ������ ����
	
	Book	- ������ ������ ���� 
 */













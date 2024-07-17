package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
			
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add( new Book( "B1234" , "자바완전정복" , "김동형" ) );
		book.add( new Book( "F9238" , "스프링프레임워크" , "이상민" ) );
		book.add( new Book( "A1002" , "포켓몬골드완전정복" , "유재학" ) );
		
		dvd.add( new DVD( "M3D232" , "포켓몬실사" , "전형준" ) );
		dvd.add( new DVD( "M9D123" , "지렁이게임초고수되기" , "황정아" ) );
		dvd.add( new DVD( "M1B001" , "야너두 웹툰 몰래볼수있어" , "정한종" ) );
		
		// ArrayList에 Book, DVD 개체 저장
		
		
		// 대여하기
		Library lib = new Library();
		
		lib.addRental( book.get(0) , "이순신" );
		lib.addRental( dvd.get(0) , "김춘추" );
		
		lib.showRentalList();
		
		
		
		
		// Rental class를 이용
//		Rental<DVD> rent = new Rental<>( dvd.get(0) , "이순신" );
//		System.out.println( rent );
//		
//		Rental<Book> brent = new Rental<>( book.get(0) , "김춘추" );
//		System.out.println( brent );
		
		

	}

}






/*
	메인 method 가진 class 
		book, dvd 객체 추가 
		Library 객체 생성해서 렌탈여부 출력

	Library	- addRental method 생성
		Rental 객체 생성하는 method
		- 대여 항목 저장할 ArrayList 생성
		Rental객체 생성하는 method에 객체 생성하고 저장
		- 대여항목 보여주는 method 생성
	
	Rantal	- 제네릭표현으로 book과 dvd객체 저장해서
		대여자 출력
	
	Media	- 다형성을 위한 부모class
		식별번호, 제목 변수를 가짐
	
	Book	- 저자의 변수를 가짐 
 */













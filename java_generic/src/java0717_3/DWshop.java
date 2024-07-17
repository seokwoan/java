package java0717_3;

public class DWshop {

	public static void main(String[] args) {
		
		Electronics elec = new Electronics( "E12001" , "냉장고" , 1702000 , "삼성" );
		Clothing clt = new Clothing( "C12032" , "바지" , 30000 , "L" );
		
//		System.out.println( elec );
//		System.out.println( clt );
		
		ShoppingCart shop = new ShoppingCart();
		
		shop.addCart( elec , 1 );
		shop.addCart( clt , 1 );
		
		shop.showCart();

	}

}

/*
Product 부모class가 가질 공통 변수 생성
Electronics, Clothing 자식class 부모class의 변수와 개별 변수 생성

CartItem <T Expends Product> 의 제네릭 타입으로 class생성
제네릭타입의 변수 생성
수량 변수 생성

ShoppingCart 
제네릭class로 설정하지 않고 method에 사용 
	-> 제네릭class라면 생성시 타입 지정을 하고 해당 타입의 객체만 넣을 수 있음
ArrayList에 와일드카드를 사용해 제네릭타입 표현
- addCart method를 통해 
CartItem의 객체 생성 및 list에 저장
- showCart method를 통해
list에 저장된 항목 출력
*/
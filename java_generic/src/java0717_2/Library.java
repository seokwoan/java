package java0717_2;

import java.util.ArrayList;
import java.util.List;

public class Library { // 도서관class는 도서관 전체에 대한 관리를 하므로 제네릭 와일드카드 사용
	
	private List<Rental<? extends Media>> list = new ArrayList<>(); 
	// List< class타입<T> > - class에 제네릭타입이 있으면 T를 사용 가능
	// class에 제네릭타입이 없다면 <?> 와일드 카드를 이용해 표시
	
	public <T extends Media> void addRental( T item , String renter) {
		// class에 제네릭지정을 하지 않고 method에만 사용할 수 있는 제네릭 
		Rental<T> rental = new Rental<>( item , renter );
		list.add( rental );
		System.out.println( "대여 -> " + rental );
	}
	
	public void showRentalList() {
		for( Rental<? extends Media> r : list ) {
			System.out.println( r );
		}
	}
	
}

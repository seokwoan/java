package java0717_2;

public class Rental<T extends Media> {
				// 책과 DVD 모두 rental class에서 사용하기 위해 제네릭타입으로 표현
	
	private T item;
	private String renter;  // 대여한 사람 
	
	public Rental( T item , String renter ){
		this.item = item;
		this.renter = renter;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public String getRenter() {
		return renter;
	}

	public void setRenter(String renter) {
		this.renter = renter;
	}

	@Override
	public String toString() {
		return "대여자 : " + renter + " , " + item.toString();
	}
	
	
	
	
	
	
	
//	제네릭표현없이 상속을 통한 다형성으로 media 1개의 객체를 이용해 작성 가능	
//	부모class에서 자식 class의 변수, method 사용 불가
//	Media item;
//	
//	public Rental( Media item ) {
//		this.item = item;
//	}
//
//	public Media getMedia() {
//		return item;
//	}
//
//	public void setMedia(Media item) {
//		this.item = item;
//	}
//
//	@Override
//	public String toString() {
//		return item.toString();
//	}
	
	

// 제네릭표현없이 2개의 객체를 이용해서 작성
	
//	Book book;
//	DVD dvd;
//	
//	Rental( Book book ){
//		this.book = book;
//	}
//	
//	Rental( DVD dvd ){
//		this.dvd = dvd;
//	}
//	
//	public Book getBook() {
//		return book;
//	}
//
//	public void setBook(Book book) {
//		this.book = book;
//	}
//
//	public DVD getDvd() {
//		return dvd;
//	}
//
//	public void setDvd(DVD dvd) {
//		this.dvd = dvd;
//	}
//
//	@Override
//	public String toString() {
//		if( instanceof ) {
//			
//		}
//		return "";
//	}

}

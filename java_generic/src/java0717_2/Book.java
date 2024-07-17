package java0717_2;

public class Book extends Media {
	
	private String author; // 지은이
	
	public Book( String id , String title , String author) {
		super( id , title);
		// 부모가 매개변수가 있는 생성자method를 가지고 있어 부모의 생성자 함수에 매개변수를 넘겨줘야한다
		this.author = author;
	}
	
	@Override
	public String toString() {
		return super.toString() + " , 저자 : " + author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
		
}

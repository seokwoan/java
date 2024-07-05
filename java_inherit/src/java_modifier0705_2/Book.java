package java_modifier0705_2;

public class Book {

	public static int count = 0; // class변수는 외부에서 사용하기 위해 생성해서 제어자 public사용
	
	private String title;
	private String author;
	private int page;
	
	
	public Book() {} // 생성자 method
	public Book( String title , String author , int page ) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	
	@Override // java의 모든 class는 object와 부모자식 관계
	public String toString() { // object가 가지고 있는 method
		return this.title + " " + this.author + " " + this.page;
	}
	
	// method는 외부에서 사용하기 위해 작성하므로 public
	public static int getCount() { // 데이터 값 출력
		return count;
	}
	public static void setCount(int count) { // 데이터 값 저장
		Book.count = count;
	}
	public String getTitle() { 
		return title;
	}
	public void setTitle(String title) { 
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
}

package java_modifier0705_2;

public class Book {

	public static int count = 0; // class������ �ܺο��� ����ϱ� ���� �����ؼ� ������ public���
	
	private String title;
	private String author;
	private int page;
	
	
	public Book() {} // ������ method
	public Book( String title , String author , int page ) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	
	@Override // java�� ��� class�� object�� �θ��ڽ� ����
	public String toString() { // object�� ������ �ִ� method
		return this.title + " " + this.author + " " + this.page;
	}
	
	// method�� �ܺο��� ����ϱ� ���� �ۼ��ϹǷ� public
	public static int getCount() { // ������ �� ���
		return count;
	}
	public static void setCount(int count) { // ������ �� ����
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

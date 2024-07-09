package java0709;

public class Movie {

	// instance������ �����ڴ� private 
	private String title; // ��ȭ����
	private String director; // ����
	private int viewAge; // ���� ����
	
	
	// class�� ��ü���� �ν��Ͻ��� �����͸� �����ϴ� ���
	// 1. set method�� ���ؼ� ����������
	// 2. ������ method�� ������ ���� -> ��ü�� ����鼭 �Ű������� ���� ������ ����
	
	
	// 1. get set - instance ������ private�����ڷ� class������ ��밡���ؼ� �ܺο��� ����ϱ� ���� �ʿ��ϴ�
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getViewAge() {
		return viewAge;
	}
	public void setViewAge(int viewAge) {
		this.viewAge = viewAge;
	}
	
	// --get set end
	
		
	
	// 2. ������ method
	
	public Movie(){}
	
	public Movie( String title, String director, int viewAge ) { // �Ű����� �ִ� ������method
		this.title = title;
		this.director = director;
		this.viewAge = viewAge;		
	}

	
	// -- ������ method end
	
	
	// ��ü�� �ν��Ͻ������� �� ����ϱ� ���� method - java�� ��κ� class�� ������ �ִ�.
	// toString
	
	@Override // java�� ��� class�� object�� �ڽ��̰� object�� ������ �ִ� toString�� Override�� ���� ���
	public String toString() {
		return this.title + " , " + this.director + " , " + this.viewAge;
	}
	
	// -- toString end
	
}






















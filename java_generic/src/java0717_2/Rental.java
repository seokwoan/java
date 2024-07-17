package java0717_2;

public class Rental<T extends Media> {
				// å�� DVD ��� rental class���� ����ϱ� ���� ���׸�Ÿ������ ǥ��
	
	private T item;
	private String renter;  // �뿩�� ��� 
	
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
		return "�뿩�� : " + renter + " , " + item.toString();
	}
	
	
	
	
	
	
	
//	���׸�ǥ������ ����� ���� ���������� media 1���� ��ü�� �̿��� �ۼ� ����	
//	�θ�class���� �ڽ� class�� ����, method ��� �Ұ�
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
	
	

// ���׸�ǥ������ 2���� ��ü�� �̿��ؼ� �ۼ�
	
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

package java0709;

public class Movie {

	// instance변수의 제어자는 private 
	private String title; // 영화제목
	private String director; // 감독
	private int viewAge; // 관람 연령
	
	
	// class의 객체내부 인스턴스에 데이터를 저장하는 방법
	// 1. set method를 통해서 데이터저장
	// 2. 생성자 method로 데이터 저장 -> 객체를 만들면서 매개변수를 통해 데이터 저장
	
	
	// 1. get set - instance 변수가 private제어자로 class에서만 사용가능해서 외부에서 사용하기 위해 필요하다
	
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
	
		
	
	// 2. 생성자 method
	
	public Movie(){}
	
	public Movie( String title, String director, int viewAge ) { // 매개변수 있는 생성자method
		this.title = title;
		this.director = director;
		this.viewAge = viewAge;		
	}

	
	// -- 생성자 method end
	
	
	// 객체의 인스턴스변수들 값 출력하기 위한 method - java의 대부분 class가 가지고 있다.
	// toString
	
	@Override // java의 모든 class는 object의 자식이고 object가 가지고 있는 toString을 Override를 통해 출력
	public String toString() {
		return this.title + " , " + this.director + " , " + this.viewAge;
	}
	
	// -- toString end
	
}






















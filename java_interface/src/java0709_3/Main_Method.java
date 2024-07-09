package java0709_3;

public class Main_Method {

	public static void main(String[] args) {
		
		move d = new dog();
		move c = new cat(); // interface를 통해 dog과 cat class객체를 생성할 수 있음
		c.moving();
		d.moving();

	}

}

class dog implements move{
	
	@Override
	public void moving() {
		System.out.println( "성큼 성큼 이동한다" );
	}
}


class cat implements move{ // class에 interface를 연결해 cat class는 move interface의 변수 , method 사용 가능
	 
	@Override
	public void moving() { 
		System.out.println( "사뿐 사뿐 이동한다" );
	}
}



interface move{ // method 반환값, 이름만 정해서 만들어둬서 기본틀을 구축
				// class간의 다중 상속이 불가능 interface는 다중 상속(?)이 가능
	
	static int a = 10; // static제어자를 붙이면 변수 생성 가능 
	public void moving(); // 내용이 없는 추상method만 생성 가능 
	
	
}





/*
	class만큼 많이 사용함
	interface - 추상class의 한 종류
		- 추상method만 가능
		- instance변수 불가
		- static 변수, static method 선언 가능
		- 객체 생성 불가능
		- class에 연결되어 사용된다
		- 다형성 구현을 위해 사용한다
		- 프로그램의 기본틀을 구축할 수 있다
		- interface를 이용하면 상속을 이용하는것 보다 종속성이 낮다 -> class의 독립성이 높다
		- 특정 class에 오류가 나면 오류가 난 class만 확인하면 된다 -> interface오류면 class가 전부 오류
		- 부모의 추가적인 코드가 필요하지 않다.

	서버에서 클라이언트에게 페이지를 제공한다.
	클라이언트의 요청을 받아주는 method 
	클라이언트가 원하는 페이지를 제공하는 method
	
 */













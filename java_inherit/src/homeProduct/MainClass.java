package homeProduct;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv( "삼성" , 800000 ); // 객체 생성시 false
		tv.power();
		tv.power(); // power method 실행 시 false -> true
		tv.power(); // power method 추가 실행시 true -> false
//		tv.brand = "삼성";
		System.out.println( tv.brand + " " + tv.price );

		Aircon aircon = new Aircon();
		aircon.brand = "LG휘센";
		System.out.println( aircon.brand );
		aircon.power();
		aircon.power();   
		// Tv와 Aircon의 생성자함수, power함수가 동일
		// 동일한 method를 따로 사용하지 않고 House class에 만들어주고
		// extends로 class에 상속 시켜줌
		// public class 상속받을class extends 상속해줄class 
		
	}

}


// class 상속 House(부모) -> Tv, Aircon, Computer ( 자식 ) 으로 상속
// 상속을 하면 자식class에서 부모class의 method, 변수 사용가능 
// 공통되는 변수, method가 존재하면 상속
// 공통되는 부분이 없다면 상속을 쓸 필요가 없음
// Tv extends House -? Tv class가 House class에 있는 instance 변수, method사용 가능
// 상속을 하는 가장 큰 이유 - 다형성
// 다형성 - 하나의 타입으로 여러 타입을 제어, 사용 하는것

// 부모class의 intance변수, instance method, class변수, class Method 사용가능
// 단, 부모class의 모든걸 사용하지는 못한다. 일부 제어걸려있는 변수나 method는 사용불가

// 생성자 method를 통해 instance 변수들의 초기화는 
// 자식class가 가지고 있는 변수는 자식class 생성자 method에서 초기화
// 부모class가 가지고 있는 변수는 부모class 생성자 method에서 초기화
//















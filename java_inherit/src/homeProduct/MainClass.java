package homeProduct;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv( "삼성" , 800000 ); // 객체 생성시 false
		tv.power();
		tv.power(); // power method 실행 시 false -> true
		tv.power(); // power method 추가 실행시 true -> false
//		tv.brand = "삼성";
		System.out.println( tv.brand + " " + tv.price );
		tv.channelUp();
//		tv.channel++; //channel변수가 private라 다른 class에서 사용 불가능 

		Aircon aircon = new Aircon();
		aircon.brand = "LG휘센";
		System.out.println( aircon.brand );
		aircon.power();
		aircon.power();   
		// Tv와 Aircon의 생성자함수, power함수가 동일
		// 동일한 method를 따로 사용하지 않고 House class에 만들어주고
		// extends로 class에 상속 시켜줌
		// public class 상속받을class extends 상속해줄class
		aircon.windControl();
		
		
		System.out.println( "다형성" );
		House tv2 = new Tv( "LG" , 1500000 );
		tv2.power();
		House item = new Tv( "삼성" , 1750000 );
		item.power(); // overriding된 power()
		item = new Aircon( "휘센" , 1030000 );
		// 부모 타입으로 만든 객체는 모든 자식타입의 객체를 만들 수 있음
		// 부모타입 객체명 = new 자식타입(); 
//		item.windCotrol();
		// item의 데이터타입이 House이므로 House의 method만 실행가능
		// 자식class의 method 사용 불가
		// 부모class의 method는 자식class에서 사용가능
		// 자식class의 method는 부모class에서 사용불가
		// 부모 -> 자식으로 method를 넘겨주는것이지 자식->부모로 넘어가지는 않음
		
		// 자식class에 extends를 넣어서 부모class 사용이 가능하게 만들준것
		// 부모class가 자식class의 값을 사용하게 만들어주지 않음
		// 부모타입의 객체는 모든 자식타입을 갖을수있지만 
		// 부모타입의 객체로 만들어지면 자식class에만 있는 method를 사용하지 못하고
		// 부모class의 method만 사용 가능
		
		// 자식class의 주소에는 부모class의 값과 자식class의 값이 들어있다. 
		// 타입이 부모타입이면 부모class의 값만 사용가능 -> 타입이 부모타입이라 부모class의 값을 사용
		// ex) int a = 3.14; -> 타입이 int여서 3 , 0.14중 int인 3만 저장 
		
		
		// tv객체 100개 , 에어컨객체 30개 -> 배열을 만들어줌
		// 배열의 타입을 부모타입으로 만들고 그 안에 자식객체들의 배열을 넣어줌?
		// House[] arr = {new Tv() , new Aircon(), new Computer() };
		// 하나의 타입으로 여거 타입을 사용 / 하나의 class로 여러 class 사용?
		
		
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



// class들의 관계 - 상속 관계
// 상속 관계에 놓여있는 class들은 부모 class와 자식 class로 나뉜다.
// 부모class의 필드(변수), method를 하위class(자식class)에서 사용 가능
// 1. 상속은 재사용성을 위해 사용한다. 여러 class간의 중복코드를 하나의 class로 통합시켜 사용
// 2. 상위class(부모class)의 필드(변수), method를 모두 하위(자식)class에서 사용하지는 못한다.
//	  - 제어자에 따라, 패키지에 따라 제한적이다.
// 3. 하위(자식)class에서 부모를 지징하는 예약어는 super이다.
// 


/*
  자바의 제어자
	1. static 	- class의 정적 변수, 정적method
			  	- class에서 공동으로 사용할수 있는 변수, method
			  	- 객체에 속하지 않고 class에 속한다.
			  	- class명.static변수명 , class명.static method()
			  	
 	2. abstract - 추상class, 추상method
 				- 미완성의 의미를 가진다
 				- 추상class는 객체 생성 불가
 				
	3. final	- 변경되지 않는 의미로 사용한다
				- 변수 앞에 final을 붙이면 변수값 변경 불가
				- method앞에 final을 붙이면 해당 method는 Overriding불가
				- class앞에 final을 붙이면 상속 불가 -> 부모class로 지정 불가 
				
	4. 접근제어자(접근을 제한하는 제어자)
		public		- 어디서나 누구든지 사용가능한 제어자
 		default		- 같은 패키지에서만 접근 가능 ( 제어자를 적지 않으면 default 상태 )
 		protected 	- 같은 패키지에서만 접근 가능 ( 단, 상속관계일 경우 패키지가 달라도 접근가능)
 		// public이면 다른 프로그램에서 접근이 가능해 변경가능 -> 보안 위험
 		private		- 어디서나 누구든지 사용 못한다.
 					- class내부에서만 사용가능
 		
 */




















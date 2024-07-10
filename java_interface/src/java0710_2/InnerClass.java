package java0710_2;

public class InnerClass {

	public static void main(String[] args) {
		
		Out out = new Out();
		
		out.num = 100;
		
//		out.obj.age = 34;
		
//		out.obj.setName( "이순신" );
		
		
		// class의 밖에서 내부class사용 -> 내부class에 private제어자를 사용해 내부에서만 사용하게 만듬
//		Out.인스턴스내부클래스 in = out.new 인스턴스내부클래스();
//		// 외부class.내부class 객체명 = 외부class객체.new 내부class();
//		// 외부class의 객체가 있어야 내부class의 객체를 만들수 있다.
//		in.age = 20;
//		in.setName( "김유신" );
		
	}

}


// static으로 선언 및 정의한 변수와 method는 instance method에서 사용가능
// instance 변수, method는 static method에서 사용 불가 -> static이 먼저 생성되어 instance 사용불가

// static 붙은건 프로그램 시작할때 생성
// 나머지는 프로그램 실행중에 생성 


class Out{
	static int count; // class변수 
	int num; // instance 변수
	private String job; // instance 변수
	인스턴스내부클래스 obj = new 인스턴스내부클래스(); // 내부class의 객체를 외부class에 만들어 사용

	// instance 내부 class -> instance변수와 같은 위치에 만듬 
//	class 인스턴스내부클래스{ // class안의 class
//		public int age; // 내부class의 변수는 외부class를 제외한 다른곳에서 사용 불가
//		private String name;
//		void setName( String name ) {
//			this.name = name;
//		}
//	}
	// class내부에서만 사용가능 다른곳에서는 사용 불가 private와 비슷한 느낌
	// 포함관계에 있는 class중 포함관계에서만 사용되는 class의 경우 포함관계로 두는것이 아닌 
	// 내부class로 만드는것이 좋다
	
	private class 인스턴스내부클래스{ // private를 붙여주면 내부에서만 사용
		// Out(외부class)의 객체를 만들때 생성 -> static변수, method 생성 불가 
		public int age; 
		
		private String name;
		
		void setName( String name ) {
			this.name = name;
		}
		
//		static void create() {
//			count = 10;
//		}
		// 내부class는 instance class라서 static을 쓸수가 없다 instance보다 static이
		// 먼저 생성되어야 하는데 instance가 생성되지 않은 상태에서instance하위의 static 생성이 불가
		
	}
	
	static class 정적클래스{ 
		// static이 붙어있는 정적클래스이기 때문에 static변수, method 생성가능
		// Out(외부class) 객체를 생성 전에 메모리에 적재됨
		// Out(외부class) 객체에 속하지 않는다
		static int birth;
		
		static void update() {
			
		}
	}
	
	void buyComputer() {
		
		// byComputer에서만 사용가능
		class 지역클래스{	// method안에 존재하는 class라 지역class
						// method가 실행될때 메모리에 생김
						// method가 종료되면 method와 같이 메모리에서 사라짐
						// 지역클래스는 제어자를 사용하지 못함
			int weight;	// method가 실행되어야만 생겨 static 사용 불가
			void del() {
				
			}
		}
		
		지역클래스 ob = new 지역클래스();
		// 지역클래스의 객체는 지역클래스가 있는 method에서만 생성 가능
	}
	
//	내부익명class 만드는법
//	1. 내부 interface를 이용
	interface Car{ // 내부 interface
		void make();
	}
	
	void makeCar() {

		Car c = new Car() { 
			@Override
			public void make() {
				System.out.println( "익명class를 통해 만들기" );
			}
		};
		// interface의 객체 생성이 가능하게 해주는게 익명class
		// interface를 통해 만들어진 객체의 class 이름이 없음
		c.make();
	}
	
}






/*
	내부class - class내부에서만 사용 가능한 class
		1. instance 내부class
		2. 정적 내부 class
		3. 지역 내부 class
		4. 익명 내부 class

 */






































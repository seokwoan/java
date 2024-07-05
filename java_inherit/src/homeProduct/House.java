package homeProduct;

public abstract class House {
	// abstract class class명 -> class를 추상class로 만들어야 추상method를 가질 수 있음
	// 추상 method를 가지고 있는 class는 반드시 추상class가 되어야한다. 
	// 추상class는 객체 생성 불가
	// new연산자를 통해 객체 생성에 필요한 크기를 계산해 운영체제에 공간을 요청하는데
	// 필요한 크기를 정확히 요청해야 한다. 
	// 추상method는 자식method의 실행 내용에 따라 변해 크기 계산이 불가능해 요청을 못함 
	// 부모class가 추상class라면 반드시 자식class는 추상method를 정의해야 한다.
	// 부모의 추상method를 재정의 하지 않을것이라면 자식class가 추상class가 되어야한다.
	
	protected boolean onOff;
	protected String brand; // 제품브랜드
	protected int price; // 제품 구매가격
	
	
	protected House(){
		this.onOff = false;
	}
	
	protected House( String brand , int price ){
		this.brand = brand; // 부모가 가지고 있는 변수는 부모가 초기화
		this.price = price;
	}


	protected abstract void power(); 
	// abstract 추상method -> 내용이 없는 method 누가 실행하냐에 따라 달라짐
	// 추상method를 가진 class는 반드시 추상class가 되어야 한다
	// 추상method는 메모리 크기를 갖지않음 
	// overriding -> 부모class와 자식class에 이름이 같은 method가 있으면 자식class가 실행
	// 다형성을 위해 부모class에서 method를 작성
	// method의 실행에서 부모의 method를 실행하고 자식에 똑같은 method가 있으면 다시 실행
	// annotation으로 주석을 달아주면 override를 인지하고 자식method를 바로 실행
	// 자식class에서 전부 overriding을 한다면 부모class의 method는 내용이 없어도 된다

	

}




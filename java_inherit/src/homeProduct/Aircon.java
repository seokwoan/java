package homeProduct;

public class Aircon extends House {

	static final String[] windText = { "미" , "약" , "강" };
	// final 제어자를 사용하면 값이 변경되지 않음  자바스크립트의 const느낌
	
	private int wind = 0; // 배열을 사용하면 배열의 index를 표현할 변수를 만들어주면 좋다.
	private int temperature = 20;
	
	
	public int getWind() {
		return wind;
	}

	public void setWind(int wind) {
		this.wind = wind;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	Aircon(){}
	
	Aircon( String brand , int price){
		super( brand , price);
	}
	
	void windControl() { 
		// method를 만들때 사용하는 데이터의 값이 바뀌어도 영향이 최대한 없게 만들어야한다.
		// 데이터의 값, 양이 변할때 코드가 바뀌면 안된다. 
		this.wind++; // 배열의 index를 이용
		if( this.wind == windText.length ) this.wind = 0; // 배열의 index가 배열의 길이가 같아지면 초기화
		System.out.printf( "현재 바람세기 : %s" , windText[wind] ); // windText는 class변수라 this를 안붙이는게 좋다.
		
	}
	
	
	void tempUp() {
		this.temperature++;
	}
	
	void tempDown() {
		this.temperature--;
	}
	
	@Override
	protected void power() {  
		super.onOff = !super.onOff;
		System.out.printf( "에어컨전원 : %s\n", super.onOff );
	}
	
	
}

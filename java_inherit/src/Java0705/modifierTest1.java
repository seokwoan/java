package Java0705;

import homeProduct.Tv; // package가 다른 class는 import를 해줘야함 

public class modifierTest1 {

//	Tv tv = new Tv();
	
	Tv tv2 = new Tv( "삼성" , 1220 );
	
	// Tv() 생성자 method에 제어자를 입력하지 않아 default가 적용되어 다른 패키지에서 사용 불가
	// Tv( String , int ) 생성자 method는 public이 있어 사용 가능
}

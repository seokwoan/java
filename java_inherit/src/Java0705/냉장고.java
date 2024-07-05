package Java0705;

import homeProduct.House;

public class 냉장고 extends House{ 
	// 상속관계일때 default는 접근 불가
	// protected는 접근 가능
	// 다른 패키지에 있는 class에 상속하려면 protected여야함
	// 자식class의 객체를 만들면 부모class의 인스턴스가 생성되어
	// 부모class의 접근자가 default면 접근 불가해 자식객체 생성 불가

	
	@Override
	protected void power() { // 부모class
		System.out.println( "냉장고" );
	}
}

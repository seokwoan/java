package java0710;

abstract class animal{ // 부모class -> 추상method가 있어 추상class로 만듬 
	
	// 자식class에서는 override로 변경해 사용해 굳이 내용이있는 method로 메모리공간을 낭비할 필요가 없다	
//	public void sound() {
//		System.out.println( "동물소리" );  
//	}
	
	// -> 추상method로 변경
	public abstract void sound(); 
	// public abstract void fly(); -> 부모에 추상class가 있으면
	// 자식class는 부모의 추상method를 재정의해야한다. 재정의하지 않으려면 추상class가 되어야한다.
	// 자식class는 부모class를 내용전체를 상속받는다. 자식class에서 선택적 사용 불가
	// fly를 넣으면 dog, cat에 적용해야하는데 dog, cat은 날지 못함
	
}


class dog extends animal{ // 자식class
	
	@Override
	public void sound() {
		System.out.println( "멍멍" );
	}
}


class cat extends animal{ // 자식class
	
	@Override
	public void sound() {
		System.out.println( "냐옹" );
	}
	
}


public class InterfaceTest {

	public static void main(String[] args) {
		
		animal d = new dog();
		animal c = new cat();
		
		d.sound();
		c.sound();
		
	}

}


/*
	동물들의 소리를 출력한다
	개, 고양이, 닭, 비둘기, 소 등등
	각 동물은 서로 다른 개체이기 때문에 각 각의 클래스로 구현
	하지만 개, 고양이, 닭, 비둘기, 소들은 동물로 통합이 가능하므로 
	animal이라는 부모 class를 두겠다


*/
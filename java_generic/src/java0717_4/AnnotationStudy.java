package java0717_4;

import java.util.ArrayList;
import java.util.Date;

@FunctionalInterface
interface moveable{ 
	public void move();
	// method를 하나만 갖는 interface를 함수형 interface라고함 
}


class A<T>{
	
	T item;
	
	@SafeVarargs
	final void get( T... add ) { // 가변인자 -> 배열처럼 값이 바뀔수 있는 인자
		// T... -> T 배열의 크기가 정해지지 않아 컴파일러경고가 나옴 
	}
}


public class AnnotationStudy {
	
	@Deprecated
	static void aaa() {
		
	}

	public static void main(String[] args) {

		aaa();
		
		
		Date today = new Date();
		
		@SuppressWarnings("all")
		ArrayList list = new ArrayList();
		
//		@suppressWarnings("unused")
		today.getYear();
		

	}

}


/*
	개발자를 위한 메모 - 주석
	
	annotation
		- 주석과 같은 의미를 가짐
		- 컴퓨터에게 알려준다
		- annotation을 하지 않아도 동작함 
		- annotation을 해줌으로 컴퓨터가 해당 annotation이 없을때 알아차리기 까지의 시간을 단축해준다
		  
		- 특정 코드들을 컴퓨터에게 정보제공
		- 표준 , 메타 , 사용자 annotation이 있다
		
		- 표준 annotation
		
			@Override
				- 컴파일러에게 method를 Overriding 하는것이라고 알려줌
			
			@Deprecated
				- 앞으로 사용하지 않을 대상이라고 알려줌
			
			
			@SuppressWarnings("text")
				- 컴파일러 경고를 출력하지 않게 하도록 설정 ( 노란줄 )
				- ("all") 모든 경고 억제
				- ("deprecation") 권장되지 않는 기능 경고 억제
				- ("null") null과 관련된 경고 억제
				- ("unchecked") 미확인 오퍼레이션 경고 억제
				- ("unused") 사용하지않는 코드 또는 불필요한 코드에 대한 경고 억제
			
			@FunctionalInterface
				- 함수형 interface라는것을 알려줌
				
			@SafeVaragrs
				- 제네릭과 같은 가변인자의 매개변수를 사용할때 경고 나타내지 않기
				
		- 메타 annotation
		
			@Target
				- annotation을 정의할때 적용할 대상 지정
				  아래의 annotation과 같이 사용
			
			@Document
				- javadoc으로 작성된 문서에 포함
			
			@Inherited
				- 하위class에서 상속되도록 할때 사용
			
			@Retention
				- annotation 기간 설정
			
			@Repeatabls
				- annotation 반복 설정

*/



















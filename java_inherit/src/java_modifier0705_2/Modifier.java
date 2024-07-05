package java_modifier0705_2;

public class Modifier {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setTitle( "JAVA 속성" );
		book.setAuthor( "유재학" );
		book.setPage( 786 );
		System.out.println( book.getTitle() );
		
		Book book2 = new Book( "JAVA,웹, 성공적" , "이병헌" , 564 );
		System.out.println( book2 ); 
		// object의 toString을 overriding해서 재정의 했다면 출력시 method호출을 안해도 작동
		
	}

}



/*
클래스
	- 변수, method 
	- instance , class
	- 생성자method
	- instance변수, class변수
	- overloading
	- overriding
	- 상속
	- 제어자
	- 다형성
	- 추상화
	- 인터페이스
	- 내부class( 익명class, 정적class)
	- 열거형

컬렉션	
	- 자료구조와 알고리즘
	- collection, List, Map, Set
	- ArrayList, Vector, LinkedList
	- Queue, stack, HashSet, TreeSet
	- HashMap, treeMap 등등
		
제네릭
애너테이션
스트림
쓰레드 		

-- 자바 기본 문법 끝 -- 

-> JSP - 내장객체, M(model-데이터)V(view)C(control)패턴
-> 스프링프레임워크 - 스프링부트
-> MVC 패턴 -> 간단한 쇼핑몰사이트
-> 프로젝트(웹) - team



*/

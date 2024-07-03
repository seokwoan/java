package java0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {
		
		Member member1 = new Member( "이순신" , 31 , "군인" );
		Member member2 = new Member( "문익점" , 29 , "섬유공장사장" );
		Member member3 = new Member( "장영실" , 45 , "기계공학자" );
		
//		// 태어난 년도 
//		Date today = new Date();
//		// Date class의 변수명을 숨겨둠 캡슐화 -> 변수명이 필요 없거나 보안을 위해
//		System.out.println( today.getYear() + 1900 ); // 컴퓨터의 기준이 1900년이기 때문 
//		System.out.println( today.getDay() + 1 );
//		System.out.println( today.getDate() ); 
//		System.out.println( today.getMonth() + 1 ); 
//		// getYear에 선이 그어진 이유는 Date를 대체할 수 있는 class가 2개 더있어 권장하지 않아서이다.
		
//		Calendar cal = Calendar.getInstance();
		// Calendar는 추상클래스 - 추상클래스는 객체를 만들지 못함 
		// 추상클래스는 c마크에 11시방향에 A가 있음
		// 자식class에 객체(instance)를 만들어주는 method가 있다.
		
//		int year = cal.get( Calendar.YEAR );
//		int month = cal.get( Calendar.MONTH ) + 1 ; // 1월달이 0이라 +1을 해줌
//		int date = cal.get( Calendar.DAY_OF_MONTH );
//		int day = cal.get( Calendar.DAY_OF_WEEK ); 
//		// Calendar의 클래스 변수를 통해 값을 가져옴
//		System.out.println( year );
//		System.out.println( month );
//		System.out.println( date );
//		System.out.println( day );
		
		
		LocalDate today = LocalDate.now();
		System.out.println( today.getYear() );
		System.out.println( today.getMonthValue() );
		System.out.println( today.getDayOfMonth() );
		System.out.println( today.getDayOfWeek() ); // 요일이 나옴
		System.out.println( today.getDayOfWeek().getValue() ); // 요일이 숫자로 나옴 월요일이 1
		
		int nowYear = today.getYear();
		int birthYear1 = nowYear - member1.age;
		System.out.printf( "%s 태어난년도 : %d\n" , member1.name , birthYear1 );
		
		// class에 instance method를 만들어 사용
		member2.birthYear();
		member3.birthYear();
		
		
		// 나이가 20대인가? 30대인가? 40대인가? 50대인가?
		DataIdenti dataIdenti = new DataIdenti(); // DataIdenti는 분류를 위한 class라 객체를 한번만 생성해서 사용
		dataIdenti.ageGroup( member1.name, member1.age , member1.job );
		dataIdenti.ageGroup( member2.name, member2.age , member2.job );
		
		dataIdenti.jobGroup( member1.name , member1.job );
		dataIdenti.jobGroup( member2.name , member2.job );
		dataIdenti.jobGroup( member3.name , member3.job );
		
		// 직업분류 - 국가직무 분류에 따라 표기
		// 출력내용 - 이순신 : 05.국방 - 이름과 직업
		// 

	}

}


class Member {
	String name; //이름
	int age; // 나이
	String job; // 직업

	Member(){} // 매개변수가 없는 생성자 method
	
	Member( String name, int age, String job){ // 매개변수가 있는 생성자 method
		this.name = name; // this는 해당 클래스의 객체 -> 생성자 method가 실행될때 생성되는 객체
		this.age = age;
		this.job = job;
	}
	
	// 태어난 년도 언제인가 출력하는 method
	void birthYear(){  // instance method라 객체를 통해 사용해야함
		// static이 붙어 있어야 class이름을 통해 사용가능
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
		int birthYear1 = nowYear - this.age; 
		// instance method를 사용할 때는 객체를 이용해 사용하므로 매개변수가 아닌 this를 통해 표현 
		System.out.printf( "%s 태어난년도 : %d\n" , this.name , birthYear1 );
	}
}

// 특정 class에서만 사용하는 method인가를 정해야함
// this를 사용하면 class의 객체만 사용 가능함

// 컨트롤용 class, 실제기능의 동작 class(method), 데이터 class(변수)
//  Controller ,        Service 		  ,	   DTO(VO)
 

class DataIdenti{ // 연령대, 직업 분류 등등 데이터 분류를 위한 class
	
	void ageGroup( String name , int age , String job ) { // return타입이 void이므로 직접 출력 
		
		String group = null;
		group = (age/10) + "0대"; 
		System.out.println( name + " : " + group + " , " + job );
		
	}

	void jobGroup( String name , String job ) {
		String group = null;
		switch( job ) { // if(job.equals("군인")) -> 자바에서 문자열 비교는 equals! 
			case "군인" : 
				group = "05.국방";
				break;
			case "기계공학자" : 
				group = "15.기계"; 
				break;
			case "섬유공장사장" : 
				group = "18.섬유의복";
				break;
		}
		System.out.printf( "%s : %s\n", name , group);
			
	}
	// 국가 직무 분류
	// 군인 - 05.국방 , 기계공학자 - 15.기계 , 섬유공장사장 - 18.섬유의복

}

// method나 function을 사용하는 이유
// 배열, 계산, 단순 출력 - 반복문
// 반복적인 코드를 작성할때 반복문을 method 혹은 function으로 사용하면
// 코드분석이 편해진다. 긴 반복문이 method 한줄로 압축
// method를 사용하면 코드의 재사용과 유지보수, 가독성이 좋아진다.
// 코드를 작성할때 사용할 변수, 배열의 값을 저장해두는게 좋다.
// method를 사용하면 구조화된 프로그래밍이 가능하다.
// 코드를 모듈화해서 작성한다. -> method가 하나의 모듈 method를 다른 프로젝트에서 사용 가능



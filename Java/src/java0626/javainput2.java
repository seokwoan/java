package java0626;

import java.util.Scanner;

public class javainput2 {

	public static void main(String[] args) {
		
		/* 코드 작성하기전 해야할일 - 문제파악, 요구사항도출
		 문자열 - " " 큰따옴표로 표혀하여 작성한다. 
		 문자열은 String 클래스타입을 사용해야 한다.
		 
		 문제2. 
		 직원 이름, 소속부서명, 월 급여액을 키보드를 통해 입력받는다.
		 세금은 8%를 낸다. 실 수령액은 얼마인지를 출력
		 이름, 부서, 실 수령액을 출력하세요.
		 두명의 직원에 대해 출력하세요.
		*/

//		Scanner word = new Scanner(System.in);
//		
//		String name1, name2, part1, part2;
//		int money1, money2;
//		float tax = 0.08f;
//		System.out.print("이름을 입력하세요");
//		name1 = word.next();
//		System.out.print("소속 부서를 입력하세요");
//		part1 = word.next();
//		System.out.print("월 급여액을 입력하세요");
//		money1 = word.nextInt();
//		System.out.print("이름을 입력하세요");
//		name2 = word.next();
//		System.out.print("소속 부서를 입력하세요");
//		part2 = word.next();
//		System.out.print("월 급여액을 입력하세요");
//		money2 = word.nextInt();
//		
//		int realMoney1 ,realMoney2;
//		// 형변환 
//		// float f = 3f; 3은 int타입인데 float에 들어가면 float타입으로 타입이 변함 
//		// 큰타입 = 작은타입; 일 경우에 자동으로 큰타입으로 변한
//		// 작은타입 = 큰타입; 일 경우 자동으로 변경안됨
//		// 강제로 변경해줄수 있음 작은타입 = (바꿀타입) (큰타입); 변경하고자 하는 타입을 앞에 넣어서 강제로 타입을 변경시킴
//		// 실수 - 정수는 포함 실수>정수의 상관관계를 갖기 때문에 변경이 가능 문자열과는 불가능
//		realMoney1 = (Int) (money1 - (money1*tax)) ;
//		realMoney2 = money2 - (money2 *tax) ;
//		
//		System.out.printf( "첫번째 직원\n 이름 : %s 소속부서 : %s 실 수령액 : %.0f원 \n두번째 직원\n "
//				+ "이름 : %s 소속부서 : %s 실 수령액 : %.0f원 " , name1, part1, realMoney1, name2, part2, realMoney2  );
		
		Scanner sc = new Scanner(System.in);
		
		String name="0", dept="";
		int money = 0;
		int salary = 0;
		float tax = 0.08f;
		// 
		
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("부서 : ");
		dept = sc.nextLine();
		
		System.out.print("월 급여 : ");
		money = sc.nextInt();
		// Integer.parseInt(sc.nextLine()); nextLine으로 값을 입력받고 입력받은 값을 Integer.parseInt로 정수로 변환함 
		
		
		salary = (int)(money - (money*tax)) ;
		
		System.out.println("이름 : "+name +" 부서 : "+dept+" 수령액 : "+salary);
		
		sc.nextLine(); // 밑의 이름 입력을 하기 위한 nextLine 77번줄 주석
	
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		// 실행하면 이름을 건너뛰고 부서를 입력하게됨
		// 키보드로 입력된 키가 입력버퍼에 저장되고 ram으로 전달
		// 월 급여액의 입력값중 엔터는 숫자로 저장이 불가능해 ram의 변수로 저장되지 않고 버퍼에 남아있음
		// 버퍼에 남아있는 엔터키(\n)는 다음에 작동할 .nextLine();에 저장되고 
		// 엔터키가 입력되면 Scanner의 작동이 멈추게됨
		// scanner의 작동이 멈춰 공백으로 다음 입력값으로 넘어가게되므
		// 숫자 입력 다음 문자열을 입력 받을때 발생하는 문제
		// 문제를 해결하기 위해서 엔터키의 값을 가져갈 nextLine();을 사용해 버퍼를 비워줌
		// int( 정수 혹은 실수 )다음에 나오는 next, nextLine에 발생하는 문제이므로
		// 버퍼를 비워줄 nextLine이 필요하다. 72줄 nextLine
		// next는 엔터값을 안가져오고 남겨두므로 next 다음에도 nextLine이 필요하다.
		
		System.out.print("부서 : ");
		dept = sc.nextLine();
		
		System.out.print("월 급여 : ");
		money = sc.nextInt();
		
		salary = (int)(money - (money*tax)) ;
		
		System.out.println("이름 : "+name +" 부서 : "+dept+" 수령액 : "+salary);
		
		/*
		next
		  
		  
		  
		*/
		
	}

}
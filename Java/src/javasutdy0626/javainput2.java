package javasutdy0626;

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

		Scanner word = new Scanner(System.in);
		
		String name1, name2, part1, part2;
		float money1, money2;
		
		System.out.print("이름을 입력하세요");
		name1 = word.next();
		System.out.print("소속 부서를 입력하세요");
		part1 = word.next();
		System.out.print("월 급여액을 입력하세요");
		money1 = word.nextFloat();
		System.out.print("이름을 입력하세요");
		name2 = word.next();
		System.out.print("소속 부서를 입력하세요");
		part2 = word.next();
		System.out.print("월 급여액을 입력하세요");
		money2 = word.nextFloat();
		
		double realMoney1 ,realMoney2;
		realMoney1 = money1 * 0.92 ;
		realMoney2 = money2 - money2 *0.08 ;
		
		System.out.printf( "첫번째 직원\n 이름 : %s 소속부서 : %s 실 수령액 : %.0f원 \n두번째 직원\n "
				+ "이름 : %s 소속부서 : %s 실 수령액 : %.0f원 " , name1, part1, realMoney1, name2, part2, realMoney2  );
		
		
		
	}

}














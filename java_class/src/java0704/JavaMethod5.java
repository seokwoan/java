package java0704;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {
		
		// 두 개의 정수를 반환하기
		// return
		MethodUtil util = new MethodUtil();
		int[] num = util.twoNum(); // return의 데이터 타입이 배열이면 받을때도 배열로 받아야 한다.
		
		System.out.println( Arrays.toString(num));
		
		// 사각형의 너비와 높이를 설정하고 넓이를 출력하세요
		// 넓이는 main method에서 출력되게 하세요
		
//		Box box = new Box();
//		box.main();
//		int area = util.rectArea();
//		System.out.println( "넓이 : " + area );
		
		// 로그인 가능한 아이디는 skyblue 비밀번호는 1234sea
		// login method를 실행하여 로그인 여부를 출력하세요
		// 아이디 비밀번호가 일치하면 로그인 성공 출력
		// 하나라도 불일치면 로그인 실패 출력
		// 로그인 여부 출력은 main에서 
		
		
//		boolean isFail = util.login();
//		if( isFail ) {
//			System.out.println( "로그인에 성공하셨습니다.");
//		}
//		else {
//			System.out.println( "로그인에 실패하셨습니다.");
//		}
		
		// 정수 3개를 키보드를 통해 입력 받으세요.
		// 입력한 세 정수의 합이 100을 넘으면 100 - 합의 결과를 출력하고 
		// 100을 넘지 않으면 세 정수의 합을 출력하세요
		// main method에서 출력
		
		int calc = util.numSum();
		System.out.printf( "세 정수의 합  : %d ", calc );
	}

}


class MethodUtil{

	int[] twoNum() { // return으로 2개 이상의 값을 보내려면 배열로 보내야한다. 
		int num1 = 20, num2 = 50;
//		int[] temp = new int[] { num1 , num2 }; // 배열명을 정해서 새로운 배열을 만들어도 되고
		return new int[] { num1 , num2 };		// 새로운 배열을 return에 만들어도 된다
//		return num2; // return num1; 에서 method가 종료됨 동작을 안하는 코드 2번의 return 불가
		// return으로 반환 시킬수 있는 값은 단일 값이다.
	}
		
	int rectArea() {
		int width = 45, height = 50;
		int area = width * height;
		return area;
		
	}
	
	
	boolean login(){
		Scanner sc = new Scanner(System.in);
		System.out.print( "아이디 : " );
		String id = sc.nextLine();
		System.out.print( "비밀번호 : ");
		String password = sc.nextLine();
		
		
//		boolean success = false;
		boolean logCheck = id.equals("skyblue") && password.equals("1234sea");
//		boolean pwCheck = password.equals("1234sea");
//		if( logCheck ) { 
//			success = true;
//		}
		return logCheck;
		
//		boolean isSuccess = true;
//		if( id.equals("skyblue") ) {
//			if( password.equals("1234sea") )
//				return isSuccess; // if문안의 return은 무조건 실행이 아니라 if밖의 return이 존재 가능
//		}
//		return isSuccess = false; // if문밖의 return 
		
	}
	
	int numSum() {
		Scanner num = new Scanner(System.in);
		System.out.print( "첫번째 정수를 입력하세요 : " );
		int num1 = num.nextInt();
		System.out.print( "두번째 정수를 입력하세요 : " );
		num1 += num.nextInt();
		System.out.print( "세번째 정수를 입력하세요 : " );
		num1 += num.nextInt();
		if( num1 > 100 ) {
			num1 = 100 - num1;
		}
		return num1;
	}
	
}

class Box{
	
	void main() {
		Scanner cm = new Scanner(System.in); 
		// method에서 만든 변수는 지역 변수라 method가 종료되면 사라짐
		// new 연산자를 통해 만들어진 참조변수는 사라지지 않음
		int row;
		int col;
		int cross;
		System.out.print( "가로의 길이를 입력하세요 : " );
//		row = cm.nextInt();
		row = Integer.parseInt(cm.nextLine() );
		System.out.print( "세로의 길이를 입력하세요 : " );
//		col = cm.nextInt();
		col = Integer.parseInt( cm.nextLine() );
		cross = row * col;
		
		System.out.printf( "가로 %d 세로 %d 넓이 %d\n", row, col, cross );
		
		
	}
	
}





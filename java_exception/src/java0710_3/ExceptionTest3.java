package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		try {
			
			//~~
			if( true ) {
				throw new NullPointerException( "aa" ); // 강제로 오류를 내는 방법
				// throw new 오류class -> 특정상황 or method에서 강제로 종료하기 위해 사용
			}
			//~~
			
		}
		catch( Exception e ){
			System.out.println( "강제 오류 발생" );
		}

	}

}



class Member{
	String name;
	int age;
	int birth;
	
	Member( String name , int birth ){
		this.name = name;
		this.birth = birth;
	}
	
	void setAge() {
		this.age = 2024 - birth;
	}
}


























package java0711;


public class Member implements Comparable<Member>{

	private String name;
	private int age;
	private String birth;
	
	
	public Member( String name , int age , String birth ) {
		this.name = name;
		this.age = age;
		this.birth = birth;
	}
	
	@Override 
	public String toString() { // 객체.toString을 통해 객체의 데이터값 출력
		return name + " , " + age + " , " + birth;
	}
	
	
	@Override
	public boolean equals( Object o ) { // 매개변수로 넣어줄수 있는건 ArrayList에 넣어준 객체의 class타입
		// 어떤 데이터로 비교할 것인가? 
		Member tmp = (Member)o; // 보무자식 관계일때 class타입도 강제형변환이 가능함 부모->자식으로 변환
		boolean isSame = this.age == tmp.age;
		if( isSame ) {
			isSame = this.name.equals(tmp.name);
		}
		if( isSame) {
			isSame = this.birth.equals(tmp.birth);
		}
		return isSame;
		// equals의 내용을 어떻게 만드냐에 따라 indexOf, contains의 동작 방식이 달라짐
		
		// return this.birth.equals(tmp.birth); // 생년월일로 비교 
		// return this.age == tmp.age ; // 나이로 비교  
		// return this.name.equals(tmp.name); // 이름으로 비교해서 이름이 있으면 찾아옴
		
				
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public int compareTo(Member o) {
		// 데이터값중 기준이될 데이터를 선택해야한다
		// return this.name.compareTo( o.name ); // -> String에는 compareTo가 이미 만들어져 있음
		
		// return this.age - o.age; // -> 나이로 정렬
		// return (this.age - o.age)*-1; or o.age-this.name; 
		
		
		// 나이기준으로 오름차순 -> 나이가 같으면 이름기준 내림차순
		int sort = 0;
		sort = this.age - o.age;
		if( sort == 0 ) {
			sort = ( this.name.compareTo( o.name ) * -1 ) ;
		}
		return sort;

	}
	
}

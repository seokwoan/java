package java0711;

public class Member {

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
	
	
//	@Override
//	public boolean equals( Object o ) { // 매개변수로 넣어줄수 있는건 ArrayList에 넣어준 객체의 class타입
//		
//		Member tmp = (Member)o; // 보무자식 관계일때 class타입도 강제형변환이 가능함 부모->자식으로 변환 
//		this.age == tmp.getAge();
//	}
	
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
	
}

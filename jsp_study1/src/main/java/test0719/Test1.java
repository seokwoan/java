package test0719;

public class Test1 { // 데이터를 저장하기 위한 class를 jsp에서 javabean이라고 부름 

	private String name;
	private int age;
	
	public Test1( String name , int age ) {
		this.name = name;
		this.age = age;
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
	
	
	
}

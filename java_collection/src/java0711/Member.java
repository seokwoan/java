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
	public String toString() { // ��ü.toString�� ���� ��ü�� �����Ͱ� ���
		return name + " , " + age + " , " + birth;
	}
	
	
	@Override
	public boolean equals( Object o ) { // �Ű������� �־��ټ� �ִ°� ArrayList�� �־��� ��ü�� classŸ��
		// � �����ͷ� ���� ���ΰ�? 
		Member tmp = (Member)o; // �����ڽ� �����϶� classŸ�Ե� ��������ȯ�� ������ �θ�->�ڽ����� ��ȯ
		boolean isSame = this.age == tmp.age;
		if( isSame ) {
			isSame = this.name.equals(tmp.name);
		}
		if( isSame) {
			isSame = this.birth.equals(tmp.birth);
		}
		return isSame;
		// equals�� ������ ��� ����Ŀ� ���� indexOf, contains�� ���� ����� �޶���
		
		// return this.birth.equals(tmp.birth); // ������Ϸ� �� 
		// return this.age == tmp.age ; // ���̷� ��  
		// return this.name.equals(tmp.name); // �̸����� ���ؼ� �̸��� ������ ã�ƿ�
		
				
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
		// �����Ͱ��� �����̵� �����͸� �����ؾ��Ѵ�
		// return this.name.compareTo( o.name ); // -> String���� compareTo�� �̹� ������� ����
		
		// return this.age - o.age; // -> ���̷� ����
		// return (this.age - o.age)*-1; or o.age-this.name; 
		
		
		// ���̱������� �������� -> ���̰� ������ �̸����� ��������
		int sort = 0;
		sort = this.age - o.age;
		if( sort == 0 ) {
			sort = ( this.name.compareTo( o.name ) * -1 ) ;
		}
		return sort;

	}
	
}

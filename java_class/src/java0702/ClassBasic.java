package java0702;

public class ClassBasic {

	public static void main(String[] args) {
		
		// class�� ��ü�� 
		// ���ǵ� class Ÿ���� ������ �����Ѵ�.
		// ������ ������ �����͸� �����Ѵ�.
		// class Ÿ������ ������ ������ �ν��Ͻ�(�ϳ�) �Ǵ� ��ü(���� ����) ��� �Ѵ�.
		
		Member member1 = new Member(); // class �ν��Ͻ� ���� 
		Member member2 = new Member(); // ������ method( class�� ���鶧 �ڵ�����)
		// class�� ������ = new class��(); 
		// class�� ������ Ÿ�� ( ��������� ������ Ÿ��)
		// ������ member1�� member2�� MemberŸ���� ������ ����
		
		System.out.println( member1 );  //new�� ������ ������ ���������̹Ƿ� �ּҰ� ����
		System.out.println( member2 );
		
		member1.name = "�̼���";
		member1.age = 23;
		System.out.println( member1.name );
		System.out.println( member1.age );
		
		member2.name = "������";
		member2.age = 34;
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page = 495;
		book2.title = "�޸�����ȭ���";
		book2.page = 893;
		
		
		// ����Ʈ�� ��ǰ��, �ü��, �޸�(ram)ũ�⿡ ����
		// ������ �� �ִ� Ŭ������ �����ϰ� �ν��Ͻ� �����Ͽ�
		// �� ����, ����� �ϼ��� ( ����Ʈ�� 3��)
		
		
		Phone fold = new Phone();
		Phone flip = new Phone();
		Phone apple = new Phone();
		
		fold.product = "����������6";
		fold.os = "android";
		fold.ram = 12;
		flip.product = "�������ø�6";
		flip.os = "android";
		flip.ram = 8;
		apple.product = "iPhone16";
		apple.os = "iOS18";
		apple.ram  = 8;
		
		System.out.println( fold.product );
		System.out.println( fold.os );
		System.out.println( fold.ram + "G" );
		System.out.println( flip.product );
		System.out.println( flip.os );
		System.out.println( flip.ram + "G" );
		System.out.println( apple.product );
		System.out.println( apple.os );
		System.out.println( apple.ram + "G");
		
		
		
	}

}

// class�� ����� ���� ������ Ÿ���̶�� �Ѵ�. 
class Member{  // Member��� �̸��� class ����
	String name; // �����͸� �־��� ���� �̸�
	int age;	 // �����͸� �־��� ���� �̸� class������ ������ ���������� �θ�
	// ������ method�� ��ġ�� ( ������ ) Member(){}; 
	// class�� ���鶧 class �̸����ε� ������ method�� �����ǰ� �۵���
}


// å ����� �� ������ ���� �����ϱ� ���� Ŭ���� 

class Book{
	String title;
	int page;
}


class Phone{
	String product;
	String os;
	int ram;
}



// ���� -> �迭 -> ����ü(�ڹٿ� ����) -> Ŭ������ ������ ������ ���� ����� 
// ����Ÿ���� �����͸� �����ϸ鼭 ������ ��޿� �������� ���� 
// ���� Ÿ���� �����͸� ������ �� �ִ� ����ü�� ����
// struct a; -> int, float �� �ٸ� Ÿ���� �����͸� ����
// ����ü�� ����ϸ鼭 ����ü������ ����ϴ� �Լ��� ������ �������� ����
// ����ü�� �Լ��� �����ϴ� Ŭ������ ����
// Ŭ������ �ִ� �Լ��� Ŭ������ �ͼӵǾ��־� method��� �θ�
// �Լ��� �ͼӵ��� �ʰ� method�� �ͼӵǾ����� 



// class �̸�(ù���� �빮��) -> ex) Scanner, Arrays, String ������ ù���ڸ� �빮�ڷ� ���






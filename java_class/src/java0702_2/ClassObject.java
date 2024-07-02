package java0702_2;

public class ClassObject {

	public static void main(String[] args) {
		
		System.out.println( Car.������ ); 
		// ������� class������ ���α׷��� ����� �� �����Ǿ��־� ��밡��
		// �ν��Ͻ� ������ �������� ���� ����
		// class������ �ϳ��� ���� ��� ��ü�� ��� ������ �����ڿ��̶�� ��
		
		Car car1; // ������ �Լ��� ������� �ʾƼ� ���� ������ �ְ� ���� ������ �ּҰ� ������� 
		
		car1 = new Car(); // new�����ڸ� ���� ������ ������ �ν��Ͻ� ���� ��밡�� class������ �����ȵ�
		car1.carName = "�Ÿ";
		car1.���� = "�ֹ���";
		
		Car car2 = new Car( "�׷���" , 3000 , "�ֹ���" ); 
		// �Ű������� �ִ� ������ method�� ����ϸ� ��ü�� ���鶧 �Ű������� �̿��� ���� ������ �� �ִ�. 
		
		
		/*  
		 ������ : �̸� , ����Ʈ , ����
				��ǿ� , 4580 , 4.3
				����� , 3485 , 4.1
				����� , 90930 , 2.7
				������ , 19200 , 3.1
				
		 ���Ҽ� �۰����� ������ ������, �Ҽ� ��Ƚ���� ���� ����Ʈ�����̴�.
		 �� ������ ���� �� �� �ִ� Ŭ������ �����ϰ� ������ �Է��� ����ϼ���
		 ( �Ű����� �ִ� ������ method�� �ΰ� �̻� ����)		
		*/
		
		Author ��ǿ� = new Author("��ǿ�");
		��ǿ�.point = 4580;
		��ǿ�.rating = 4.3f;
		Author ����� = new Author(3485);
		�����.name = "�����";
		�����.rating = 4.1f;
		Author ����� = new Author( "�����" , 2.7f , 90930 );
		Author ������ = new Author( "������" , 19200 , 3.1f );
		
		System.out.println( ��ǿ�.name + " " + ��ǿ�.point + " " + ��ǿ�.rating);
		System.out.println( �����.name + " " + �����.point + " " + �����.rating );
		System.out.println( �����.name + " " + �����.point + " " + �����.rating );
		System.out.printf( "%s %d %.1f\n" , ������.name , ������.point , ������.rating );
		System.out.println( ��ǿ� );
		
	}

}

// class ���ο� ����Ǵ� ����(�Ǵ� �迭)�� �ΰ����� ������.
// class ����(�迭) , �ν��Ͻ� ���� 
// �ν��Ͻ������� class ��ü ������ �޸� �Ҵ��� �ȴ�. 
// class ��ü ������ new �����ڸ� ���Ѵ�.
// class������ ���α׷� ���� �Ҷ� �޸𸮿� �ε��ϸ鼭 �����ȴ�. 


// ������ method - ��ü(�ν��Ͻ�) ������ �����Ҷ� ���� �ʱ�ȭ ���ִ� method
// ������ method - return�� �������� �ʴ´�. return�� ������ �ȵȴ�
// 				 return�� �ϸ� �ȵǴ� ������ ������ method������ return Ÿ�� ������ �ȵǱ� ����
// �����ε� - �ϳ��� method�̸����� �������� method�� ����°�( �Ű������� ������ Ÿ�� �ٸ�)
// �����ε� ���� ����
// 1. ���� Ŭ���������� �����ϴ�.
// 2. method�� �̸��� ���ƾ� �Ѵ�.
// 3 or 4 �� �����ϸ� ����
// 3. �Ű������� Ÿ���� �ٸ��� ����Ǿ�� �Ѵ�.
// 4. �Ű������� ������ �޶�� �Ѵ�. 
// �Ű����� Ÿ���� ������ Ȯ���ؼ� ������ ���� ������ ������ overloading �Ұ�
// �Ű����� Ÿ���� ������ ���Ƶ� Ÿ���� ������ �ٸ��� overloading ���� 
// �Ű������� �̸��� �������. 

class Car{
	static String ������ = "����"; // class�� ������ ����鼭 �����͸� �ٷ� �־��� �� ����
	// class�� ������ �����Ҷ� ���� �տ� static�� ������ class������ �ȴ�. 
	// static�� ������
	
	String carName; // �ν��Ͻ� ����
	int ��ⷮ; // �ν��Ͻ� ����
	String ����; // �ν��Ͻ� ����
	
	// ������ method 
	// ��ü������� method�� �̸��� ���Ƶ� �ȴ�. overloading
	// method�� �̸��� ���� �Ű������� Ÿ�Ը� �ٲ��ָ� ���� method�� ��� ����
	// ���� ����� ���� �ٸ� �̸��� �Լ��� ������ ���� �ʿ䰡 ����
	Car(){ // �Լ��� ����� ������ "()"�� �ʿ��ϴ� �Ű������� ����
		// ������ method�� ���� - �ν��Ͻ� ������ �ʱⰪ ����
		���� = "�ֹ���"; // Car ������Ÿ���� ���� new�����ڷ� ������� ��ü�� ���ắ���� �ֹ������� �����
		
	}
	// �Ű������� �ִ� ������ method
	Car( String carName , int cc , String fuel){ 
		// �Ű������� �ۼ�����
		// �Ϲ������� �Ű������� �̸��� �ν��Ͻ������� ���� �̸����� �ۼ� 
		this.carName = carName; // ������ ���ֱ� ���� this.�ν��Ͻ� ������ ������ ����
		// this�� ������ method�� ��ü�� ������ ���� ��ü�� �ǹ� 
		��ⷮ = cc;
		this.���� = fuel;
	}
	
	Car( String carName , String fuel , int cc ){ 
		// �Ű������� �ۼ�����
		// �Ϲ������� �Ű������� �̸��� �ν��Ͻ������� ���� �̸����� �ۼ� 
		this.carName = carName; // ������ ���ֱ� ���� this.�ν��Ͻ� ������ ������ ����
		// this�� ������ method�� ��ü�� ������ ���� ��ü�� �ǹ� 
		��ⷮ = cc;
		this.���� = fuel;
	}
	
	
	Car( String ���� ){ // �ʿ��� ���� �Ű������� �̿��� ����� �� �ִ�.
		this.���� = ����;
	}
	
}

class Author{
	String name; // �̸� - �ν��Ͻ� ����
	int point; // ����Ʈ - �ν��Ͻ� ����
	float rating; // ���� - �ν��Ͻ� ����
	
	// �Ű������� ���� ������ method�� �ڵ�����
	// �Ű������� ���� ������ method�� �������� �ʰ� �Ű������� �ִ� method�� �����ϸ�
	// �Ű��������� ������method�� �ڵ����� �������� ����
	// �Ű������� �ִ� ������ method�� ����� �Ű������� ���� ������ method�� �߰��ؾ� ����
	// �Ű������� ���� ������ method�� ������ new�����ڷ� ����ִ� method ȣ�� �Ұ�
	Author(){
		// �Ű������� ���� ������ method�� ��������
		// �Ű����� ���� ȣ���� ���ɼ��� �����Ƿ� ����
	}
	
	Author( String name ){
		this.name = name;
	}
	
	Author( int point ){
		this.point = point;
	}
	
	Author( float rating ){
		this.rating = rating;
	}
	
	Author( String name , int point , float rating ){
		this.name = name;
		this.point = point;
		this.rating = rating;
	}
	
	Author( String name , float rating , int point ){
		this.name = name;
		this.point = point;
		this.rating = rating;
	}
	
	public String toString() {
		return name + " " + point + " " + rating;
		// public String(������Ÿ��) toString() -> String�� return�� Ÿ�� 
		//       
		// return ���ڿ� ;
		
	}
}











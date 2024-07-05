package homeProduct;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv( "�Ｚ" , 800000 ); // ��ü ������ false
		tv.power();
		tv.power(); // power method ���� �� false -> true
		tv.power(); // power method �߰� ����� true -> false
//		tv.brand = "�Ｚ";
		System.out.println( tv.brand + " " + tv.price );
		tv.channelUp();
//		tv.channel++; //channel������ private�� �ٸ� class���� ��� �Ұ��� 

		Aircon aircon = new Aircon();
		aircon.brand = "LG�ּ�";
		System.out.println( aircon.brand );
		aircon.power();
		aircon.power();   
		// Tv�� Aircon�� �������Լ�, power�Լ��� ����
		// ������ method�� ���� ������� �ʰ� House class�� ������ְ�
		// extends�� class�� ��� ������
		// public class ��ӹ���class extends �������class
		aircon.windControl();
		
		
		System.out.println( "������" );
		House tv2 = new Tv( "LG" , 1500000 );
		tv2.power();
		House item = new Tv( "�Ｚ" , 1750000 );
		item.power(); // overriding�� power()
		item = new Aircon( "�ּ�" , 1030000 );
		// �θ� Ÿ������ ���� ��ü�� ��� �ڽ�Ÿ���� ��ü�� ���� �� ����
		// �θ�Ÿ�� ��ü�� = new �ڽ�Ÿ��(); 
//		item.windCotrol();
		// item�� ������Ÿ���� House�̹Ƿ� House�� method�� ���డ��
		// �ڽ�class�� method ��� �Ұ�
		// �θ�class�� method�� �ڽ�class���� ��밡��
		// �ڽ�class�� method�� �θ�class���� ���Ұ�
		// �θ� -> �ڽ����� method�� �Ѱ��ִ°����� �ڽ�->�θ�� �Ѿ���� ����
		
		// �ڽ�class�� extends�� �־ �θ�class ����� �����ϰ� �����ذ�
		// �θ�class�� �ڽ�class�� ���� ����ϰ� ��������� ����
		// �θ�Ÿ���� ��ü�� ��� �ڽ�Ÿ���� ������������ 
		// �θ�Ÿ���� ��ü�� ��������� �ڽ�class���� �ִ� method�� ������� ���ϰ�
		// �θ�class�� method�� ��� ����
		
		// �ڽ�class�� �ּҿ��� �θ�class�� ���� �ڽ�class�� ���� ����ִ�. 
		// Ÿ���� �θ�Ÿ���̸� �θ�class�� ���� ��밡�� -> Ÿ���� �θ�Ÿ���̶� �θ�class�� ���� ���
		// ex) int a = 3.14; -> Ÿ���� int���� 3 , 0.14�� int�� 3�� ���� 
		
		
		// tv��ü 100�� , ��������ü 30�� -> �迭�� �������
		// �迭�� Ÿ���� �θ�Ÿ������ ����� �� �ȿ� �ڽİ�ü���� �迭�� �־���?
		// House[] arr = {new Tv() , new Aircon(), new Computer() };
		// �ϳ��� Ÿ������ ���� Ÿ���� ��� / �ϳ��� class�� ���� class ���?
		
		
	}

}


// class ��� House(�θ�) -> Tv, Aircon, Computer ( �ڽ� ) ���� ���
// ����� �ϸ� �ڽ�class���� �θ�class�� method, ���� ��밡�� 
// ����Ǵ� ����, method�� �����ϸ� ���
// ����Ǵ� �κ��� ���ٸ� ����� �� �ʿ䰡 ����
// Tv extends House -? Tv class�� House class�� �ִ� instance ����, method��� ����
// ����� �ϴ� ���� ū ���� - ������
// ������ - �ϳ��� Ÿ������ ���� Ÿ���� ����, ��� �ϴ°�

// �θ�class�� intance����, instance method, class����, class Method ��밡��
// ��, �θ�class�� ���� ��������� ���Ѵ�. �Ϻ� ����ɷ��ִ� ������ method�� ���Ұ�

// ������ method�� ���� instance �������� �ʱ�ȭ�� 
// �ڽ�class�� ������ �ִ� ������ �ڽ�class ������ method���� �ʱ�ȭ
// �θ�class�� ������ �ִ� ������ �θ�class ������ method���� �ʱ�ȭ
//



// class���� ���� - ��� ����
// ��� ���迡 �����ִ� class���� �θ� class�� �ڽ� class�� ������.
// �θ�class�� �ʵ�(����), method�� ����class(�ڽ�class)���� ��� ����
// 1. ����� ���뼺�� ���� ����Ѵ�. ���� class���� �ߺ��ڵ带 �ϳ��� class�� ���ս��� ���
// 2. ����class(�θ�class)�� �ʵ�(����), method�� ��� ����(�ڽ�)class���� ��������� ���Ѵ�.
//	  - �����ڿ� ����, ��Ű���� ���� �������̴�.
// 3. ����(�ڽ�)class���� �θ� ��¡�ϴ� ������ super�̴�.
// 


/*
  �ڹ��� ������
	1. static 	- class�� ���� ����, ����method
			  	- class���� �������� ����Ҽ� �ִ� ����, method
			  	- ��ü�� ������ �ʰ� class�� ���Ѵ�.
			  	- class��.static������ , class��.static method()
			  	
 	2. abstract - �߻�class, �߻�method
 				- �̿ϼ��� �ǹ̸� ������
 				- �߻�class�� ��ü ���� �Ұ�
 				
	3. final	- ������� �ʴ� �ǹ̷� ����Ѵ�
				- ���� �տ� final�� ���̸� ������ ���� �Ұ�
				- method�տ� final�� ���̸� �ش� method�� Overriding�Ұ�
				- class�տ� final�� ���̸� ��� �Ұ� -> �θ�class�� ���� �Ұ� 
				
	4. ����������(������ �����ϴ� ������)
		public		- ��𼭳� �������� ��밡���� ������
 		default		- ���� ��Ű�������� ���� ���� ( �����ڸ� ���� ������ default ���� )
 		protected 	- ���� ��Ű�������� ���� ���� ( ��, ��Ӱ����� ��� ��Ű���� �޶� ���ٰ���)
 		// public�̸� �ٸ� ���α׷����� ������ ������ ���氡�� -> ���� ����
 		private		- ��𼭳� �������� ��� ���Ѵ�.
 					- class���ο����� ��밡��
 		
 */




















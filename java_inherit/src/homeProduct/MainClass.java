package homeProduct;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv( "�Ｚ" , 800000 ); // ��ü ������ false
		tv.power();
		tv.power(); // power method ���� �� false -> true
		tv.power(); // power method �߰� ����� true -> false
//		tv.brand = "�Ｚ";
		System.out.println( tv.brand + " " + tv.price );

		Aircon aircon = new Aircon();
		aircon.brand = "LG�ּ�";
		System.out.println( aircon.brand );
		aircon.power();
		aircon.power();   
		// Tv�� Aircon�� �������Լ�, power�Լ��� ����
		// ������ method�� ���� ������� �ʰ� House class�� ������ְ�
		// extends�� class�� ��� ������
		// public class ��ӹ���class extends �������class 
		
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















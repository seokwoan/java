package homeProduct;

public class Tv extends House { 
//// public class ��ӹ���class extends �������class 	
	// �ϳ��� ���Ͽ� class�� ������ �ִ°� �ƴ� class�� ���Ϸ� ������ 
	// ���ȭ �Ѵ�. 
	// main method�� ���� class�� ����� ���� class
	
	int channel = 10; // ä�� instance����
	int vol = 5; // �Ҹ�

	Tv(){ // ������ method
		super(); // -> super() == new House()
//		new House(); �ڽ�class�� ������ �Լ����� super();�� �����Ǿ�����
//		Tv class�� ��ü�� ���鶧���� �θ� class�� instance���� ������
//		
	}
	
	// �Ű����� �ִ� ������ method
	Tv( String brand , int price ){
		super( brand , price ); // �θ�class ������method ȣ��
	}
	
	void channelUp() {
		this.channel++; // ��ü�� channel�� ���� ����
		// ��ü ���� instance������ ���� �ٲٸ� return�� �ʿ����
	}
	
	void channelDown() {
		this.channel--;
	}
	
}

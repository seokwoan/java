package homeProduct;

public class Tv extends House { 
//// public class ��ӹ���class extends �������class 	
	// �ϳ��� ���Ͽ� class�� ������ �ִ°� �ƴ� class�� ���Ϸ� ������ 
	// ���ȭ �Ѵ�. 
	// main method�� ���� class�� ����� ���� class
	
	// ������ private�� ����� ������ ������, ��� ��� �Ű������� �ִ� method�� �̿���
	private int channel = 10; // ä�� instance���� private�� class���ο����� ��밡�� ��ü�� ���� ���� �Ұ�
	private int vol = 5; // �Ҹ�
	// �ڹ��� ���� ��� ������ private
	// �ڹٿ����� ������ ���� ��κ� method���� ����
	// ������ ������ �ʿ� ����
	
//	public void setChannel( int channel ) { //channel�� ���� ������ method
//		this.channel = channel;
//	} 
	// eclipse���� �����ϴ� ����� ���� 
	// Source - Generate Getters and Setters

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	Tv(){ // ������ method
		super(); // -> super() == new House()
//		new House(); �ڽ�class�� ������ �Լ����� super();�� �����Ǿ�����
//		Tv class�� ��ü�� ���鶧���� �θ� class�� instance���� ������
//		
	}
	
	// �Ű����� �ִ� ������ method
	public Tv( String brand , int price ){
		super( brand , price ); // �θ�class ������method ȣ��
	}
	
	public void channelUp() {
		this.channel++; // ��ü�� channel�� ���� ����
		// ��ü ���� instance������ ���� �ٲٸ� return�� �ʿ����
	}
	
	public void channelDown() {
		this.channel--;
	}
	
	@Override // annotatin : @(����) -> ��ǻ�Ϳ� ��������
	// power�� override �ȴٰ� ��ǻ�Ϳ� ����
	// Override�� ��쿡�� �θ� �ƴ� �ڽ�method �ۼ�����
	protected void power() { // �θ�class�� �ڽ�class�� ���� �̸��� method�� ������ �ڽ�class�� method���� 
		super.onOff = !super.onOff;
		System.out.printf( "TV���� : %s\n", super.onOff );
	} // overriding�� method�� �θ��� �����ڸ� �Ȱ��� ����ؾ��Ѵ�
	
}

//overriding ����
//�θ�class�� �ش� method�� �����ؾ��Ѵ�.
//overriding method�� �ݵ�� ��ȯŸ��, method��, �Ű����� ��� �Ȱ��� �ۼ��ؾ��Ѵ�.
//method�� {}������ �޶� �ȴ�.


// overloading - ���ο� method�� �����ϴ°�
// ���� class�� ���� �̸��� method�� �Ű������� Ÿ��, ������ �ٸ����� ��Ī ��ȯŸ���� �������

//overriding - ������ method�� ������ �ϴ°�
// �θ� �ڽ� ������ class���� �θ� �ڽ��� ���� method��, �Ű�����, ��ȯŸ���� ������
// �θ��� method�� �ڽ��� method�� ������ �Ǿ� ����� ���� ��Ī













package homeProduct;

public class Aircon extends House {

	static final String[] windText = { "��" , "��" , "��" };
	// final �����ڸ� ����ϸ� ���� ������� ����  �ڹٽ�ũ��Ʈ�� const����
	
	private int wind = 0; // �迭�� ����ϸ� �迭�� index�� ǥ���� ������ ������ָ� ����.
	private int temperature = 20;
	
	
	public int getWind() {
		return wind;
	}

	public void setWind(int wind) {
		this.wind = wind;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	Aircon(){}
	
	Aircon( String brand , int price){
		super( brand , price);
	}
	
	void windControl() { 
		// method�� ���鶧 ����ϴ� �������� ���� �ٲ� ������ �ִ��� ���� �������Ѵ�.
		// �������� ��, ���� ���Ҷ� �ڵ尡 �ٲ�� �ȵȴ�. 
		this.wind++; // �迭�� index�� �̿�
		if( this.wind == windText.length ) this.wind = 0; // �迭�� index�� �迭�� ���̰� �������� �ʱ�ȭ
		System.out.printf( "���� �ٶ����� : %s" , windText[wind] ); // windText�� class������ this�� �Ⱥ��̴°� ����.
		
	}
	
	
	void tempUp() {
		this.temperature++;
	}
	
	void tempDown() {
		this.temperature--;
	}
	
	@Override
	protected void power() {  
		super.onOff = !super.onOff;
		System.out.printf( "���������� : %s\n", super.onOff );
	}
	
	
}

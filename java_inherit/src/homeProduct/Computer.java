package homeProduct;

public class Computer extends House {

	
	Computer(){}
	
	Computer( String brand , int price){
		super( brand , price );
	}
	
	
//	abstract void power(); 
	// �θ�class�� ���� ���
	// �߻�method�� ���⿡ �߻�class�� �ǰų� method�� �����ؾ���

	// �߻�method�� power�� ����
	@Override
	protected void power() {  
		super.onOff = !super.onOff;
		System.out.printf( "��ǻ������ : %s\n", super.onOff );
	}
}

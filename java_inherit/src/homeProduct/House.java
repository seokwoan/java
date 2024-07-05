package homeProduct;

public abstract class House {
	// abstract class class�� -> class�� �߻�class�� ������ �߻�method�� ���� �� ����
	// �߻� method�� ������ �ִ� class�� �ݵ�� �߻�class�� �Ǿ���Ѵ�. 
	// �߻�class�� ��ü ���� �Ұ�
	// new�����ڸ� ���� ��ü ������ �ʿ��� ũ�⸦ ����� �ü���� ������ ��û�ϴµ�
	// �ʿ��� ũ�⸦ ��Ȯ�� ��û�ؾ� �Ѵ�. 
	// �߻�method�� �ڽ�method�� ���� ���뿡 ���� ���� ũ�� ����� �Ұ����� ��û�� ���� 
	// �θ�class�� �߻�class��� �ݵ�� �ڽ�class�� �߻�method�� �����ؾ� �Ѵ�.
	// �θ��� �߻�method�� ������ ���� �������̶�� �ڽ�class�� �߻�class�� �Ǿ���Ѵ�.
	
	protected boolean onOff;
	protected String brand; // ��ǰ�귣��
	protected int price; // ��ǰ ���Ű���
	
	
	protected House(){
		this.onOff = false;
	}
	
	protected House( String brand , int price ){
		this.brand = brand; // �θ� ������ �ִ� ������ �θ� �ʱ�ȭ
		this.price = price;
	}


	protected abstract void power(); 
	// abstract �߻�method -> ������ ���� method ���� �����ϳĿ� ���� �޶���
	// �߻�method�� ���� class�� �ݵ�� �߻�class�� �Ǿ�� �Ѵ�
	// �߻�method�� �޸� ũ�⸦ �������� 
	// overriding -> �θ�class�� �ڽ�class�� �̸��� ���� method�� ������ �ڽ�class�� ����
	// �������� ���� �θ�class���� method�� �ۼ�
	// method�� ���࿡�� �θ��� method�� �����ϰ� �ڽĿ� �Ȱ��� method�� ������ �ٽ� ����
	// annotation���� �ּ��� �޾��ָ� override�� �����ϰ� �ڽ�method�� �ٷ� ����
	// �ڽ�class���� ���� overriding�� �Ѵٸ� �θ�class�� method�� ������ ��� �ȴ�

	

}




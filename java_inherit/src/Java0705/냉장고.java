package Java0705;

import homeProduct.House;

public class ����� extends House{ 
	// ��Ӱ����϶� default�� ���� �Ұ�
	// protected�� ���� ����
	// �ٸ� ��Ű���� �ִ� class�� ����Ϸ��� protected������
	// �ڽ�class�� ��ü�� ����� �θ�class�� �ν��Ͻ��� �����Ǿ�
	// �θ�class�� �����ڰ� default�� ���� �Ұ��� �ڽİ�ü ���� �Ұ�

	
	@Override
	protected void power() { // �θ�class
		System.out.println( "�����" );
	}
}

package java0710;


interface Animal1{ // interface�� �⺻������ �߻��� �����̴�
	static int a =10;
	final int b = 10;
	static void mee() {
		
	}
	
	public void sound(); 
	// �߻� method -> interface���� ��������� method�� abstrct�� ������ �ʾƵ� �⺻������ �߻�method�� �������
	// public void fly();
	// interface���� method�� �����ص� class���� ������ �ؾ��Ѵ�.
	// class�� ����� �ϳ��� �θ� ������ ������ interface�� �������� ������ ���� 
	// class���� ������ interface�� ������ �� ���� -> �������� interface�� ����� �����ؼ� ���
	// ����� ��� �ϳ��� �θ�class�� �����Ƿ� ���� �ٸ� ������ ��� �޸� ����
}

interface bird{
	
	public void fly();
}


class Dog1 implements Animal1{
	
	@Override
	public void sound() {
		System.out.println( "�۸�" );
	}
}


class Cat1 implements Animal1{
	
	@Override
	public void sound() {
		System.out.println( "�Ŀ�" );
	}
}



class Pigeon1 implements Animal1, bird{
	
	@Override
	public void sound() {
		System.out.println( "����" );
	}
	
	@Override
	public void fly() {
		System.out.println( "Ǫ��� ��ѱ� ����" );
	}
}





public class InterfaceTest2 {

	public static void main(String[] args) {
		
		Dog1 d = new Dog1();
		Cat1 c = new Cat1();
		Pigeon1 p = new Pigeon1();
		
		d.sound();
		c.sound();
		p.sound();
		p.fly();
	}

}



/*
	class ���
	
		1.	���ϻ�� - �ϳ��� class�� ��� �����ϴ�.
			�ڽ�class�� �ϳ��� �θ�class�� ������ �ִ�.
			�ٸ� class�� ����� ����Ϸ��� ���԰���� ����
			
			���԰���
			class A {}
			class B {
				A a = new A(); -> B class�� A class�� ��ü�� �������
			}
			�ڵ��� - Ÿ�̾�, ����, â��, ������, �ڵ�.. -> �ڵ���class�� ���԰��谡 �Ǿ���Ѵ�.
			�ڵ��� - �ҳ�Ÿ, �ƹݶ�, �׷���, ����Ƽ��, ī�Ϲ� -> �ڵ���class�� �θ�class
			
		2.	�θ�class�� ������ method�� ��ӹ޾� ����Ѵ�.
			�θ�class�� public, protected, default������
				������ method�� ��ӵȴ�.
			�ڽ�class�� �θ� ������� �ִ� ������ �� �޾ƾ� �Ѵ�.
			�ڽ�class���忡���� �������� ����. ���������� ����̴�.
			
		3.	���� ����
				�θ�class�� ������ �ڽ�class�� ������ �ش�.
			
			
	interface
		1. ���� ����
			class�� �������� interface�� �����Ͽ� ���� �� �� �ִ�.
			
		2. ������
			class�� �ʿ��� interface�� �����Ͽ� ���� �� �� �ִ�.
			 
		3. ���� ����
			class�� �ʿ��� interface�� �����ϸ� �ǹǷ� ��Ӱ����϶����� �������� ��������.(��Ӻ��� ������ ����)
			

*/

package java0710;


//	abstract class unit{
//		int hp;
//		public void repair() {
//			System.out.println( "SCV�� ����" );
//			hp += 2; -> �θ�class�� ������ �־� �ڽ�class�� �������� �� ũ��
//		};
//	}

abstract class Unit{
	int hp;
}

interface Repairable{
	public void repair(); // repair method�� interface�� ������ָ� �ʿ��� class�� ������ ��
}

class Marine extends Unit{ // ���
	Marine(){ super.hp = 50; }
//	@Override -> �θ�class�� repair method�� ������ ������ 
//	public void repair() { } // Marine�� ����̶� repair�� ��︮�� method�� �ƴ�
//	������ �θ�class�� ������ �־� �����ؾ���
}


class Dropship extends Unit implements Repairable{ // ���
	Dropship(){ super.hp = 100; }
	public void repair() {
		System.out.println( "SCV�� ����" );
	}
}


class Tank extends Unit implements Repairable{ // ���
	Tank(){ super.hp = 150; }
	public void repair() {
		System.out.println( "SCV ����" );
	}
}




public class InterfaceTest3 {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		Dropship d = new Dropship();
		Tank t = new Tank();
		
		m.hp -= 10; // hp -> 40
		d.hp -= 20; // hp -> 80
		t.hp -= 50; // hp -> 100
		// hp�� �پ� �� ������ �Ѵ�.
		
		t.repair();

		

	}

}

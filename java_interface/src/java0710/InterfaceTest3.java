package java0710;


//	abstract class unit{
//		int hp;
//		public void repair() {
//			System.out.println( "SCV가 수리" );
//			hp += 2; -> 부모class가 가지고 있어 자식class에 강제성이 더 크다
//		};
//	}

abstract class Unit{
	int hp;
}

interface Repairable{
	public void repair(); // repair method를 interface로 만들어주면 필요한 class만 가져다 씀
}

class Marine extends Unit{ // 사람
	Marine(){ super.hp = 50; }
//	@Override -> 부모class가 repair method를 가지고 있을때 
//	public void repair() { } // Marine은 사람이라 repair는 어울리는 method가 아님
//	하지만 부모class가 가지고 있어 정의해야함
}


class Dropship extends Unit implements Repairable{ // 기계
	Dropship(){ super.hp = 100; }
	public void repair() {
		System.out.println( "SCV가 수리" );
	}
}


class Tank extends Unit implements Repairable{ // 기계
	Tank(){ super.hp = 150; }
	public void repair() {
		System.out.println( "SCV 수리" );
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
		// hp가 줄어 들어서 수리를 한다.
		
		t.repair();

		

	}

}

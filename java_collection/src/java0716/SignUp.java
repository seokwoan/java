package java0716;

public class SignUp implements PageAction{

	@Override
	public String action() {
		System.out.println( "ȸ�� ���� ������ ���̽��� ���� �Ϸ�" );
		return "ȸ������ �Ϸ� ������ �̵�";
	}
	
}

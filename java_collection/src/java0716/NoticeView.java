package java0716;

public class NoticeView implements PageAction{

	@Override
	public String action() {
		System.out.println( "�� �������� ������ ������ ��ȸ �Ϸ�" );
		return "�� ������ �̵�";
	}
}

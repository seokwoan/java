package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		
		Game[] game = new Game[7];
		
		game[0] = new Game( "��������:����" , "���þ׼�" , "PS4 , PC" );
		game[1] = new Game( "�ҷο� ����Ʈ" , "�÷����� , �ҿ����ũ" , "PC, switch" );
		game[2] = new Game( "�������" , "FPS" , "PC" );
		game[3] = new Game( "���ϸ��� ���̿÷�" , "RPG" , "switch" );
		game[4] = new Game( "�ӿ���" , "���¿���" , "PC" );
		game[5] = new Game( "������ �� ����" , "�����Ʋ��" , "PC , mobile" );
		game[6] = new Game( "��Ÿũ����Ʈ" , "�ǽð� ����" , "PC" );
		
		for( int i = 0 ; i < game.length ; i++ ) {
			System.out.println( game[i] );
		}
		
//		for( Game g : game ) {
//			System.out.println( g );
//		}
		
	}

}


// 7���� ���������� ���� ��ü �����ϰ� ����ϼ���

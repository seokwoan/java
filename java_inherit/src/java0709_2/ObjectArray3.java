package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findAll();
		
		for( Board board : list ) {
			if( board.getTitle().contains( "��" ) ) {
				System.out.println( board );
			}	
		}
		
		// hit���� 50 �̻��� �� ���
		for( Board board : list ) {
			if( board.getHit() >= 50 ) {
				System.out.println( board );
			}
		}
		
		// ������ ���ڼ��� 10�� �̻��ΰ͸� ���
		for( Board board : list ) {
			if( board.getTitle().length() >= 5 ) {
				System.out.println( board );
			}
		}
		
		
		// content�� ���ڼ��� 10�� ������ ��ü�� title�� writer�� ���
		for( Board board : list ) {
			if( board.getContent().length() <= 10 ) {
				System.out.printf( " title : %s , writer : %s\n" ,  board.getTitle() , board.getWriter() );
			}
		}

		
		
		// hit���� 100�̻��� ��ü���� �����Ͽ� hot �迭�� ���� 
		
		int size = 0;
		for( Board board : list ) {
			if( board.getHit() >= 100) {
				size++;
			}
		}
		
		Board[] hot = new Board[size];
		
		int i = 0;
		for( Board board : list ) {
			if( board.getHit() >= 100 ) {
				hot[i] = board;
				i++;
			}
		}
		
		for( Board data : hot ) {
			if( data == null ) break; // hot�� ũ�⸦ �𸦶� �����Ͱ� ������ for���� ������
			System.out.println( data );
		}
		
		// writer�� ���� ���Ե� ��ü�� �����Ͽ� sin�迭�� ���� �� ����ϼ���
		
		int size1 = 0;
		for( Board board : list ) {
			if( board.getWriter().contains( "��" ) ) {
				size1++;
			}
		}
		
		Board[] sin = new Board[size1];
		int k = 0;
		
		for( Board board : list ) {
			if( board.getWriter().contains( "��" ) ) {
				sin[k++] = board;
			}
		}

		for ( Board writer : sin ) {
			System.out.println( writer );
		}
		
	}

}




















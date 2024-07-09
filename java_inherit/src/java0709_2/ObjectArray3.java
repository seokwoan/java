package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findAll();
		
		for( Board board : list ) {
			if( board.getTitle().contains( "마" ) ) {
				System.out.println( board );
			}	
		}
		
		// hit값이 50 이상인 것 출력
		for( Board board : list ) {
			if( board.getHit() >= 50 ) {
				System.out.println( board );
			}
		}
		
		// 제목의 글자수가 10자 이상인것만 출력
		for( Board board : list ) {
			if( board.getTitle().length() >= 5 ) {
				System.out.println( board );
			}
		}
		
		
		// content의 글자수가 10자 이하인 객체의 title과 writer만 출력
		for( Board board : list ) {
			if( board.getContent().length() <= 10 ) {
				System.out.printf( " title : %s , writer : %s\n" ,  board.getTitle() , board.getWriter() );
			}
		}

		
		
		// hit수가 100이상인 객체들을 추출하여 hot 배열에 저장 
		
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
			if( data == null ) break; // hot의 크기를 모를때 데이터가 없으면 for문을 멈춰줌
			System.out.println( data );
		}
		
		// writer에 신이 포함된 객체만 추출하여 sin배열에 저장 후 출력하세요
		
		int size1 = 0;
		for( Board board : list ) {
			if( board.getWriter().contains( "신" ) ) {
				size1++;
			}
		}
		
		Board[] sin = new Board[size1];
		int k = 0;
		
		for( Board board : list ) {
			if( board.getWriter().contains( "신" ) ) {
				sin[k++] = board;
			}
		}

		for ( Board writer : sin ) {
			System.out.println( writer );
		}
		
	}

}




















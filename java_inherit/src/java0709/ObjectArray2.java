package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		
		Game[] game = new Game[7];
		
		game[0] = new Game( "몬스터헌터:월드" , "헌팅액션" , "PS4 , PC" );
		game[1] = new Game( "할로우 나이트" , "플랫포머 , 소울라이크" , "PC, switch" );
		game[2] = new Game( "서든어택" , "FPS" , "PC" );
		game[3] = new Game( "포켓몬스터 바이올렛" , "RPG" , "switch" );
		game[4] = new Game( "팰월드" , "오픈월드" , "PC" );
		game[5] = new Game( "전략적 팀 전투" , "오토배틀러" , "PC , mobile" );
		game[6] = new Game( "스타크래프트" , "실시간 전략" , "PC" );
		
		for( int i = 0 ; i < game.length ; i++ ) {
			System.out.println( game[i] );
		}
		
//		for( Game g : game ) {
//			System.out.println( g );
//		}
		
	}

}


// 7개의 게임정보를 가진 객체 생성하고 출력하세요

package java0709;

public class Game {

	private String title;
	private String genre;
	private String platform;
	
	// get set
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	// --get set end
	
	
	// 생성자 method
	
	public Game() {}

	public Game( String title, String genre, String platform ) {
		this.title = title;
		this.genre = genre;
		this.platform = platform;
	}
	
	// -- 생성자 method end
	
	// toString 
	
	@Override
	public String toString() {
		return this.title + " , " + this.genre + " , " + this.platform;
	}
	
	// -- toString end
	
	
	
	
	
	
	
	
	
	
	
}


// 게임 제목과, 장르, 플랫폼
// 장르는 액션, 롤플레이, FPS 등등
// 플랫폼은 PC, PS4, switch, XBOX 등등
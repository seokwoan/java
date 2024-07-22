package javaprototype;

public class Java_clone3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		GithubRepository repository = new GithubRepository();
		repository.setUser( "kingchan223" );
		repository.setName( "disign=pattern" );
		
		// ù��° ��ü
		GithubIssue githubIssue = new GithubIssue( repository );
		githubIssue.setId(1);
		githubIssue.setTitle( "���Ͻ� ���Ͽ� ���ؼ�" );
		String url = githubIssue.getUrl();
		System.out.println( url );
		
//		// 2��° ��ü
//		GithubIssue githubIssue2 = new GithubIssue( repository );
//		githubIssue2.setId(2);
//		githubIssue2.setTitle( "���Ͻ� ���Ͽ� ���ؼ�2" );
//		String url2 = githubIssue2.getUrl();
//		System.out.println( url2 );

		// 1�� ��ü�� ����
		GithubIssue clone = (GithubIssue)githubIssue.clone();
		
		System.out.println( clone.getUrl() );
		
		githubIssue.setId( 3 );
		System.out.println( githubIssue.getUrl() );
		System.out.println( clone.getUrl() );
		
	}

}



class GithubRepository{
	private String user;
	private String name;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

//class GithubIssue{
//	private int id;
//	private String title;
//	private String url;
//	private GithubRepository githubRepository;
//	
//	public GithubIssue( GithubRepository githubRepository ) {
//		this.githubRepository = githubRepository;
//	}
//	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getUrl() {
//		return "http://github.com/" +githubRepository.getUser() + "/" + githubRepository.getName() + "/issue/"+getId();
//	}
//	public void setUrl(String url) {
//		this.url = url;
//	}
//	public GithubRepository getGithunrepository() {
//		return githubRepository;
//	}
//	public void setGithunrepository(GithubRepository githunrepository) {
//		this.githubRepository = githunrepository;
//	}
//	
//}


class GithubIssue implements Cloneable{
	private int id;
	private String title;
	private String url;
	private GithubRepository githubRepository;
	
	public GithubIssue( GithubRepository githubRepository ) {
		this.githubRepository = githubRepository;
	}
	
	// ��������
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	// ��������
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		GithubRepository repository = new GithubRepository();
//		repository.setUser( this.githubRepository.getUser() );
//		repository.setName( this.githubRepository.getName() );
//		
//		GithubIssue githubIssue = new GithubIssue(repository);
//		githubIssue.setId(this.id );
//		githubIssue.setTitle (this.title );
//		return githubIssue;
//	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return "http://github.com/" +githubRepository.getUser() + "/" + githubRepository.getName() + "/issue/"+getId();
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public GithubRepository getGithunrepository() {
		return githubRepository;
	}
	public void setGithunrepository(GithubRepository githunrepository) {
		this.githubRepository = githunrepository;
	}
	
	
}


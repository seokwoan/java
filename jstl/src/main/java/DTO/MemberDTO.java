package DTO; 
// DTO는 순수하게 데이터만 저장하는 class들이 저장되는 패키지
// 세분화하면 읽기 전용 VO클래스가 있음 -> 데이터베이스에서 가져온 데이터를 사용자에게 출력만 해줌 

public class MemberDTO {

	private int memberId;
	private String userId;
	private String userPassword;
	private String userEmail;
	private String userName;
	
	public MemberDTO() {}
	
	public MemberDTO( String userId, String userPassword, String userEmail, String userName ) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userName = userName;
	}
	
	public MemberDTO( int id, String userId, String userPassword, String userEmail, String userName ) {
		 this( userId, userPassword, userEmail, userName );
		 this.memberId = id;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}

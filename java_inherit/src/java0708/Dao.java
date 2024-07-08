package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
	// database에 접근하기 위한 객체를 만들기 위함
	// 객체를 만들어 바로 database에 저장 불가
	// database와 연결하기위한 프로그램(드라이버)가 필요함
	
	
	private Connection conn; // database 접속 정보객체(성공여부)를 저장할 변수
	private Statement st; // sql문을 실행하여 database와 상호작용을 위한 변수
	private ResultSet rs; // database select(조회)결과를 받기 위한 변수
	private PreparedStatement pt; // sql문을 database에 보내기 위한 변수 데이터가 쪼개져 보내지기 때문에 Statement보다 보안이 좋다. 
	private int size = 0;
	
	Dao(){
		DriverInit();
		Connect();
		
	}
	
	// mysql과 java프로그램을 연결할 driver로드 
	private void DriverInit() {
		
		try { // try는 예외처리
		// class파일을 메모리에 적재(load)
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		// 'Class'라는 이름을 가진 class를 이용해 class를 메모리에 적재
		}
		catch( Exception e ) {
			System.out.println( "드라이버 로드 실패" );
		}
	}
	
	
	// mysql 계정 접속
	private void Connect() {
		
		String user = "swgg";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3306/swgg";
		
		try {
			conn = DriverManager.getConnection( url, user, password );
		}
		catch( Exception e ) {
			System.out.println( "데이터 베이스 접속 실패" );
		}
		
		
	}
	
	// 자바에서 database로 전달
	public void insert( Member m ) {
		
		// Statement를 사용해 databaase에 데이터 전달
//		String sql = "insert into test_member( name, kor, eng, mat, total, std_avg ) values( '"+
//					m.getName()+"' , "+m.getKor()+" , "+m.getEng()+" , "+m.getMat()+" , "+
//					m.getTotal()+" , "+m.getStd_avg()+" )"; // sql 쿼리문 작성
//		
//		try { // database와 관련된 행위는 전부 예외처리를 해야함 -> 연결 실패로 인해 데이터 이동이 안될수도 있음
//			st = conn.createStatement(); // 쿼리문을 보내기 위해 Statement 객체 생성
//			// 쿼리문에 모든 내용이 들어가 보안적으로 취약함
//			st.executeUpdate(sql); // sql문을 데이터베이스에 전달
//		}
//		catch( Exception e ) {
//			System.out.println( "데이터 저장 실패" );
//		}
		
		// PreparedStatement를 사용해 database에 데이터 전달
		String sql =
			"insert into test_member( name, kor, eng, mat, total, std_avg) values( ?, ?, ?, ?, ?, ?)";
			// insert into table명( column명 ) valuse( 데이터( ?로 작성) )
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString( 1 , m.getName() ); // pt.set데이터타입( ?(column순서) , 데이터값 ); 
			pt.setInt( 2 , m.getKor() );
			pt.setInt( 3 , m.getEng() );
			pt.setInt( 4 , m.getMat() );
			pt.setInt( 5 , m.getTotal() );
			pt.setInt( 6 , m.getStd_avg() );
			pt.executeUpdate(); // executeUpdate를 해야 database로 데이터가 넘어감
		}
		catch( Exception e ) {
			System.out.println( "데이터 저장 실패" );
		}
		
	}
	
	
	public Member[] select() {
		
		Member[] list = null;
		
		String sql = "select count(*) as cnt from test_member"; 
		// 데이터가 사용되지 않아 statement 사용 가능
		// count의 결과를 cnt column에 저장
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);  // select를 할때는 method 이름이 Query 나머지는 Update
			if( rs.next() ) { // 다음값이 있냐 없냐 database에 데이터가 저장되어 있으면 실행? 
				// database의 column 아래 첫값은 null값(비어있음)이고 rs에는 null값(비어있음)에 들어있음
				// rs.next()를 하면 null값 밑의 데이터를 가져옴 -> 데이터가 있으면 참 없으면 거짓
				// rs.next()가 참이면 rs의 위치가 내려감 -> rs가 내려가면서 select로 데이터값을 가져옴
				// 데이터가 없으면 거짓이 되고 null값이라 움직이지 않음 -> 데이터를 전부 가져옴
				// 참조변수인데 주소가 계속 바뀌어서 데이터를 확인 
				size = rs.getInt( "cnt" );
				System.out.println( rs.getInt("cnt") );
				// re.getInt( column명 )을 통해 column( 데이터의 수 )를 구해옴
			}
			if( size != 0 ) {
				list = new Member[size]; // class로 배열을 만들었으면 참조변수 배열만 만들어졌고 객체가 아님
				int i = 0;
				sql = "select * from test_member"; // 전체 데이터 조회 쿼리문(sql질의문)
				rs = st.executeQuery( sql ); // 조회 결과 받기
				while( rs.next() ) { // 조회결과 하나씩 순회 -> 생성자 method를 이용해 배열의 객체를 만들어줌 
					list[i] = new Member( rs.getInt("member_id"), rs.getString("name") , 
							rs.getInt( "kor" ), rs.getInt( "eng" ), rs.getInt( "mat" ) , 
							rs.getInt( "total" ), rs.getInt( "std_avg" ) ); 
					i++; // 배열의 다음 인덱스를표현을 위해 1증가
				}
				
			}
			
		}
		catch( Exception e ) {
			System.out.println( "데이터 조회 실패" );
		}
				
		return list;
	}
	
}






// driver -> 계정로그인 -> sql쿼리문(명령어) 


// Member[] a = new Member[x] -> 객체가 만들어진게 아닌 배열의 주소를 저장할 참조 변수들이 만들어짐
// a[0] = new Member[] - > 각 배열의 index에 객체를 만들어 줘야함








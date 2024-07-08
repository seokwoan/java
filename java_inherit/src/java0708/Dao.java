package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
	// database�� �����ϱ� ���� ��ü�� ����� ����
	// ��ü�� ����� �ٷ� database�� ���� �Ұ�
	// database�� �����ϱ����� ���α׷�(����̹�)�� �ʿ���
	
	
	private Connection conn; // database ���� ������ü(��������)�� ������ ����
	private Statement st; // sql���� �����Ͽ� database�� ��ȣ�ۿ��� ���� ����
	private ResultSet rs; // database select(��ȸ)����� �ޱ� ���� ����
	private PreparedStatement pt; // sql���� database�� ������ ���� ���� �����Ͱ� �ɰ��� �������� ������ Statement���� ������ ����. 
	private int size = 0;
	
	Dao(){
		DriverInit();
		Connect();
		
	}
	
	// mysql�� java���α׷��� ������ driver�ε� 
	private void DriverInit() {
		
		try { // try�� ����ó��
		// class������ �޸𸮿� ����(load)
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		// 'Class'��� �̸��� ���� class�� �̿��� class�� �޸𸮿� ����
		}
		catch( Exception e ) {
			System.out.println( "����̹� �ε� ����" );
		}
	}
	
	
	// mysql ���� ����
	private void Connect() {
		
		String user = "swgg";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3306/swgg";
		
		try {
			conn = DriverManager.getConnection( url, user, password );
		}
		catch( Exception e ) {
			System.out.println( "������ ���̽� ���� ����" );
		}
		
		
	}
	
	// �ڹٿ��� database�� ����
	public void insert( Member m ) {
		
		// Statement�� ����� databaase�� ������ ����
//		String sql = "insert into test_member( name, kor, eng, mat, total, std_avg ) values( '"+
//					m.getName()+"' , "+m.getKor()+" , "+m.getEng()+" , "+m.getMat()+" , "+
//					m.getTotal()+" , "+m.getStd_avg()+" )"; // sql ������ �ۼ�
//		
//		try { // database�� ���õ� ������ ���� ����ó���� �ؾ��� -> ���� ���з� ���� ������ �̵��� �ȵɼ��� ����
//			st = conn.createStatement(); // �������� ������ ���� Statement ��ü ����
//			// �������� ��� ������ �� ���������� �����
//			st.executeUpdate(sql); // sql���� �����ͺ��̽��� ����
//		}
//		catch( Exception e ) {
//			System.out.println( "������ ���� ����" );
//		}
		
		// PreparedStatement�� ����� database�� ������ ����
		String sql =
			"insert into test_member( name, kor, eng, mat, total, std_avg) values( ?, ?, ?, ?, ?, ?)";
			// insert into table��( column�� ) valuse( ������( ?�� �ۼ�) )
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString( 1 , m.getName() ); // pt.set������Ÿ��( ?(column����) , �����Ͱ� ); 
			pt.setInt( 2 , m.getKor() );
			pt.setInt( 3 , m.getEng() );
			pt.setInt( 4 , m.getMat() );
			pt.setInt( 5 , m.getTotal() );
			pt.setInt( 6 , m.getStd_avg() );
			pt.executeUpdate(); // executeUpdate�� �ؾ� database�� �����Ͱ� �Ѿ
		}
		catch( Exception e ) {
			System.out.println( "������ ���� ����" );
		}
		
	}
	
	
	public Member[] select() {
		
		Member[] list = null;
		
		String sql = "select count(*) as cnt from test_member"; 
		// �����Ͱ� ������ �ʾ� statement ��� ����
		// count�� ����� cnt column�� ����
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);  // select�� �Ҷ��� method �̸��� Query �������� Update
			if( rs.next() ) { // �������� �ֳ� ���� database�� �����Ͱ� ����Ǿ� ������ ����? 
				// database�� column �Ʒ� ù���� null��(�������)�̰� rs���� null��(�������)�� �������
				// rs.next()�� �ϸ� null�� ���� �����͸� ������ -> �����Ͱ� ������ �� ������ ����
				// rs.next()�� ���̸� rs�� ��ġ�� ������ -> rs�� �������鼭 select�� �����Ͱ��� ������
				// �����Ͱ� ������ ������ �ǰ� null���̶� �������� ���� -> �����͸� ���� ������
				// ���������ε� �ּҰ� ��� �ٲ� �����͸� Ȯ�� 
				size = rs.getInt( "cnt" );
				System.out.println( rs.getInt("cnt") );
				// re.getInt( column�� )�� ���� column( �������� �� )�� ���ؿ�
			}
			if( size != 0 ) {
				list = new Member[size]; // class�� �迭�� ��������� �������� �迭�� ��������� ��ü�� �ƴ�
				int i = 0;
				sql = "select * from test_member"; // ��ü ������ ��ȸ ������(sql���ǹ�)
				rs = st.executeQuery( sql ); // ��ȸ ��� �ޱ�
				while( rs.next() ) { // ��ȸ��� �ϳ��� ��ȸ -> ������ method�� �̿��� �迭�� ��ü�� ������� 
					list[i] = new Member( rs.getInt("member_id"), rs.getString("name") , 
							rs.getInt( "kor" ), rs.getInt( "eng" ), rs.getInt( "mat" ) , 
							rs.getInt( "total" ), rs.getInt( "std_avg" ) ); 
					i++; // �迭�� ���� �ε�����ǥ���� ���� 1����
				}
				
			}
			
		}
		catch( Exception e ) {
			System.out.println( "������ ��ȸ ����" );
		}
				
		return list;
	}
	
}






// driver -> �����α��� -> sql������(��ɾ�) 


// Member[] a = new Member[x] -> ��ü�� ��������� �ƴ� �迭�� �ּҸ� ������ ���� �������� �������
// a[0] = new Member[] - > �� �迭�� index�� ��ü�� ����� �����








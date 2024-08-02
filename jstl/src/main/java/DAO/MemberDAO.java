package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.MemberDTO;

public class MemberDAO extends DBConnect{

	public void save( MemberDTO member ) { // ȸ�� ���� ���� member ���̺� ����

		String sql = "insert into member( user_id, user_password, user_email, user_name ) values( ? , ? , ? , ? )";
		
		try {
			pt = conn.prepareStatement( sql );
			pt.setString( 1 , member.getUserId() );
			pt.setString( 2 , member.getUserPassword() );
			pt.setString( 3 , member.getUserEmail() );
			pt.setString( 4 , member.getUserName() );
			pt.executeUpdate();
			
			
		}
		catch( SQLException e ) {
			e.printStackTrace();
			System.out.println( "ȸ������ ȸ�� ���� ���̺� ���� ����" );
		}
	}
	
	public boolean login( String id , String pw ) {
		
//		String sql = "select * from member"; 
		
//		ResultSet rs = null;
//		ArrayList<MemberDTO> list = new ArrayList<>();
//		
//		try{
//			pt = conn.prepareStatement(sql);
//			rs = pt.executeQuery(); // select���ϰ�� executeQuery();
//			
//			while( rs.next() ){
//				list.add(
//					new MemberDTO( rs.getString("user_id") , rs.getString("user_password") ,
//							rs.getString("user_email") , rs.getString("user_name") ) );
//				
//			}
//		}
//		catch( SQLException e ){
//			System.out.println( "��ȸ ����" );
//		}
//		
//		if( !list.isEmpty() ){
//			for( MemberDTO m : list ){
//				if( m.getUserId().equals(id) ){ 
//					if( m.getUserPassword().equals(pw) ){
//						return true;
//					}
//				}
//			}
//		}
		
//		return false;
		
		String sql = "select * from member where user_id=? and user_password=?";
		
		try {
			pt = conn.prepareStatement( sql );
			pt.setString( 1 , id );
			pt.setString( 2 , pw );
			rs = pt.executeQuery(); // ����ڰ� �Է��� ���̵� ����� �����Ѵٸ� �����ְ� ��ġ�ϴ� ���� ������ �ƹ����� ����
			
			if( rs.next() ) {
				return true;
			}
		}
		catch( SQLException e ) {
			e.printStackTrace();
			System.out.println( "�α��� ����" );
		}
		
		return false;
	}

	public List<String> findAllUserId() { // ȸ�����Ե� ��ü���̵� ��ȸ
		
		String sql = "select user_id from member";
		
		List<String> list = new ArrayList<>();
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			
			while( rs.next() ) {
				list.add( rs.getString( "user_id" ) );
			}
			
		}
		catch( SQLException e ) {
			e.printStackTrace();
			System.out.println( "��ü ���̵� ��ȸ ����" );
		}
		
		return list;
	}
	
}
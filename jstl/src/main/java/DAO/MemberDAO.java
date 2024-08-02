package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.MemberDTO;

public class MemberDAO extends DBConnect{

	public void save( MemberDTO member ) { // 회원 가입 내용 member 테이블에 저장

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
			System.out.println( "회원가입 회원 정보 테이블 저장 실패" );
		}
	}
	
	public boolean login( String id , String pw ) {
		
//		String sql = "select * from member"; 
		
//		ResultSet rs = null;
//		ArrayList<MemberDTO> list = new ArrayList<>();
//		
//		try{
//			pt = conn.prepareStatement(sql);
//			rs = pt.executeQuery(); // select문일경우 executeQuery();
//			
//			while( rs.next() ){
//				list.add(
//					new MemberDTO( rs.getString("user_id") , rs.getString("user_password") ,
//							rs.getString("user_email") , rs.getString("user_name") ) );
//				
//			}
//		}
//		catch( SQLException e ){
//			System.out.println( "조회 실패" );
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
			rs = pt.executeQuery(); // 사용자가 입력한 아이디 비번이 존재한다면 값이있고 일치하는 값이 없으면 아무값도 없다
			
			if( rs.next() ) {
				return true;
			}
		}
		catch( SQLException e ) {
			e.printStackTrace();
			System.out.println( "로그인 실패" );
		}
		
		return false;
	}

	public List<String> findAllUserId() { // 회원가입된 전체아이디 조회
		
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
			System.out.println( "전체 아이디 조회 실패" );
		}
		
		return list;
	}
	
}
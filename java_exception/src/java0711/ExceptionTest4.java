package java0711;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ExceptionTest4 {

	public static void main(String[] args) {

		// 파일에 쓰기
		
		try( BufferedReader br = 
				new BufferedReader( new FileReader("c:/test/data.txt"))  )
		{
			String text = br.readLine();
			System.out.println( text );
			
			
		}catch(Exception e) {
			System.out.println("파일 열기 실패 및 파일쓰기 실패");
		}
		
		
//		BufferedWriter br=null;
//		try {
//			
//			br = new BufferedWriter( new FileWriter("c:/test/data.txt") );
//			String name ="이순신";
//			br.write("이순신 34 군인" + name.substring(10) );
//			
//			br.close();
//			
//		}catch(Exception e) {
//			System.out.println("파일 열기 실패 또는 파일 쓰기 실패");
//			try {
//				br.close();
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
//		}

	}

}

//예외 처리 - 자동자원반환
//파일 읽기, 쓰기 를 하려면 파일을 열어야한다.
//파일을 열어서 사용이 끝났으면 사용된 자원을 반납해야 한다.
//파일 닫기를 해줘야 한다.
//데이터베이스에 데이터를 저장하거나 가져오는 행위를 했다면
//닫기를 해줘야한다. 

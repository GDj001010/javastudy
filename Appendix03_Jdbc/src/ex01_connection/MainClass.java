package ex01_connection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MainClass {

	public static void ex01() {
		
		// 클래스를 로드하는 방법(메모리에 로드한다 : 사용하겠다.)
		try {
			Class.forName("oracle.jdbc.OracleDriver");	// OracleDriver 클래스 경로를 통해 사용
														// oracle.jdbc.driver.OracleDriver도 사용 가능 둘이 같다.
			System.out.println("클래스가 로드되었습니다.");
			
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 
	}
	
	public static void ex02() {
		
		// Oracle DataBase와 연결할 때 사용하는 Connection 인터페이스
		
		Connection con = null;
		
		// Oracle 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	// 접속정보들은 항상 필요하다.
		String user = "GDJ61";
		String password = "1111";
		
		// DriverManager - 클래스로부터 Connection 객체를 받아 온다.
		
		try {
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB에 접속되었습니다.");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 사용이 끝난 Connection 객체는 반드시 닫아야 한다.
		try {
			if(con != null) {
				
				con.close();
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex03() {
		
		// 프로퍼티 파일을 읽어서 사용자 정보 처리하기
		
		BufferedReader reader = null;
		Connection con = null;
		
		try {
			// 프로퍼티 파일을 읽는 문자 입력 스트림 생성하기
			reader = new BufferedReader(new FileReader("db.properties"));
			
			// 프로퍼티 파일을 읽어서 프로퍼티 객체 생성하기
			Properties properties = new Properties();
			properties.load(reader);
			
			// 프로퍼티 객체에 저장된 각 Property 읽기
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			
			// DriverManager로 부터 Connection 객체 얻기
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB에 접속되었습니다.");
			
		}catch (IOException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con != null) {
					con.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public static Connection getConnection() {
		
		Connection con = null;
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties properties = new Properties();
			properties.load(new BufferedReader(new FileReader("db.properties")));
			
			con = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
			
		}catch (Exception e) {		// ClassNotFoundException, SQLException, IOException 한 번에 처리 Exception
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Connection con = getConnection();
		System.out.println("DB에 접속되었습니다.");
		
		
	}

}









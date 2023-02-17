package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class ParkingDAO {
	
	private static ParkingDAO dao = new ParkingDAO();
	
	private ParkingDAO() {}
	
	public static ParkingDAO getinstance() {
		return dao;
	}
	
	private Connection con;
	private PreparedStatement ps;
	private String sql;
	private ResultSet rs;
	private int res;
	
	
	public void getConnection() {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			con = DriverManager.getConnection(p.getProperty("url"), p);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void close() {
		try {
			if(rs != null) con.close();
			if(ps != null) ps.close();
			if(con != null) rs.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}





















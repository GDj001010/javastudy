package ex05_delete;



import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MainClass {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			// 회원번호가 1인 회원을 삭제하시오
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			
			String sql = "DELETE FROM MEMBER_TBL"; 
			sql += " WHERE MEMBER_NO = ?";
			
			
			int memberNo = 1;
			ps = con.prepareStatement(sql);			
			ps.setInt(1, memberNo);
			
			int delresult = ps.executeUpdate();
			System.out.println(delresult + "개의 행이 삭제되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

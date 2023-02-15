package ex01_setter;

public class User {
	
	private String id;
	private String pw;
	
	// 생성자가 없으므로 디폴트 생성자 사용
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}
	
	
	
	
}

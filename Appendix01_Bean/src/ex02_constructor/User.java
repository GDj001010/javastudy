package ex02_constructor;

public class User {

	private String id;
	private String pw;
	
	
	// 생성자
	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}
	
}

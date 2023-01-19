package ex02_List;

public class User {
	
	
	private String id;
	private int pw;
	
	public User() {
		
	}
	
	
	public User(String id, int pw) {
		this.id = id;
		this.pw = pw;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getPd() {
		return  pw;
	}


	public void setPd(int pw) {
		this.pw = pw;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package ex04_hash;

public class User {
	
	private String id, pw;								// 필드 생성 한 번에 가능
	
	public User(String id, String pw) {					// 생성자
		super();
		this.id = id;
		this.pw = pw;
	
	}

	@Override
	public int hashCode() {								// 객체 비교할 때 사용
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {					// 객체 비교할 때 사용
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		return true;
	}

	@Override
	public String toString() {							//	참조값이 출력 되는 걸 막아줌
		return "User [id=" + id + ", pw=" + pw + "]";
	}
	
	
	
}

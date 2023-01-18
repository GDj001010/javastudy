package ex04_builder;

public class User {
	
	// 필드(Builder 객체가 가진 값을 받아온다.)
	private String id;
	private String pw;
	
	
	
	
	// User 생성자
	public User(Builder builder) {
		this.id = builder.id;
		this.pw = builder.pw;
	}
	
	
	
	// Builder 객체 반환 메소드
	public static Builder builder() {
		return new Builder();
	}
	

	// id, pw 출력
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}





	// Builder 클래스(내부 클래스)
	public static class Builder {
		
		
		// Builder 필드(여기로 값을 전달 받아서 User 필드로 전달한다.)
		private String id;
		private String pw;
		
		
		// 값을 받아오는 메소드 (메소드명 == 필드명 동일하게 구성)
		// 1. 메소드명과 필드명을 동일하게 구성한다.
		// 2. 메소드 체이닝을 위해서 현재 객체(this) 를 반환한다.
		public Builder id(String id) {
			this.id = id;
			return this; 				// 클래스 외부에서 호출 (User) 내부에서 (this)
		}
		public Builder pw(String pw) {
			this.pw = pw;
			return this;
		}
		
		
		// User 객체 반환
		// Builder 필드 값을 가진 User객체를 반환
		public User build() {
			return new User(this);  	// this ( id, pw 값을 모두 가지고 있는 Builder 객체)
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

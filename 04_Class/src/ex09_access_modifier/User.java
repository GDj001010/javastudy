package ex09_access_modifier;

public class User {

	/*
		접근 제어 지시자(AccessModifier)
		1. private 	 : 클래스 내부에서만 접근할 수 있다.          공부
		2. default 	 : 동일한 패키지에서만 접근할 수 있다.
		3. protected : 동일한 패키지 또는 상속 관계의 클래스에서만 접근할 수 있다.
		4. public 	 : 누구나 접근할 수 있다.                     공부
	*/
	
	/*
		정보 은닉(Information Hiding)
		1. 클래스의 내부 정보를 외부에 노출하지 않는 것을 말한다.
		2. 클래스의 내부 정보는 "필드"를 의미하므로 "필드값"을 외부에 공개하지 않는 것을 말한다.
		3. "필드"는 private(클래스 내부에서만 접근) 하게 처리한다.    "필드는 무조건" 
		4. 메소드는 public(전체 접근) 하게 처리한다. "필드"에 접근하기 위해서는 "메소드"를 통해서 접근해야 한다.
	*/
	
	/*
		Getter와 Setter   "손으로 코딩하지 않음" Source - Generate Getter and Setter - 체크 없이 Select all - Generate
		1. Getter
			1) 필드값을 외부로 반출하는 메소드
			2) get + 필드 이름을 가지는데 이를 수정하면 안됨.
		
		2. Setter
			1) 외부로부터 필드값을 받아오는 메소드
			2) set + 필드이름을 가지는데 이를 수정하면 안됨.
	
	*/
	
	
	// 필드   private으로 바꾸는 작업
	private String  id;
	private String  pw;
	private boolean isVip;  // is로 시작함
	
	
	
	// 메소드
	
	
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
	
	
	
	
	public boolean isVip() {
		return isVip;
	}
	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}
	
	
	
	
}

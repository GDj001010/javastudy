package ex08_this;

public class User {

	/*
		this
		1. 현재 객체의 참조값
		2. Class의 내부에서만 사용 가능
		3. Class의 구성 요소 (필드, 메소드)를 호출할 때 사용할 수 있다.
			1) 필드 	: this.필드
			2) 메소드 	: this.메소드() 
	*/
	
	// 필드  ( 클래스에서 사용 될 변수 )
	String id;  // 앞에 this를 붙여 this.id
	String pw;  // 앞에 this를 붙여 this.pw
	
	// 생성자
	User(String id, String pw){
		this.id = id;
		this.pw = pw;
	
	}
	
	
	

	// 메소드
	void printThis() {
		System.out.println(this);
	}
	
	
	void info() {
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + pw);
	}
}
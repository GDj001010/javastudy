package ex06_default_constructor;

public class User {

	// 생성자를 만들지 않으면 "디폴트 생성자"가 사용된다.
	
	/*
	User(){  // "디폴트 생성자"
		System.out.println("우리의 첫 생성자");
	}
	*/
	
	//필드
	String id;
	String pw;
	
	// 메소드
	void info() {  // 주고받는 것이 없음
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + pw);
	}
	
}

package ex03_singleton;

	// singleton
	// 객체를 하나만 만들 수 있다.
	// User 1개만

public class User {
	
	// static 필드 (미리 User를 만들어 둔다.)
	private static User user = new User();
	
	// private 생성자(외부에서는 생성자를 호출할 수 없다.)
	private User() {
		
	}
	
	// static < 클래스 메소드 "클래스 명으로 호출"
	// static 메소드 (static 필드를 사용하기 위해서)를 만들어준다.
	// User 필드를 외부에서 사용할 수 있도록 반환하는 메소드 "일종의 Getter"
	// 공개  공유  반환타입 메소드 명
	public static User getInstance() {
		return user;
	}
	
}

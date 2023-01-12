
package ex09_access_modifier;

public class MainClass {
	
	public static void ex01() {
		
		// User 객체 선언 + 생성
		User user = new User();
		// 클래스 타입이면 객체
		
		// user 객체에 id, pw 전달하기
		user.setId("admin");
		user.setPw("123456");
		// 객체가 메소드를 부름
		
		// user 객체의 id, pw 확인하기
		System.out.println(user.getId());
		System.out.println(user.getPw());
		
		
	}

	
	public static void ex02() {
		
		User user = new User();
		
		user.setId("ehdud");
		user.setPw("1919");
		
		System.out.println(user.getId());
		System.out.println(user.getPw());
		
	}
	
	public static void main(String[] args) {
		
		ex02();
	}

}

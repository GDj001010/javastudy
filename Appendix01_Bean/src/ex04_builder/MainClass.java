package ex04_builder;

import ex04_builder.User.Builder;

public class MainClass {

	public static void main(String[] args) {
		

		Builder builder = User.builder();
		
		// User 클래스로 빌더 호출
		User user = User.builder()
				.id("admin")
				.pw("123456")
				.build();
		
		System.out.println(user);
	}

}

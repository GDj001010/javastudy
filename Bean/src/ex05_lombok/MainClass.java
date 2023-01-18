package ex05_lombok;

public class MainClass {

	public static void main(String[] args) {
		
		User user = new User("admin123", "456123");
		
		System.out.println(user.getId());
		System.out.println(user.getPw());
		System.out.println(user);		// toString으로 확인
		
		User user1 = new User();
		user1.setId("admin");
		user1.setPw("123456");
		System.out.println(user1);		// toString으로 확인
		
		User user2 = User.builder()
				.id("mater")
				.pw("789465")
				.build();
		System.out.println(user2);		// toString으로 확인
		
		
		
		
	}

}

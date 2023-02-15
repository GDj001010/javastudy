package ex01_setter;

public class MainClass {

	public static void main(String[] args) {
		
		// setter를 이용한 객체 생성
		// User 객체(bean) 생성			
		User user = new User();
		
		// setter를 이용한 필드값 저장
		user.setId("admin");
		user.setPw("123456");
		
		// 필드 값 확인
		System.out.println(user);

		
	
	}

}

package ex03_constructor;

public class Person {
	
	// 생성자
	public Person() {  // 매개변수가 없는 생성자 - 디폴트 생성자
		super();  // 생략 가능한 부모 클래스의 생성자 호출(매개변수가 없는 디폴트 형식의 생성자는 생략 가능
		System.out.println("Person 생성");  
	}
	
	/************************************************************/
	
	// 필드
	private String name;
	
	// 생성자
	public Person(String name) {
		this.name = name;
		
	}
	
	
	// 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}

package practice02_Person_Array;

public class Person {
	
	// 생성자를 만들지 않으면 "디폴트 생성자"가 사용된다.
	
	// 필드
	private String name;
	private int age;
	
	
	// 생성자           디폴트 생성자는 생성자가 하나도 없을 때 사용 생성자가 하나라도 있으면 사용 되지 않음
	
	public Person() {}   // new Person() 가능 이름, 나이가 없음 이름, 나이를 넣어줄 메소드가 필요
	
	public Person(String name, int age) {  // new Person("alice", 20) 가능
		this.name = name;
		this.age = age;
	}

	// 메소드
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	
	
	
		
		
		
		
		
		
		
	}
		
		
	
	
	
	
	
	
	
	
	
}

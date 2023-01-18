package ex06_Object;

public class Person {
	
	// 필드
	private String name;
	
	
	// 생성자 ( 이름 안 받아 오는 방법)
	public Person() {				// ex01 때문에 만듬 안 만들어주면 오류
									// 인수를 받는 직접 만든 생성자를 하나라도 만든다면 디폴트 생성자는 동작하지 않기 때문에 만들어줌
	}
	
	
	// 생성자 ( 이름 받아 오는 방법)
	public Person(String name) {
		this.name = name;
	}
	
	
	// get, set
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	

	// 메소드
	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void sleep() {
		System.out.println("잔다.");
	}

/*					나중
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	
	
}

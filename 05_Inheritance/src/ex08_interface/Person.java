package ex08_interface;
/*
	인터페이스(interface)
	1. 추상 클래스의 한 형태이다.
	2. JDK 1.7 이전에는 추상 메소드로만 구성된 추상 클래스를 의미한다.
	3. JDK 1.8 이후에는 본문이 있는 default 메소드, static 메소드를 추가할 수 있다.
	4. 인터페이스는 주로 final 상수값을 보관할 수 있거나, 추상 메소드를 가진다
	5. 인터페이스의 추상 메소드는 public abstract를 모두 생략할 수 있습니다.
*/
public interface Person {				// class가 아닌 interface  추상 클래스

	// default 메소드 (본문이 있는 메소드 )
	public default void eat() {			// default (기본값) 모두가 사용 가능
		System.out.println("먹는다.");
		
	}
	
	public default void sleep() {
		System.out.println("잔다.");
		
	}
	
	// 추상(abstract) 메소드 (본문이 없는 메소드)
	public void study();
	
}

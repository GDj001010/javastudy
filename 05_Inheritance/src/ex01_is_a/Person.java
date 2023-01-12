package ex01_is_a;

	/*
		is a 관계
		1. 상속 관계로 만들 수 있는 관계이다.
		2. Student in a Person
		3.  자식   is a 부모
	*/
	/*
	 	부모 클래스
	 	1. 슈퍼 클래스라고 한다. (super)
	 	2. 자식 클래스에게 기능을 제공하는 입장.
	 	
	*/
public class Person {

	
	//메소드 생성
	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void sleep() {
		System.out.println("잔다.");
	}
}

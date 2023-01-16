package ex06_downcasting;

public class Student extends Person{
	/*
	@Override
	public void study() {		// 부모 객체가 가진 메소드를 다시 만들어 사용 - Override
		System.out.println("공부한다.");
	}*/
	
	@Override
	public void study() {		// 부모 객체가 가진 메소드를 다시 만들어 사용 - Override
		System.out.println("공부한다.");
	
	}
}

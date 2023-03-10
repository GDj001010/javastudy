package ex07_abstract;

/*
	추상 메소드
	1. abstract method
	2. 본문이 없는 메소드이다.
	3. 중괄호를 없애고, 세미콜론을 붙이고, abstract 키워드를 method 앞에 추가한다.
*/

/*
	추상 클래스
	1. abstract class
	2. 추상 메소드를 1개 이상 가진 클래스이다.
	3. abstract 키워드를 클래스 앞에 추가한다.
	4. 추상 클래스를 상속 받는 클래스는 "반드시" "모든" "추상 메소드"를 오버라이드 해야 한다.
	5. 추상 클래스는 객체 생성이 불가능하다. (new Person이 불가능)
		(본문이 없는 추상 메소드를 가지고 있기 때문이다.)
*/
public abstract class Person {			// class Person < 클래스 앞에 추가
	/*
	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void sleep() {
		System.out.println("잔다.");
		
	}
	
	public void study() {		// Person 타입의 객체기 때문에 학생의 공부메소드 까지 저장
		
	}
	*/
	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void sleep() {
		System.out.println("잔다.");
		
	}
	
	public abstract void study();   	// 추상적 메소드 - 본문이 없다면 괄호를 지워줌
										// void study < 메소드 앞에만 추가해주면 됨 대부분 public 뒤에 붙임
	
	
}

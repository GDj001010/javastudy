package ex01_is_a;

public class Student extends Person { // 상속 - Person 클래스에 메소드들을 사용할 수 있음. (학생도 사람이기 때문에 사람이 할 수 있는 일을 사용 가능)
	
	/*
		1. 학생도 사람이기 때문에 사람이 할 수 있는 일을 사용 가능
		2. 사람과 차는 다르기 때문에 사용 불가
	*/
	/*
		자식 클래스
		1. 서브 클래스라고 한다. (sub)
		2. 부모 클래스의 기능을 자기 것처럼 사용할 수 있다.
	*/
	
	
	// 메소드 생성
	public void study() {
		System.out.println("공부한다.");
	}
	
	
}

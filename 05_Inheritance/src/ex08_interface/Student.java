package ex08_interface;
/*
 	1. 클래스를 상속 받는다. extends 키워드를 사용한다.
		public class Person{}
		public class Student extends Person{}

 	2. 인터페이스는 상속받는다고 표현하지 않고 인터페이스를 구현한다라고 표현 implements 키워드를 사용
 		public interface Person{}
 		public class Student implements Person{}
 	3. 
 	
*/
public class Student implements Person{

	@Override
	public void study() {
		System.out.println("공부한다.");
		
	}
	
	
}

package ex06_downcasting;

public class MainClass {

	public static void ex01() {
		
			/*
		Person person = new Student();		// 자식을 부모 타입으로 객체를 저장시킴 - "업캐스팅" 부모 클래스에 메소드만 호출 가능
		
		person.study();
		
		*/
		
		// upcasting
		Person person = new Student();		// 자식을 부모 타입으로 객체를 저장시킴 - "업캐스팅" 부모 클래스에 메소드만 호출 가능
		
		// downcasting
		Student student = (Student)person;	// 부모를 자식 타입으로 객체 저장시킴 - "다운캐스팅"
		
		student.eat();
		student.sleep();
		student.study();
		
	}
	
	public static void ex02() {
		
			// Person
			Person person = new Person();		
			
			// 잘못된 캐스팅
			Student student = (Student)person;	
			
			// 잘못된 캐스팅은 컴파일 오류로 걸러지지 않는다.
			student.eat();
			student.sleep();
			student.study();		// 오류가 발생하는 부분
		
	}
	
	public static void ex03() {
		
		Person person = new Person();
		
		// Student 객체(인스턴스, instance)가 맞다면 Student 타입으로 캐스팅하자.
		if(person instanceof Student) {
			
			Student student = (Student)person;  // 다운 캐스팅 방법
			student.eat();
			student.sleep();
			student.study();
			
			// 권장하는 코드 진행  eat메소드와 study메소드가 서로 다른 곳에 있음을 알려줌  
			person.eat();    		
			person.sleep();			
			((Student)person).study();		// 다운 캐스팅 방법  Student student = (Student)person; 와 똑같이 동작 student.study();  와 동일한 코드
			
			
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
	
		ex03();
		
	}


}

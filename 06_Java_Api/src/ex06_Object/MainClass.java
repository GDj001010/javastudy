package ex06_Object;

public class MainClass {
	
	/*
		java.lang.Object 클래스			java.lang 패키지에 포함된 클래스들은 임폴트(import) 필요가 없음
		1. 모든 클래스의 최상위 슈퍼 클래스이다.
		2. 별도의 슈퍼 클래스를 명시하지 않는 경우 Object 클래스가 슈퍼 클래스이다.
		3. 모든 것을 저장할 수 있는 만능 타입이다.		(Object <- Person <- Student <- Alba)
													 최상위 부모    부모      자식      후손 자식
	 	4. Object 타입으로 저장된 객체는 Object 클래스의 메소드만 호출할 수 있으므로 다시 원래 객체의 타입으로 캐스팅해서 사용해야 된다.
	 	
	*/
	/*
		Object 클래스의 주요 메소드
		1. equals	: 동등 비교할 때 사용하는 메소드  (같다, 다르다)
			1) 동등 비교할 때 사용하는 메소드
			2) 동등 비교하는 객체들의 참조값을 비교함 - 객체의 값(데이터)를 비교하지 못함
			3) 객체의 값으로 동등 비교를 수행하기 위해서는 equals 메소드를 다시 만들어야 한다.  "Override 해야 한다."  기억하기
		2. toSting	: 문자열로 변환할 때 사용하는 메소드
			1) "객체이름 + @ + 참조값" 형식으로 변환함
			2) 원하는 형식으로 변경하려면 toString 메소드를 다시 만든다. 		"Override 해야 한다."  기억하기
	*/
		
		
	public static void ex01() {
		
		Object person = new Person();		// Object 클래스는 모든 객체를 저장할 수 있다.
		
		
		// Object 타입이지만 실제론 Person 타입이냐 묻는 것
		if(person instanceof Person) {
			((Person) person).eat();		//  person.  <- 하면 자동으로 다운 캐스팅 되는 코드 나옴
			((Person) person).sleep();		//  			Object 객체는 사용하기 위해서 항상 캐스팅해야 한다.
		}
		
	}
	
	public static void ex02() {
		
		// name이 같으면 같은 Person으로 처리하기로 한 시스템
		
		Person person1 = new Person("홍길동");
		Person person2 = new Person("홍길동");
		
		if(person1.equals(person2)) {				// 참조값을 비교하기 때문에 서로 다른 객체여서 다른 Person이 나온다.
			System.out.println("같은 Person 이다.");
		}else {
			System.out.println("다른 Person 이다.");
			
		}
		
		System.out.println(person1.getName());		// get 해주는 이유 : 홍길동이 나옴
		System.out.println(person2.getName());		// get 해주는 이유 : 홍길동이 나옴
		
		System.out.println(person1);				// person1 객체의 참조값이 나옴
		
		
	}
	
	public static void ex03() {
		
		Person person = new Person("홍길동");
		
		
		System.out.println(person.toString());				// 오버라이드 안 해주면 "객체이름 + @ + 참조값" 형식으로 변환함
		
		System.out.println(person);							// toString 메소드는 호출을 생략함
		
		
		
	}
	
	public static void main(String[] args) {
		
		ex01();
		
	}

}

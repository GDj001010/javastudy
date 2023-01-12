package ex10_static;

public class MainClass {

	public static void main(String[] args) {
	
		// 모든 객체는 참조타입
		
		// static : 클래스 기반에 객체들을 하나에 모아서 공유
		// static 요소는 객체를 이용해서 호출할수 있으나, 권장하지 않는다.
		
		
		// static 요소는 클래스를 이용해서 호출하는 것이 권장이다.
		
		// MyMath myMath = new MyMath();  호출을 안 함
		
		System.out.println(MyMath.PI);
		
		System.out.println(MyMath.getCircleArea(1.5));
		
		System.out.println(MyMath.max(1.1, 2.2, 3.3));
		System.out.println(MyMath.max(1.1, 2.2, 3.3, 4.4));
		System.out.println(MyMath.max(1.1, 2.2, 3.3, 4.4, 5.5));	// 최대값
		
		System.out.println(MyMath.min(3.3, 4.4, 5.5, 1.1));
		System.out.println(MyMath.min(3.3, 4.4, 5.5, 2.2, 7.7));
		System.out.println(MyMath.min(3.3, 4.4, 5.5, 9.9));   		// 최소값
		
		
		// System.out.println(MyMath.class);
	}
	
}

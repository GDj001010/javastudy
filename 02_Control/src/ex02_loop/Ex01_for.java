package ex02_loop;

public class Ex01_for {
	
		/*
		 
		 	for문
		 	1. 연속된 숫자를 생성하는 반복문(배열에서 주로 사용)
		 	2. 형식    1        2       4
		 		for(초기문; 조건문; 증감문(증감또는 감소) {     
		               3
		            실행문     2, 3, 4 에서 loop(반복)이 실행 됨   실행순서 1 - 2 - 3 - 4
		        }                                                          초기 조건 실행 증감
		 */
	
	public static void ex01() {
		
		// 1 ~ 10
		// 연속된 숫자를 생성하는 반복문은 여러가지 방법이 있다.
		
		            // a가 10보다 작은지 확인
		for(int a = 1; a <= 10; ++a) {  // ++a, a++ 다 사용 가능
			System.out.println(a);
		}
		
	}

	public static void ex02() {
	
		// 횟수(5번)  개발자들은 0부터 시작을 선호함

		int count = 5;
		
		for(int a = 0; a < count; a++) {
			System.out.println("Hello World");
		}
		
	}
	
	public static void ex03() {
		
		// 10 ~ 1

		for(int a = 10; a > 0; a--) {
			System.out.println(a);
		}
	
	}
	
	public static void ex04() {
		
		// 구구단 2단 출력
		// 2 * 1 = 2
		// 2 * 2 = 4
		
		int a = 2;
		
		for(int b = 1; b < 10; b++) {
			int result = a * b;
			System.out.println(a + "X" + b + "=" + result);
			
			/*
			
			int dan = 2;     이 곳에 원하는 구구단을 넣으면 모든 구구단 식이 된다.
			
			for(int a = 1; a <= 9; a++) {
			System.out.println(dan + "x" + a + "=" + (dan * a))
			*/
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		ex04();

	}

}

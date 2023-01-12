package ex05_ellipsis;

public class MainClass {
	
	public static void ex01() {
		
		// Calculator 객체 선언 + 생성
		Calculator calc = new Calculator();
		
		System.out.println(calc.addition(1.1, 2.2));
		System.out.println(calc.addition(1.1, 2.2, 3.3));
		System.out.println(calc.addition(1.1, 2.2, 3.3, 4.4));
		System.out.println(calc.addition(1.1, 2.2, 3.3, 4.4, 5.5));
	}
	
	public static void ex02() {  // 연습
		
		Calculator calc = new Calculator();
		
		double[] add = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		double a = calc.addition(add);
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		ex02();
		
	
		
		
	}

}

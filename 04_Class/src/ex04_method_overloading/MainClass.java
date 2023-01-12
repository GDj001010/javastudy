package ex04_method_overloading;

public class MainClass {

	public static void ex01() {
		
	// Calculator 객체 선언
	Calculator calc;
	
	// Calculator 객체 생성
	calc = new Calculator();
	
	// addition(double a, double b) 호출
	
	double result = calc.addition(1.5, 2.5);
	System.out.println(result);
	
	
	// addition(double[] numbers) 호출
	
	double[] arr = {1.1, 2.2, 3.3};
	double result2 = calc.addition(arr);
	System.out.println(result2);
	
	}
	
	public static void ex02() {
		
		Calculator calc = new Calculator();
		
		double a = calc.addition(1.5, 2.5);
		System.out.println(a);
		
		double[] add = {1.5, 1.8, 3.4, 6.9};
		double b = calc.addition(add);
		System.out.println(b);
		
	}
	
		
		
		
	
	public static void main(String[] args) {
		
		ex02();

	}

}

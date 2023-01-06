package ex05_op_condition;

public class MainClass {

	// 단항 : ++a, --a !(not)
	// 이항 : a + b,  "a + b + c"   << a와 b가 먼저 연산 되고 그 뒤에 b와 c가 연산 되어 이항 연산임
	
	
	public static void ex01() {
	
		int a = 3;
		int b = 4;
		
		boolean result1 = a > b;    // 크다
		boolean result2 = a >= b;   // 크거나 같다
		boolean result3 = a < b;    // 작다
		boolean result4 = a <= b;   // 작거나 같다
		boolean result5 = a == b;   // 같다
		boolean result6 = a != b;   // 같지 않다
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		
	}
	
	public static void ex02() {
		
		// 논리 연산
		// 1. 논리 and : &&, 모든 조건이 true이면 true, 아니면 false
		// 2. 논리 or  : ||, 하나의 조건이라도 true이면 true, 아니면 false
		// 3. 논리 not : ! , 조건이 true이면 false, 조건이 false이면 true
		
		int a = 10;
		int b = 10;
		
		boolean result1 = (a == 10) && (b == 10);
		boolean result2 = (a == 10) && (b == 20);
		
		System.out.println(result1);
		System.out.println(result2);
		
		boolean result3 = (a == 10) || (b == 10);
		boolean result4 = (a == 10) || (b == 20);
		
		System.out.println(result3);
		System.out.println(result4);
		
		boolean result5 = !(a == 10);
		boolean result6 = !(a == 20);
		
		System.out.println(result5);
		System.out.println(result6);
		
		
	}
	
	public static void ex03() {
		
		// Short Circuit Evaluation
		// 1. 논리 and의 경우 조건의 결과가 false인 경우가 발생하면더 이상 동작하지 않는다 최종 결과가 false로 정해졌기 때문이다.
		// 2. 논리  or의 경우 조건의 결과가 true인 경우가 발생하면 더 이상 동작하지 않는다 최종 결과가 true로 정해졌기 때문이다.
		
		int a = 10;
		int b = 10;
		
		boolean result1 = (a == 20) && (++b == 11);  // a가 false가 나오면서 그 뒤에 연산은 시작 되지 않음
		
		System.out.println(result1);
		System.out.println(b);
		
		boolean result2 = (a == 10) || (++b == 11);  // a가 true가 나오면서 그 뒤 연산은 시작 되지 않음 
		
		System.out.println(result2);
		System.out.println(b);
		
		
	}

	public static void ex04() { // 연습

		int score = 75;
		
		boolean result = (score >= 70) && (score < 80); // 70점대는 true 아니면 false
		
		System.out.println(result);
		
		boolean result2 = (score / 10) == 7; // 70점대는 true 아니면 false
		
		System.out.println(result2);
		
	}
	
	public static void ex05() {
		
		// 조건 연산
		// (조건식) ? true 일 때 처리 : false 일 때 처리
		
		int score = 80; // 60점 미안일 때 불합격
		
		String result = (score >= 60) ? "합격" : "불합격";  //  3항 연산자 (연산자에 필요한 요소가 3항 필요)
		//                 1               2        3
		System.out.println(result);	
		
		
	}
	
	public static void ex06() {  // 연습
		
		int n = 2;
		
		String result = (n % 2 == 0) ? "짝수" : "홀수";   // 짝수, 홀수
		
		System.out.println(result);
		
	}
	
	public static void ex07() {  // 연습
		
		
		int n = 1;     // 변수값이 0일시 나머지가 0이기 때문에 3의 배수라고 생각함
		
		// String result = (n % 3 == 0) ? "3의 배수" : (n % 2 == 0) ? "짝수" : "홀수";  ---  짝수면 짝수 홀수면 홀수 3의 배수는 3의 배수
		String result1 = (n != 0 && n % 3 == 0) ? "3의 배수" : (n % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(result1);
		
	}
	
	
	
	public static void main(String[] args) {
		
		ex03();
		

	}

}

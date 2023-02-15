package test;

public class test_test {
	
	public static void ex01() {
		
		// 문제1. int serial의 첫 번째 글자가 1,3,5이면 "남자" 2,4,6이면 "여자"를 출력
		// int serial의 첫 번째 글자는 항상 1~6 사이의 정수라고 가정한다
		// 예시
		// 남자입니다
		
		int serial = 3;
		
		if(serial % 2 == 1) {
			System.out.println("남자입니다");
		}
		else {
			System.out.println("여자입니다");
		}
		
	}
		
	public static void ex02() {
			
			
			// 문제3. 구구단을 모두 출력하지 말고 5x5=25까지만 출력하시오
			// 예시
			// 2x1=2
			// 2x2=4
			// ...
			// 5x5=25
			
			
			for(int i = 2; i < 6; i++) {	
				for(int j = 1; j < 10; j++) {
					if(i*j == 30) {
						break;
					}
					System.out.println(i + "x" + j + "= " + i*j);
				}
			}
		
	}
	
	public static void ex03() {
			
			
			// 문제5. 1부터 100 사이의 모든 짝수와 홀수를 각각 더한 결과를 모두 출력하시오.
			// 예시
			// 짝수 합은 2550입니다
			// 홀수 합은 2500입니다
			
			int holl = 0;
			int jjac = 0;
			
			for(int i = 1; i < 101; i++) {
				if(i % 2 == 0) {
					jjac += i;
				}
				else {
					holl += i;
				}
				
			}
			
			System.out.println("짝수 합은: " + jjac + "입니다");
			System.out.println("홀수 합은: " + holl + "입니다");
			
			
		}
		
	public static void ex04() {
		/*
		제한이형 버전  
		
		for(int i = 2; i <= 5; i++) {
			for(int k = 1; k <= 9; k++) {
				if(i==5 && k == 6) {
					break;
				}
				System.out.println(i + "x" + k + "=" + (i*k));
			}
		}
		
	}
		
		*/
	}
		
	public static void ex05(){
	
		int idx = 3;
		
		int deletecar = (int)(Math.random() * idx);
		
		System.out.println(deletecar);
		
	}

	public static void ex06() {
		
		
		
	}
	public static void main(String[] args) {
		
		ex05();

	}

}

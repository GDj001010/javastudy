package ex02_loop;

public class Ex04_continue {

	/*
 		continue문 ( 계속 하시오 )
 		1. 반복문을 계속 하시오
 		2. 반복문의 실행 시작 지점부터 다시 실행
 		3. 어떤 코드를 "제외"하고 반복문을 실행하고 싶을 때 사용
	*/
	
	public static void ex01() {
		
		// 1 ~ 50 사이에서 4의 배수를 제외하고 출력하기
		
		for(int a = 1; a < 50; a++) {
			
			if(a % 4 == 0) {
				continue;
			}
			
			System.out.println(a);
		}
		
	}
	
	public static void main(String[] args) {
		
		ex01();

	}

}

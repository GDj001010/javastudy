package ex02_finally;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// finally 블록
		// 항상 마지막에 실행되는 블록으로 생략할 수 있다.
/*		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("나이를 입력하세요 >>>");
			
			int age = sc.nextInt();
			
			System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");
			sc.close();
		}catch(Exception e) {
			System.out.println("예외 상황 발생");
		}
	*/	
		
		Scanner sc = null;		// 모든 블록에서 사용 가능하도록 위에서 선언
		
		try {
			 sc = new Scanner(System.in);		// 생성 - 선언과 생성 분리
			System.out.println("나이를 입력하세요 >>>");
			int age = sc.nextInt();
			System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");
		}catch(Exception e) {
			System.out.println("예외 상황 발생");
		}finally{
			sc.close();							// finally 블록은 자원(resource)을 반납할 때 주로 사용한다.
		}

	}
	
	
	
}

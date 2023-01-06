package ex01_branch;

public class Ex01_if {
	
	public static void ex01() {
	
	// if 문
	
		int score = 55;
			
		if(score >= 60) {
				System.out.println("합격");
		}
		if(score < 60) {
				System.out.println("불합격");
		}
		
	}
	
	public static void ex02() {
		
		// ;은 문장의 맞침표
		// if 문의 중괄호
		// 실행문이 1개인 경우 중괄호를 생략할 수 있다.
		// 실행문이 2개 이상인 경우 중괄호가 반드시 필요하다.
		
		int score = 80;
		
		if(score >= 60) {
			System.out.println("합격");
		    System.out.println("축하합니다");  // 중괄호를 안 해주면 "축하합니다", "보충수업입니다"는 무조건 나옴, if문의 적용범위는 아래 한 줄
		}
		    
		if(score < 60) {
			System.out.println("불합격");
		    System.out.println("보충수업입니다.");
		}
	}

	public static void main(String[] args) {
		
		ex02();
		
	}

}

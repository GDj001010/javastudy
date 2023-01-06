package ex01_branch;

public class Ex02_else {
	
	public static void main(String[] args) {
		

		int score = 50;
		
		if(score >= 60) {
			System.out.println("합격");
		    System.out.println("축하합니다");  // 중괄호를 안 해주면 "축하합니다", "보충수업입니다"는 무조건 나옴, if문의 적용범위는 아래 한 줄
		}
		    
		else {
			System.out.println("불합격");
		    System.out.println("보충수업입니다.");
		}
		
	}

}

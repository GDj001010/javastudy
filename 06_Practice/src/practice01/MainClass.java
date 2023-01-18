package practice01;

public class MainClass {

	// 문제1. 가위바위보
	// 실행
	// 가위바위보 >>> 가위
	// 당신은 가위, 컴퓨터는 보, 이겼습니다.
	// Hint : 가위는 0, 바위는 1, 보는 2로 처리한다.
	public static void ex01() {
		
		int me = 0;
		int com = 2;
		
		String[] strarr = {"가위", "바위", "보"};
		

		if(me == 0 && com == 2) {
			System.out.println("user" + strarr[me] + "computer" + strarr[com] + "이겼습니다.");
		}
		
		
		
		
		
			
		

		
		
	}
	
	public static void main(String[] args) {
		
		ex01();

	}

}

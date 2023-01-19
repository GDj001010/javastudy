package practice01;

import java.util.Scanner;

public class MainClass {

	// 문제1. 가위바위보
	// 실행
	// 가위바위보 >>> 가위
	// 당신은 가위, 컴퓨터는 보, 이겼습니다.
	// Hint : 가위는 0, 바위는 1, 보는 2로 처리한다.
	public static void ex01() {
		

		
		String[] strarr = {"가위", "바위", "보"};
		
		int com = (int)(Math.random() * 3);		// 컴퓨터가 랜덤으로 가위바위보를 한다
		
		Scanner sc = new Scanner(System.in);	// user가 가위바위보를 내는 걸 입력
		System.out.println("가위바위보 >>>");
		int user = 0;
		switch(sc.next()) {
		case "가위": user = 0; break;
		case "바위": user = 1; break;
		default : user = 2;						// user의 입력 값을 숫자로 변형
		}
		String result = null;
		switch(user - com) {
		case 0: result = "비겼습니다."; 
			break;
		case -2: 
		case 1: result = "이겼습니다.";
			break;
		default : result = "졌습니다.";
		}
		System.out.println("당신은: " + strarr[user] + " 컴퓨터는: " + strarr[com] + " " + result);
		
		
	}
	
	// 문제2. 친구 3명을 저장할 수 있는 배열을 생성하고 임의의 값으로 초기화하시오.
	// 새로 사귄 친구의 수를 입력 받아서 기존 친구들이 저장된 배열의 길이를 새로 사귄 친구의 수만큼 늘리시오.
	public static void ex02() {
		
		String[] strPd = {"정빈", "지훈", "동형"};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("새로 사귄 친구 >>>");
		int count = sc.nextInt();
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		ex02();

	}

}

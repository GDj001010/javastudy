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
	
	public static void ex02() {
		
		String[] player = {"가위", "바위", "보"};
		
		int com = (int)(Math.random() * 3);
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 >>>");
		
		int user = 0;
		switch(sc.next()) {
		case "가위" : user = 0;
			break;
		case "바위" : user = 1;
			break;
		default : user = 2;
		}
		
		String result = null;
		switch(user - com) {
		case 0 : result = "비겼습니다.";
		case -1 :
		case 2 : result = "졌습니다.";
		default : result = "이겼습니다.";
		}
		System.out.println("당신은: " + player[user] + " 컴퓨터는: " + player[com] + " " + result);
		
	}
	
	public static void main(String[] args) {
		
		ex02();

	}

}

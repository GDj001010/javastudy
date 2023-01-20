package practice01;

import java.util.ArrayList;
import java.util.List;
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
		
		String[] strPd = {"뿌뿌", "뽀뽀", "빠삐"};
		Scanner sc = new Scanner(System.in);
		System.out.println("새로 사귄 친구 >>>");
		int count = sc.nextInt();
		String[] result = new String[strPd.length + count];
		for(int i = 0; i < strPd.length; i++) {
			result[i] = strPd[i];
		}
		strPd = result;
		System.out.println(strPd.length);
		for(int j = 0; j < strPd.length; j++) {
			System.out.println(strPd[j]);
		}
		sc.close();
	
	}
	
	// 문제3. Scanner 클래스의 next() 메소드를 이용해서 사용자로부터 문자열을 계속 입력 받는다.
	// 사용자가 "종료" 문자열을 입력하면 더 이상 입력 받지 않는다.
	// 총 몇 번만에 종료되었는지 그 횟수를 마지막에 출력한다.
	public static void ex03() {
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ex03();

	}

}

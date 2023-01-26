package practice01;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
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
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String a = "";
		
		while(!a.equals("종료")) {
			System.out.println("입력하시오 >>>");
			a = sc.next();
			count++;
			
		}
		System.out.println("입력된 숫자는: " + count + " 회 입니다.");
		sc.close();
	}
	
	// 문제4. 퀴즈 정답을 맞힐때까지 계속 퀴즈를 내시오.
	// 질문 : 대한민국의 수도는? >>> 서울
	// 정답입니다.
	// 질문 : 대한민국의 수도는? >>> seoul
	// 정답입니다.
	// 질문 : 대한민국의 수도는? >>> 인천
	// 오답입니다.
	
	public static void ex04() {
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		while(!str.equals("서울")) {
			System.out.println("대한민국의 수도는? >>>");
			str = sc.next();
			if(!str.equals("서울")) {
				System.out.println("오답입니다.");
			}
			
			
		}
		System.out.println("정답입니다.");
		sc.close();
		
	}
	
	// 문제5. 평점 입력 받아서 해당 평점만큼 ★을 출력하시오.
	// 평점은 1 ~ 5 사이 정수로 입력 받는데, 벗어난 범위는 다시 입력 받는다.
	public static void ex05() {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		do {
			System.out.println("평점(1~5) >>>");
			a = sc.nextInt();
		}while(a < 1 || a > 5);
		for(int count = 0; count < a; count++) {
			sb.append("★");
			
		}
		String star = sb.toString();
		System.out.println(star);
		sc.close();
		
		
		
	}
	
	
	// 문제6. 비밀번호를 "1234"로 가정한다.
	// 사용자로부터 비밀번호를 입력 받아서 "1234"와 같으면 "성공", "1234"가 아니면 다시 비밀번호를 입력 받도록 처리하시오.
	// 비밀번호 입력은 최대 5번으로 제한하고, 5번의 입력이 모두 틀리면 최종적으로 "실패"를 출력하시오.
	public static void ex06() {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int pw = 0;
		
		do {
			System.out.println("비밀번호를 입력하시오. >>>");
			pw = sc.nextInt();
			count++;
			if(count == 5) {
				System.out.println("실패");
				return;
			}
		}while(pw != 1234);
		
		
		
		System.out.println("성공");
		sc.close();
		
	}
	
	
	// 문제7. 구구단을 외자.
	// 2~9단 사이의 임의의 구구단이 출력되면 정답을 입력한다.
	// 정답을 입력해서 맞으면 "정답", 틀리면 "땡"을 출력하시오.
	// 예시1)
	// 4x9? >>> 36
	// 정답
	// 예시2)
	// 8x7? >>> 49
	// 땡
	public static void ex07() {
		
		int dan = (int)((Math.random() * 8) + 2);
		int n = (int)((Math.random() * 9) + 1);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(dan + "X" + n + " = >>>");
		int result = sc.nextInt();
		System.out.println(dan * n == result ? "정답" : "오답");
		
		
		
	}
	
	
	// 문제8. 임의의 주민등록번호(personalId)를 분석하여 나이와 성별을 출력하시오.
	// 나이 : 현재년도 - 태어난년도 + 1
	// 성별 : 하이픈(-) 뒤의 글자가 1,3이면 "남자", 2,4이면 "여자"
	// 예시)
	// 28살 여자입니다.
	public static void ex08() {

		Calendar calendar = Calendar.getInstance();
		String personAge = "961010-2843198";
		int nowYear = calendar.get(Calendar.YEAR);
		String gender = "";
		
		switch(Integer.parseInt(personAge.substring(7, 8))) {
		case 1:
		case 2: gender = 19 + personAge.substring(0, 2);
		break;
		case 3:
		case 4: gender = 20 + personAge.substring(0, 2);
		break;
		}
		
		int age = nowYear - Integer.parseInt(gender);
		String mow = "";
		
		System.out.println(age + "살" + "여자" + "남자");
		
		
		
	}
	
	public static void main(String[] args) {
		
		ex08();

	}

}

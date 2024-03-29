package practice01;


import java.util.Calendar;
import java.util.Scanner;


public class MainClass {

	// 문제1. 가위바위보
	// 실행
	// 가위바위보 >>> 가위
	// 당신은 가위, 컴퓨터는 보, 이겼습니다.
	// Hint : 가위는 0, 바위는 1, 보는 2로 처리한다.
	public static void ex01() {
	
		String[] str = {"가위", "바위", "보"};
		int com = (int)(Math.random() * 3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보! : >>>");
		int user = 0;
		switch(sc.next()) {
		case "가위" : user = 0;
		break;
		case "바위" : user = 1;
		break;
		default : user = 2;
		}
		String com1 = str[com];
		String user1 = str[user];
		
		
		
		switch(user - com) {
		case 0 	: System.out.println(user1 + " : " + com1 + " : 비겼습니다.");
		break;
		case -2 :
		case 1 	: System.out.println(user1 + " : " + com1 + " : 이겼습니다.");
		break;
		default : System.out.println(user1 + " : " + com1 + " : 졌습니다.");
		}
		sc.close();
		
		
	}
	
	// 문제2. 친구 3명을 저장할 수 있는 배열을 생성하고 임의의 값으로 초기화하시오.
	// 새로 사귄 친구의 수를 입력 받아서 기존 친구들이 저장된 배열의 길이를 새로 사귄 친구의 수만큼 늘리시오.
	public static void ex02() {
		
		String[] frends = {"지훈", "소연", "준서"};
		Scanner sc = new Scanner(System.in);
		System.out.println("새로사귄 친구 수 : >>>");
		int newfrend = sc.nextInt();
		String[] newfrends = new String[frends.length + newfrend];
		for(int i = 0; i < frends.length; i++) {
			newfrends[i] = frends[i];
		}
		frends = newfrends;
		for(int j = 0; j < frends.length; j++) {
			System.out.println(frends[j]);
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
		
		sc.close();
		
	}
	
	
	// 문제8. 임의의 주민등록번호(personalId)를 분석하여 나이와 성별을 출력하시오.
	// 나이 : 현재년도 - 태어난년도 + 1
	// 성별 : 하이픈(-) 뒤의 글자가 1,3이면 "남자", 2,4이면 "여자"
	// 예시)
	// 28살 여자입니다.
	public static void ex08() {

		Calendar calendar = Calendar.getInstance();
		String personAge = "000711-457936";
		
		int year = calendar.get(Calendar.YEAR);
		int genderNo = Integer.parseInt(personAge.substring(7, 8));
		String birthYear = "";
		
		switch(genderNo) {
		case 1:
		case 2: birthYear = 19 + personAge.substring(0, 2);
		break;
		case 3:
		case 4: birthYear = 20 + personAge.substring(0, 2);
		break;
		}
		
		int age = (year - Integer.parseInt(birthYear)) + 1;
		String gender = "";
		if(genderNo % 2 == 1) {
			gender = "남자";
		}else {
			gender = "여자";
		}
		System.out.println(age + "살" + gender + "입니다.");
		System.out.println(Integer.parseInt(birthYear));
		
	}
	
	// 문제9. 다음 기준에 따라서 파일명을 변환하시오.
	// Scanner 클래스의 next() 메소드를 이용해서 파일명을 입력 받은 뒤 파일명을 다음과 같이 수정하시오.
	// 파일명 마지막에 밑줄(_)과 타임스탬프 값을 붙이시오.
	// 예시)
	// 변환 전 파일명 >>> happy.jpg
	// 변환 후 파일명 = happy_1658792128410.jpg
	public static void ex09() {
		
		
		
		
		
	}
	
	// 문제10. Scanner 클래스의 next() 메소드를 이용해서 사람 이름을 입력 받은 뒤
	// 친구의 이름이면 "반갑다 친구야"를 출력하고, 모르는 사람의 이름이면 "처음 뵙겠습니다"를 출력하시오.
	// 친구의 이름을 String[] friend 배열에 저장한 뒤 작업을 수행하시오.
	// 예시1
	// 이름 입력 >>> 정우성
	// 반갑다 친구야
	// 예시2
	// 이름 입력 >>> 유재석
	// 처음 뵙겠습니다
	public static void ex10() {
		
		String[] frends = {"유재석", "정우성", "안영미"};
		Scanner sc = new Scanner(System.in);
		System.out.println("친구 이름: >>>");
		String frend = sc.next();
		
		for(int i = 0; i < frends.length; i++) {
			if(frend.equals(frends[i])) {
				System.out.println("반갑다 친구야.");
				return;
			}
		}
		System.out.println("처음 뵙겠습니다.");
		sc.close();
		
	}
	
	public static void main(String[] args) {
		
		ex01();

	}

}



























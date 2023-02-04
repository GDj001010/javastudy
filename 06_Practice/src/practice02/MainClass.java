package practice02;

import java.util.Scanner;


public class MainClass {

	// 문제1. 통장(balance)에 최초 5000원이 있다.
		// 1원부터 통장 잔고 사이의 난수를 발생시켜서 해당 난수만큼 출금 처리하시오.
		// 더 이상 출금이 불가능한 상황이면 출금을 멈추시오.
		// 예시)
		// 출금 전 5000원, 1회 출금액 2917원, 출금 후 2083원
		// 출금 전 2083원, 2회 출금액 1961원, 출금 후 122원
		// 출금 전 122원, 3회 출금액 102원, 출금 후 20원
		// 출금 전 20원, 4회 출금액 2원, 출금 후 18원
		// 출금 전 18원, 5회 출금액 17원, 출금 후 1원
		// 출금 전 1원, 6회 출금액 1원, 출금 후 0원
	public static void ex01() {
		
		int balance = 5000;
		int count = 0;
		while(balance > 0) {
			int ran = (int)(Math.random() * balance) + 1;
			count++;
			System.out.println("출금 전: " + balance + "원, " + count + "회 출금액" + ran + "원, 출금 후" + (balance - ran) + "원");
			balance -= ran;
		}
		
		
	}
	
	// 문제2. UpDown 게임
		// 1 ~ 10000 사이의 난수를 발생시키고 해당 난수를 사용자가 맞히는 게임이다.
		// 입력마다 "Up!", "Down!" 메시지를 출력하시오.
		// 예시)
		// 입력 >>> 5000
		// Down!
		// 입력 >>> 2500
		// Up!
		// ...
		// 입력 >>> 4500
		// 정답. 총 5번만에 성공.
	public static void ex02() {
		
		int ran = (int)(Math.random() * 10000) +1;
		int count = 0;
		int a = 0;
		Scanner sc = new Scanner(System.in);
		while(count != 5) {
			System.out.println("숫자를 입력하세요 >>>");
			a = sc.nextInt();
			if(a < 0 || a > 10000) {
				System.out.println("1 ~ 10000 사이에 숫자만 입력 가능합니다.");
				continue;
			}
			if(ran == a) {
				System.out.println(count + "회 만에 정답입니다!");
				return;
			}else if(ran > a){
				System.out.println("UP!");
			}else {
				System.out.println("DOWN!");
			}
			count++;
		}
		System.out.println("5회동안 정답을 못 맞췄습니다.");
		
	}
	
	// 문제3. 자동으로 진행되는 윷 던지기를 구현하시오. 윷이나 모가 나오면 추가로 던지시오.
		// 예시)
		// "도", 1칸 이동한다.
		// "개", 2칸 이동한다.
		// "걸", 3칸 이동한다.
		// "윷", "도", 5칸 이동한다.
		// "모", "윷", "도", 10칸 이동한다.
	public static void ex03() {
		
		String[] str = {"", "도","개","걸","윷","모"};
		int move = 0;
		while(true) {
			int ran = (int)(Math.random() * 5) +1;
			System.out.print("\"" + str[ran] + "\""); 
			move += ran;
			if(ran <= 3) {
				System.out.print(move + "칸 이동한다.");
				break;
			}else {
				System.out.print(",");
			}
			
		}
		
		
	}
	
	// 문제4. 0~9 사이 난수를 100개 생성하시오.
		// 발생한 0~9 사이의 각 난수들이 생성된 횟수(빈도수)를 그래프화 하여 출력하시오.
		// 예시)
		// 0 : #### 4
		// 1 : ############ 12
		// 2 : ############ 12
		// 3 : ##### 5
		// 4 : ######## 8
		// 5 : ########### 11
		// 6 : ############ 12
		// 7 : ################## 18
		// 8 : ####### 7
		// 9 : ########### 11
	public static void ex04() {
		
		
		
		
	}
	public static void main(String[] args) {
		
		ex03();

	}

}

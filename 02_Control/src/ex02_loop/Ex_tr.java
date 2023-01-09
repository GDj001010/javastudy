package ex02_loop;

public class Ex_tr {

	// 예제 1번 ~ 4번 for문
	public static void ex01() {
		
		for(int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		
	}

	public static void ex02() {
		
		int a = 5;
		for(int b = 0; b < a; b++) {
			System.out.println("Hello World");
		}
		
	}
	
	public static void ex03() {
		
		for(int a = 10; a > 0; a--) {
			System.out.println(a);
		}
		
	}
	
	public static void ex04() {
		
		int a = 1;
		for(int b = 2; a < 10; a++) {
			System.out.println(b + "x" + a + "=" + b * a);
		}
		
	}
	
	// 에제 5번 ~ 6번 while문
	public static void ex05() {
		
		int a = 1;
		while(a < 11) {
			System.out.println(a);
			a++;
		}
		
	}
	
	public static void ex06() {
		
		
		int account = 85000;
		int money = 550;
		int n = 0;
		while(account >= 550) {
			
			account -= money;
			n++;
			System.out.println(n + "번째 출금액:" + money + " 출금 계좌: " + account);
		}
			
		
		
		
	}

	
	// 예제 7 ~ 8번 break문
	public static void ex07() {
		
		int a = 1;
		
		while(true){
			if(a > 10) {
				break;
			}
			System.out.println("a");
			a++;
		}
		
		
	}
	
	public static void ex08() {
		
		int money = 60;
		int total = 0;
		int n = 0;
		int t = 100000;
		
		while(true) {
			if(total >= t) {
				break;
			}
			total += money;
			System.out.println(++n + "회 모금액:" + total + "원");
		}
		
	}
	
	public static void ex09() {
		
		for(int b = 1; b <= 50; b++) {
			if(b % 4 == 0) {
				continue;
			}
			System.out.println(b);
		}
		
	}
	
	public static void main(String[] args) {
		
		ex09();

	}

}

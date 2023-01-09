package ex02_loop;

public class Ex_tr {

	// 예제 1번 ~ 4번 for문
	public static void ex01() {
		
		for(int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		
	}

	public static void ex02() {  // 개발자들은 0부터 하는 것을 선호함.

		
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

	
	// 예제 7 ~ 8번 break문  // 무한루프는 주로 while(true) 로 사용
	// break는 for, while, switch에 사용
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

	// 예제 9번 continue문
	public static void ex09() {
		
		for(int b = 1; b <= 50; b++) {
			if(b % 4 == 0) {
				continue;
			}
			System.out.println(b);
		}
		
	}

	// 예제 10번 ~ 13번 nested_loop(반복 안에 중첩 반복)문
	public static void ex10() {
	
		for(int a = 1; a < 6; a++) {
			for(int b = 1; b < 9; b++) {
				System.out.println(a + "일차" + b + "교시 수업");
			}
		}
		
	}
	
	public static void ex11() {
		
		int a = 1;
		while(a < 6) {
			int b = 1;
			while(b < 9) {
				System.out.println(a + "일차" + b + "교시 수업");
				b++;  //  출력 후 b++ 이 되면서 b가 9보다 커지거나 같아질 때까지 돈 뒤
			}
			a++;  // a++ 이 되면서 a가 6보다 커지거나 같아질 때까지 두번 째 while문 무한 반복
		}
		
	}

	public static void ex12() {
		/*
		int a = 2;
		int result;
		while(a < 10) {
			int b = 1;
			while(b < 10) {
				result = a * b;
				System.out.println(a + "x" + b + "=" + result);
				b++;
			}
			a++;
			
		}
		*/
		
		for(int a = 2; a < 10; a++) {
			for(int b = 1; b < 10; b++) {
				System.out.println(a + "x" + b + "=" + (a*b));
			}
		}
		
	}

	public static void ex13() {
		
		for(int a = 1; a < 10; a++) {
			for(int b = 2; b < 10; b++){
				System.out.print(b + "x" + a + "=" + (b * a) + "\t");
			}
			System.out.println();
		}
		
	}
	
	// 배열
	public static void ex14() {
		
		int[] arr = new int[5];  // 참조값에 들어있는 인덱스값들은 자동 0으로 초기화
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
	}
	
	public static void ex15() {  // 대부분 조합코드를 이렇게 짬
		
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void ex16() {
		
		int[] arr = new int[5];
		
		arr[0] = 100;
		arr[1] = 83;
		arr[2] = 95;
		arr[3] = 76;
		arr[4] = 70;
		
		int total = 0;
		int max = 0;
		int min = 100;
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("합계: " + total + "점");
		System.out.println("평균: " + (double)total / arr.length + "점");
		System.out.println("최대: " + max + "점"); 
		System.out.println("최소: " + min + "점"); 
	}
	
	public static void main(String[] args) {
		
		ex16();

	}

}

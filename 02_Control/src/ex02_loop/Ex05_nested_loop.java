package ex02_loop;

public class Ex05_nested_loop {

	/*
 		nested_loop  - 중첩 for문
 		*/
	
	public static void ex01() {
		
		for(int day = 1; day <= 5; day++){
 	 		for(int hour = 1; hour <= 8; hour++) {
 	 			System.out.println(day + "일차" + hour + "교시 수업");

 		} 	
	}
		
}
	
	public static void ex02() {
		
		int day = 1;
		while(day <= 5) {
			
			int hour = 1;
			while(hour <= 8) {
				
				System.out.println(day + "일차 " + hour + "교시 수업");
				hour++;
			}
			
			day++;   // day가 1일 때 hour 8번 돌아간 뒤 day++로 2번째 반복
			
		}
		
		
	}
	
	public static void ex03() {
		
		// 전체 구구단 출력하기
		// 2 x 1 = 2
		// ...
		// 9 x 9 = 81
		
		 	for(int dan = 2; dan <= 9; dan++) {
		 		for(int n = 1; n <= 9; n++) {
		 			System.out.println(dan + "x" + n + "=" + (dan * n));
	}
}
		 			
		 /*
		내가 한 거
		int a = 2;
		while(a < 10) {
			
			int b = 1;
			while(b < 10) {
				System.out.println(a + "x" + b + "=" + (a * b));
				b++;
			}
			a++;
		
	}
	*/
}
	
	public static void ex04() {
		
		// 전체 구구단 출력하기
		// 2x1=2  3x1=3 4x1=4 ... 9x1= 9
		// ...
		// 2x9=18 3x9=27 4x9=36... 9x9=81
		
		
		/*
		내가 한 거
		int a = 1;
		while(a < 10) {
			
			int b = 2;
			while(b < 10) {
				System.out.println(b + "x" + a + "=" + (a*b));
				b++;
			}
			a++;
		}
		*/
		
		for(int n = 1; n <= 9; n++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "x" + n + "=" + (dan * n) + "\t");
				
			}
			System.out.println();  // 공백 - 줄바꿈
		}
		
		
	}
		
	public static void main(String[] args) {
		
		ex03();

	}

}

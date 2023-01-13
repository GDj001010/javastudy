package exam;

public class MainClass {

	// 문제1. int serial의 첫 번째 글자가 1,3,5이면 "남자", 2,4,6이면 "여자"를 출력하시오.
	// int serial의 첫 번째 글자는 항상 1 ~ 6 사이의 정수라고 가정한다.
	// 예시
	// 남자입니다.
	public static void q1() {                 
		int number = 2234567;
		/*
		if(number / 1000000 % 2 == 1) {
			System.out.println("남자입니다.");  // 100만으로 나눠서 앞자리 구함 길이가 정해져있다면 이 방법이 좋음
		}else {
			
			System.out.println("여자입니다.");
		}
		*/
		/*
		while(number >= 10) {                // 10으로 계속 나눠주면서 앞자리를 구함  길을 모름
			number /= 10;
		}
		if(number % 2 == 1) {
			System.out.println("남자입니다.");  // 100만으로 나눠서 앞자리 구함 길이가 정해져있다면 이 방법이 좋음
		}else {
			
			System.out.println("여자입니다.");
		
		
		}
		*/
		
		String strNumber = number + "";  // {"1", "2", "3", "4", "5", "6", "7"}  < 배열처럼 문자형식이 됨
		if(strNumber.charAt(0) % 2 == 1) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		
		
		
		
	}
	
	// 문제2. int a와 int b에 저장된 결과를 이용해서 사칙연산 결과를 출력하시오.
	// 예시
	// 7 + 2 = 9
	// 7 - 2 = 5
	// 7 * 2 = 14
	// 7 / 2 = 3.5
	public static void q2() {
		int a = 7;
		int b = 2;
		
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + ((double)a / b));
		
		
	}
	
	// 문제3. 구구단을 모두 출력하지 말고 5 x 5 = 25까지만 출력하시오.
	// 예시
	// 2 x 1 = 2
	// 2 x 2 = 4
	// ...
	// 5 x 5 = 25
	
	public static void q3() {
		/*
		for(int i = 2; i < 6; i++) {
			for(int j = 1; j < 10; j++) {
				if(i == 5 && j == 6) {
					break;
				}
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			
		}
		
	
*/	
		outer:  // 바깥 for문의 label
		for(int i = 2; i < 10; i++) {
			inner: // 안쪽 for문 label
			for(int n = 1; n < 10; n++) {
				System.out.println(i + "x" + n + "=" + (i*n));
				if(i == 5 && n ==5) {
					break outer; // 바깥 for문 끝내기
				}
			}
		}
		
	}
	

	// 문제4. begin부터 end 사이의 모든 정수들의 평균을 출력하시오.
	// 단, 항상 begin은 end보다 작거나 같은 상태이다.
	// 예시
	// 1부터 6사이 모든 정수의 평균은 3.5입니다.
	public static void q4() {
	/*
		int begin = 1;
		int end = 6;
		int total = 0;
		double a = 0;  // 평균값
		while(begin <= end) {
			total += begin;
			begin++;
		}
		a = total / (double)end;
		System.out.println("1" + "부터" + end + "까지 평균: " + a + "입니다.");
		*/
		int begin = 1;
		int end = 6;
		int total = 0;
		for(int n = begin; n <= end; n++) {
			total += n;
		}
		System.out.println(begin + "부터" + end + "사이 모든 정수의 평균은" + (total / (double)end));
		
		
	}
	
	// 문제5. 1부터 100 사이의 모든 짝수와 홀수를 각각 더한 결과를 모두 출력하시오.
	// 예시
	// 짝수 합은 2550입니다.
	// 홀수 합은 2500입니다.
	public static void q5() {
		int evenTotal = 0;  // 짝수 합
		int oddTotal = 0;   // 홀수 합
		
		for(int i = 1; i <101; i++) {
			if(i % 2 == 1) {
				oddTotal += i;
			}
			else {
				evenTotal += i;
				}
		}
		System.out.println("짝수 합은: " + evenTotal + "입니다.");
		System.out.println("홀수 합은: " + oddTotal + "입니다.");
		
	}
	
	// 문제6. 배열에 저장된 모든 정수를 모두 더하시오.
	// 단, 0보다 작은 값은 더하지 마시오.
	// 예시
	// 합계는 6입니다.
	public static void q6() {   // 배열에서 for문 사용시 인덱스(변수)는 i > j > k 순으로 사용
		int total = 0;
		int[] arr = {1, -1, -2, 2, 3, -3};    // 배열에서 마지막 요소가 필요할 땐 (배열의 길이 - 1) arr.length - 1
		/*
		for(int n : arr) {
			if(n < 0) {
				continue;
			}
			total += n;
		}
		System.out.println("합계는: " + total + "입니다.");
		
		*/
	
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0) {
			total += arr[i];
			}
		}
		System.out.println("합계는: " + total + "입니다.");
		
	}
	
	// 문제7. 제시된 배열에 변수 ch에 저장된 문자가 몇 개 포함되어 있는지 갯수를 구해서 출력하시오.
	// 예시
	// 배열에 포함된 h는 2개입니다.
	public static void q7() {      
		char ch = 'h';
		char[] characters = {'a', 'h', 'e', 'h', 'p'};
		int count = 0;
		/*
		for(char a : characters) {
			if(ch == a) {
				count++;
			}
			
		}
		System.out.println("배열에 포함된 h는: " + count + "개입니다.");
		*/
		
		for(int i = 0; i < characters.length; i++) {
			if(ch == characters[i]) {
				count++;
			}
			
		}
		System.out.println("배열에 포함된 " + ch + "는" + count + "개 입니다.");
		
		
	}
	
	// 문제8. 점수에 따라 가져갈 수 있는 모든 사은품을 출력하시오.
	// 점수가 60점 이상인 경우 : "행주"
	// 점수가 70점 이상인 경우 : "행주", "도마"
	// 점수가 80점 이상인 경우 : "행주", "도마", "식칼"
	// 점수가 90점 이상인 경우 : "행주", "도마", "식칼", "냄비"
	// 예시
	// 행주도마
	public static void q8() {
		String strScore = "75";
		/*
		int a = Integer.parseInt(strScore);
		
		if(a >= 90) {
			System.out.println("행주, " + "도마, " + "식칼, " + "냄비");
		}
		else if(a >= 80) {
			System.out.println("행주, " + "도마, " + "식칼");
		}
		else if(a >= 70) {
			System.out.println("행주, " + "도마");
		}
		else if(a >= 60) {
			System.out.println("행주");
		}
		else {
			System.out.println("꽝");
		}
		*/
		/*
		int score = Integer.parseInt(strScore);
		
		String result = "";  // null을 넣어주면 안 됨
		
		if(score >= 60) {
			result += "행주";
		}
		if(score >= 70) {
			result += "도마";
		}
		if(score >= 80) {
			result += "식칼";
		}
		if(score >= 90) {
			result += "냄비";
		}
		System.out.println(result);
		*/
		
		int score = Integer.parseInt(strScore);
		
		String result = "";
		
		switch(score / 10) {
		case 10: result += "냄비";
		case 9: 
		case 8: result += "식칼";
		case 7: result += "도마";
		case 6: result += "행주";
		}
		
		System.out.println(result);
		
		
	}
	
	// 문제9. 1 ~ 100 사이의 정수를 대상으로 369 게임 결과를 아래와 같이 출력하시오.
	// 예시
	// 1   2   짝   4   5   짝   7   8   짝   10
	// 11  12  짝   14  15  짝   17  18  짝   20
	// 21  22  짝   24  25  짝   27  28  짝   짝
	// 짝  짝  짝짝 짝  짝  짝짝 짝  짝  짝짝 40
	// ...
	// 81  82  짝   84  85  짝   87  88  짝   짝
	// 짝  짝  짝짝 짝  짝  짝짝 짝  짝  짝짝 100
	public static void q9() {                                      //llllllllllllllllllllllllllllllllllllllllllll
		boolean condition1 = false;  // 일의 자리가 3의 배수인가?
		boolean condition2 = false;  // 십의 자리가 3의 배수인가?
		for(int n = 1; n < 101; n++) {
			int one = n % 10;
			condition1 = one % 3 == 0 && one % 10 != 0;
			int ten = n / 10;
			condition2 = ten % 3 == 0 && ten % 10 != 0;
			if(condition1 && condition2) {
				System.out.print("짝짝" + "\t");
			}else if(condition1 || condition2){
				System.out.print("짝" + "\t");
			}else {
				System.out.print(n + "\t");
			}
			if(n % 10 == 0) {
				System.out.println();
			}
			
	}
				
				
		
}
		
	
	// 문제10. 5명의 이름과 점수를 각각의 배열에 저장하였다.
	// 가장 높은 점수를 받은 사람의 이름을 출력하시오.
	// 예시
	// 가장 높은 점수를 받은 사람은 정숙입니다.
	public static void q10() {                        
		
//		String[] names = {"철수", "영희", "정숙", "상철", "미희"};
//		int[] scores = {50, 60, 90, 80, 70};
		/*
		int max = scores[0];											// 순회 하다가 맥스보다 큰 값이 나오면 카운트
		int j = 0;
		String b;
		
		
		for(int score : scores) {                              // 제일 큰 숫자의 인덱스 i를 기억하고 그 인덱스 i 값을 names[i]로 출력
			if(max < score) {
				j++;
		}	 
			max = score;
	}
		b = names[j];
		System.out.println("가장 높은 점수를 받은 사람은: " + b + "입니다");
			*/
		/*
		int max = scores[0];	//50	
		int maxNo = 0;			//0		가장 높은 학생의 인덱스
		
		for(int i = 1; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];	// 90
				maxNo = i;			// 2
			}
		}
		System.out.println("가장 높은 점수를 받은 사람은" + names[maxNo] + "입니다.");
		*/
		

		
	}
	
	// main 메소드는 그대로 사용합니다.
	public static void main(String[] args) {
		System.out.println("=====문제1=====");
		q1();
		System.out.println("=====문제2=====");
		q2();
		System.out.println("=====문제3=====");
		q3();
		System.out.println("=====문제4=====");
		q4();
		System.out.println("=====문제5=====");
		q5();
		System.out.println("=====문제6=====");
		q6();
		System.out.println("=====문제7=====");
		q7();
		System.out.println("=====문제8=====");
		q8();
		System.out.println("=====문제9=====");
		q9();
		System.out.println("=====문제10=====");
		q10();
	}

}

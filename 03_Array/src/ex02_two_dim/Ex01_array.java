package ex02_two_dim;

public class Ex01_array {

	public static void ex01() {  // 1차원 배열이 2개 이상 있다 == 2차원 배열,        길이가 다른 여러 배열들을 관리할 수 있다
		
		// 2차원 배열 선언
		int[][] arr;
		
		// 2차원 배열 생성
		arr = new int[3][2]; 	// 3행 2열이라고 해석함 (길이가 2인 배열 3개가 있다.)
		
		// 2차원 배열 순회
		for(int i = 0; i < 3; i++) {  		// i : 행 번호
			for(int j = 0; j < 2; j++) {  	// j : 열 번호
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
		
	}

	public static void ex02() {
	/*	
		// 2차연 배열 선언 + 생성
		int[][] arr = new int[3][2];
		
		// 길이 확인
		System.out.println(arr.length); // 1차원 배열이 3개가 있다는 의미. 출력시 3이 나옴 (3행이다. 의미)
		System.out.println(arr[0]);  	// 1번째 1차원 배열 출력시 참조값이 나옴.
		System.out.println(arr[1]);  	// 2번째 1차원 배열 출력시 참조값이 나옴.
		System.out.println(arr[2]);  	// 3번째 1차원 배열 출력시 참조값이 나옴.
		
		각자 다른 참조값이 나오면서 모든 배열들이 따로 떨어져있다.
		같은 1차원 배열이 아니다
		*/
		
		int[][] arr = new int[3][2];
		
		
		/*
		System.out.println(arr.length);     	// 3행이다를 의미 출력시 3이 나옴
		System.out.println(arr[0].length);  	// 모두 2가 출력됨 0행에 배열의 길이가 2이기 때문
		System.out.println(arr[1].length); 		// 모두 2가 출력됨 1행에 배열의 길이가 2이기 때문
		System.out.println(arr[2].length);		// 모두 2가 출력됨 2행에 배열의 길이가 2이기 때문
		*/
		
		
		// 2차원 배열 순회
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void ex03() {
		
		// 2차원 배열 선언
		int[][] arr;
		
		// 2차원 배열 생성 (행만 생성하기)
		arr = new int[3][]; 
		
		// 각 행이 가질 열을 생성하기 (각 1차원 배열의 생성)
		arr[0] = new int[5];
		arr[1] = new int[3];
		arr[2] = new int[2];
		
		// 2차원 배열 순회
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void ex04() {  	// 초기화
		
		int[][] arr = {				// 맨 아래 표를 직접 만들어준다는 느낌
				{1,2,3,4,5},
				{4,5,6},
				{7,8}
		};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		ex04();

	}

}
	/*
	
	
	row 행    자바에선 row major(행 우선 방식) 방식만을 사용
	
	column 열       사용 안함

		0      0
	  (0.0)   (0.1)
		0      0
	(1.0)     (1.1)
		0      0
	  (2.0)   (2.1)
3행 	2열
세로	가로
 */


package ex01_one_dim;

public class Ex02_reference {

	public static void ex01() {
		
		int[] arr;
		
		arr = new int[5];
		
		System.out.println(arr); // 5개 배열 요소의 참조(주소, 번지)값. (출력시 골뱅이 뒤부터 참조값, 앞은 무시)
		
	}

	public static void ex02() {
		
		int[] a = new int[5];  	// int(4바이트) 만약 a주소가 0x10
		int[] b;				// b의 주소는 0x14    가장 최신 바이트가 주소가 됨
		
		b = a;  //  같은 참조값으로 사용 가능 b에서도 a참조값 꺼내오기 가능
		
		for(int i = 0; i < b.length; i++)
		System.out.println(b[0]);
		
	}

	public static void ex03() {  // 심화
		
		// 생성된 배열의 크기를 늘이는 방법
		
		// 기존 배열
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		//신규 배열
		int[] b = new int[10];
		
		// 기존 배열 요소 -> 신규 배열 요소
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		// 기존 배열의 참조값을 신규 배열의 참조값으로 수정
		a = b;
		
		// 기존 배열이 신규 배열로 변경되었으므로 확인
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		
	  }
	}
	public static void main(String[] args) {
		
		ex03();
		
	
	}

}

/*
	b[0] = 100;
	system.out.println(a[0]);
	출력하면 a, b 둘다 100이 나옴

*/
 
 /*
            |-------|
          a | 0x123 |─────┐
            |-------|          │
            |  ...  |          │
            |-------|          │
       a[0] |   0   | 0x123    │
            |-------|          │
       a[1] |   0   |          │
            |-------|          │
       a[2] |   0   |          │ b = a;
            |-------|          │
       a[3] |   0   |          │
            |-------|          │
       a[4] |   0   |          │
            |-------|          │
            |  ...  |          │
            |-------|          │
          b | 0x123 |◀────┘
            |-------|
		*/
 

/*
 
 int[] arr;
 
 arr = new int[5];
 
 arr
 arr[0]
 arr[1]
 arr[2]
 arr[3]
 arr[4]
 
 데이터 공간(메모리)이 총 6개임
 
 출력시
 
 쓰레기 값 ( 참조값 )
 0
 0
 0
 0
 0
 
 
*/
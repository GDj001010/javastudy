package ex03_date_time;

public class Ex01_System {

	public static void ex01() {
		
		/*
			타임스탬프
			1. 현재 시간을 long 타입의 정수 값으로 가지고 있는 값을 의미한다.
			2. 1970년 1월 1일 0시부터 1/1000초 마다 1씩 증가하고 있는 값이다.
		*/
		
		long timestemp = System.currentTimeMillis();	// 현재 시간을 1000분의 1초로 저장
		
		System.out.println(timestemp);  
		System.out.println(Long.MAX_VALUE);				
		
	}
	
	public static void ex02() {
		
		/*
			시간 단위
			second > ms(Millis second) > ㎲(마이크로) > ㎱(나노) > ㎰(피코) 
					 
		long nanoTime1 = System.nanoTime();
		System.out.println(nanoTime1);
		
		*/
		// String의 + 연산과 StringBuilder의 append 메소드 성능 확인하기
		String str = "";
		StringBuilder sb = new StringBuilder();
		// 시작 시간
		long nanoTime1 = System.nanoTime();
		
		// 작업수행
		for(char ch = 'A'; ch <= 'z'; ch++) {
		//	 str += ch; 	// 똑같은 작작업이지만 +가 들어가면 갈 수록 성능이 떨어진다.
			sb.append(ch); // 훨신 효율적임
		}

		// 종료시간
		long nanoTime2 = System.nanoTime();
		
		// 결과 확인
		System.out.println("작업수행 시간 : " + (nanoTime2 - nanoTime1) + "ns");
	}
	
	public static void main(String[] args) {
		
		ex01();
		
	}

}

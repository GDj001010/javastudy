package ex03_date_time;

import java.util.Calendar;

public class Ex05_Calendar {

	public static void main(String[] args) {
		
		/*
			java.util.Calendar
			1. 현재 날짜 또는 특정 날짜를 생성할 수 있다.
			2. 날짜의 일부 구성 요소(년, 월, 일, ..... 중 하나만 필요할 때)를 쉽게 가져다 사용할 수 있다.
			
		*/
	
		// 현재 날짜
		Calendar now = Calendar.getInstance();
		
		// 년, 월, 일, 요일
		int year = now.get(Calendar.YEAR);				 	// now.get(1) 과 동일하게 동작한다.
		int month = now.get(Calendar.MONTH) + 1;			// 월(0 ~ 11)까지 정보를 받아줌 : +1 주의가 필요함  공부하기
		int day = now.get(Calendar.DAY_OF_MONTH);
		int weekNo = now.get(Calendar.DAY_OF_WEEK);			// 일(1), 월(2) ,,,,,토(7)
		
		String week[] = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(weekNo);							// 화
		System.out.println(week[weekNo - 1] + "요일");

		// 오전/오후, 시, 분, 초
		int ampm = now.get(Calendar.AM_PM);  				// 오전은 0 오후는 1
		int hour12 = now.get(Calendar.HOUR);				// 시 (0~11) 
		int hour24 = now.get(Calendar.HOUR_OF_DAY);			// 시 (0~23)
		int minute = now.get(Calendar.MINUTE);				// 분 (0~59)
		int second = now.get(Calendar.SECOND);				// 초 (0~59)
		
		if(ampm == 1) {
			System.out.println("오후");
		}else {
			System.out.println("오전");
		}
		
		// System.out.print(ampm);
		System.out.print(hour12 + "시");
		// System.out.print(hour24 + "시");
		System.out.print(minute + "분");
		System.out.println(second+ "초");
		
		now.add(Calendar.DATE, 1);							// 1일 후
		now.add(Calendar.HOUR, -3);							// 3시간 전
		
	}

}

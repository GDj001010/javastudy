package ex03_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Ex04_SimpleDateFormat {
	// 공부하기
	/*
		형식
		1. yy 	: 년도 2자 (23년
		2. yyyy : 2023
		3. M 	: 월 1자 (1월 무조건 대문자  		1~12
		4. MM	: 01  (                     		01~12
		5. MMM 	: 1월 (그 지역에 맞게 표시해줌 - 한국 로컬화
		6. d	: 17 (								1~31
		7. dd	: 17 (								01~31
		8. E	: 화 (무조건 대문자 로컬화
		9. a	: 오후 (로컬화
		10.h	: 2 (시간  							1~12
		11.hh	: 02  (   							01~12
		12 H	: 14 (시  							0 ~ 23
		13.HH	: 14 (   							00~23
		14.m	: 8 (분 							0~59
		15.mm	: 08 		    					00~59
		16.s	: 30(초  							0~59
		17.ss	: 30     							00~59
	*/
	
	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String	strNow = sdf.format(now);
		
		System.out.println(strNow);

		Date a = new Date();
		SimpleDateFormat qwe = new SimpleDateFormat("E");
		String str = qwe.format(a);
		
		System.out.println(str);
		
		
		
	}

}

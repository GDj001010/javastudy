package myExample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class MyMainClass {

	public static void main(String[] args) {
	
		LocalDateTime ldt = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String str = dtf.format(ldt);
		
		System.out.println(str);

	}
}

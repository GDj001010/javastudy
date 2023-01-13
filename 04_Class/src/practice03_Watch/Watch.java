package practice03_Watch;

public class Watch {

	
	//필드
	private int hour;  // 0~ 23
	private int minute;  // 0 ~ 59
	private int second;  // 0 ~ 59
	
	
	
	
	// 생성자
	public Watch(int hour, int minute, int second) {
		super();
	this.hour = hour;
	this.minute = minute;
	this.second = second;
	}
	
	//	메소드
	
	public void addHour(int hour) {    // 시간 올려주는 메소드
		for(int i = 1; i <= hour; i++) {
			this.hour += 1;
			if(this.hour == 24) {
				this.hour = 0;
		}
			
		}
		
	}
	
	public void addMinute(int minute) {  // 분 올려주는 메소드
		for(int i = 1; i <= minute; i++) {
			this.minute += 1;
			if(this.minute == 60) {
				this.hour++;
				this.minute = 0;
			}
		}
		
	}
	
	public void addSecond(int second) {  // 초 올려주는 메소드
		for(int i = 1; i <= second; i++) {
			this.second += 1;
			if(this.second == 60) {
				this.minute++;
				this.second = 0;
				if(this.minute == 60) {
					this.hour++;
					this.minute = 0;
				}
			}
		}
	}
	

	

	
	public void see() {
		System.out.println(hour + "시간");
		System.out.println(minute + "분");
		System.out.println(second + "초");
	}
	

	

	
	
}

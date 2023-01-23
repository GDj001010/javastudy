package practice01_Car;

public class Car {

	private int run;					// 자동차 속도
	private final int MAXSPEED = 50;	// 최대 스피드
	private int oillot;					// 기름통
	
	
	
	
	
	
	public void drive() {
		for(int i = 1; i < oillot; i++) {
			
		if(oillot == 0) {
			System.out.println("기름이 없습니다.");
		}
		System.out.println("달린다.");
		
		}
		
	}
	
}

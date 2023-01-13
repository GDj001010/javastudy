package practice02_soldier;

/*
 	has a 관계
 	1. 상속 관계로 만들 수 있는 관계이다.
 	2. Soldier has a Gun
 	3.  자식   has a 부모
 
 */
public class Soldier {
	
	// 필드
	private Gun gun;  // 초기값은 null
	
	//생성자
	public Soldier() {
		gun = new Gun();   // Gun 클래스 호출
	}
	
	
	// 메소드
	public void reload(int bullet) {
		gun.reload(bullet);
	}
	
	public void shoot() {
		gun.shoot();
	}
	
	
	
	
	
}


	
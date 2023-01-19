package myexam;

public class Gun {
	
	private int bullet;
	private static final int MAX_BULLET = 10;
	
	// 총알 넣기
	public void reload(int bullet) throws RuntimeException{
		if(this.bullet + bullet > MAX_BULLET) {
			throw new RuntimeException("장전 불가능");
		}
		this.bullet += bullet;
	}
	
	// 총 쏘기
	public void shoot() throws RuntimeException {
		if(bullet == 0) {
			throw new RuntimeException("총알이 없습니다.");
		}
		bullet--;
		System.out.println("탕");
		
		
		
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}

	public int getMaxBullet() {
		return MAX_BULLET;
	}

	
	
	
}

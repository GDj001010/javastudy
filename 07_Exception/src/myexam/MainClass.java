package myexam;

public class MainClass {

	public static void main(String[] args) {
		
		Gun gun = new Gun();
		
		try {
			gun.reload(10);
			for(int n = 1; n <= gun.getMaxBullet(); n++) {
				gun.shoot();
				if(gun.getBullet() == 0) {
					System.out.println("총알이 없습니다.");
				}
				
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

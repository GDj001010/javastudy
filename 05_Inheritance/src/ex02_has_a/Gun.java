package ex02_has_a;

public class Gun {
	
		// 필드
		private String model;   // 모델명
		private int bullet;		// 총알
		private final int MAX_BULLET = 20;
		
		
		// 메소드
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getBullet() {
			return bullet;
		}
		public void setBullet(int bullet) {
			this.bullet = bullet;
		}
		
		// 총알 넣기
		public void reload(int bullet) {
			if(this.bullet == MAX_BULLET) {
				return;
			}
			this.bullet += bullet;
			this.bullet = (this.bullet > MAX_BULLET) ? MAX_BULLET : this.bullet;
		}
		
		
		// 총 쏘기
		public void shoot() {
			if(this.bullet == 0) {
				System.out.println("헛빵");
				return;
			}
			bullet--;  // 매개변수가 없기 떄문에 this. 을 안 붙여도 됨 매개변수 구분을 할 이유가 없기 때문
			System.out.println("빵");
		}
		
}

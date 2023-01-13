package practice04_bakery;

	// 한 가지 종류의 빵만 판매하는 빵집


public class Bakery {

	
	// 필드
		private int breadCount;  // 판매하는 빵의 개수  10
		private int breadPrice;  // 판매하는 빵의 가격  1000
		private int bakeryMoney; // 빵집에 있는 돈      10000

		// 생성자
		public Bakery(int breadCount, int breadPrice, int bakeryMoney) {
			this.breadCount = breadCount;
			this.breadPrice = breadPrice;
			this.bakeryMoney = bakeryMoney;
		}

		BreadAndChange bac;
		Customer csm;
		// 판매 메소드
		// 구매자에게 돈을 받는다. 구매자에게 빵과 잔돈을 준다.
		public BreadAndChange sell(int money) {
			if(this.breadCount < money) {
				csm.money = money;
				return bac;
			}
			this.breadCount -= 
			this.bakeryMoney += money;
			
			
			
			
		}
		
		// 판매 현황 메소드
		public void info() {
			System.out.println("남은 빵 : " + breadCount + "개");
			System.out.println("현재 돈 : " + bakeryMoney + "원");
	
		}
	
}

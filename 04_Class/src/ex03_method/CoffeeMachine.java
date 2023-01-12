package ex03_method;

public class CoffeeMachine {

	// 거스름돈 만들기
	
	
	
	// 필드
	int moneyPot;  // 돈통
	String[] menu = {"아메리카노", "카페라떼", "마끼아또"};  // 커피 명
	int[] prices = {900, 1500, 2000};  // 가격
	
	CoffeeAndChange cnc = new CoffeeAndChange();  // 거스름돈 실행
	
	// 메소드
	 CoffeeAndChange buyCoffee(int money, int choice){
		 
		 // 돈(money)이 모자르면 money 그대로 반환
		 String coffee = menu[choice - 1];    	// 메뉴 선택
		 int price = prices[choice - 1]; 		// 되면서 가격 선택 
		 if(prices[choice - 1] > money) {  		// 돈이 모자를 경우 돈 그대로 반환
			 cnc.change = money;
			 return cnc;
		 }
		 
	
		moneyPot += price;                		// 커피 가격 돈통
		
		
		CoffeeAndChange cnc = new CoffeeAndChange();
		cnc.coffee = coffee; 
		cnc.change = money - price;
		return cnc;
	}
	 
	
}

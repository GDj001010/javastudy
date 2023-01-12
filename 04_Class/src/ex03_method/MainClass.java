package ex03_method;

public class MainClass {

	public static void ex01() {
		// Calculator 객체 선언 + 생성
		Calculator calc = new Calculator();
		
		double add = calc.addition(1.5, 2.5); // addition 메소드 호출
		System.out.println(add);
		
		double sub = calc.subtraction(2.5, 1.3); // subtraction 메소드 호출
		System.out.println(sub);
		
	}
	
	public static void ex02() {
		
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		
		CoffeeAndChange coffeeAndChange = coffeeMachine.buyCoffee(500, 1);
		System.out.println(coffeeAndChange.coffee);
		System.out.println(coffeeAndChange.change);
		
		System.out.println(coffeeMachine.moneyPot);
		
	}
	
	public static void ex03() {
		
		Car car = new Car();
		
		car.addoil(49);
		
		for(int n = 0; n < 51; n++) {
			car.pushAccle();
		}
		
		System.out.println(car.oilPot);
		System.out.println(car.carSpeed);
		
		for(int n = 0; n < 5; n++) {
			car.pushBreak();
		}
		System.out.println(car.oilPot);
		System.out.println(car.carSpeed);
		
	}

	public static void ex04() { // 연습
		Car car = new Car();  // Car 클래스 사용 가능
		
		car.addoil(40);  // 기름 넣어주기
		
		for(int i = 1; i < 50; i++) {
			car.pushAccle();
		}
		
		System.out.println(car.carSpeed);
		System.out.println(car.oilPot);
		
		
		
	}
	
	public static void main(String[] args) {
		
		ex04();
		
		
	}
	
	
	
	
}

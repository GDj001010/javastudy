package practice05_Cart;

public class MainClass {

	public static void main(String[] args) {
		
		Customer me = new Customer(20000, 500);
		
		me.addToCart(new Meat(1, "소고기", 5000));
		me.addToCart(new Pizza(2, "고구마피자", 3000));
		me.addToCart(new Noodle(3, "누들면", 2000));
		me.addToCart(new Noodle(3, "누들면", 2000));
		me.deleteFromCart(2);
		
		String receipt = me.buy();
		System.out.println(receipt);
		
		System.out.println(me.getMyMoney());
		System.out.println(me.getMyPoint());
		
	}

}

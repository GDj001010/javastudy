package practice;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount myAcc = new BankAccount("010-1111-1111", 150_000);
		BankAccount yourAcc = new BankAccount("010-9999-9999", 100_000);
		
		
		myAcc.deposit(20_000);  // 입금
		
		
		myAcc.transfer(yourAcc, 50_000);  // 이체
		
		
		
		 myAcc.inquiry();
		 yourAcc.inquiry();
		
	}

}

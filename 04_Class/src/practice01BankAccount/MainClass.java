package practice01BankAccount;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount myAcc = new BankAccount("010-1111-1111", 150_000);    // myAcc 객체 생성
		BankAccount yourAcc = new BankAccount("010-9999-9999", 100_000);  // yourAcc 객체 생성
		
		
		myAcc.deposit(20_000);  // 입금
		
		
		myAcc.transfer(yourAcc, 50_000);  // 이체
		
		
		
		 myAcc.inquiry();
		 yourAcc.inquiry();
		
	}

}

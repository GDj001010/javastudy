package practice01BankAccount;

public class BankAccount {

	// 필드
	private String accNo;	// 계좌
	private long balance;	// 통장
	
	// 생성자
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	
	}
	
	// 메소드(입금, 출금, 이체, 조회)
	
	// 입금(마이너스 입금 불가 처리)
	public void deposit(long money) {
		if(money <= 0) {
			return; // return은 반환 타입이 void(없다) 일 때만 사용 가능 (메소드 종료)
		}
		balance += money;
	}
	
	// 출금(마이너스 출금 + 잔액보다 큰 출금 불가 처리)
	public long withdrawal(long money) {
		if(money <= 0 || money > balance) {
			return 0;
		}
		balance -= money;
		return money;
	}
	
	// 이체
	public void transfer(BankAccount other, long money) {
		// 1. 내 통장에서 money 출금 : this.withdrawal(money)   하지만 현재는 이름이 다르기 때문에 this가 필요 없음 이름이 같을 땐 붙여주기
		// 2. 상대 통장에 실제로 내 통장에서 출금 된 금액을 입금 : other.deposit(withdrawal(money))
		other.deposit(withdrawal(money));
		
	}
	
	// 조회
	public void inquiry() {
		System.out.println("계좌번호: " + accNo);
		System.out.println("잔액: " + balance + "원");
		
	}
	
	
}

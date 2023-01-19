package ex05_exception_class;

/*
	예외 클래스 만들기
	1. Exception 클래스를 상속 받는다.  (필수)	모든 Exception의 부모 클래스이기 때문
	2. Exception 클래스의 슈퍼 클래스인 Throwable 클래스가 Serializable 인터페이스를 구현하기 때문에 serialVersionUID 값을 가질 수 있다. (선택) 꼭 해야 되는 건 아니기 때문
	
*/
public class GunException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3700059434730916901L;
	
	private String exceptionCode;
	
	public GunException(String message, String exceptionCode) {
		super(message);
		this.exceptionCode = exceptionCode;
		
		
		
	}

	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	
}

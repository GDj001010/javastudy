package ex02_random;

import java.security.SecureRandom;

public class Ex03_SecureRandom {

	public static void main(String[] args) {
		
		// java.security.SecureRandom
		// 보안이 필요한 난수가 필요할 때
		
		SecureRandom secureRandom = new SecureRandom();
		
		// 정수 난수
		int dice = secureRandom.nextInt(6) + 1;		// 주사위 1~6
		System.out.println(dice);
	}

}

package ex06_op_string;

public class MainClass {

	// 연결 연산
	// 문자열과 + 연산자가 만나면 문자열로 연결 된다.
	
	public static void ex01() {
		
		// 연결 연산
		// 문자열과 + 연산자가 만나면 문자열로 연결 된다.
		
		String str1 = "구디" + "아카데미";
		String str2 = "4" + "달라";
		String str3 = 100 + 10 + "번지";
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

	public static void ex02() {
		
		// 모든 타입의 데이터는 빈 문자열("")을 + 시키면 문자열이 된다.

		int a = 100;
		String str = a + "";
		
		System.out.println(str);
		// System.out.println(a == str);  이 연산은 실행되지 않음 숫자 100과 문자 100은 다르다.
		
		
		// 원래는 이런게 있습니다.
		// String str = String.value0f(a);
		// 하지만 개발자들은 잘 안 쓴다.
	}

	public static void ex03() {
		
		// 문자열의 비교는 == 또는 !=로 하지 않는다.
		
		String str1 = "hello";
		System.out.println(str1 == "hello");	// true
		
		String str2 = new String("hello");
		System.out.println(str2);	// false
		
	}
	
	
	public static void main(String[] args) {
		ex03();

	}

}

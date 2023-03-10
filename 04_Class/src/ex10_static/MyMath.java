package ex10_static;

public class MyMath {

	/*
		static
		1. 정적 요소
		2. 객체 생성 이전에 클래스 영역에 만들어 지는 요소
		3. 객체마다 생성되지 않고 클래스별로 1개씩만 생성됨
		4. 클래스를 이용해서 호출하기 때문에 클래스 변수, 클래스 메소드라고 부름
		5. static 클래스는 static필드만 참조가 가능
		6. static 요소는 다른 static 요소만을 참조할 수 있다. (non-static 요소는 참조할 수 없음)
		
	 */
	
	// 필드
	public static final double PI = 3.141592;  // static이 들어가면서 클래스에 PI값이 들어가고 myMath(객체), yourMath(객체)엔 PI값이 안 들어감
	
	// 메소드  
	public static double getCircleArea(double radius) {
		return PI * radius * radius;
	}
	
	
	public static double max(double... numbers) {
		double max = Double.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	public static double min(double... i) {
		double min = Double.MAX_VALUE;
		for(int n = 0; n < i.length; n++) {
			if(min > i[n]) {
				min = i[n];
			}
		}
		return min;
	}
	
	
	
	
}

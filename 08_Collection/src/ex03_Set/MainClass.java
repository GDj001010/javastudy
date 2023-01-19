package ex03_Set;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void ex01() {
		
		/*
			Set
			1. 저장된 요소들에 인덱스가 없다. → 저장 순서가 없다.
			2. 중복 저장이 되지 않는다.
		*/
		// HashSet 객체 선언 및 생성
		Set<String> set = new HashSet<String>();
	
		// 추가			순서대로 저장되지 않고 순서(인덱스) 없이 저장 됨
		set.add("spring");
		set.add("spring");
		set.add("spring");	// 출려되지 않음
		set.add("summer");
		set.add("autumn");
		set.add("winter");
		
		
		// 제거
		set.remove("summer");
		
		
		
		
		// 확인
		System.out.println(set); 
		
		
		
	}
	
	public static void ex02() {
		// HashSet은 향상 for문 활용
	
		// HashSet 객체의 초기화 	
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		// 인덱스가 없기 때문에 향상 for문만 가능
		for(Integer n : set) {
			System.out.println(n);
		}
		
		
		
	}
	
	public static void ex03() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 교집합
		set1.retainAll(set2);	//	set1에 교집합 결과가 저장된다.
		
		System.out.println(set1);		// 결과값 3,4,5
		System.out.println(set2);		// 결과값 3,4,5,6,7
		
		
	}
	
	public static void ex04() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 합집합
		set1.addAll(set2);	//	set1에 교집합 결과가 저장된다.
		
		System.out.println(set1);		// 결과값 1,2,3,4,5,6,7
		System.out.println(set2);		// 결과값 3,4,5,6,7
	}
	
	public static void ex05() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 차집합
		set1.removeAll(set2);	//	set1에 교집합 결과가 저장된다.
		
		System.out.println(set1);		// 결과값 1,2
		System.out.println(set2);		// 결과값 3,4,5,6,7
		
	}
	
	public static void ex06() {	// 연습
		// 1 ~ 45 6자리 set에 저장
		
		Set<Integer> set = new HashSet<Integer>();
		
		/*
		while(true) {
			
			int lotto = (int)(Math.random() * 45) + 1;
			set.add(lotto);
			if(set.size() == 6) {
				System.out.println(set);
				return;
			}
			
		}
		*/
		while(set.size() < 6) {
			set.add( (int)(Math.random() * 45) + 1);
		}
		System.out.println(set);
		
		
		
		
	}
		
 

	
	public static void main(String[] args) {
		
		ex06();
		
	}

}

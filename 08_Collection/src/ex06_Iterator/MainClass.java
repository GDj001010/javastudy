package ex06_Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {

	/*
			Iterator 인터페이스
			1. 특정 Collection(컬렉션) (List, set) 을 순회할 때 사용한다.
			2. 주요 메소드
				1) hasNext() : 남아 있는 요소가 있으면 true 반환 (남은게 있는지 없는지 확인하는 메소드 
				2) next()	 : 요소를 하나 꺼냄
	 */

	public static void ex01() {
	
		List<String> list = new ArrayList<String>();
		
		list.add("동그랑땡");
		list.add("동태전");
		list.add("굴전");
		
		Iterator<String> itr = list.iterator();			// 리스트에 부탁한 반복자
		
		while(itr.hasNext()) {							// 리스트에 남아있는 요소가 있으면 반복하시오
			String food = itr.next();
			System.out.println(food);
			
		}
		
		
		
	}
	
	public static void ex02() {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(5);
		set.add(15);
		set.add(105);
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			Integer number = itr.next();
			System.out.println(number);
		}
		
	}
	
	public static void ex03() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		map.put("name", "김동형");
		map.put("age", 24);
		map.put("isAlive", true);
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> itr = keySet.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			Object value = map.get(key);
			System.out.println(key + ":" + value);
		}
		/*											위에 코드랑 출력값 같음
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("isAlive"));
		*/
	}
	
	public static void ex112() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("가가가");
		set.add("나나나");
		set.add("다다다");
		
		
		
	}
	
	public static void main(String[] args) {
		
		ex03();
		
	}

}

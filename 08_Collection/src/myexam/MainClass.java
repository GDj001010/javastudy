package myexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void ex01() {
		
		Box<Integer> box = new Box<Integer>();
		
		box.setA(250);
		
		System.out.println(box.getA());
		
		Box<String> box2 = new Box<String>();
		
		box2.setA("asdads");
		
		System.out.println(box2.getA());
		
	}
	
	public static void ex02() {
		
		List<String> list = new ArrayList<String>();
		
		// list 추가
		list.add("spring");
		list.add("summer");
		list.add("autumn");
		list.add("winter");
		list.add("ehdgud");
		list.add(0, "weoqwewq");
		
		// list 삭제
		list.remove(3);
		
		list.set(2, "kkkk");
		
		
		
		
		
		
		
		System.out.println(list);
		
		
	}
	
	public static void ex03() {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int total = 0;
		
		for(int a : list) {
			total += a;
		}
		System.out.println(total);
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.get(list.size() - 1));
	}
	
	public static void ex04() {
		
		
		
	}
	
	public static void main(String[] args) {
		
		ex03();
		
	}

}

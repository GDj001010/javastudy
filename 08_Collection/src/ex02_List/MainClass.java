package ex02_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void ex01() {
		
		// 배열 리스트(ArrayList) 선언 및 생성
		List<String> list = new ArrayList<String>();
		
		// 추가
		list.add("summer");		// 인덱스의 지정이 없으면 항상 마지막에 추가됨
		list.add("autumn");
		list.add("frog");
		list.add("winter");
		list.add(0, "spring");	// 인덱스 0에 spring 추가 됨
		
		
		// 수정
		list.set(2, "fall");	// 인덱스 2의 요소를 fall로 수정
		
		
		
		// 삭제
		list.remove("frog");	// 방법 1 삭제할 대상을 전달
	//	list.remove(3);			// 방법 2 삭제할 대상의 인덱스 전달
		
		
		
		
		
		// 확인
		System.out.println(list);
		
	}
	
	public static void ex02() {

		
		// ArrayList 초기화
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		// 리스트 길이
		System.out.println("리스트 길이" + list.size());
		
		// 개별 요소 확인
		System.out.println("첫 번째 요소 : " + list.get(0));
		System.out.println("첫 번째 요소 : " + list.get(list.size() - 1));

		// 리스트 순회 for문 돌리기
		// 모든 요소 합계 구하기
		
		// for문
		int total = 0;
		for(int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		System.out.println(total);

		
		// 상향 for문
		int totall = 0;
		for(int i : list) {
			totall += i;
		}
			System.out.println(totall);
		
		
		
		
	}
	
	public static void ex03() {
		
		List<User> userList = new ArrayList<User>();
		
		for(int i = 0; i < 3; i++) {
			
			User user = new User("user", 123456);
			userList.add(user);
			System.out.println(userList.get(i));
		}

		// 아이디만 출력하기
		for(int i = 0, length = userList.size(); i < length; i++) {
			System.out.println(userList.get(i).getId());
		}
	
	
	
	
	
	
	}
	
	public static void ex111() {
	
	// 선언 생성
	List<Integer> list = new ArrayList<Integer>();
	
	// 추가
	list.add(60);
	list.add(70);
	list.add(80);
	list.add(90);
	list.add(789789);
	list.add(0,50);
	
	
	// 수정
	list.set(3, 2000);
	
	
	
	// 삭제
	list.remove(5);
	
	System.out.println(list);
	
}
	
	public static void main(String[] args) {
		
		ex02();

	}

}

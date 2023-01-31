package ex01_internet;

import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {

	/*
	 	URL										공부하기 2월 8일 평가문제
	 	1. Uniform Resource Locator
	 	2. 정형화된 자원의 경로
	 	3. 실제로는 웹 주소를 의미한다.
	 	4. 구성										request where(); = where=nexearch 호출 -> javq
  "(http)프로토콜://"   "호스트"    /  서버경로  ?파라미터=값&파라미터=값&...					%    삼성전자 인코딩 된 데이터 = 클라이언트가 서버로 보내는 주소
	 		https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%82%BC%EC%84%B1%EC%A0%84%EC%9E%90
	 		1) 프로토콜 : 통신규약, https(secure + http : 보안 처리된 하이퍼텍스트 전송 프로토콜)
	 		2) 호스트	: 서버의 대표 주소	- 서버라고 생각하기
	 		3) 서버경로	: URL Mapping(URL Pattern)  - 개발자가 만듬
	 		4) 파라미터 : 서버로 보내는 데이터를 의미(변수라고 생각하면 된다.)
	 		"?"는 주소창에 하나 밖에 못 온다.
	*/
	
	public static void ex01() {
		
		String apiURL = "https://search.naver.com/search.naver?query=삼성전자";
		URL url = null;
		
		try {
			
			url = new URL(apiURL);		// 반드시 예외 처리가 필요한 코드
			
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("파라미터 : " + url.getQuery());
			
			
			
		}catch (MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}
		
	}
	
	public static void main(String[] args) {
		
		ex01();
		
	}

}

























package ex01_internet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
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
	
	public static void ex02() {
		
		// 웹 접속을 담당하는 HttpURLConnection
		
		String apiURL = "https://www.naver.com";
		URL url = null;
		HttpURLConnection con = null;
		
		try {
			
			url = new URL(apiURL);		// MalformedURLException 처리가 필요하다.
			con = (HttpURLConnection)url.openConnection();	// IOException 처리가 필요하다.- 스트림을 만든다는 개념
					// 캐스팅
			
			// HTTP 응답 코드 공부하기
			/*
				1. 200 : 정상 접속
				2. 401..2..3... : 잘못된 요청 (사용자가 잘못하였음)
				3. 501..2..3... : 서버측 오류 (서버가 잘못하였음)
			*/
			System.out.println("정상 응답 : " + HttpURLConnection.HTTP_OK);
			System.out.println("Not Fount : " + HttpURLConnection.HTTP_NOT_FOUND);
			System.out.println("Internal Error : " + HttpURLConnection.HTTP_INTERNAL_ERROR);
			
			// apiURL 접속 확인
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {			// 정상 접속이 될 경우
				System.out.println(apiURL + "접속 완료");
			}
			
			// 요청 방식(요청 메소드)
			String requestMethod = con.getRequestMethod();			// 삼성전자 검색할 시 주소창에 나오는 데이터가 get 방식이다
			System.out.println("요청 방식 : " + requestMethod);
			
			// 컨텐트 타입
			String contentType = con.getContentType();
			System.out.println("컨텐트 타입 : " + contentType);		// contentType = 웹 상에서 주고 받는 타입
			
			// 요청 헤더
			String userAgent = con.getRequestProperty("User-Agent"); 	// 헤더의 키값 (정해진 키워드)
			System.out.println("User-Agent : " + userAgent); 			// 누군가 요청했다 정보(크롬으로 네이버를 접속시 네이버 userAgent에 크롬이 저장 됨)
																		// 출력시 java로 나옴
			String referer = con.getRequestProperty("Referer");
			System.out.println("Referer : " + referer);					// 이전 주소가 나옴 네이버창 - 웹툰창 - 로그인 후 다시 웹툰창으로 돌려주듯이 사용
			
			// 접속 종료
			con.disconnect();
			
			
		}catch (MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}catch (IOException e) {
			System.out.println("apiURL 접속 오류");
		}
		
	}
	
	public static void ex03() {
		
		String apiURL = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		URL url = null;
		HttpURLConnection con = null;
		
		InputStream in = null;					// Daum 로그를 읽어 들이는 입력 스트림
		FileOutputStream out = null;			// C:\storage\daum.png로 내보내는 출력 스트림
		
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			
			int responseCode = con.getResponseCode();			// 웹에 스트림 연결
			if(responseCode == HttpURLConnection.HTTP_OK) {		// 정상 접속이 되었다면.
				
				in = con.getInputStream();		
				out = new FileOutputStream("C:" + File.separator + "storage" + File.separator + "daum.png");
				
				byte[] b = new byte[10];
				int readByte = 0;			// 10바이트가 아닐 수도 있기 때문에 선언
				
				while((readByte = in.read(b)) != -1) {
					
					out.write(b, 0, readByte);
					
				}
				
				System.out.println("다운로드 완료");
				
				out.close();				// output 종료
				in.close();					// input 종료
				con.disconnect(); 			// 접속 종료
				
			}
			
		}catch (MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}catch (IOException e) {
			// 접속 실패 또는 스트림 관련 오류
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		ex03();
		
	}

}

























package ex01_internet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

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
			String requestMethod = con.getRequestMethod();			// 삼성전자 검색할 시 주소창에 나오는 데이터가 "get" 방식이다
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
		
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		File file = new File("C:" + File.separator + "storage", "daum.png");
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();

			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				
				in = new BufferedInputStream(con.getInputStream());
				out = new BufferedOutputStream(new FileOutputStream(file));
				
				byte[] b = new byte[10];
				int count = 0;
				
				while((count = in.read(b)) != -1) {
					out.write(b, 0, count);
					
				}
				
				System.out.println("다운로드 완료");
				in.close();
				out.close();
				con.disconnect();
				
			}
			
		}catch (MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex04() {
		
		String apiURL = "https://gdlms.cafe24.com/uflist/curri/10004/bbs/68_63d8848f7d506.txt";
		
		URL url = null;
		HttpURLConnection con = null;
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		File file = new File("C:" + File.separator + "storage", "다운로드 문서.txt");
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				
				in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				out = new BufferedWriter(new FileWriter(file));
				
				StringBuilder sb = new StringBuilder();
				String str = null;
				
				while((str = in.readLine()) != null) {
					sb.append(str + "\n");
				}
				out.write(sb.toString());
				
				System.out.println("다운로드 완료");
				
				in.close();
				out.close();
				con.disconnect();
			}
		}catch (MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void ex05() {
		
		/*
			인코딩(암호화) : 원본 데이터를 UTF-8 방식으로 암호화
			디코딩(복호화) : UTF-8 방식으로 암호화된 데이터를 복원
		*/
		
		String data = "한글 english 12345 !@#$+-";
		
		try {
			
			// 인코딩		공부하기
			String encodeData = URLEncoder.encode(data, "UTF-8");
			System.out.println(encodeData);
			
			// 디코딩
			String decodeData = URLDecoder.decode(encodeData, "UTF-8");
			System.out.println(decodeData);
			
		}catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 실패");
		}
		
	}

	public static void ex06() {		// 연습
		// 1시간마다 갱신되는 전국 날씨 정보
		// storage\sfc_web_map.xml로 다운로드 받기
		String apiURL = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";
		
		URL url = null;
		HttpURLConnection con = null;
		
		BufferedReader in = null;
		BufferedWriter out = null;
		File file = null;
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			String message = "";
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				file = new File("C:" + File.separator + "storage", "sfc_web_map.xml");
				in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				message = "다운로드 성공";
			}else {
				file = new File("C:" + File.separator + "storage", "다운로드실패.txt");
				in = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				message = "다운로드 실패";
			}
			
			StringBuilder sb = new StringBuilder();
			String str = null;
			
			while((str = in.readLine()) != null) {
				sb.append(str);
			}
			out = new BufferedWriter(new FileWriter(file));
			out.write(sb.toString());
			
			System.out.println(message);
			
			out.close();
			in.close();
			con.disconnect();
		}catch (MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		ex05();
		
	}

}

























package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class MainClass {

	public static void ex01() {
		/*
		 	한국공항공사_항공기 운항정보 : 공항 코드 정보
		 	1. 서비스 URL : http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList
		 	2. 요청변수(Request Parameter)
		 		1) ServiceKey : 인증키
		*/	
		// 인코딩 된 인증키 활용
		//	String encodingKey = "XokTvQs9E3%2BUuAoHWbXMOxumI7VYZPxNCqRt59JhMI1vM5g1txLcjJqlXO3voRklXpEJns3ShufiCv1PlNMtzQ%3D%3D";
		//	String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
		//	apiURL += "?serviceKey=" + encodingKey;
		
		// 디코딩 된 인증키 인코딩 후 활용 ( 인코딩 된 데이터는 별로 없어 아래 코드로 사용 공부하기 )
		String serviceKey = "XokTvQs9E3+UuAoHWbXMOxumI7VYZPxNCqRt59JhMI1vM5g1txLcjJqlXO3voRklXpEJns3ShufiCv1PlNMtzQ==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");
			
			int responseCode = con.getResponseCode();
			
			if(responseCode == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
			
			File file = new File("C:" + File.separator + "storage", "공항코드정보.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			
			System.out.println("공항코드정보.xml이 생성되었습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		
		ex01();
		

	}

}

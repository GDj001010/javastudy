package api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiMain {

	public static void main(String[] args) {
		
		try {
			
			// api 주소 완성
			String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
			apiURL += "?serviceKey=" + URLEncoder.encode("XokTvQs9E3+UuAoHWbXMOxumI7VYZPxNCqRt59JhMI1vM5g1txLcjJqlXO3voRklXpEJns3ShufiCv1PlNMtzQ==", "UTF-8");
			apiURL += "&searchYear=" + URLEncoder.encode("2021", "UTF-8");
			apiURL += "&siDo=" + URLEncoder.encode("1100", "UTF-8");
			apiURL += "&guGun=" + URLEncoder.encode("1125", "UTF-8");
			apiURL += "&type=" + URLEncoder.encode("json", "UTF-8");
			apiURL += "&numOfRows=" + URLEncoder.encode("10", "UTF-8");
			apiURL += "&pageNo=" + URLEncoder.encode("1", "UTF-8");
			
			// url 객체 생성(API 주소의 형식 검증)
			URL url = new URL(apiURL);
			
			// api 주소 접속
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			// get 방식(주소창에 파라미터를 이용하는 방식)의 요청임을 처리
			con.setRequestMethod("GET");
			// 응답 데이터는 "json"임을 처리 
			// 웹상에서 주고받는 데이터 타입 Content-Type이 "json"이다   결과에 UTF-8 처리가 필요한 데이터가 없어 charset 안 해줘도 된다. (보험)
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			// 접속된 API로 부터 데이터를 읽어 들일 입력 스트림 생성
			// 1. 정상 스트림과 에러 스트림으로 구분해서 생성 (기본)
			// 2. API 입력 스트림은 오직 바이트 입력 스트림만 지원하므로 문자 입력 스트림으로 바꾸는 작업이 필요하다.
			// 3. 속도 향상을 위해서 buffer가 내장된 스트림을 생성
			BufferedReader reader = null;
			if(con.getResponseCode() == 200) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			// BufferedReader는 readLine 메소드를 지원한다.
			String line = null;							// 한줄 씩 읽어들일 String 지정
			StringBuilder sb = new StringBuilder(); 	// 한 곳에 모을 스트링빌더 생성
			
			while((line = reader.readLine()) != null) {
				
				sb.append(line);
			}
			
			// 이제 API의 응답 데이터는 sb에 저장되어 있다.
			System.out.println(sb.toString());
			
			// API의 응답 데이터를 분석하기 위해서 JSONObject로 변환한다.
			// json 라이브러리 사용을 위해서 Build Path 작업을 수행한다.
			/*
			JSONObject obj = new JSONObject(sb.toString());
			JSONObject items = obj.getJSONObject("items");
			JSONArray itemList = items.getJSONArray("item");
			*/
			JSONArray itemList = new JSONObject(sb.toString())
									.getJSONObject("items")
									.getJSONArray("item");
			
			List<Accident> list = new ArrayList<Accident>();
			for(int i = 0; i < itemList.length(); i++) {
				 // 응답 데이터에서 필요한 데이터를 분석(파싱)한다.
				 JSONObject item = itemList.getJSONObject(i);		// 모든 요소 하나씩 저장
				 String occrrncDt = item.getString("occrrnc_dt");
				 String occrrncDayCd = item.getString("occrrnc_day_cd");
				 int dthDnvCnt = item.getInt("dth_dnv_cnt");
				 int injpsnCnt = item.getInt("injpsn_cnt");		// 밑줄 지우고 대문자로 바꾸는 연습 자바언어.
				 // 응답 데이터에서 추출한 데이터를 하나의 객체(Bean)로 만든다.
				 // 하나의 객체에 있는 4개의 데이터를 저장할 map 이나 bean을 만들어 저장해줘야 한다.
				 Accident accident = new Accident();
				 accident.setOccrrncDt(occrrncDt);
				 accident.setOccrrncDayCd(occrrncDayCd);
				 accident.setDthDnvCnt(dthDnvCnt);
				 accident.setInjpsnCnt(injpsnCnt);
				 // accident 9개의 사고정보를 한 곳에 (ArrayList) 저장
				 // 객체를 ArrayList에 저장한다.
				 list.add(accident);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	

	}

}

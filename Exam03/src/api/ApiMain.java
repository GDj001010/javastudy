package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;



public class ApiMain {

	public static void main(String[] args) {
		
   
		String serviceKey = "XokTvQs9E3+UuAoHWbXMOxumI7VYZPxNCqRt59JhMI1vM5g1txLcjJqlXO3voRklXpEJns3ShufiCv1PlNMtzQ==";
        String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
     
        URL url = null;
        HttpURLConnection con = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
        	StringBuilder sbURL = new StringBuilder();
        	sbURL.append(apiURL);
        	sbURL.append("?ServiceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
        	sbURL.append("&type=json");
        	sbURL.append("&searchYear=2021");
        	sbURL.append("&siDo=1100");
        	sbURL.append("&guGun=1125");
        	sbURL.append("&numOfRows=10");
        	sbURL.append("&pageNo=1");
        	
        	url = new URL(sbURL.toString());
			con = (HttpURLConnection)url.openConnection();
        	
        	con.setRequestMethod("GET");
        	con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
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
			System.out.println(sb.toString());
			
			JSONArray items = new JSONObject(sb.toString())
					.getJSONObject("response")
					.getJSONObject("body")
					.getJSONArray("items");
			Accident ac = new Accident();
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				ac.setOccrrncDt("occrrncDt");
				ac.setOccrrncDayCd("occrrncDayCd");
				ac.setDthDnvCnt(Integer.parseInt(dthDnvCnt));
				ac.setInjpsnCnt(Integer.parseInt(injpsnCnt));
			}
			List<Map<String, Object>> list = new ArrayList<>();

            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                list.add(item.toMap());
                String occrrncDt = ac.getOccrrncDt;
                String occrrncDayCd = ac.getOccrrncDayCd;
                int dthDnvCnt = ac.getDthDnvCnt();
                int injpsnCnt = ac.getInjpsnCnt();
            }
			
			
        	
        }catch (Exception e) {
			e.printStackTrace();
		}
            
	}

	}

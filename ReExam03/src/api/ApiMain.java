package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class ApiMain {

	public static void main(String[] args) {
		
		try {
			String apiUrl = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1154551000";			
			URL url = new URL(apiUrl);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/xml");
			BufferedReader reader = null;
			if(con.getResponseCode() == 200) {
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
			
			JSONObject obj = XML.toJSONObject(sb.toString());						
			String pubDate = obj.getJSONObject("rss")
								.getJSONObject("channel")
								.getString("pubDate");
						
			String category = obj.getJSONObject("rss")
								  .getJSONObject("channel")
								  .getJSONObject("item")
								  .getString("category");			
			
			JSONArray dataList = obj.getJSONObject("rss")
									.getJSONObject("channel")
									.getJSONObject("item")
									.getJSONObject("description")
									.getJSONObject("body")
									.getJSONArray("data");
			
			List<Weather> weatherList = new ArrayList<Weather>();
			StringBuilder fileBuilder = new StringBuilder();
			
			for(int i = 0; i < dataList.length(); i++) {
				JSONObject data = dataList.getJSONObject(i);
				System.out.println(data.getInt("temp"));		
				System.out.println(data.getString("wfKor"));	
				System.out.println(data.getInt("hour"));					
				int temp = data.getInt("temp");
				String wfKor = data.getString("wfKor");
				int hour = data.getInt("hour");
				fileBuilder.append(hour).append("시, ").append(temp).append("도, ").append(wfKor);
				fileBuilder.append("\n");
				Weather weather = new Weather();
				weather.setTemp(temp);
				weather.setWfKor(wfKor);
				weather.setHour(hour);
				weatherList.add(weather);				
			}
			
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("weather.txt"));
			writer.write(pubDate + "\n");
			writer.write(category + "\n");
			writer.write(fileBuilder.toString());
			
			writer.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}























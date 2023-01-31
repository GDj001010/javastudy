package myExample;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {

	public static void ex01() {   	// 공부하면서 직접 해보기
	
		String apiURL = "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fwww.google.com%2Fchrome%2Fstatic%2Fimages%2Ffavicons%2Ffavicon-32x32.png&type=f30_30_png_expire24";
		
		URL url = null;
		HttpURLConnection con = null;
		
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		File file = new File("C:" + File.separator + "storage", "Crom.png");
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
			
			in = new BufferedInputStream(con.getInputStream());
			out = new BufferedOutputStream(new FileOutputStream(file));
			
			byte[] b = new byte[10];
			int readByte = 0;
			
			while((readByte = in.read(b)) != -1) {
				
				out.write(b, 0, readByte);
				
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
	
	public static void ex02() {		// 공부하면서 직접 해보기
		
		String apiURL = "https://gdlms.cafe24.com/uflist/curri/10004/bbs/68_63d8848f7d506.txt";
		URL url = null;
		HttpURLConnection con = null;

		File file = null;
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			String message = "";
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				file = new File("C:" + File.separator + "storage", "다운로드1.txt");
				message = "다운로드 성공";
			}else {
				in = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				file = new File("C:" + File.separator + "storage", "다운로드실패.html");
				message = "다운로드 실패";
			}
			
			StringBuilder sb = new StringBuilder();
			out = new BufferedWriter(new FileWriter(file));
			char[] cbuf = new char[5];
			int count = 0;
			
			while((count = in.read(cbuf)) != -1) {
				
				sb.append(cbuf, 0, count);
				
			}
			
			out.write(sb.toString());
			in.close();
			out.close();
			con.disconnect();
			System.out.println(message);
		
		}catch (MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		ex01();
		

	}

}

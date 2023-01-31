package myExample;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {

	public static void main(String[] args) {
		
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

}

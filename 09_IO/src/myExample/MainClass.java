package myExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) {
		
		File file = new File("C:" + File.separator + "storage", "test03.txt");
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			StringBuilder sb = new StringBuilder();
			
			String str = null;
			
			while((str = br.readLine()) != null) {
				
				sb.append(str);
				
			}
			
			System.out.println(sb.toString());
			
		
		}catch (IOException e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(br != null){
					br.close();
				}
			}catch (IOException e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		
		
	}

}



















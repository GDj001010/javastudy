package ex03_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyMainClass {

	public static void ex01() {
		
		File file = new File("C:" + File.separator + "storage", "ex01.txt");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			String str = null;
			StringBuilder sb = new StringBuilder();
			while((str = br.readLine()) != null) {
				sb.append(str);
			}
			
			System.out.println(sb.toString());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	public static void ex02() {
		
		File file = new File("C:"+ File.separator + "storage", "ex02.txt");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			String str = null;
			StringBuilder sb = new StringBuilder();
			
			while((str = br.readLine()) != null) {
				sb.append(str);
			}
			System.out.println(sb.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
			
		ex02();

	}

}

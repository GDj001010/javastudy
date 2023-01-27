package ex03_Reader;

import java.io.File;
import java.io.FileReader;

public class MyMainClass {

	public static void ex01() {
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "ex01.txt");
		
		FileReader fr = null;
		try {
			
			fr = new FileReader(file);
			
			int c;
			
			StringBuilder sb = new StringBuilder();
			while((c = fr.read()) != 1) {
				
				sb.append((char)c);
				
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
			
		ex01();

	}

}

package ex02_Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyExample {

	public static void main(String[] args) {
		
		File dir = new File("C:" + File.separator + "test");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "test01_txt");
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);	// test01 파일과 연결
			int i = 'I';
			char[] cbuf = {' ' , 'a', 'm'};
			String str = " a boy"; 
			
			fw.write(i);
			fw.write(cbuf);
			fw.write(str);
			
			System.out.println("test01_txt 파일 생성");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw != null) {
					fw.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		

	}

}

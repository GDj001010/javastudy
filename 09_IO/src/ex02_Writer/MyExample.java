package ex02_Writer;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyExample {

	public static void ex01() {
		
		
		
		File file = new File("C:" + File.separator + "storage", "test02.txt");
		
		BufferedOutputStream bos = null;
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream(file));
			
			bos.write("거짓말을 하면 코가 길어진다".getBytes("UTF-8"));
			
			System.out.println("test02.txt 파일 생성");
		}catch (IOException e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(bos != null) {
					bos.close();
				}
			}catch (IOException e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		
		
	}
	
	public static void ex02() {
		
		String str = "\"";
		
		System.out.println(str);
		
		
	}
	
	public static void main(String[] args) {
		ex02();

	}
}



















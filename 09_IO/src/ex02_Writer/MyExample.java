package ex02_Writer;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyExample {

	public static void ex01() {
		
		
		
	}
	
	public static void main(String[] args) {
		
		File file = new File("C:" + File.separator + "storage", "test02.txt");
		
		BufferedOutputStream bos = null;
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream(file));
			
			bos.write("거짓말을 하면 코가 길어진다".getBytes("UTF-8"));
			
			System.out.println("dd");
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

}



















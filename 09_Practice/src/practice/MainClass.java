package practice;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;


public class MainClass {

	public static void ex01() {
		
		// 문제1. 현재 시간을 이용하여 디렉터리를 생성하시오.
		// 예시)
		// C:\14\31\30
		LocalTime now = LocalTime.now();
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		
		String sep = File.separator;
		File dir = new File("C:" + sep + hour + sep + minute + sep + second);
		
		if(dir.exists() == false) {
			dir.mkdirs();
			
		}else {
			dir.deleteOnExit();
		}
		
		
	}
	
	
	// 문제2. C:\Program Files\Java\jdk-11.0.17 경로의 파일 목록을 아래와 같이 출력하시오.
	/*
		2023-01-04  오후 02:19    <DIR>          bin
		2023-01-04  오후 02:19    <DIR>          conf
		2023-01-04  오후 02:19    <DIR>          include
		2023-01-04  오후 02:19    <DIR>          jmods
		2023-01-04  오후 02:19    <DIR>          legal
		2023-01-04  오후 02:19    <DIR>          lib
		2023-01-04  오후 02:19               160 README.html
		2023-01-04  오후 02:19             1,302 release
		               2개 파일               1,462 바이트
	 */
	public static void ex02() {
		
		String sep = File.separator;
		File dir = new File("C:" + sep + "Program Files" + sep + "Java" + sep + "jdk-11.0.17");
		
		if(dir.exists()) {
			File[] list = dir.listFiles();
			
			int fileCount = 0;
			long totalFileSize = 0;
			
			for(File file : list) {
				if(file.isHidden()) {
					continue;
				}
				String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd  a hh:mm").format(file.lastModified());
				String directiry = file.isDirectory() ? "<DIR>" : "";
				String size = "";
				if(file.isFile()) {
					long length = file.length();
					size = new DecimalFormat("#,##0").format(length);	// format(file.length(););
					fileCount++;
					totalFileSize += length;	// totalFileSize += file.length();
				}
				//String size = file.isFile() ? new DecimalFormat("#,##0").format(file.length()) : "";
				String name = file.getName();
				String result = String.format("%s%9s%9s %s\n", lastModifiedDate, directiry, size, name);
				System.out.print(result);
				
			}
			System.out.println(fileCount + "개 파일" + new DecimalFormat("#,##0").format(totalFileSize) + "바이트");
		}

		
		/*
		String sep = File.separator;
		File dir = new File("C:" + sep + "Program Files" + sep + "Java" + sep + "jdk-11.0.17");
	
		File[] files = dir.listFiles();
		Calendar now = Calendar.getInstance();
		Date nows = new Date();
		long result = 0;
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isHidden() == false) {
			long lastModifile = files[i].lastModified();
			String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(lastModifile);
			System.out.print(lastModifiedDate + " ");
			
			SimpleDateFormat sdf = new SimpleDateFormat("a hh:mm");
			String	strNow = sdf.format(nows);
			System.out.print(strNow);
			System.out.print(" ");
			
			if(files[i].isDirectory()) {
				System.out.print("<DIR>" + " ");
			}else {
				long size = files[i].length();
				System.out.print(size + " ");
				result += size;
			}
			
			System.out.println(files[i].getName());
			
			}
		}
		System.out.println("           2개 파일      " + result + " 바이트");
		
		
		*/

	
	}
	
	// 문제3. C:\storage 디렉터리를 삭제하시오.
	// 파일이 저장된 디렉터리는 지워지지 않으므로 먼저 디렉터리에 저장된 파일을 삭제해야 한다.
	public static void ex03() {
		
		File dir = new File("C:" + File.separator + "storaga");
		
		File file = new File(dir, "myfile.txt");
		if(file.exists()) {
			file.delete();
		}
		if(dir.exists()) {
			dir.delete();
		}
		
		/*
		String sep = File.separator;
		File dir = new File("C:" + sep + "storaga");
		
		File file = new File(dir, "myfile.txt");
		if(file.exists()) {
		file.delete();
		System.out.println("파일이 삭제되었습니다.");
		}
		if(dir.exists()) {
		dir.delete();
		System.out.println("디렉터리가 삭제되었습니다.");
		}
		System.out.println("삭제할게 없습니다.");
		 */	
	}
	
	
	public static void main(String[] args) {
		
		ex03();
		
	}

}

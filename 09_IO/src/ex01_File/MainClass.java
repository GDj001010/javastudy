package ex01_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class MainClass {

	/*
		File 클래스
		1. java.io 패키지
		2. 파일, 디렉터리(폴더)를 관리하는 클래스이다.
		3. 객체 생성 방법
			1) new File(경로, 파일)
			2) new File(파일)
		4. 경로 구분 방법
			1) 윈도우 : 백슬래시(\)
			2) 리눅스 : 슬래시(/)
	*/
	
	public static void ex01() {
		
		// File.separator : 플랫폼에 따라서 자동으로 경로 구분자를 사용하는 필드값.
		
		// 디렉터리 관련 필수 작업
		
		File dir = new File("C:" + File.separator +"storage");		// C드라이브 아래 storage 폴더를 의미한다.
		// 없으면 만들고, 있으면 지운다.
		if(dir.exists() == false) {				// exists < 폴더 유무 확인 메소드	공부하기   
			dir.mkdirs();
			System.out.println("C:" + File.separator + "storage 생성 완료");
		}else {
		//	dir.delete();						지금 바로 지운다.
			dir.deleteOnExit();					// JVM 실행이 끝나면 지운다.
			System.out.println("C:" + File.separator + "storage 삭제 완료");
		}
		
		}
	
	public static void ex02() throws IOException{		// 예외 처리를 ex02 메소드를 호출한 곳으로 넘긴다.
		
		File dir = new File("C:" + File.separator + "storaga");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "myfile.txt");
		if(file.exists() == false) {
			file.createNewFile();			// 반드시 예외처리가 필요한 코드
			throw new IOException("예외 발생");
		}else {
			file.delete();
		}

	}
	
	public static void ex03() throws IOException{
		
		File dir = new File("C:" + File.separator + "storaga");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "myfile.txt");
		
		if(file.exists() == false) {
			file.createNewFile();
		}
	
		// 파일의 정보 확인
		System.out.println("파일명 : " + file.getName());
		System.out.println("디렉터리명 : " + file.getParent());
		System.out.println("경로명 : " + file.getPath());			// 파일명 + 디렉터리명
		
		System.out.println("디렉터리인가? " + file.isDirectory());
		System.out.println("파일인가? " + file.isFile());
		
		
		long lastModified = file.lastModified();	// 최종 수정일의 타임 스탬프 값이 나옴
		System.out.println("최종 수정일: " + lastModified);
		
		String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(lastModified);
		System.out.println("최종 수정일: " + lastModifiedDate);

		long size = file.length();					// 파일의 크기가 바이트 단위로 저장
		long kb = (size / 1024) + (size % 1024 != 0 ? 1 : 0);	// 1025바이트면 윈도우가 2KB로 인식하기 때문에 1024로 나눈 후 나머지가 있다면 1 더해주는 식
		System.out.println("파일 크기: " + kb + "KB");		// 킬로 바이트 단위로 출력 ( 1024바이트 == 1킬로바이트 ) 그냥 출력시 바이트 단위로 출력 
		
		
	}
	
	public static void main(String[] args) throws IOException {	// main 메소드를 호출하는 곳으로 예외처리를 넘긴다. (개발자가 try-catch 하지 않겠다.)
		
		ex03();
		
	}

}

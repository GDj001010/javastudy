package ex02_socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientMainClass {

	
	public static void main(String[] args) {
		// Socket : 클라이언트가 사용하는 Socket
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			
			// InetSocketAddress : 접속할 서버의 정보를 이용해서 생성
			InetSocketAddress address = new InetSocketAddress("localhost", 9090);
		
			// 서버에 접속
			socket.connect(address); 		// IOException 처리 필요
			
			System.out.println("[클라이언트] 접속 성공");
			
			// 서버가 보낸 welcome 메시지 확인하기
			DataInputStream in = new DataInputStream(socket.getInputStream());
			String welcomeMessage = in.readUTF();
			System.out.println("[클라이언트] " + welcomeMessage);
			
			
		}catch (IOException e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(socket.isClosed() == false) {
					socket.close();
				}
			}catch (IOException e) {
				e.printStackTrace();// TODO: handle exception
			}
		}

	}

}

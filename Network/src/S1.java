import java.net.*;
import java.io.*;

//서버 구성
public class S1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("통신시작");
		ServerSocket ss = new ServerSocket(9001); //포트 번호 만듬 
		System.out.println("Accept..");
		Socket socket = ss.accept(); //클라이언트 접속할 때까지 wait
		
		System.out.println("연결 완료..");
		InputStream is = socket.getInputStream(); //inputStream은 받는 쪽, outputStream은 던지는 쪽
		DataInputStream dis = new DataInputStream(is); //read
		
		//로직 처리..client가 int를 보냈으므로 int로 받음. 
		//network는 thread를 작성해서 input과  output을 따로 관리해야 함. 지금은 일단 나중에..
		int value = dis.readInt();
		System.out.println(value);
		
		
		socket.close(); //socket을 닫으면 input과 output모두 닫히니까 
		
	}

}

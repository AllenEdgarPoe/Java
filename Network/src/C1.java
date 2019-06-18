import java.net.*;
import java.io.*;

public class C1 {

	public static void main(String[] args) throws IOException {
		//Socket socket = new Socket("192.168.10.1", 9001);//ip주소, 포트번호
		//Socket socket = new Socket("localhost", 9001);
		Socket socket = new Socket("127.0.0.1", 9001);
	
		OutputStream os = socket.getOutputStream(); //정보를 던지는 것.  
		DataOutputStream dos = new DataOutputStream(os); //데이터 필터링. 
		 
		// 로직...
		dos.writeInt(12); 
		
		socket.close();
		//그냥 하면 서버가 돌지 않으므로 exception error가 남. 
	}

}

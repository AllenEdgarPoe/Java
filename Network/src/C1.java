import java.net.*;
import java.io.*;

public class C1 {

	public static void main(String[] args) throws IOException {
		//Socket socket = new Socket("192.168.10.1", 9001);//ip�ּ�, ��Ʈ��ȣ
		//Socket socket = new Socket("localhost", 9001);
		Socket socket = new Socket("127.0.0.1", 9001);
	
		OutputStream os = socket.getOutputStream(); //������ ������ ��.  
		DataOutputStream dos = new DataOutputStream(os); //������ ���͸�. 
		 
		// ����...
		dos.writeInt(12); 
		
		socket.close();
		//�׳� �ϸ� ������ ���� �����Ƿ� exception error�� ��. 
	}

}

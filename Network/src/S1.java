import java.net.*;
import java.io.*;

//���� ����
public class S1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("��Ž���");
		ServerSocket ss = new ServerSocket(9001); //��Ʈ ��ȣ ���� 
		System.out.println("Accept..");
		Socket socket = ss.accept(); //Ŭ���̾�Ʈ ������ ������ wait
		
		System.out.println("���� �Ϸ�..");
		InputStream is = socket.getInputStream(); //inputStream�� �޴� ��, outputStream�� ������ ��
		DataInputStream dis = new DataInputStream(is); //read
		
		//���� ó��..client�� int�� �������Ƿ� int�� ����. 
		//network�� thread�� �ۼ��ؼ� input��  output�� ���� �����ؾ� ��. ������ �ϴ� ���߿�..
		int value = dis.readInt();
		System.out.println(value);
		
		
		socket.close(); //socket�� ������ input�� output��� �����ϱ� 
		
	}

}

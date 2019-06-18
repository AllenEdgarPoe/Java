package GroupChat;

import java.io.*;
import java.util.*;
import java.net.*;

public class ChatClient {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("***Starting Chat***");
		System.out.print("Input your nickname >");
		String nickname = scn.nextLine();
	
		
		Socket socket = null; //일단 외부에서 받는 걸로.
		try {
			socket = new Socket("192.168.30.4", 9009);	
			
			OutputStream os = socket.getOutputStream();
			DataOutput dos = new DataOutputStream(os);
			
			dos.writeInt(1);
			dos.writeUTF(nickname);
			
			///inputThread
			InputThread inputThread = new InputThread();
			inputThread.in = socket.getInputStream();
			inputThread.start();
			
			
			while (true) {
				System.out.println("Input your message>");
				String message = scn.nextLine();
				
				if(message.equals("q")) {
					dos.writeInt(3);
					System.out.println("Ending Chat");
					inputThread.isExit = true;
					break;
					
				}else {
					dos.writeInt(2);
					dos.writeUTF(message);
				}
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		 
		
		
	}

}

//input thread만들기
class InputThread extends Thread{
	//overriding
	public InputStream in;
	public boolean isExit = false;
	
	public void run() {
		DataInputStream dis = new DataInputStream(in);
		while(true) {
			if (isExit == true)
				break;
			
			try {
				String message = dis.readUTF();
				System.out.println(message);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}



















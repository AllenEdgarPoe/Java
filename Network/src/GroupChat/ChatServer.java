package GroupChat;
import java.util.*;
import java.io.*;
import java.net.*;

public class ChatServer {

	public static void main(String[] args) {
		System.out.println("Starting server");
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(9009);
			
			while(true) {
				Socket socket = ss.accept();
				SocketModel.listSocket.add(socket);
				
				ProcessThread pt = new ProcessThread();
				pt.socket = socket;
				pt.start();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ss.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		while (true) {
			try {
				System.out.println("Accept..");
				Socket socket = ss.accept();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}

class ProcessThread extends Thread{
	public Socket socket ;
	public String nickName;
	
	public void run() {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				String broadCastMessage = "";
				int command = dis.readInt();
				
				if(command == 1) {
					String nickName = dis.readUTF();
					this.nickName = nickName;
					broadCastMessage += nickName +"님이 참여하였습니다!★\r\n";

							
				}else if(command == 2) {
					String message = dis.readUTF();
					broadCastMessage += nickName+ ": "+message;
					
				}else if(command == 3) {
					broadCastMessage += nickName +"님이 퇴장하였습니다.";
					SocketModel.listSocket.remove(socket);
				}
				
				System.out.println("lalal");
				
				for(int i = 0; i<SocketModel.listSocket.size();i++) {
					Socket socket = SocketModel.listSocket.get(i);
					OutputStream os = socket.getOutputStream();
					DataOutputStream dos = new DataOutputStream(os);
					
					dos.writeUTF(broadCastMessage);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class SocketModel{
	public static ArrayList<Socket> listSocket = new ArrayList<Socket>();
}







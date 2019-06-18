package ManagingFile;

import java.io.*;
public class FileLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\temp\\test.dat");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			//읽기 로직.... 로직 예...
			int value = dis.readInt();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
			
	}

}


package ManagingFile;

import java.io.*;

public class SaveFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\temp\\test.bmp");
		
		FileOutputStream os = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		
 		try {
			os = new FileOutputStream(file); //���� �־��ִ� ����. ����Ʈ �����θ� �־���. 
			bos = new BufferedOutputStream(os); //buffered�� �迭. ���������� ũ�⸦ ���� �迭. ���� ���� ũ�⸦ �־��ٰ� �� ���� write����. 
			dos = new DataOutputStream(bos); //write int. byte, utf�̷������� �־��ִ� ����. 
			
			//���� ����
			
						
			dos.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}


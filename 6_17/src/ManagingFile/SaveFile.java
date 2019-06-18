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
			os = new FileOutputStream(file); //값을 넣어주는 역할. 바이트 단위로만 넣어줌. 
			bos = new BufferedOutputStream(os); //buffered는 배열. 내부적으로 크기를 가진 배열. 램에 일정 크기를 넣었다가 다 차면 write해줌. 
			dos = new DataOutputStream(bos); //write int. byte, utf이런식으로 넣어주는 필터. 
			
			//저장 로직
			
						
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


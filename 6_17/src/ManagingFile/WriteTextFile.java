package ManagingFile;
import java.io.*;

public class WriteTextFile {

	public static void main(String[] args) {
		// 문자 스트림..
		File file = new File("C:\\temp\\aaa.txt");
		try {
			FileWriter writer = new FileWriter(file);
			
			writer.write("HI\r\n");
			writer.write("Hello");
			writer.write(2009); //문자열만 가능하기 때문에 이건 ?로 처리
			writer.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("끝났음");
	}

}

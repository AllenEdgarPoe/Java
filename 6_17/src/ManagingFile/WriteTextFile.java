package ManagingFile;
import java.io.*;

public class WriteTextFile {

	public static void main(String[] args) {
		// ���� ��Ʈ��..
		File file = new File("C:\\temp\\aaa.txt");
		try {
			FileWriter writer = new FileWriter(file);
			
			writer.write("HI\r\n");
			writer.write("Hello");
			writer.write(2009); //���ڿ��� �����ϱ� ������ �̰� ?�� ó��
			writer.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("������");
	}

}

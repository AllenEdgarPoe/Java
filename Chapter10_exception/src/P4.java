import java.io.File;
import java.io.FileInputStream;

public class P4 {
	public static void main(String[] args) {
		FileInputStream is = null;
		
		try {
			File f = new File("C:\\aaa.txt");
			is = new FileInputStream(f);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally{ //
			try {
				is.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
}

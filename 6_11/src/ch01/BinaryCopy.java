package ch01;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class BinaryCopy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("c:/Temp/photo.png");
		File f2 = new File("c:/Temp/copy.png");
		try {
			FileInputStream fis = new FileInputStream(f1);
			FileOutputStream fos = new FileOutputStream(f2);
			int c;
			while((c = fis.read())!=-1) {
				fos.write((byte)c);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

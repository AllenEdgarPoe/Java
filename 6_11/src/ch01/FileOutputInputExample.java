package ch01;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
/**
 * console - Scanner(System.in)
 * "Life is too short"
 * c:/temp/ex01.txt<-FileWriter
 * <- FileReader
 * 모니터 출력 <- out()
 */
public class FileOutputInputExample {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			///append하려면 뒤에 true로 넣으면 된당
			File file1 = new File("c:/temp/ex01.txt");
			/*
			FileWriter fw = new FileWriter("c:/temp/ex01.txt",true);
			FileReader fr = new FileReader("c:/temp/ex01.txt");
			*/
			FileWriter fw = new FileWriter(file1);
			FileReader fr = new FileReader(file1);
			
			System.out.print("쓰고 싶은 말을 쓰세요 >");
			String str = scanner.nextLine();
			fw.write(str);
			fw.write("\n\r");
			fw.close();
			System.out.println("파일 저장 완료");
			int c; 
			
			while((c = fr.read())!= -1) {
				System.out.print((char)c);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

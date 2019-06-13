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
 * ����� ��� <- out()
 */
public class FileOutputInputExample {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			///append�Ϸ��� �ڿ� true�� ������ �ȴ�
			File file1 = new File("c:/temp/ex01.txt");
			/*
			FileWriter fw = new FileWriter("c:/temp/ex01.txt",true);
			FileReader fr = new FileReader("c:/temp/ex01.txt");
			*/
			FileWriter fw = new FileWriter(file1);
			FileReader fr = new FileReader(file1);
			
			System.out.print("���� ���� ���� ������ >");
			String str = scanner.nextLine();
			fw.write(str);
			fw.write("\n\r");
			fw.close();
			System.out.println("���� ���� �Ϸ�");
			int c; 
			
			while((c = fr.read())!= -1) {
				System.out.print((char)c);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

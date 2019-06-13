package ch01;
import java.io.File;

public class FileListEx {
	public static void listDirectory(File dir) {
		File[] subfiles = dir.listFiles(); //서브디렉토리 리스트
		for(int i=0;i<subfiles.length;i++) {
			File f = subfiles[i];
			long t = f.lastModified(); //생성시간, 최근 수정시간 /현재 시간은 1970.1.1.0.0 으로부터 시간 계산한거. 
			System.out.println(t);
			System.out.println(f.getName()); //파일 이름 받기
			System.out.println(f.length());
			System.out.printf("\t수정한 시간:%tb %td %ta %tT\n",t,t,t,t); //문자열에서 %뒤에 나오는 건 그 계수만큼 값이 매칭되는 것
			
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("c:/temp");
		if(f1.isFile()) {
			System.out.println("파일입니다");
		}else if(f1.isDirectory()){
			System.out.println("디렉토리입니다");
		}
		listDirectory(f1);
		
	}
}





















package ch01;
import java.io.File;

public class FileListEx {
	public static void listDirectory(File dir) {
		File[] subfiles = dir.listFiles(); //������丮 ����Ʈ
		for(int i=0;i<subfiles.length;i++) {
			File f = subfiles[i];
			long t = f.lastModified(); //�����ð�, �ֱ� �����ð� /���� �ð��� 1970.1.1.0.0 ���κ��� �ð� ����Ѱ�. 
			System.out.println(t);
			System.out.println(f.getName()); //���� �̸� �ޱ�
			System.out.println(f.length());
			System.out.printf("\t������ �ð�:%tb %td %ta %tT\n",t,t,t,t); //���ڿ����� %�ڿ� ������ �� �� �����ŭ ���� ��Ī�Ǵ� ��
			
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("c:/temp");
		if(f1.isFile()) {
			System.out.println("�����Դϴ�");
		}else if(f1.isDirectory()){
			System.out.println("���丮�Դϴ�");
		}
		listDirectory(f1);
		
	}
}





















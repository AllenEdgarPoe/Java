package inheritance;

public class interfaceClass {
	public static void main(String[] args) {
//		CommandAble c1 = new c();
		
	}
}
//Interface
interface CmdTest{
	public abstract void method1();
	public abstract void method2();
}

interface CommandAble{
	//
	
//	public abstract int a = 10; //����� ���� �ʴ� static. 
	public abstract void command(); //public abstract�� �׻� ����.
	
}

//abstract class CommandAble{ //���� ���������� interface�� �κ� ����ȭ�� ����..
//	int a;
//	public abstract void command();
//}


class AAA implements CommandAble{
	public void command(){  //�������̽� ������������ �޽������� ��밡��..
		System.out.println("WTF");
//		public void method1();
//		cmdTest2 = new AAA();
//		c1.command();
	}
}

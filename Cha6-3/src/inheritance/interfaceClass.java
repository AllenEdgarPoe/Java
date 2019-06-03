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
	
//	public abstract int a = 10; //상속이 되지 않는 static. 
	public abstract void command(); //public abstract가 항상 붙음.
	
}

//abstract class CommandAble{ //위와 동일하지만 interface는 부분 형상화가 가능..
//	int a;
//	public abstract void command();
//}


class AAA implements CommandAble{
	public void command(){  //인터페이스 참조변수명을 메쏘드명으로 사용가능..
		System.out.println("WTF");
//		public void method1();
//		cmdTest2 = new AAA();
//		c1.command();
	}
}

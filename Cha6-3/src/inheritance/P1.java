package inheritance;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c1 = new ChildClass();
		c1.v1 = 10;
		c1.v2 = 20;
		c1.v3 = 30;
		c1.method1();
		
		//������...
		ParentClass c2 = new ChildClass();
		c2.v1 = 20;
		c2.v2 = 30;
		//c2.v3 = 40; ������.
		
		//Overriding
		c2.method1();
		
		ParentClass c3 = new ChildClass2();
		c3.method1();
		
		c3 = new ChildClass(); //c3�� ChildClass�� ���������� �ٲ�� ChildClass�� �޽���..
		c3.method1();
		
		ParentClass c4 = new ChildClass3();
		c4.method1();
		
		
		ParentClass ref = null;
		ref = new ParentClass();
		ref = new ChildClass();
		ref = new ChildClass2();
		ref = new ChildClass3();
		
		//��������ȯ
		ChildClass ref2 = (ChildClass)new ParentClass(); 
		ref2.v3 = 10; //ClassCastException ���� �߻�.. ParentClass���� ���� ����.
		

		
	}

}
class ParentClass{
	public int v1;
	public int v2;
	public void method1() {
		System.out.println("ParentClass �ȳ��ϼ���");
	}
}

class ChildClass extends ParentClass{
	public int v3;
	public void method1() {
		System.out.println("ChildClass �ȳ��ϼ���");
	}

}

class ChildClass2 extends ParentClass{
	public void method1() {
		System.out.println("~~~~");
	}
}

class ChildClass3 extends ParentClass{
	public void method2() {
		System.out.println("!!!!!!");
	}
}










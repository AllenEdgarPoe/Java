package inheritance;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c1 = new ChildClass();
		c1.v1 = 10;
		c1.v2 = 20;
		c1.v3 = 30;
		c1.method1();
		
		//다형성...
		ParentClass c2 = new ChildClass();
		c2.v1 = 20;
		c2.v2 = 30;
		//c2.v3 = 40; 오류남.
		
		//Overriding
		c2.method1();
		
		ParentClass c3 = new ChildClass2();
		c3.method1();
		
		c3 = new ChildClass(); //c3가 ChildClass로 참조변수를 바뀌면 ChildClass의 메쏘드로..
		c3.method1();
		
		ParentClass c4 = new ChildClass3();
		c4.method1();
		
		
		ParentClass ref = null;
		ref = new ParentClass();
		ref = new ChildClass();
		ref = new ChildClass2();
		ref = new ChildClass3();
		
		//강제형변환
		ChildClass ref2 = (ChildClass)new ParentClass(); 
		ref2.v3 = 10; //ClassCastException 문제 발생.. ParentClass에는 없기 때문.
		

		
	}

}
class ParentClass{
	public int v1;
	public int v2;
	public void method1() {
		System.out.println("ParentClass 안녕하세요");
	}
}

class ChildClass extends ParentClass{
	public int v3;
	public void method1() {
		System.out.println("ChildClass 안녕하세요");
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










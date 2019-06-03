package inheritance;

public class UsageExample {
	public static void main(String[] args) {
		PlusAble p = new Plus();
		
		int result = p.plus(10,20);
		
		System.out.println(result);
		
	}
}

interface PlusAble{
	public abstract int plus(int a,int b);
}

class Test implements PlusAble{
	public int plus(int a, int b) {
		return 1;
	}
}
//B
class Plus implements PlusAble{
	public int plus(int a, int b) {
		return a+b;
	}
}









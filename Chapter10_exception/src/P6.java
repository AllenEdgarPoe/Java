
public class P6 {
	public static void main(String[] args){
		try {
			int a = 10/0;
			int [] arr = null;
			arr.toString();
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic");
		}catch(NullPointerException e) {
			System.out.println("Null");
		}
	}
}

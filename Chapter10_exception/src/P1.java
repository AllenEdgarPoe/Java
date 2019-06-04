
public class P1 {
	public static void main(String[] args) {
		
		Problem prob = new Problem();
		
		try {
			int a = 10/0; //Exception error
		}catch(Exception e) {
//			e.printStackTrace(); //문자가 나옴
			prob.method1();
		}
		
		try {
			int [] arr = null;
			System.out.println(arr.length);
		}catch(Exception e) {
			prob.method1();
		}
		
		try {
			int[] arr = new int[10];
			arr[10] = 100;
		}catch(Exception e){
			prob.method1();
		}
	}
}

class Problem{
	public void method1() {
		System.out.println("문제 발생!!!!");
	}
}

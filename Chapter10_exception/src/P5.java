
public class P5 {
	public static void main(String[] args){ //간혹 main에다가 throws Exception하기도 함
		AAA a = new AAA();
		try {
			int result = a.method1(10,0);
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class AAA{
	public int method1(int a, int b) throws Exception{ //호출한 쪽에 처리를 해라
		if(b ==0) {
			throw new Exception("0으로는 나눌 수 없음ㅋ");
		}
		return a/b;
	}
}
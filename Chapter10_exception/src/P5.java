
public class P5 {
	public static void main(String[] args){ //��Ȥ main���ٰ� throws Exception�ϱ⵵ ��
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
	public int method1(int a, int b) throws Exception{ //ȣ���� �ʿ� ó���� �ض�
		if(b ==0) {
			throw new Exception("0���δ� ���� �� ������");
		}
		return a/b;
	}
}
package ch05;

public class RunnableMain {
	public static void main(String[] args) {
		//Runnable����� Ŭ������ Thread�� ������ �Ű������� �����ؼ� ����
		Thread th = new Thread(new RunnableClass());
		th.start();
	}

}

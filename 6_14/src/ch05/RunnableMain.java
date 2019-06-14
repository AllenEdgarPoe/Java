package ch05;

public class RunnableMain {
	public static void main(String[] args) {
		//Runnable기능의 클래스를 Thread의 생성자 매개변수로 전달해서 생성
		Thread th = new Thread(new RunnableClass());
		th.start();
	}

}

package ch05;

public class ThreadExMain {
	public static void main(String[] args) {
		TimerThreader th
			= new TimerThreader();
		//th.run();
		th.start();
	}
}

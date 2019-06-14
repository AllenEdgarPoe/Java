package ch05;

public class TimerThreader extends Thread {
	int n = 0;
	public void run() {
		while(true) {
			n++;
			try {
				System.out.println(n);
				sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

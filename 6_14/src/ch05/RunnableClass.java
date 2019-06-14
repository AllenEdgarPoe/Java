package ch05;

public class RunnableClass extends Object implements Runnable{
	int n = 0;
	@Override
	public void run() {
			while(true) {
				n++;
				try {
					System.out.println(n);
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

}

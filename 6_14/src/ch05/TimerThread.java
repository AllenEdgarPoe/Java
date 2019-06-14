package ch05;

import java.util.Random;

import javax.swing.JLabel;

public class TimerThread extends Thread{
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	public void run() {
		int n = 0;
		Random rand = new Random();
		for(int i=1; i<10; i++) {
			timerLabel.setText(Integer.toString(rand.nextInt(10)));
		}
		
	}
}

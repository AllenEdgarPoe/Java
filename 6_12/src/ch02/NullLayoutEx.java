package ch02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class NullLayoutEx {
	public NullLayoutEx() {
		setTitle("NullLayout");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //배치관리자 삭제
		
		JLabel la = new JLable("Hello Press Buttons");
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);
		
		for(int i=1;i<=9;i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			c.add(b);
		}
		setVisible(true);
	}
}
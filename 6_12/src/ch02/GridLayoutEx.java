package ch02;

import java.awt.GridLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutEx {
	public GridLayoutEx() {
		setTitle("GridLayout");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("�̸�"));
		c.add(new JLabel(""));
		c.add(new JLabel("�й�"));
		c.add(new JLabel(""));
		c.add(new JLabel("�а�"));
		c.add(new JLabel(""));
		c.add(new JLabel("����"));
		c.add(new JLabel(""));
		c.add(new JLabel("�̸�"));
		
		setVisible(true);
	}
}

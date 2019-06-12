package ch02;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle("flowLayout");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//배치관리자 설정

		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30,40));
	
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
		c.add(new JButton("mul"),BorderLayout.EAST);
		c.add(new JButton("div"),BorderLayout.WEST);
		c.add(new JButton("Calculate"),BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayoutEx ex = new FlowLayoutEx();

	}

}

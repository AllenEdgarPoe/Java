package ch04;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldEx extends JFrame {
	//
	JTextField tf1 = null;
	JTextField tf2;
	JTextField tf3;

	public JTextFieldEx() {
		setTitle("JTextField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		c.add(new JLabel("이름"));
		
		tf1 = new JTextField(20);
		c.add(tf1);
		c.add(new JLabel("학과"));
		tf2 = new JTextField("컴퓨터공학과",20);
		c.add(tf2);
		c.add(new JLabel("주소"));
		tf3 = new JTextField("서울시..",20);
		c.add(tf3);

		
		JButton button = new JButton("출력");
		c.add(button);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextFieldEx();
	}

}

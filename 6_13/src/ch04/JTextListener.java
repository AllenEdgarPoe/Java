package ch04;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextListener extends JFrame {
	//
	JTextField tf1 = null;
	JTextField tf2;
	JTextField tf3;

	public JTextListener() {
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

		
		JButton button = new JButton("파일로 저장");
		button.addActionListener(new MyTextListener()) ;
		c.add(button);
		JButton button2 = new JButton("파일로부터 읽기");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
						FileReader fr = new FileReader("c:/temp/info.text");
						int c;
						while((c=fr.read())!= -1) {
							System.out.print((char)c);
						}
					fr.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				c.add(button2);
				
				
				setSize(300,300);
				setVisible(true);
			}
		
		});
	
	class MyTextListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println(tf1.getText());
			System.out.println(tf2.getText());
			System.out.println(tf3.getText());
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			try {
				FileWriter fw = new FileWriter("c:/temp/info.text");
				
				fw.write(tf1.getText()+"\n\r");
				fw.write(tf2.getText()+"\n\r");
				fw.write(tf3.getText()+"\n\r");
				fw.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextListener();
	}

}

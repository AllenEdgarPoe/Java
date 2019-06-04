import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class p1 {
	public static void main(String[] args) {
		new MyFrame(); //�����ּҸ� �� �޾Ƶ� ��
		
	}
}

class MyFrame extends JFrame{
	public MyFrame() {
		super("test"); //JFrame�� �⺻ �����ڸ� ȣ����. 
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //xǥ �������� terminate
		
		this.setBounds(600,300,500,500); //��ġ �� ũ�� frame����. (x,y,width,height) 
		this.setLayout(new FlowLayout());
		
		Button btn = new Button("Imma Button");
		Button btn2 = new Button("Calculation");
		
		CommandHello cmd = new CommandHello();
		CommandHello2 cmd2 = new CommandHello2();
		
		btn.addActionListener(cmd); 
		btn2.addActionListener(cmd2);
		
		
		this.add(btn);
		this.add(btn2);
		
		this.setVisible(true);
		
		
	}


}

//Action �����ϱ�
class CommandHello implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "�ݰ�����");
				
	}
}

class CommandHello2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int result = a + b;
		JOptionPane.showInputDialog(a+" + "+b+" = ?");
	
	}
}










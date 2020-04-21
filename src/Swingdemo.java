import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Swingdemo extends JFrame implements ActionListener{
	JTextField T1;
	JTextField T2;
	 Swingdemo()
	 {
		 JLabel L1=new JLabel("Enter name");
		 JTextField T1=new JTextField(10);
		 JLabel L2=new JLabel("Enter Password");
		 JTextField T2=new JTextField(10);
		 JButton b1=new JButton("Login");
		 JButton b2=new JButton("cancel");
		 add(L1);
		 add(T1);
		 add(L2);
		 add(T2);
		 add(b1);
		 add(b2);
		 
		 setSize(400,400);
		 setVisible(true);
		 setLayout(new FlowLayout());
		 setTitle("Rushikesh");
		 b1.addActionListener(this);
		 
		 
	 }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                new Swingdemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str=e.getActionCommand();
		if(str.equals("Login"))
		{
			if(T1.getText().equals(T2.getText()))
			{
				System.out.println("Login Successfully");
				JOptionPane.showMessageDialog(this,"successful");
			}
		}
		else
		{
			System.out.println("Login failed");
			JOptionPane.showMessageDialog(this,"Login failed");
		}
	}

}

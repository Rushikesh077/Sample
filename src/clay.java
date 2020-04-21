import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class clay extends Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clay c1=new clay();
		

	}
	clay()
	{
		 Panel p = new Panel();
		    p.setBackground(Color.pink);
		    p.add(new Button("One"));
		    p.add(new Button("Two"));
		    p.add(new Button("Three"));
		    add("North",p);
		    setLayout(new FlowLayout());
		    setSize(300,300);
		    setVisible(true);
		   

	}

}

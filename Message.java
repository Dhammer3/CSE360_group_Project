/*import javax.swing.JOptionPane;

public class Message
{

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, " " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}*/






import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Message extends JFrame {
	Message(){
		JFrame f=new JFrame("April 1st");
					//submit button
		JButton b=new JButton("Update");
		b.setBounds(100,190,140, 40);

					//enter name label
		JLabel label = new JLabel();
		label.setText("Event Name :");
		label.setBounds(10, 10, 100, 100);
					//empty label which will show event after button clicked
		JLabel label1 = new JLabel();
		label1.setBounds(10, 140, 200, 100);
					//textfield to enter name
		JTextField textfield= new JTextField();
		textfield.setBounds(140, 50, 130, 30);
					//add to frame

//////////////////////////////////////////////////////////////////
		JLabel labelx = new JLabel();
		labelx.setText("Due Date :");
		labelx.setBounds(10, 50, 100, 100);
		f.add(labelx);
		JTextField textfieldx= new JTextField();
		textfieldx.setBounds(140, 90, 130, 30);
		f.add(textfieldx);
////////////////////
		JLabel labely = new JLabel();
		labely.setText("Description :");
		labely.setBounds(10, 90, 100, 100);
		f.add(labely);
		JTextField textfieldy= new JTextField();
		textfieldy.setBounds(140, 130, 130, 30);
		f.add(textfieldy);


///////////////////////////////////////////////////////////////////


		f.add(label1);
		f.add(textfield);
		f.add(label);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

							//action listener
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {
					label1.setText("**Updated**");
			}
	      });
		}


		public static void main(String[] args) {
		    new Message();
		}
 }
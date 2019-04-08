package calender;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Message extends JFrame {
	Message(){
		String month = drop.title;
		int day = drop.day;
		JFrame f=new JFrame(" ");
		f.setTitle(month + " " + day);
		
		//add button
		JButton add=new JButton("Add");
		add.setBounds(5,190,140, 40);
		
		JButton delete=new JButton("Delete");
		delete.setBounds(5,235,140,40);  //( x, y, width, height)
		
		JButton change=new JButton("Change");
		change.setBounds(5,280,140, 40);
		
		JButton display=new JButton("Display");
		display.setBounds(5,325,140, 40);
		
		JButton printReport=new JButton("Print Report");
		printReport.setBounds(5,370,140, 40);
		
		JButton save=new JButton("Save");
		save.setBounds(5,415,140, 40);
		
		JButton restore=new JButton("Restore");
		restore.setBounds(5,460,140, 40); 
		
		
		//enter name label
		JLabel label = new JLabel();
		label.setText("Event Name :");
		label.setBounds(10, 10, 100, 100);
		
		//empty label which will show event after button clicked
		JLabel label1 = new JLabel();
		label1.setBounds(10, 120, 200, 100);
		
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
////////////////////
		JLabel labelz = new JLabel();
		labelz.setText("Events for " + month + " " + day + ":");
		labelz.setBounds(500, 10, 130, 100); //( x, y, width, height)
		f.add(labelz);
////////////////////
		JLabel labelLine = new JLabel();
		labelLine.setText("_______________");
		labelLine.setBounds(500, 15, 130, 100); //( x, y, width, height)
		f.add(labelLine);
////////////////////
		JLabel labelName = new JLabel();
		labelName.setText("Event Name:");
		labelName.setBounds(400, 50, 130, 100); //( x, y, width, height)
		f.add(labelName);
		
		JLabel labelName2 = new JLabel();
		labelName2.setText("n/a");
		labelName2.setBounds(480, 50, 130, 100); //( x, y, width, height)
		f.add(labelName2);		
////////////////////
		JLabel labelPriority = new JLabel();
		labelPriority.setText("Priority:");
		labelPriority.setBounds(400, 80, 130, 100); //( x, y, width, height)
		f.add(labelPriority);
		
		JLabel labelPriority2 = new JLabel();
		labelPriority2.setText("n/a");
		labelPriority2.setBounds(480, 80, 130, 100); //( x, y, width, height)
		f.add(labelPriority2);
/////////////////////
		JLabel labelDue = new JLabel();
		labelDue.setText("Due Date:");
		labelDue.setBounds(400, 110, 130, 100); //( x, y, width, height)
		f.add(labelDue);
		
		JLabel labelDue2 = new JLabel();
		labelDue2.setText("n/a");
		labelDue2.setBounds(480, 110, 130, 100); //( x, y, width, height)
		f.add(labelDue2);
/////////////////////
		JLabel labelDescription = new JLabel();
		labelDescription.setText("Description:");
		labelDescription.setBounds(400, 140, 130, 100); //( x, y, width, height)
		f.add(labelDescription);		
		
		JLabel labelDescription2 = new JLabel();
		labelDescription2.setText("n/a");
		labelDescription2.setBounds(480, 140, 130, 100); //( x, y, width, height)
		f.add(labelDescription2);		
		
///////////////////////////////////////////////////////////////////
		f.add(label1);
		f.add(textfield);
		f.add(label);
		
		f.add(add);
		f.add(delete);
		f.add(change);
	    f.add(display);
	    f.add(printReport);
		f.add(save);
		f.add(restore); 
		
		
		f.setSize(900,900);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		//action listener
		add.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent a) {
	label1.setText("**Updated**");
	
	String name = textfield.getText();
	String date = textfieldx.getText();
	String description = textfieldy.getText();
	labelName2.setText(name);
	labelDue2.setText(date);
	labelDescription2.setText(description);
	}
  });
}


public static void main(String[] args) {
    new Message();
	}
 }
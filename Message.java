package calender;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;




public class Message extends JFrame {
	//int jButtonYset=220;
	int xDescriptionSpacing=10;
	int xTextFieldSpacing=140;
	
	int ySpacing=10;
	int yButtonSpacing=200;
	int xDescriptionSize=130;
	int yDescriptionSize=100;
	
	String taskName="";
	String dueDate="";
	String description="";
	String priorityText=""; //need to do error handling for this
	
	
	
	public Message(){
		/////////////////////////////////////
		String month = drop.month;
		String day = drop.day;
		String year = drop.year;
		/////////////////////////////////////
		
		toDoList List= new toDoList();
		JFrame f=new JFrame(month+" "+day+" " +year);

		JLabel label = new JLabel();
		label.setText("Task Name :");
		label.setBounds(xDescriptionSpacing, ySpacing, 100, 100);
		
		yInputIterate();	
		JTextField toDoItemName= new JTextField();
		toDoItemName.setBounds(xTextFieldSpacing, ySpacing, 130, 30);
		//toDoItemName.setText("here");
		
		JTextArea todoLists=new JTextArea();
		todoLists.setBounds(400, 10, 400, 400);
		
		/*JTextField todoName=new JTextField();
		todoName.setBounds(400, 40, 400, 400);
		
		JTextField todoDate=new JTextField();
		todoDate.setBounds(400, 80, 400, 400);
		
		JTextField todoDes=new JTextField();
		todoDes.setBounds(400, 120, 400, 400);
*/
		
		//drop down for date
		JLabel labelx = new JLabel();
		labelx.setText("Due Date :");
		labelx.setBounds(xDescriptionSpacing, ySpacing, 100, 100);
		f.add(labelx);
	
		yInputIterate();
		JTextField dueDateTextField= new JTextField();
		dueDateTextField.setBounds(xTextFieldSpacing, ySpacing, 130, 30);
		//dueDateTextField.setText("Here");
	
		f.add(dueDateTextField);

		JLabel desc = new JLabel();
		desc.setText("Description :");
		desc.setBounds(xDescriptionSpacing, ySpacing, 100, 100);
		f.add(desc);
		
		yInputIterate();
		JTextField descriptionTextBox= new JTextField();
		descriptionTextBox.setBounds(xTextFieldSpacing, ySpacing, 130, 30);
		f.add(descriptionTextBox);
		
		JLabel priority = new JLabel();
		priority.setText("Priority :");
		priority.setBounds(xDescriptionSpacing, ySpacing, 100, 100);
		f.add(priority);
		
		yInputIterate();
		JTextField priorityTextBox= new JTextField();
		priorityTextBox.setBounds(xTextFieldSpacing, ySpacing, 130, 30);
		f.add(priorityTextBox);
		
		
		JLabel feedBackMessage = new JLabel();
		feedBackMessage.setBounds(xDescriptionSpacing, ySpacing, 200, 100);
		
		
		yInputIterate();
		yInputIterate();
		JButton update=new JButton("Update");
		update.setBounds(xDescriptionSpacing,ySpacing,140, 40);
		
		yInputIterate();
		JButton delete=new JButton("Delete");
		delete.setBounds(xDescriptionSpacing,ySpacing,140, 40);
		
		yInputIterate();
		JButton change=new JButton("Change");
		change.setBounds(xDescriptionSpacing,ySpacing,140, 40);
		
		yInputIterate();
		JButton save=new JButton("Save");
		save.setBounds(xDescriptionSpacing,ySpacing,140, 40);

		yInputIterate();
		JButton load=new JButton("Load");
		load.setBounds(xDescriptionSpacing,ySpacing,140, 40);
		
		yInputIterate();
		JButton print=new JButton("Print");
		print.setBounds(xDescriptionSpacing,ySpacing,140, 40);

		
	
		f.add(feedBackMessage);
		f.add(toDoItemName);
		f.add(label);
		f.add(update);
		f.add(delete);
		f.add(change);
		f.add(save);
		f.add(load);
		f.add(print);
		f.add(todoLists);
		
		f.setSize(900,600);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

							//action listener
		update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent updateButton) 
			{
				boolean updated=false;
				taskName=toDoItemName.getText();
				dueDate=dueDateTextField.getText();
				description=descriptionTextBox.getText();
				priorityText = priorityTextBox.getText(); 
				
				List.addItem(Integer.valueOf(priorityText), description, dueDate, taskName);
				
				
				if(updated)
				{
					
				}
				feedBackMessage.setText("**Updated**");
			}
	
	      });
		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent deleteButton) 
			{
					boolean deleted=false;
					if(deleted)
					{
						
					}
					feedBackMessage.setText("**Deleted**");
			}
	
	      });
		change.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent changeButton) 
			{
					boolean changed=false;
					if(changed)
					{
						
					}
					feedBackMessage.setText("**Changed**");
			}
	
	      });
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent saveButton) 
			{
					boolean saved=false;
					if(saved)
					{
						
					}
					feedBackMessage.setText("**Saved**");
			}
	
	      });
		load.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent loadButton) 
			{
				boolean loaded=false;
				if(loaded)
				{
					
				}
				feedBackMessage.setText("**Loaded**");
			}
	
	      });
		print.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent printButton) 
			{
				toDoItem sorted = List.head;
				String item ="";
				item+=sorted.printInfo();
				sorted=sorted;
				item+="\n";
				while(sorted.next!=null) {
					item+=sorted.printInfo();
					sorted=sorted.next;
					item+="\n";
				}
				todoLists.setText(item);
			
		
				todoLists.setText(List.head.printInfo());
				
				
				
				//todoLists.setText("hello");
			/*	todoName.setText("taskName");
				todoDate.setText(dueDate);
				todoDes.setText(description);
			*/	
				
				
				
			}
	
	     });
		
		}
	
		
		public void yInputIterate()
		{
			this.ySpacing+=40;
		}
		

		public static void main(String[] args) {
		    new Message();
		}
 }






/*package calender;

import javax.swing.*;
import java.awt.event.*;



public class Message extends JFrame {
		
	Message(){
		String month = drop.title;
		String day = drop.day;
		String year = drop.year;
		
		JFrame f=new JFrame(" ");
		f.setTitle(month + " " + day + " " + year);
		
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

		
	
JLabel labelName = new JLabel();
labelName.setText("Event Name:");
labelName.setBounds(400, 50, 130, 100); //( x, y, width, height)
f.add(labelName);

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
*/
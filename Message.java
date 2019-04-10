package group_project;



import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




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
	String priorityText="";//need to do error handling for this
	//String
	//int jButtonY
	Message(){
		toDoList List= new toDoList();
		JFrame f=new JFrame("To Do List");

		JLabel label = new JLabel();
		label.setText("Task Name :");
		label.setBounds(xDescriptionSpacing, ySpacing, 100, 100);
		
		yInputIterate();	
		JTextField toDoItemName= new JTextField();
		toDoItemName.setBounds(xTextFieldSpacing, ySpacing, 130, 30);
		//toDoItemName.setText("here");
		
		JTextArea todoLists=new JTextArea();
		todoLists.setBounds(400, 10, 400, 400);
	
	

		
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
				priorityText=priorityTextBox.getText();
				
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
				
				toDoItem sorted=List.head;
				String item="";
				while(sorted.next!=null)
				{
					item+=sorted.printInfo();
					sorted=sorted.next;
					item+="\n";
				}
				todoLists.setText(List.head.printInfo()+"\n");
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
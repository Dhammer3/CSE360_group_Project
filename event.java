package calender;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;


public class event extends JFrame implements ActionListener {

private JTable table;
private static final Object[][] rowData = {};
private static final Object[] columnNames = {"Event", "Priority", "Due Date", "Description" };
JButton getValue;
String month = drop.month;
String day = drop.day;
String year = drop.year;
int number = drop.number;
String event = " ";
String priority = " ";
String dueDate = " ";
String description = " ";
int count = 5;
JButton save = new JButton("Save");
JButton restore=new JButton("Restore");
int repeat = 5;

public event() {

getContentPane().setLayout( new FlowLayout() );
DefaultTableModel tableModel;
tableModel = new DefaultTableModel(rowData, columnNames);

    for(int i = 1; i <=count; i++) {
       tableModel.addRow(new Object[]{event, priority, dueDate, description});
	   }

table = new JTable(tableModel);
JScrollPane scrollPane = new JScrollPane(table);
table.setPreferredScrollableViewportSize(new Dimension(280, 100));

getContentPane().add(scrollPane);

getValue = new JButton( "update" );
getValue.addActionListener( this );
getContentPane().add( getValue );

//JButton save = new JButton("Save");
save.addActionListener(this);
getContentPane().add(save);

//JButton restore=new JButton("Restore");
restore.addActionListener(this);
getContentPane().add(restore);

setVisible(true);
setSize( 500, 300 );
}


public void actionPerformed( ActionEvent action) {

int row = table.getSelectedRow();
int column = table.getSelectedColumn();
count++;

if (action.getSource() == getValue ) {
    String value = String.valueOf( table.getValueAt(row,column) );
    System.out.println(value);
}

if (action.getSource() == save ) {
    String value = String.valueOf( table.getValueAt(row,column) );
    System.out.println("save button works");
}

if (action.getSource() == restore ) {
    String value = String.valueOf( table.getValueAt(row,column) );
    System.out.println("restore button works");
}
}


public static void main ( String[] args ) {
	new event();

	}
}
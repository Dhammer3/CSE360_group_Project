import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Calender2 extends JFrame implements ActionListener {

  public static void main(String[] args) {
    int rows = 1;
    int cols = 12;
    Calender2 gt = new Calender2(rows, cols);
    gt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gt.pack();
    gt.setVisible(true);
  }

  public Calender2(int rows, int cols) {
    Container pane = getContentPane();
    pane.setLayout(new GridLayout(rows, cols));

      JButton January = new JButton("January");
      January.addActionListener(this);
	  January.setActionCommand("January");
      pane.add(January);

      JButton Feburary = new JButton("Feburary");
      Feburary.addActionListener(this);
      Feburary.setActionCommand("Feburary");
      pane.add(Feburary);

      JButton March = new JButton("March");
      March.addActionListener(this);
      March.setActionCommand("March");
      pane.add(March);

      JButton April = new JButton("April");
      April.addActionListener(this);
      April.setActionCommand("April");
      pane.add(April);

      JButton May = new JButton("May");
      May.addActionListener(this);
      May.setActionCommand("May");
      pane.add(May);

      JButton June = new JButton("June");
      June.addActionListener(this);
      June.setActionCommand("June");
      pane.add(June);

      JButton July = new JButton("July");
      July.addActionListener(this);
      July.setActionCommand("July");
      pane.add(July);

      JButton August = new JButton("August");
      August.addActionListener(this);
      August.setActionCommand("August");
      pane.add(August);

      JButton September = new JButton("September");
      September.addActionListener(this);
      September.setActionCommand("September");
      pane.add(September);

      JButton October = new JButton("October");
      October.addActionListener(this);
      October.setActionCommand("October");
      pane.add(October);

      JButton November = new JButton("November");
      November.addActionListener(this);
      November.setActionCommand("November");
      pane.add(November);

      JButton December = new JButton("December");
      December.addActionListener(this);
      December.setActionCommand("December");
      pane.add(December);

  }
    @Override
  public void actionPerformed(ActionEvent a) {
  	String action = a.getActionCommand();
          if (action.equals("January")) {
              System.out.println("January was selected");


          }
           if (action.equals("Feburary")) {
		       System.out.println("Feburary was selected");
          }
           if (action.equals("March")) {
		  		       System.out.println("March was selected");
          }
           if (action.equals("April")) {
		  		       System.out.println("April was selected");
		  		      April aprilCalender = new April();


          }
           if (action.equals("May")) {
		  		       System.out.println("May was selected");
          }
           if (action.equals("June")) {
		  		       System.out.println("June was selected");
          }
           if (action.equals("July")) {
		  		       System.out.println("July was selected");
          }
           if (action.equals("August")) {
		  		       System.out.println("August was selected");
          }
           if (action.equals("September")) {
		  		       System.out.println("September was selected");
          }
           if (action.equals("October")) {
		  		       System.out.println("October was selected");
          }
           if (action.equals("November")) {
		  		       System.out.println("November was selected");
          }
           if (action.equals("December")) {
		  		       System.out.println("December was selected");
          }

    }

}
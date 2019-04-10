package group_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class April extends JFrame implements ActionListener {
 //Message popup = new Message();
    public April() {
    	
Message popup = new Message();
/*
        setTitle("April");
        setSize(500, 500);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button10 = new JButton("10");
        JButton button11 = new JButton("11");
		JButton button12 = new JButton("12");
		JButton button13 = new JButton("13");
		JButton button14 = new JButton("14");
		JButton button15 = new JButton("15");
		JButton button16 = new JButton("16");
		JButton button17 = new JButton("17");
		JButton button18 = new JButton("18");
		JButton button19 = new JButton("19");
		JButton button20 = new JButton("20");
		JButton button21 = new JButton("21");
		JButton button22 = new JButton("22");
		JButton button23 = new JButton("23");
		JButton button24 = new JButton("24");
		JButton button25 = new JButton("25");
		JButton button26 = new JButton("26");
		JButton button27 = new JButton("27");
		JButton button28 = new JButton("28");
		JButton button29 = new JButton("29");
		JButton button30 = new JButton("30");

        JPanel panel = new JPanel();

        // Add button to JPanel
       	button1.addActionListener(this);
      	button1.setActionCommand("1");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
		panel.add(button5);
        panel.add(button6);
        panel.add(button7);
		panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		panel.add(button17);
		panel.add(button18);
		panel.add(button19);
        panel.add(button20);
        panel.add(button21);
		panel.add(button22);
		panel.add(button23);
		panel.add(button24);
		panel.add(button25);
		panel.add(button26);
		panel.add(button27);
		panel.add(button28);
		panel.add(button29);
        panel.add(button30);

        // And JPanel needs to be added to the JFrame itself!
        this.getContentPane().add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        */
    }

      @Override
	  public void actionPerformed(ActionEvent a) {
	  	String action = a.getActionCommand();
	          if (action.equals("1")) {
	              System.out.println("one was selected");
	              Message popup = new Message();
	             // Message.infoBox("Events:", "Events for April 1st");
}
}

    public static void main(String[] args) {

        April a = new April();
    }
}
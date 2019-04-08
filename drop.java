package calender;

import javax.swing.*;
public class drop {
	
	static int number; // This is the number used in the April2 file
	static String title; //This is supplies the correct month name
	static int day;
	
  public static void main(String[] a) {
    String[] choices = { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
        "The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                        // default
                                                                        // icon
        choices, // Array of choices
        choices[0]); // Initial choice
    System.out.println(input);


if (input == "January"){
	day = 31;
    title = "January";
     String[] days = { "1","2","3","4"};
	 String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	 "CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
     System.out.println(input2);
  }
 String[] years = { "2000","2001","2002","2003"};
	 String input3 = (String) JOptionPane.showInputDialog(null, "Select a year",
	 "CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, years,years[0]);
     System.out.println(input3);
     Message A = new Message();
}
}



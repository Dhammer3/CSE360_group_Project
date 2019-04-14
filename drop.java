package calender;

import javax.swing.*;
public class drop {
	
	static int number; // This is the number used in the April2 file
	static String month; //This is supplies the correct month name
	static String day;
	static String year;
	static String input;
	static String input2;
	
  public static void main(String[] a) {
    String[] choices = { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String input = (String) JOptionPane.showInputDialog(null, "Select a month.",
        "CSE 360 Calendar", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                        // default
                                                                        // icon
        choices, // Array of choices
        choices[0]); // Initial choice
    System.out.println(input);


if (input == "January"){
	month = "January";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}

if (input == "Febuary"){
	month = "Febuary";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}

if (input == "March"){
	month = "March";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}

if (input == "April"){
	month = "April";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}

if (input == "May"){
	month = "May";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}

if (input == "June"){
	month = "June";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}

if (input == "July"){
	month = "July";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}

if (input == "August"){
	month = "August";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}

if (input == "September"){
	month = "September";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}

if (input == "October"){
	month = "October";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}

if (input == "November"){
	month = "November";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}

if (input == "December"){
	month = "December";
	String[] days = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String input2 = (String) JOptionPane.showInputDialog(null, "Select a day",
	"CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, days,days[0]);
	day = input2;
	System.out.println(input2);
}


 String[] years = { "1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003",
		 			"2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017",
		 			"2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031",};
	 String input0 = (String) JOptionPane.showInputDialog(null, "Select a year",
	 "CSE 360 Calender", JOptionPane.QUESTION_MESSAGE, null, years,years[0]);
     System.out.println(input0);
     
     year = input0;
    Message A = new Message();
 
   
}
}























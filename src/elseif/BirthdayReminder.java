
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "Febuary 12th";
		String dadsBirthday = "July 9th";
		String myBirthday = "March 13th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("What birthday would you like to remember?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (birthday.equals("Mom")) {JOptionPane.showMessageDialog(null, momsBirthday);}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (birthday.equals("Dad")) {JOptionPane.showMessageDialog(null, dadsBirthday);}
		// 6. if user asked for your name
			// print myBirthday
		else if (birthday.equals("Isabel")) {JOptionPane.showMessageDialog(null, myBirthday);}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");}
	} 
}

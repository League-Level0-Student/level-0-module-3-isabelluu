//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot sandy = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		while (true) {
			String answer = JOptionPane.showInputDialog("What color would you like the robot to draw");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (answer.equals("blue")) {
				sandy.setPenColor(Color.CYAN);
				;
			}
			// 6. If the user doesn’t enter anything, choose a random color
			else {
				sandy.setRandomPenColor();
			}

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			sandy.penDown();
			sandy.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			sandy.setSpeed(100);
			sandy.move(50);
			sandy.turn(80);
			sandy.move(50);
			sandy.turn(80);
			sandy.move(50);
			sandy.turn(80);
			sandy.move(50);
		}
	}
}

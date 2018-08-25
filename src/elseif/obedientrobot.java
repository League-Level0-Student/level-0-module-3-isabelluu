package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	Robot sandy = new Robot();
public static void main(String[] args) {
	String shape = JOptionPane.showInputDialog("Square, triangle, or circle?");
	//String color = JOptionPane.showInputDialog("What color would you like?");
	if (shape.equals("square")) {
	drawSquare();}
	if (shape.equals("triangle")) {
	drawTriangle();}
	if (shape.equals("circle")) {
		drawCircle(); 
	
	}	}
public static void drawSquare() {
	Robot sandy = new Robot();
	sandy.penDown();
	sandy.setSpeed(30);
	sandy.setRandomPenColor();;
	for (int i = 0; i<4; i++) {
	sandy.move(100);
	sandy.turn(90);}}
	
	public static void drawTriangle() {
		Robot sandy = new Robot();
		sandy.penDown();
		sandy.setSpeed(30);
		sandy.setRandomPenColor();
		for (int i = 0; i<3; i++) {
		sandy.move(50);
		sandy.turn(80);}}
	
		public static void drawCircle() {
			Robot sandy = new Robot();
			sandy.penDown();
			sandy.setSpeed(30);
			sandy.setRandomPenColor();
			for (int i = 0; i<360; i++) {
				sandy.move(1);
				sandy.turn(1);
			}}
		
	
}


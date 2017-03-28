package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE 
		Robot sasuke= new Robot();
		sasuke.penDown();
		sasuke.setPenColor(Color.blue);                       
		sasuke.move(100);
		sasuke.turn(90);
		sasuke.move(100);
		sasuke.turn(90);
		sasuke.setPenColor(Color.red);
        sasuke.move(100);
        sasuke.turn(90);
        sasuke.move(100);
        int sides = 65;
	   for (int i = 0; i < sides; i++) {
			sasuke.move(100);
		    sasuke.turn(360 / sides);   
	   }
	
		
		
	}
}                                                                               

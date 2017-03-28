package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot tobi= new Robot();
	void go() {
		drawTriangle(100); // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible

		// 4. make a variable to hold the length of the triangle and set it to 50

		// 7. Do the following (up to step 10) 60 times

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
	
			// 10. Turn the tortoise 6 degrees to the right

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		
		for (int i = 0;  i < 3 ; i++) { 
			

			// 7. Change the pen color to random
	tobi.penDown();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	tobi.move(length);
			// 2. Turn the robot 1/3 of 360 degrees to the right
	tobi.turn(360 / 3);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
	 tobi.setPenWidth(i);
	 
}               

		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}

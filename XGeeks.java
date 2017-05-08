package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
String peterspower = "chidori";
String denzelspower = "hacker";
String angelspower = "Super X-Ray";
String carmespower = "Eating";
String sussanaspower = "something";
        // 2. Ask the user to enter a name. Store their answer in a variable.
String ans = JOptionPane.showInputDialog("Enter any name"); 

        // 3. Show the superpower in a pop-up, depending on the name entered. 
if(ans.equals("peter")){
	JOptionPane.showInputDialog("chidori");
}
	//print peter's power
if(ans.equals("denzel")){
	JOptionPane.showInputDialog("hacker");
}
//print denzel's power
if(ans.equals("angel")){
	JOptionPane.showInputDialog("Super X-Ray");
}
			//print angle's power
			if(ans.equals("carmen")){
				JOptionPane.showInputDialog("Eating");
			}
				//print carmen's power
				if(ans.equals("sussana")){
					JOptionPane.showInputDialog("something");
					//print sussana's power
	
}


    }
}
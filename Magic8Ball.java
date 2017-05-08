package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

    // 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	 // 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random randy = new Random();
 int x = randy.nextInt(4);
    // 3. Print out this variable
System.out.print(x);
    // 4. Get the user to enter a question for the 8 ball
String ans = JOptionPane.showInputDialog("enter a yes or no question"); 
    // 5. If the random number is 0
if(x==0){  
    // -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "yes" ); }
    // 6. If the random number is 1
if(x==1){ 
JOptionPane.showMessageDialog(null, "yes" ); }

    // -- tell the user "No"

    // 7. If the random number is 2

    // -- tell the user "Maybe you should ask Google?"

    // 8. If the random number is 3

    // -- write your own answer

}
}


   
package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Guessingamesssss {
 public static void main(String[] args) {
	
Random randy = new Random();
int square = randy.nextInt(100) + 1 ; 
for (int i = 0; i < 100; i++) {
	

String  guessing =  JOptionPane.showInputDialog("pick a number 1-100");
int ansAsInt = Integer.parseInt(guessing);
if(ansAsInt > square){
JOptionPane.showMessageDialog(null, "guess lower");	
}
if (ansAsInt < square){
	JOptionPane.showMessageDialog(null, "guess higer");	
	
}
if (ansAsInt == square){
	JOptionPane.showMessageDialog(null, "you got it right, you get a million bucks");	
	
}
}	 
 }
}

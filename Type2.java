package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Type2 {
	 public static void main(String[] args) {
			
		 Random randy = new Random();
		 int square = randy.nextInt(100) + 1 ; 
		 for (int i = 0; i < 100; i++) {
		 	

		 String  guessing =  JOptionPane.showInputDialog("pick a grade percantage");
		 int ansAsInt = Integer.parseInt(guessing);
		 if(ansAsInt > square){
		 JOptionPane.showMessageDialog(null, "22");	
		 }
		 if (ansAsInt < square){
		 	JOptionPane.showMessageDialog(null, "55566");	
		 	
		 }
		 if (ansAsInt == square){
		 	JOptionPane.showMessageDialog(null, "you got it right, you get a million bucks");	
		 	
		 }
		 }	 
		  }
		 }



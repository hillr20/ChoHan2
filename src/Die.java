import java.util.Random;

import javax.swing.JOptionPane;

public class Die {
	private int sides;
	private int value;
	private int die1Value;
	private int die2Value;
	private int numOfSides;
	
	// 
	//constructor (takes a number as an input)
	//roll (generates a random roll)
	
	public Die(int numOfSides){
		String input = JOptionPane.showInputDialog("Dice come with different number of sides. This game can be played with "
				+ "4-sided, 6-sided, 8-sided, 10-sided, 12-sided, and 20-sided dice. "
				+ "Please enter the number that corresponds"
				+ "with the number of sides your desired dice have.");
		int n = Integer.parseInt(input);
		numOfSides = n;
		if (n == 4 || n == 6 ||n == 8 || n == 10 ||n == 12 ||n == 20 ){
			int roll = (int)(Math.random()*n) + 1;
			roll = n * 2;
		}
		else {
			System.out.println("Invalid number of sides. Please enter either 4, 6, 8, 10, 12, or 20.");
		}
			
	}
	
	public void roll1() {
		Die die1 = new Die(numOfSides);
		Die die2 = new Die(numOfSides);

		//record values
		die1Value = die1.getValue();
		die2Value = die2.getValue();
		
	}
	String result;
		//String result;
		//returns result of dice roll as eiter Cho or Han
	public String getChoHan() {
		int sum = die1Value + die2Value;
			//even or odd
		if (sum % 2 == 0){
			String result = "Cho/even";
		}
		else {
			String result = "Han/odd";
		}
		return result;	
	}
		
	public int getDie1AndDie2() {
		return die1;
		return die2;
	}
		
		//getters
	public int getDie1Value() {
		return die1Value;
	}
		
	public int getDie2Value() {
		return die2Value;
	}
		
	/*public String toString() {
		return "\n Side Num: " + sides;
	}*/
		

	public void roll(){ 
	      Random randroll = new Random();	  
	      value = randroll.nextInt(numOfSides) + 1;
	}
	
	public int getNumOfSides() {
		int s = numOfSides;
		return numOfSides;
		
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		String diceSum = "die1Value + die2Value";
		return diceSum;
		
		
		
	}
	

		
	
	



	
	


}

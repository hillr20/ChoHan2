import javax.swing.JOptionPane;

public class ChoHan2 {

	public static void main(String[] args) {
		
		Die die1 = new Die(numOfSides);
		Die die2 = new Die(numOfSides);
		
		die1.roll();
		die2.roll();
		
		for (int round = 0; round < maxRounds; round ++) {
			System.out.println("You are playing a Cho Han Game. Now playing round " + round + 1);
			
			int loadedDie = (int)(Math.random() *2) + 1;
			if (loadedDie == 1) {
				
				
			}
			else {
				LoadedDie ldie = new LoadedDie(numOfSides);	
			}
		
		
		
			loadedDie = (int)(Math.random() *2) + 1;
			if (loadedDie == 1) {
				Die ldie = new Die (numOfSides);
			
			
			}
			else {
				LoadedDie die = new LoadedDie(numOfSides);	
			}
		
		
			String input = JOptionPane.showInputDialog("If your guess is odd, enter 1. If you guess even, enter 2.");
			int guess = Integer.parseInt(input);
			if (guess == 1) {
				String guess1 = "odd";
			
			
			}
			if (guess == 2 ) {
				String guess2 = "even";
			
			}
			}
		

		}	
	public static void roundResults(Die die) {
		System.out.println("The dealer rolled " + die1Value + " and " + die2Value + " and the the guesses were " + guess1 + "");
}

}

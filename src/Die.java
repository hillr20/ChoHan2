import javax.swing.JOptionPane;

public class Die {
	private int numOfSides;
	
	// 
	//constructor (takes a number as an input)
	//roll (generates a random roll)
	
	public Die(int n){
		String input = JOptionPane.showInputDialog("Dice come with different number of sides. This game can be played with "
				+ "4-sided, 6-sided, 8-sided, 10-sided, 12-sided, and 20-sided dice. "
				+ "Please enter the number that corresponds"
				+ "with the number of sides your desired dice have.");
		n = Integer.parseInt(input);
		if (n == 4 || n == 6 ||n == 8 || n == 10 ||n == 12 ||n == 20 ){
			int roll = (int)(Math.random()*n) + 1;
			roll = n * 2;
		}
		else {
			System.out.println("Invalid number of sides. Please enter either 4, 6, 8, 10, 12, or 20.");
		}
			
	}		
	


}

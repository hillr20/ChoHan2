public class LoadedDie extends Die {

	public LoadedDie(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
		
		
	double randNum = Math.random();
	double num = randNum * 100;
		
	public int generateRoll() {
		int something = (int)(Math.random() * 100) + 1;
		if (something <= 80) {
			int allNumRoll = (int)(Math.random()*/*getSideNum*/n) + 1;
			int roll = allNumRoll *2 - 1;
			return roll;	
			
		}
		else {
			int allNumRoll = (int)(Math.random()* /*getSideNum*/ n()) + 1;
			int roll = allNumRoll *2;
			return roll;
		}
	}
	
	
	


}

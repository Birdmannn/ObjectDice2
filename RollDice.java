package ObjectDice2;

public class RollDice {
    public static void main(String[] args) {
		
		PairOfDice dice = new PairOfDice();
		int count = 0;
		
		do {
			dice.roll();
			System.out.println("The dice come up " + dice);
			count++;
			
			
		} while (dice.getTotal() != 2);
		System.out.println();
		System.out.println("It took " + count + " rolls to get a 2.");
	}

}

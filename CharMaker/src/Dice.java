import java.util.Random;

/**
 * Contains a series of functions for both rolling dice, and for creating groups of dice, like 4d6, and such
 */
public class Dice {
	static Random rand = new Random();
	
	int num; //the number of dice in this group
	int sides; //the number of sides for this group of dice
	
	/**
	 * Directly create a set of dice
	 * @param num the number of dice in the set
	 * @param sides the number of sides each die has
	 */
	public Dice(int num, int sides){
		this.num = num;
		this.sides = sides;
	}
	
	/**
	 * create a dice set from a descriptor string, like 4d6
	 * @param diceString a string describing number of dice with the same number of sides
	 */
	public Dice(String diceString){
		String[] desc = diceString.split("d");
		num = Integer.parseInt(desc[0]);
		sides = Integer.parseInt(desc[1]);
	}
	
	/**
	 * takes an array of dice sides and returns an array of values
	 * @param sides the array of the number of sides of each die to roll
	 * @return
	 */
	static int[] roll(int... sides){
		int[] out = new int[sides.length];
		for(int i = 0; i < sides.length; i++)
			out[i] = rand.nextInt(sides[i])+1;
		return out;
	}
		
	/**
	 * rolls this dice group
	 * @return the sum of these dice
	 */
	int roll(){
		int sum = 0;
		for(int i = 0; i < num; i++)
			sum += rand.nextInt(sides) + 1;
		return sum;
	}
}

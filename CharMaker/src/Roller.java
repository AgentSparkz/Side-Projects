import java.util.Random;

public class Roller {
	static Random rand = new Random();
	
	
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
}

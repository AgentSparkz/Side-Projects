import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class Character {
	
	public Character(){
		int[] finalStats = new int[6];
		int[] finalMods = new int[6];
		int[] stats = new int[7];
		int[] statDice = new int[4];
		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 4; i++){
				statDice[j] = dxRoller(6);
			}
			Arrays.sort(statDice);
			stats[i] = statDice[0]+statDice[1]+statDice[2];
		}
		Arrays.sort(stats);
		
		for (int score: finalStats){
			finalMods[score] = (finalStats[score] - 10)/2;
		}
		int[] saves = {finalMods[2], finalMods[1], finalMods[4]};
		
	}
	
	public int dxRoller (int sides){
		return ((int)((Math.random()*sides) + 1));
	}
}

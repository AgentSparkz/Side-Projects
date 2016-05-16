import java.util.Random;

public class Die {
	int sides;
	static Random rand = new Random();
	
	public Die(int s){
		sides = s;
	}
	
	public int roll(){
		return rand.nextInt(sides) + 1; 
	}
}

import java.util.Arrays;
import java.util.List;

public class Dice {
	List<Die> dice;
	
	public Dice(Die... dice){
		this.dice = Arrays.asList(dice);
	}
	
	public Integer roll(){
		int accum = 0;
		for(Die die : dice)
			accum += die.roll();
		return accum;
	}
}

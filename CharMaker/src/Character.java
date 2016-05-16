import java.util.HashMap;
import java.util.Map;

public class Character {
	int health;
	int maxHealth;
	Map<Stat, Integer> stats = new HashMap<>();
	String name;
	Map<CharClass, Integer> classLevels = new HashMap<>();
	Race race;
}

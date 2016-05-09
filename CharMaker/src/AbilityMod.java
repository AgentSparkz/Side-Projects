
public class AbilityMod {
	Ability ability; //the ability to be changed
	int amt; //the amount to modify by
	Type type; //the type of bonus, either permanent or temporary
	
	public AbilityMod(Ability abil, int a, Type t){
		ability = abil;
		amt = a;
		type = t;
	}
	
	enum Type{
		perm, temp
	}
}

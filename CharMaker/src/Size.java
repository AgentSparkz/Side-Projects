public enum Size {
	fine(8),
	diminutive(4),
	tiny(2),
	small(1),
	medium(0),
	large(-1),
	huge(-2),
	gargantuan(-4),
	colossal(-8);
	
	int sizeMod;
	
	Size(int size){
		sizeMod = size;
	}
}
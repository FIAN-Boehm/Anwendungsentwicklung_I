package kreaturen;

//under construction
public class Stable {

	private Creature creature;
	private Stable nextStable;
	

	public Stable() {
		super();
	}

	public Stable(int anzahlStaelle) {
		for (int i = 0; i < anzahlStaelle; i++) {
			this.nextStable = new Stable();
		}
		
	}

	public Stable(int anzahlStaelle, Creature... creatures) {
		
		

	}

	public Creature getCreature() {
		return creature;
	}

	public void setCreature(Creature creature) {
		this.creature = creature;
	}

	public Stable getNextStable() {
		return nextStable;
	}

	public void setNextStable(Stable nextStable) {
		this.nextStable = nextStable;
	}

	
	public void addCreature(Creature creature) {
		
	}
	
	@Override
	public String toString() {
		return null;
	}

	public void printStable() {
		
	}

}

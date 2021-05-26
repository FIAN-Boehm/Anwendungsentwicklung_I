package kreaturen;

//under construction
public class Stable {

	private Creature creature;
	private Stable nextStable;

	public Stable() {
		super();
	}

	public Stable(int anzahlStaelle) {
		if (anzahlStaelle > 1) {
			nextStable = new Stable(anzahlStaelle - 1);
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
		if (this.creature == null) {
			this.creature = creature;
		} else if (nextStable != null) {
			nextStable.addCreature(creature);
		} else {
			System.out.println("Stable is full, no room for new creature!");
		}
	}

//	public void addCreature(Creature... creatures) {
//		int i =0;
//			if (this.creature == null) {
//				this.creature = creatures[i];
//				i++;
//			} else {
//				nextStable.addCreature(creature);
//			}
//		
//	}

	@Override
	public String toString() {
		return null;
	}

	public void printStable() {
		if (creature != null) {
			PrintHelper.printLine();
			creature.printCreature();
			if (nextStable != null) {
				nextStable.printStable();
			}
		} else {
			PrintHelper.printLine();
			PrintHelper.printEmptyCell();
			if (nextStable != null) {
				nextStable.printStable();
			}

		}
		if (nextStable == null) {
			PrintHelper.printLine();
		}
	}

	public void feedCreatures(int anzahlFutterkuebel) {
		if (creature != null && creature.isHungry() && anzahlFutterkuebel > 0) {
			creature.feedCreature();
		} else if (creature == null && anzahlFutterkuebel > 0) {
			System.out.println("No creature in this stable!");
			
		}
		if (nextStable != null) {
			nextStable.feedCreatures(anzahlFutterkuebel - 1);
		}
		
	}

}

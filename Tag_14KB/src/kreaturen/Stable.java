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

//	public Stable(int anzahlStaelle, Creature... creatures) {
//
//	}

	@Override
	public String toString() {
		return "Stable [creature=" + creature + ", nextStable=" + nextStable + "]";
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
			System.out.println();
		}
	}

	public void feedCreatures(int anzahlFutterkuebel) {
		if (creature != null && anzahlFutterkuebel > 0) {
			if (creature.isHungry()) {
				creature.feedCreature();
				anzahlFutterkuebel--;
			}
			if (nextStable != null) {
				nextStable.feedCreatures(anzahlFutterkuebel);
			}
		}
		if ((nextStable == null && anzahlFutterkuebel > 0)||(creature == null && anzahlFutterkuebel > 0)) {
			System.out.println("All creatures are fed, some food is left!");
		} else if (creature != null && creature.isHungry() && anzahlFutterkuebel == 0) {
			System.out.println("Not enough food, some creatures go hungry!");
		}else if ((creature == null && anzahlFutterkuebel == 0)||(!creature.isHungry() && nextStable == null && anzahlFutterkuebel == 0)) {
			System.out.println("All creatures are fed, no food left!");
		}
	}
	
	
	//testing how to deal with returns in recursive method
//	public String feedCreatures(int anzahlFutterkuebel) {
//		
//		
//		if (creature != null && anzahlFutterkuebel > 0) {
//			if (creature.isHungry()) {
//				creature.feedCreature();
//				anzahlFutterkuebel--;
//			}
//			if (nextStable != null) {
//				nextStable.feedCreatures(anzahlFutterkuebel);
//			}
//		}
//		
//		
//		if ((nextStable == null && anzahlFutterkuebel > 0) || (creature == null && anzahlFutterkuebel > 0)) {
//			feedFoodLeft();
//
//		} else if (creature != null && creature.isHungry() && anzahlFutterkuebel == 0) {
//			feedNotEnoughFood();
//
//		} else if ((creature == null && anzahlFutterkuebel == 0)
//				|| (!creature.isHungry() && nextStable == null && anzahlFutterkuebel == 0)) {
//			feedAllFedNoFoodLeft();
//		}
//		return "";
//	}
//
//	//methode die den nutzer �ber das f�tterergebnis informiert
//	public String feedFeedback(int result) {
//		String text = "";
//		switch (result) {
//		case 1:
//			text = "All creatures are fed, some food is left!";
//			break;
//		case 2:
//			text = "Not enough food, some creatures go hungry!";
//			break;
//		case 3:
//			text = "All creatures are fed, no food left!";
//			break;
//		default:
//			text = "Etwas ist schief gelaufen";
//			break;
//		}
//		return text;
//	}
//	
//	public String feedFoodLeft() {
//		return "All creatures are fed, some food is left!";
//	}
//	public String feedNotEnoughFood() {
//		return("Not enough food, some creatures go hungry!");
//	}
//	public String feedAllFedNoFoodLeft() {
//		return("All creatures are fed, no food left!");
//	}
//
}

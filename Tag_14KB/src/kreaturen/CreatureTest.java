package kreaturen;

public class CreatureTest {

	public static void main(String[] args) {
		
		Creature head = new Creature(CreatureType.TRUNKY);
		Creature foot = new Creature(CreatureType.FOOTY);
//		Creature foot2 = new Creature(CreatureType.FOOTY);
//		Creature foot3 = new Creature(CreatureType.FOOTY);
//		Creature foot4 = new Creature(CreatureType.FOOTY);
		
//		cr.printCreature();
//		cr.feedCreature();
//		cr.printCreature();
		
		Stable stable = new Stable(4);
		
		stable.addCreature(head);
		stable.addCreature(foot);
//		stable.addCreature(foot2);
//		stable.addCreature(foot3);
//		stable.addCreature(foot4);
		
		stable.printStable();
		
		stable.feedCreatures(1);
		
		stable.printStable();
		
		stable.feedCreatures(2);
		
		stable.printStable();
	}

}

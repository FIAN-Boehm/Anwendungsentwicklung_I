package kreaturen;

public class CreatureTest {

	public static void main(String[] args) {
		
		Creature head = new Creature(CreatureType.TRUNKY);
		Creature foot = new Creature(CreatureType.FOOTY);
		
//		cr.printCreature();
//		cr.feedCreature();
//		cr.printCreature();
		
		Stable stable = new Stable(4);
		
		stable.addCreature(head);
		stable.addCreature(foot);
		
		stable.printStable();
		
//		System.out.println(stable);
	}

}

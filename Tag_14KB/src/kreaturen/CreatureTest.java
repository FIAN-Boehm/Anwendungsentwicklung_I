package kreaturen;

public class CreatureTest {

	public static void main(String[] args) {
		
		Creature cr = new Creature(CreatureType.TRUNKY);
//		cr.printCreature();
//		cr.feedCreature();
//		cr.printCreature();
		
		Stable stable = new Stable(4);
		
		stable.printStable();
		
		stable.addCreature(cr);
		
		stable.printStable();
		
		System.out.println(stable);
	}

}

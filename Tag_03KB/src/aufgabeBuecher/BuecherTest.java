package aufgabeBuecher;

public class BuecherTest {
	
	public static void main(String[] args) {
		Buecher buch1 = new Buecher("Herr der Ringe, Die Gefährten", "John Ronald Reuel Tolkien", "Klett Cotta", 1000);
		Buecher buch2 = new Buecher("Herr der Ringe, Die zwei Türme", "John Ronald Reuel Tolkien", "Klett Cotta", 1300);
		Buecher buch3 = new Buecher("Herr der Ringe, Die Rückkehr des Königs", "John Ronald Reuel Tolkien", "Klett Cotta", 1400);
		
		System.out.println(buch1);
		System.out.println(buch2.toString());
		System.out.println(buch3.toString());
	}

}

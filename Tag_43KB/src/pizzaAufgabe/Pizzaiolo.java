package pizzaAufgabe;

import java.util.Random;

public class Pizzaiolo extends Thread {
	private PizzaSync ps;
	Random rand = new Random(); // Erzeugt Zufallszahlengenerator

	public Pizzaiolo(PizzaSync ps) {
		this.ps = ps;
	}

	public void run() {
		int nummer = 0;
		while (true) {

			// Auf Telefonanruf warten und Bestellung entgegennehmen
			try {
				// nextInt gibt hier die nächste ganzzahlige Zufallszahl 
				// zwischen 0 und 10000
				// zurück
				Thread.sleep(3000 + rand.nextInt(10001));
			} catch (InterruptedException e) {
				System.err.println("Exception");
			}
			++nummer;
			
			System.out.println("Pizza " + nummer + " bestellt");

			// Pizza zubereiten und ausliefern
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				System.err.println("Exception");
			}
			System.out.println("Pizza " + nummer + " zubereitet");
			ps.lieferePizza(nummer);
		}
	}
}

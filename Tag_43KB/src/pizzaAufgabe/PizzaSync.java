package pizzaAufgabe;

public class PizzaSync {
	
	Kurier kurier;
	Pizzaiolo pizzaiolo;
	
	public PizzaSync(Kurier kurier, Pizzaiolo pizzaiolo) {
		super();
		this.kurier = kurier;
		this.pizzaiolo = pizzaiolo;
	}

	/*
	 * Wird vom Pizzaiolo verwendet, um eine Pizza zur Auslieferung zu übergeben;
	 * blockiert, wenn der Kurier beschäftigt ist
	 */
	public synchronized void lieferePizza(int pizza) {
		System.out.println("Pizza " + pizza + " wird ausgeliefert.");
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/*
	 * Wird vom Kurier verwendet, um eine Pizza zur Auslieferung abzuholen;
	 * blockiert, wenn keine Pizza bereit
	 */
	public synchronized int getPizza() {
		return 0;
		
	}

	/* Wird vom Kurier verwendet, wenn er eine Pizza ausgeliefert hat */
	public synchronized void pizzaGeliefert() {
		System.out.println("Pizza " + getPizza() + " wurde ausgeliefert");
	}
}

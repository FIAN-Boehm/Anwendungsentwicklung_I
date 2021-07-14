package pizzaAufgabe;

public class Kurier extends Thread {

	PizzaSync ps;
	
	public Kurier(PizzaSync pz) {
		super();
		this.ps=pz;
		
	}

	@Override
	public void run() {
		ps.lieferePizza(ps.getPizza());
		ps.pizzaGeliefert();
	}
	
	
	
}

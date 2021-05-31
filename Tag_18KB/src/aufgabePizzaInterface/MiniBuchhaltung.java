package aufgabePizzaInterface;

public class MiniBuchhaltung {

	public double machKasse(Pizza[] pizzas) {
		double endpreis = 0;
		for (Pizza pizza : pizzas) {
			endpreis += pizza.getPreis();
		}
		return endpreis;
	}

	public String whatsInStock(Pizza pizzas[]) {
		String stock = "";
		for (Pizza pizza : pizzas) {
			stock += (pizza.toString()) + ("\nPreis: " + pizza.getPreis())+("\n");
		}
		return stock;

	}
}

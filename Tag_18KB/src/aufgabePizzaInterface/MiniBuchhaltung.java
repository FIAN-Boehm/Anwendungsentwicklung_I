package aufgabePizzaInterface;

import java.text.DecimalFormat;

public class MiniBuchhaltung {

	private DecimalFormat df2;
	
	public double machKasse(Pizza[] pizzas) {
		double endpreis = 0;
		for (Pizza pizza : pizzas) {
			endpreis += pizza.getPreis();
		}
		return endpreis;
	}

	//gives strange Preis result
//	public String whatsInStock(Pizza pizzas[]) {
//	String stock = "";
//	for (Pizza pizza : pizzas) {
//		stock += (pizza.toString()) + ("\nPreis: " + (pizza.getPreis()))+("\n");
//	}
//	return stock;
//
//}
	//just another way to do it, but not so nice looking
//	public String whatsInStock(Pizza pizzas[]) {
//		df2 = new DecimalFormat("#.##");
//		String stock = "";
//		for (Pizza pizza : pizzas) {
//			stock += (pizza.toString()) + ("\nPreis: " + df2.format(pizza.getPreis()))+("\n");
//		}
//		return stock;
//
//	}
	
	//42
	public String whatsInStock(Pizza pizzas[]) {
		
		String stock = "";
		for (Pizza pizza : pizzas) {
			stock += String.format((pizza.toString()) + ("\nPreis: %.2f\n"),pizza.getPreis());
		}
		return stock;

	}
}

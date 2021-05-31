package aufgabePizzaInterface;

public class Application {

	public static void main(String[] args) {

		MiniBuchhaltung mb = new MiniBuchhaltung();

		Pizza[] pizzas = new Pizza[] { new PizzaNapolitana(), new PizzaMargherita("groﬂ"), new PizzaEigenbau(
				Zutaten.BODENGROSS, Zutaten.SOSSE, Zutaten.CHAMPIGNON, Zutaten.KAESE, Zutaten.SCHINKEN) };

		System.out.println(mb.whatsInStock(pizzas));
		System.out.printf("Endpreis lautet: %.2f", mb.machKasse(pizzas));
	}

}

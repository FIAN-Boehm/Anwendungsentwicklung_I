package rueckwaertsisch;

public class Application {

	public static void main(String[] args) {
		
		RueckwaertsMachine rm = new RueckwaertsMachine();
		System.out.println(rm.reverser("Die kleine Dame!"));
		rm.run();
	}

}

package controller;

import model.Angestellter;
import model.SimpleBank;

public class Application {

	public static void main(String[] args) {
		
		SimpleBank sb = new SimpleBank();
		
		Angestellter a1 = new Angestellter(sb, 0, 1, 50);
		Angestellter a2 = new Angestellter(sb, 2, 1, 5000);
		
		System.out.println(sb.kontostand());
		
		a1.run();
		a2.run();
		
		System.out.println(sb.kontostand());
		
	}

}

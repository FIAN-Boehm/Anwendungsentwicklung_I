package kaffeeAutomaten.controller;

import kaffeeAutomaten.model.KaffeeAutomat;
import kaffeeAutomaten.model.Mitarbeiter;

public class Pausenraum {


	private Thread team [];
	private KaffeeAutomat automaten [] = new KaffeeAutomat [5];
	
	
	public Pausenraum() {
		super();
		team= new Thread [((int) (5+ (Math.random()*11)))];
		for (int i = 0; i < team.length; i++) {
			team[i] =  new Thread(new Mitarbeiter(Integer.toString(i), this));
		}
		
		for (int i = 0; i < automaten.length; i++) {
			automaten[i]= new KaffeeAutomat(Integer.toString(i), this);
		}
	}


	public Thread[] getTeam() {
		return team;
	}


	public KaffeeAutomat[] getAutomaten() {
		return automaten;
	}


	
	
	
	
	

}

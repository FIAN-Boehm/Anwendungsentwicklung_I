package kaffeeAutomaten.controller;

import kaffeeAutomaten.model.KaffeeAutomat;
import kaffeeAutomaten.model.Mitarbeiter;

public class Pausenraum {


	private Thread team [];
	private Thread automaten [] = new Thread [5];
	
	
	public Pausenraum() {
		super();
		team= new Thread [((int) (5+ (Math.random()*11)))];
		for (int i = 0; i < team.length; i++) {
			team[i] =  new Thread(new Mitarbeiter(Integer.toString(i), this));
		}
		
		for (int i = 0; i < automaten.length; i++) {
			automaten[i]= new Thread(new KaffeeAutomat(Integer.toString(i), this));
		}
	}


	public Thread[] getTeam() {
		return team;
	}


	public void setTeam(Thread[] team) {
		this.team = team;
	}


	public Thread[] getAutomaten() {
		return automaten;
	}


	public void setAutomaten(Thread[] automaten) {
		this.automaten = automaten;
	}
	
	
	
	

}

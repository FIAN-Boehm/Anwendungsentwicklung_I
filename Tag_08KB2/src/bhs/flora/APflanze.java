package bhs.flora;

import bhs.interfaces.IFressbar;

public abstract class APflanze implements IFressbar{
	private String name;
	private String farbe;
	private double naehrwert;
	
	public APflanze() {
		super();
		this.name="Gras";
		this.farbe="grün";
		this.naehrwert=1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public double getNaehrwert() {
		return naehrwert;
	}
	public void setNaehrwert(double naehrwert) {
		this.naehrwert = naehrwert;
	}

	
}

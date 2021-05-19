package bhs.fauna.fleischfresser;

public class Ferkel extends Schwein {
	private String ohrengroesse;
	
	public Ferkel() {
		this("Peter", "Violett", 89, 3,'m', "Mittel");
	}
	/**
	 * @param name
	 * @param farbe
	 * @param gewicht
	 * @param alter
	 * @param geschlecht
	 */
	public Ferkel(String name, String farbe, double gewicht, int alter, char geschlecht, String ohrengroesse) {
		super(name, farbe, gewicht, alter, geschlecht);
		this.ohrengroesse = ohrengroesse;
	}

	public String getOhrengroesse() {
		return ohrengroesse;
	}

	public void setOhrengroesse(String ohrengroesse) {
		this.ohrengroesse = ohrengroesse;
	}

	@Override
	public String toString() {
		return "ATier: Ferkel [ohrengroesse=" + ohrengroesse + ", getName()=" + getName() + ", getFarbe()=" + getFarbe()
				+ ", getGewicht()=" + getGewicht() + "]";
	}
	@Override
	public void bewegen() {
		
	}
	
	@Override
	public String machGeraeusch() {
		return "Oinki, oinki!!";
	}
	
	
	
	
	
}

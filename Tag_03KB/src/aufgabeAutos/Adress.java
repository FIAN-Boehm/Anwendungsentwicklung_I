package aufgabeAutos;

public class Adress {
	private String name, vorname, strassenname, hausnummer, ortsname;
	private int plz;

	public Adress(String name, String vorname, String strassenname, String hausnummer, String ortsname, int plz) {
		this.name = name;
		this.vorname = vorname;
		this.strassenname = strassenname;
		this.hausnummer = hausnummer;
		this.ortsname = ortsname;
		this.plz = plz;
	}

	@Override
	public String toString() {
		return "Adress [name=" + name + ", vorname=" + vorname + ", strassenname=" + strassenname + ", hausnummer="
				+ hausnummer + ", ortsname=" + ortsname + ", plz=" + plz + "]";
	}

	public String getStrassenname() {
		return strassenname;
	}

	public void setStrassenname(String strassenname) {
		this.strassenname = strassenname;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getOrtsname() {
		return ortsname;
	}

	public void setOrtsname(String ortsname) {
		this.ortsname = ortsname;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getVorname() {
		return vorname;
	}

	public void printAdress() {
		System.out.print(this.getStrassenname()+", ");
		System.out.print(this.getHausnummer()+", ");
		System.out.print(this.getOrtsname()+", ");
		System.out.print(this.getPlz());
		System.out.println();
	}

	public static Adress machAutohausAdresse() {
		Adress autoHaus = new Adress("Bugatti", "Autohaus", "Bugatti Road", "1", "Abu Dhabi", 12345);
		return autoHaus;
	}
}

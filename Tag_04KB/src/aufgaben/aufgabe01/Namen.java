package aufgaben.aufgabe01;

public class Namen {
	private String prename, lastname, kuerzel;

	{
		prename = "Kay";
		lastname = "Böhm";
		kuerzel = prename.substring(0, 1) + lastname.substring(0, 1);
	}

	@Override
	public String toString() {
		return "prenamen [prename=" + prename + ", lastname=" + lastname + "]";
	}

	public String getPrename() {
		return prename;
	}

	public void setPrename(String prename) {
		this.prename = prename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String putTogether(String prename, String lastname) {
		return prename + lastname;
	}

	public void printTogether(Namen elem) {
		System.out.println(putTogether(elem.prename, elem.lastname));
	}

	public void getLength(Namen elem) {
		System.out.println("Vorname " + this.getPrename() + " hat die Länge: " + prename.length());
		System.out.println("Nachname " + this.getLastname() + " hat die Länge: " + lastname.length());
		System.out
				.println("Zusammen sind das " + this.putTogether(elem.prename, elem.lastname).length() + " Buchstaben");
	}

	public void getInitials(Namen elem) {
		System.out.println("Die Intitialen lauten: " + kuerzel);
	}
}

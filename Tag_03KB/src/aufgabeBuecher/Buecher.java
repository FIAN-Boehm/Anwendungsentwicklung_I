package aufgabeBuecher;

public class Buecher {
	private String titel, autor, verlag;
	private int seiten;

	public Buecher(String titel, String autor, String verlag, int seiten) {
		this.titel = titel;
		this.autor = autor;
		this.verlag = verlag;
		this.seiten = seiten;
	}
	

	@Override
	public String toString() {
		return "Buecher [Titel: " + titel + ", Autor: " + autor + ", Verlag: " + verlag + ", Seiten: " + seiten + "]";
	}


	public String gettitel() {
		return titel;
	}

	public void settitel(String titel) {
		this.titel = titel;
	}

	public String getautor() {
		return autor;
	}

	public void setautor(String autor) {
		this.autor = autor;
	}

	public String getverlag() {
		return verlag;
	}

	public void setverlag(String verlag) {
		this.verlag = verlag;
	}

	public int getseiten() {
		return seiten;
	}

	public void setseiten(int seiten) {
		this.seiten = seiten;
	}

}

package aufgabeDateAndTimeAPI;

public enum Hochzeitsjubilaeum {

	SILBERHOCHZEIT(25), GOLDHOCHZEIT(50), DIAMANTHOCHZEIT(60);
	
	private final int jahre;
	
	Hochzeitsjubilaeum(int jahre) {
		this.jahre=jahre;
	}

	public int getJahre() {
		return jahre;
	}
}

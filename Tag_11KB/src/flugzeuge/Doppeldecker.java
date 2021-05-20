package flugzeuge;

public final class Doppeldecker extends Flugzeug {

	private final boolean offenesCockpit;
	private static final int LOOPINGSPEED = 320;

	public Doppeldecker(String hersteller, int maxSpeed, boolean offenesCockpit, String immat) {
		super(hersteller, maxSpeed, 2);
		this.offenesCockpit = offenesCockpit;
		this.setImmatNummer(immat);
	}

	public Doppeldecker(String hersteller, int maxSpeed, String immat) {
		super(hersteller, maxSpeed, 2);
		this.setImmatNummer(immat);
		this.offenesCockpit=true;
	}

	public boolean isOffenesCockpit() {
		return offenesCockpit;
	}

	@Override
	public boolean getLooping() {
		return (super.getMaxSpeed()>getLoopingspeed());
	}

	public static int getLoopingspeed() {
		return LOOPINGSPEED;
	}

}

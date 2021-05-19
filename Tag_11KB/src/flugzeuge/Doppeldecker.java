package flugzeuge;

public final class Doppeldecker extends Flugzeug {

	private boolean offenesCockpit = true;
	private static final int LOOPINGSPEED = 320;

	public Doppeldecker(String hersteller, int maxSpeed, boolean offenesCockpit) {
		super(hersteller, maxSpeed, 2);
		this.offenesCockpit = offenesCockpit;
	}

	public Doppeldecker(String hersteller, int maxSpeed) {
		super(hersteller, maxSpeed, 2);
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

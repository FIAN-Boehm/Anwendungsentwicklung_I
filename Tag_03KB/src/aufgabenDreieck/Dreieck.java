package aufgabenDreieck;

public class Dreieck {
	private Punkt p1;
	private Punkt p2;
	private Punkt p3;

public Dreieck(){
System.out.println ("Dreieck wird erzeugt aus 3 Eckpunkten");
p1 = new Punkt();
p2 = new Punkt();
p3 = new Punkt();
}


	public double entfernung(Punkt p1, Punkt p2) {
		return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
	}

	public double umfang() {
		double s1, s2, s3, umfang;
		s1=this.entfernung(this.p1, this.p2);
		s2=this.entfernung(this.p2, this.p3);
		s3=this.entfernung(this.p3, this.p1);
		umfang=s1+s2+s3;
		return umfang;

	}
}

package aufgabeAutos;

public class MotorVehicle {
	private double length = 3.2, width = 1.5, hight = 1.3, weight = 1.2;
	private String brand = "Bugatti";
	private Adress startAdress = Adress.machAutohausAdresse(), destination = Adress.machAutohausAdresse(),
			customer = Adress.machAutohausAdresse();
	private boolean delivery = false;

	// customer wird übergeben mit Adressobjekt des Endkunden
	public MotorVehicle(double length, double width, double hight, double weight, String brand, Adress customer,
			Adress startAdress, Adress destination, boolean delivery) {

		this.length = length;
		this.width = width;
		this.hight = hight;
		this.weight = weight;
		this.brand = brand;
		this.customer = customer;
		this.startAdress = startAdress;
		this.destination = destination;
		this.delivery = delivery;

	}

	public MotorVehicle() {
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Adress getStartAdress() {
		return startAdress;
	}

	public void setStartAdress(Adress startAdress) {
		this.startAdress = startAdress;
	}

	public Adress getDestination() {
		return destination;
	}

	public void setDestination(Adress destination) {
		this.destination = destination;
	}

	public Adress getCustomer() {
		return customer;
	}

	public void setCustomer(Adress customer) {
		this.customer = customer;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	@Override
	public String toString() {
		return "MotorVehicle [length=" + length + ", width=" + width + ", hight=" + hight + ", weight=" + weight
				+ ", brand=" + brand + ", startAdress=" + startAdress + ", destination=" + destination + ", customer="
				+ customer + ", delivery=" + delivery + "]";
	}

	public void getStatus() {
		System.out.println("Größe LxBxH: " + getLength() + ", " + getWidth() + ", " + getHight());
		System.out.println("Gewicht: " + getWeight());
		System.out.println("Marke: " + getBrand());
		System.out.println("Start Adresse: ");
		this.startAdress.printAdress();
		if (this.delivery) {
			System.out.println("Zieladresse: ");
			this.destination.printAdress();
			System.out.println("Kein Selbstabholer");
			
		} else {
			System.out.println("Selbstabholer");
			
		}
		System.out.println("Kunde: " + this.customer.getName()+", "+this.customer.getVorname());
		System.out.println();
	}

}

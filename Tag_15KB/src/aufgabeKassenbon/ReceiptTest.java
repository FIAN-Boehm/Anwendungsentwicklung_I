package aufgabeKassenbon;

public class ReceiptTest {

	public static void main(String[] args) {
		Receipt r = new Receipt();

		r.addEintrag(new ReceiptItem("Fischst�bchen", 1.79, 3));
		r.addEintrag(new ReceiptItem("Steaks", 3.99, 5));
		r.addEintrag(new ReceiptItem("Naturelle (1l)", 4.99, 6));
		r.addEintrag(new ReceiptItem("Magnum Eis Creme",2.99,2));
		r.schreibeKopf();
		r.gibEintraegeAus();
		r.schreibeSumme();
		
	}
}

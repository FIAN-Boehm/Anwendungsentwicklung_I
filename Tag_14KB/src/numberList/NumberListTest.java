package numberList;

public class NumberListTest {

	public static void main(String[] args) {
		
		NumberList nl = new NumberList();
		for(int i= 0; i<10; i++) {
		nl.addElement(i);
		System.out.print("Wert: ");
		System.out.println(nl.getElement(i));
		System.out.print("L�nge: ");
		System.out.println(nl);
		}
		
		System.out.println(nl);
		nl.removeElement();
		System.out.println(nl);

		nl.removeElement(1);
		System.out.println(nl);
		nl.removeElement(3);
		System.out.println(nl);
		nl.removeElement(1);
		System.out.println(nl);
		nl.removeElement(0);
		System.out.println(nl);
		nl.removeElement(4);
		System.out.println(nl);
	}

}

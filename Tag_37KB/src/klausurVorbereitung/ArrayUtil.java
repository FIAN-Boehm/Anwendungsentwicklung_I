package klausurVorbereitung;

import java.util.Arrays;

public class ArrayUtil {

	private int[] array;

	public ArrayUtil(int[] array) {
		super();
		this.array = array;
	}

	public ArrayUtil() {
		super();
		this.array = new int[] { 0, 1, 2, 3, 4, 5 };
	}

	public ArrayUtil(int eingabe) {
		super();
		erzeugeUserArray(eingabe);
	}

	@Override
	public String toString() {
		return "ArrayUtil [array=" + Arrays.toString(array) + "]";
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	// aufgabe 1
	public void erzeugeUserArray(int eingabe) {
		array = new int[eingabe];
		for (int i = 0; i < eingabe; i++) {
			array[i] = eingabe - i;
		}
	}

	// aufgabe 2
	public static int searchIndex(int[] a, int value) {
		int matchIndex = -1;
		 
			for (int i = 0; i < a.length; i++) {
				if (a[i] == value) {
					matchIndex = i;
		
			}
		}
		return matchIndex;
	}

	// aufgabe 3
	public static void swap(int[] a, int i, int j) {
		if (i < a.length && j < a.length) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		} else {
			PrintHelper.printOutOfBounds();
		}
	}

	// aufgabe 4
	public static void reverseArray(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}

	// aufgabe 5
	public static int[] cloneArray(int[] a) {
		int[] clone = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			clone[i] = a[i];
		}

		return clone;
	}

}

package klausurVorbereitungArrays;

import java.util.Arrays;

public class ArrayUebungTest {

	public static void main(String[] args) {
		
		//aufgabe 1
		ArrayUtil au = new ArrayUtil(6);
		System.out.println(au.toString());
		//aufgabe 2
		System.out.println(ArrayUtil.searchIndex(au.getArray(), 4));
		//aufgabe 3
		ArrayUtil.swap(au.getArray(), 1, 4);
		System.out.println(au.toString());
		//aufgabe 4
		ArrayUtil.reverseArray(au.getArray());
		System.out.println(au.toString());
		//aufgabe 5
		int [] newArray = ArrayUtil.cloneArray(au.getArray());
		System.out.println(Arrays.toString(newArray));
	}

}

package aufgabe1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBuilder {

	private int[] array;
	private static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	public ArrayBuilder() {
		super();
	}

	public int[] readInArray(int numOfElements, int maxVal) {
		array = new int[numOfElements];
		for (int i = 0; i<array.length;i++) {
			array[i]= (int)(Math.random()*maxVal+1);
		}
		return array;
	}
	
	public int[] readInArray(int numOfElements,int minVal, int maxVal) {
		array = new int[numOfElements];
		for (int i = 0; i<array.length;i++) {
			array[i]= ((int) (Math.random()*(maxVal - minVal))) + minVal;
		}
		return array;
	}

	public int findMin(int[] searchArray) {
		int min = searchArray[0];
		for (int i = 1; i < searchArray.length; i++) {
			if (searchArray[i] < min) {
				min = searchArray[i];
			}
		}
		return min;
	}

	public int findMax(int[] searchArray) {
		int max = searchArray[0];
		for (int i = 1; i < searchArray.length; i++) {
			if (searchArray[i] > max) {
				max = searchArray[i];
			}
		}
		return max;
	}
	
	public String run () {
		int tmpLength = sc.nextInt();
		int tmpMin = sc.nextInt();
		int tmpMax = sc.nextInt();
		int [] tempArray =readInArray(tmpLength, tmpMin, tmpMax);
		String tmp = "Die niedrigste Zahl in der Kiste lautet: "+findMin(tempArray)+System.lineSeparator();
		tmp += "Die höchste Zahl in der Kiste lautet: "+findMax(tempArray)+System.lineSeparator();
		return tmp;
	}
	
	@Override
	public String toString() {
		return "ArrayBuilder [array=" + Arrays.toString(array) + "]";
	}

	public String startZeile() {
		return "Bitte sagen Sie an wie viele Zahlen ich anlegen soll: ";
	}

}

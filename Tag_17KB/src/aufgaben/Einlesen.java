package aufgaben;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Einlesen {
	static Scanner sc = null;

	public static void main(String[] args) {
		System.out.println(filtern("C:\\Java\\Wiki.txt", "Deutschland","c:\\Java\\logme.txt"));
	}

	public static int filtern(String eingabeDatei, String filterWort, String ausgabeDatei) {
		int anzahl = 0;
		File file = new File(eingabeDatei);
		FileWriter writer = null;
		try {
			writer = new FileWriter(ausgabeDatei);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			String tmp = sc.nextLine();
			if(tmp.contains(filterWort));
			anzahl++;
		}
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return anzahl;
	}
}

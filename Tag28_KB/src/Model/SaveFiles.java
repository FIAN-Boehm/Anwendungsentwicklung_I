package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SaveFiles {
	
	private File path, initialFile;
	private String saves[], pathString = "src/Saves/";
	
	public SaveFiles() {
		super();
		path = new File(pathString);
		saves=path.list();
		initialFile = new File(pathString+saves[0]);
	}

	@Override
	public String toString() {
		return "SaveFiles [path=" + path + ", initialFile=" + initialFile + ", saves=" + Arrays.toString(saves)
				+ ", pathString=" + pathString + "]";
	}

	public File getPath() {
		return path;
	}

	public void setPath(File path) {
		this.path = path;
	}

	public File getInitialFile() {
		return initialFile;
	}

	public void setInitialFile(File initialFile) {
		this.initialFile = initialFile;
	}

	public String[] getSaves() {
		return saves;
	}

	public void setSaves(String[] saves) {
		this.saves = saves;
	}

	public String getPathString() {
		return pathString;
	}

	public void setPathString(String pathString) {
		this.pathString = pathString;
	}
	
	public static String ladeStartBildschirm() {
		Scanner sc = null;
		String tmp="";
		try {
			sc = new Scanner(new File ("src/Saves/Willkommen.txt"));
		} catch (FileNotFoundException e) {
			// to do
			// pop up mit fehlermeldung
			
			System.out.println("Datei konnte nicht gefunden werden.");
			e.printStackTrace();
			
		}
		
		while (sc != null && sc.hasNext()) {
			tmp = tmp+sc.nextLine()+System.lineSeparator();
			
			
		}
		if (sc != null)
			sc.close();
		
		return tmp;
	}
	

	
	
}

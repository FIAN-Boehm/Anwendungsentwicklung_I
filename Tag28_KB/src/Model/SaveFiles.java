package Model;

import java.io.File;
import java.util.Arrays;

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
	

	
	
}

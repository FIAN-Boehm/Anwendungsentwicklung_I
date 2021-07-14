package View;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuBar extends JMenuBar {

	private JMenu mnuFile = new JMenu("Menü");
	private JMenu mnuHelp = new JMenu("Help");
	public JMenu getMnuFile() {
		return mnuFile;
	}

	public void setMnuFile(JMenu mnuFile) {
		this.mnuFile = mnuFile;
	}

	public JMenu getMnuHelp() {
		return mnuHelp;
	}

	public void setMnuHelp(JMenu mnuHelp) {
		this.mnuHelp = mnuHelp;
	}

	public JMenuItem getMniAbout() {
		return mniAbout;
	}

	public void setMniAbout(JMenuItem mniAbout) {
		this.mniAbout = mniAbout;
	}

	public JMenuItem getMniStart() {
		return mniStart;
	}

	public void setMniStart(JMenuItem mniStart) {
		this.mniStart = mniStart;
	}

	public JMenuItem getMniOpen() {
		return mniOpen;
	}

	public void setMniOpen(JMenuItem mniOpen) {
		this.mniOpen = mniOpen;
	}

	public JMenuItem getMniExit() {
		return mniExit;
	}

	public void setMniExit(JMenuItem mniExit) {
		this.mniExit = mniExit;
	}

	private JMenuItem mniAbout = new JMenuItem("About");
	private JMenuItem mniStart = new JMenuItem("Start");
	private JMenuItem mniOpen = new JMenuItem("Thema");
	private JMenuItem mniExit = new JMenuItem("Exit");
	
	
	public MyMenuBar() {
		init();
	}
	
	private void init() {
		this.mnuFile.add(mniStart);
		this.mnuFile.add(mniOpen);
		this.mnuFile.addSeparator();
		this.mnuFile.add(mniExit);
		
		this.mnuHelp.add(mniAbout);

		this.add(mnuFile);
		this.add(mnuHelp);
	}
}

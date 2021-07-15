package kaffeeAutomaten.view;


import javax.swing.JFrame;
import javax.swing.JMenuBar;

import kaffeeAutomaten.controller.Pausenraum;



public class MainFrame extends JFrame {

	private MainPanel mainPanel;
	private JMenuBar mnbMain;
	private Pausenraum pr;

	public MainFrame(Pausenraum pr) {
		super();
		this.pr=pr;
		mainPanel = new MainPanel(pr,this);
		mnbMain = new MyMenuBar();
		this.setResizable(false);
//		this.setLocation(-1000, 50);
		this.setLocationRelativeTo(null);
		this.setSize(860, 480);
		this.setContentPane(mainPanel);
		this.setJMenuBar(mnbMain);
		this.setTitle("Kaffee Junkies");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	

	public JMenuBar getMnbMain() {
		return mnbMain;
	}



	public void setMnbMain(JMenuBar mnbMain) {
		this.mnbMain = mnbMain;
	}



	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}



	public MainPanel getMainPanel() {
		return this.mainPanel;
	}

}

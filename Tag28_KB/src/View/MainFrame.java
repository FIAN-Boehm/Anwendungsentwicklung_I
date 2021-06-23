package View;


import javax.swing.JFrame;
import javax.swing.JMenuBar;



public class MainFrame extends JFrame {

	private MainPanel mainPanel = new MainPanel();

	private JMenuBar mnbMain = new MyMenuBar();

	public MainFrame() {
		super();
		
		this.setResizable(false);
//		this.setLocation(-1000, 50);
		this.setLocationRelativeTo(null);
		this.setSize(640, 480);
		this.setContentPane(mainPanel);
		this.setJMenuBar(mnbMain);
		this.setTitle("Ultimate Hangman");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	

	public MainPanel getMainPanel() {
		return this.mainPanel;
	}

}

package View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextPane;

public class RatePanel extends JPanel {

	JTextPane text = new JTextPane();
	Font font = new Font(Font.MONOSPACED, Font.BOLD,40);
	
	RatePanel(){
		text.setEditable(false);
		text.setOpaque(false);
		text.setFont(font);
		text.setText("ULTIMATE HANGMAN");
		this.setBackground(Color.LIGHT_GRAY);
		this.add(text);
		
	}
	
	
}

package kaffeeAutomaten.view;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class MyJTextPanel extends JPanel {

	private Dimension dimension = new Dimension(150,160);
	private JLabel label;
	private JTextPane text;
	
	public MyJTextPanel(String labelTxt) {
	super();
	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	this.add(label = new JLabel(labelTxt));
	this.add(text = new JTextPane());
	text.setPreferredSize(dimension);
	
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JTextPane getText() {
		return text;
	}

	public void setText(JTextPane text) {
		this.text = text;
	}
	
}

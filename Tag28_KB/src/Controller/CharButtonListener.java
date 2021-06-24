package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Model.Woerter;
import View.MainFrame;

public class CharButtonListener implements ActionListener {

	private Woerter woerter;
	private MainFrame frame;

	CharButtonListener(Woerter woerter, MainFrame frame) {
		this.woerter = woerter;
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		woerter.pruefeTip(btn.getText());
		
	}

}
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Model.Woerter;
import View.MainFrame;

public class CharButtonListener implements ActionListener {

	private Woerter woerter;
	private MainFrame frame;
	private RateLabelMaker rpm;

	CharButtonListener(Woerter woerter, MainFrame frame, RateLabelMaker rpm) {
		this.woerter = woerter;
		this.frame = frame;
		this.rpm = rpm;
	}

	//nimmt eine eingabe vom entsprechenden button entgegen
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		woerter.pruefeTip(btn.getText());
		rpm.zeichneRatebild();
		frame.getMainPanel().getRatePanel().repaint();
		if(woerter.isGewonnen()) {
			frame.getMainPanel().getZeichenPanel().zeichneGewonnenBild(woerter);
		}
//		System.out.println(btn.getText()); //nur zum testen
//	System.out.println(woerter.getRateBild()); //nur zum testen
//		System.out.println(woerter.getZielWortChars());

	}

}
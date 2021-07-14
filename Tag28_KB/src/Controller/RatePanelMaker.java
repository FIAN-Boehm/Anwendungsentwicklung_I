package Controller;

import java.util.ArrayList;

import javax.swing.JLabel;

import Model.Woerter;
import View.MainFrame;

public class RatePanelMaker {
	
	private Woerter woerter;
	private MainFrame frame;
	
	public RatePanelMaker(MainFrame frame, Woerter woerter) {
		this.frame=frame;
		this.woerter=woerter;
	}
	
	
	public void zeichneRatebild () {
		
		String tmp = "";
		for (String string : woerter.getRateBild()) {
			tmp=tmp+string+" ";
		}
		frame.getMainPanel().getRatePanel().getText().setText(tmp);
		frame.getMainPanel().getRatePanel().repaint();
	}
	
	
	
}

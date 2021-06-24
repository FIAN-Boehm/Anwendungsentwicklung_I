package Controller;

import java.util.ArrayList;

import javax.swing.JLabel;

import Model.Woerter;
import View.MainFrame;

public class RateLabelMaker {
	
	private Woerter woerter;
	private MainFrame frame;
	
	public RateLabelMaker(MainFrame frame, Woerter woerter) {
		this.frame=frame;
		this.woerter=woerter;
	}
	
	
	public void zeichneRatebild () {
		
		String tmp = "";
		for (String string : woerter.getRateBild()) {
			tmp=tmp+string;
		}
		frame.getMainPanel().getRatePanel().getText().setText(tmp);		
	}
	
}

package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JMenuItem;

import Model.SaveFiles;
import Model.Woerter;
import View.MainFrame;

public class MyController {

	private Woerter woerter;
	private MainFrame frame;
	private RatePanelMaker rpm;
	

	MyController() {

	}

	public void run() {
		woerter = new Woerter();
		frame = new MainFrame();
		rpm = new RatePanelMaker(frame, woerter);
		for (int i = 0; i < frame.getMainPanel().getBbox().getTastatur().length; i++) {
			frame.getMainPanel().getBbox().getTastatur()[i]
					.addActionListener(new CharButtonListener(woerter, frame, rpm));
		}
		((JMenuItem) frame.getMnbMain().getMenu(0).getMenuComponent(0)).addActionListener(MenueStartItemListenener.getInstance());
		frame.getMainPanel().getZeichenPanel().zeichneStartBild();
	}

	public void starteSpiel() {
		
		rpm.zeichneRatebild();
		
		woerter.setRunning(true);
		while (woerter.isRunning()) {

		}
		if (woerter.isGewonnen()) {
			frame.getMainPanel().getZeichenPanel().zeichneGewonnenBild(woerter);
		}else {
			frame.getMainPanel().getZeichenPanel().zeichneVerlorenBild(woerter);
		}
	}

	public Woerter getWoerter() {
		return woerter;
	}

	public void setWoerter(Woerter woerter) {
		this.woerter = woerter;
	}

	public MainFrame getFrame() {
		return frame;
	}

	public void setFrame(MainFrame frame) {
		this.frame = frame;
	}

	public RatePanelMaker getRpm() {
		return rpm;
	}

	public void setRpm(RatePanelMaker rpm) {
		this.rpm = rpm;
	}

}

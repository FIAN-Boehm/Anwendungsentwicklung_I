package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Model.Woerter;
import View.MainFrame;

public class MyController {

	private Woerter woerter;
	private MainFrame frame;
	private RateLabelMaker rpm;

	MyController() {
		
	}
	
	public void run() {
		woerter = new Woerter();
		frame = new MainFrame();
		rpm = new RateLabelMaker(frame, woerter);

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

	public RateLabelMaker getRpm() {
		return rpm;
	}

	public void setRpm(RateLabelMaker rpm) {
		this.rpm = rpm;
	}

}

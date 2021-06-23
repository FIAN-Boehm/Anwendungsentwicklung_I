package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Model.Woerter;
import View.MainFrame;



public class MyController {

	public void run() {
		Woerter woerter = new Woerter();
		MainFrame mf = new MainFrame();
		RateLabelMaker.machRateLabel(woerter.getZielWort(), mf.getMainPanel().getRatePanel().getTextLabel());
		
	}
	
}

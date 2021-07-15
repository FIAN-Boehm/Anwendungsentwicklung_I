package kaffeeAutomaten.view;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import kaffeeAutomaten.controller.Pausenraum;


public class MainPanel extends JPanel {

	ZeichenPanel zp;
	JButton startKnopf = new JButton("Simulation Starten");
	Pausenraum pr;
	JTextPane maschinenNr [];
	JTextPane txtFelder[];
	
	
	public MainPanel(Pausenraum pr) {
		init();
		this.pr=pr;
	}

	private void init() {
		this.add(zp = new ZeichenPanel());
		zp.zeichneStartBild();
		this.add(startKnopf);
		startKnopf.addActionListener(new StartKnopfListener());
	}
	
	private void startButton() {
		this.remove(startKnopf);
		this.remove(zp);
		setLayout(new GridLayout(3,5));
		maschinenNr = new JTextPane[5];
		txtFelder = new JTextPane[6];
		for (int i = 0; i < maschinenNr.length; i++) {
			maschinenNr[i] = new JTextPane();
			maschinenNr[i].setText(pr.getAutomaten()[i].getName());
			this.add(maschinenNr[i]);
		}
		
	}
	
	
	private class StartKnopfListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			startButton();
			pr.starteSimulation();		
			repaint();
		}
		
	}
}
	
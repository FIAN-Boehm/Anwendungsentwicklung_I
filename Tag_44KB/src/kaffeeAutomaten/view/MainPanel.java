package kaffeeAutomaten.view;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import kaffeeAutomaten.controller.Pausenraum;


public class MainPanel extends JPanel {

	
	private JButton startKnopf = new JButton("Simulation Starten");
	private Pausenraum pr;
	private MainFrame mf;
	private JLabel maschinenNr [];
	private JTextPane txtFelder[];
	
	
	public MainPanel(Pausenraum pr, MainFrame mf) {
		
		this.pr=pr;
		this.mf=mf;
		init();
	}

	private void init() {
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		maschinenNr = new JLabel[5];
		txtFelder = new JTextPane[5];
		for (int i = 0; i < maschinenNr.length; i++) {
			maschinenNr[i] = new JLabel(pr.getAutomaten()[i].getName());
			this.add(maschinenNr[i]);
			txtFelder[i]= new JTextPane();
			txtFelder[i].setPreferredSize(new Dimension(150,150));
			txtFelder[i].setName(pr.getAutomaten()[i].getName());
			txtFelder[i].setBorder(BorderFactory.createEtchedBorder());
			this.add(txtFelder[i]);
		}
		
		
		startKnopf.addActionListener(new StartKnopfListener());
		this.add(startKnopf);
	}
	
	

	public MainFrame getMf() {
		return mf;
	}

	public void setMf(MainFrame mf) {
		this.mf = mf;
	}

	public JLabel[] getMaschinenNr() {
		return maschinenNr;
	}

	public void setMaschinenNr(JLabel[] maschinenNr) {
		this.maschinenNr = maschinenNr;
	}

	public JTextPane[] getTxtFelder() {
		return txtFelder;
	}

	public void setTxtFelder(JTextPane[] txtFelder) {
		this.txtFelder = txtFelder;
	}

	public JButton getStartKnopf() {
		return startKnopf;
	}

	public void setStartKnopf(JButton startKnopf) {
		this.startKnopf = startKnopf;
	}

	public Pausenraum getPr() {
		return pr;
	}

	public void setPr(Pausenraum pr) {
		this.pr = pr;
	}

	
	
	private class StartKnopfListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
	
			pr.starteSimulation();		
			
		}
		
	}
}
	
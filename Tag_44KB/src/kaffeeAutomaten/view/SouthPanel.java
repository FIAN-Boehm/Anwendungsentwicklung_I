package kaffeeAutomaten.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import kaffeeAutomaten.controller.Pausenraum;

public class SouthPanel extends JPanel	{

	private Pausenraum pr;
	private MainFrame mf;
	private JButton startKnopf = new JButton("Simulation Starten");

	public SouthPanel(Pausenraum pr, MainFrame mf) {
		super();
		this.pr=pr;
		this.mf=mf;
		startKnopf.addActionListener(new StartKnopfListener());
		this.add(startKnopf);
	}
	
	public JButton getStartKnopf() {
		return startKnopf;
	}

	public void setStartKnopf(JButton startKnopf) {
		this.startKnopf = startKnopf;
	}
	private class StartKnopfListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
	
			pr.starteSimulation();		
			
		}
		
	}
}

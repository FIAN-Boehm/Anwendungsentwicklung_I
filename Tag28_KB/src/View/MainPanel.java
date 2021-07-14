package View;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.Woerter;

public class MainPanel extends JPanel {

	private ZeichenPanel zeichenPanel = new ZeichenPanel();
	private RatePanel ratePanel = new RatePanel();
	private ButtonBox bbox = new ButtonBox();
	private StrichmannPanel sp;
	
	public MainPanel() {
		init();
	}

	private void init() {
		this.setLayout(new BorderLayout());
		this.add(ratePanel, BorderLayout.NORTH);
		this.add(zeichenPanel, BorderLayout.CENTER);
		this.add(bbox, BorderLayout.SOUTH);
	}

	@Override
	public String toString() {
		return "MainPanel [zeichenPanel=" + zeichenPanel + ", ratePanel=" + ratePanel + ", bbox=" + bbox + "]";
	}

	public StrichmannPanel getSp() {
		return sp;
	}

	public void setSp(StrichmannPanel sp) {
		this.sp = sp;
	}

	public void setZeichenPanel(ZeichenPanel zeichenPanel) {
		this.zeichenPanel = zeichenPanel;
	}

	public void setRatePanel(RatePanel ratePanel) {
		this.ratePanel = ratePanel;
	}

	public void setBbox(ButtonBox bbox) {
		this.bbox = bbox;
	}

	public ZeichenPanel getZeichenPanel() {
		return zeichenPanel;
	}

	public RatePanel getRatePanel() {
		return ratePanel;
	}


	public ButtonBox getBbox() {
		return bbox;
	}
	public void zeichneGalgen(int fehlversuche) {
		sp = new StrichmannPanel(fehlversuche);
		remove(zeichenPanel);
		this.add(sp, BorderLayout.CENTER);
		
		
	}
	
	public void zeichneGewonnen() {
		remove(sp);
		this.add(zeichenPanel, BorderLayout.CENTER);
		
	}
	public void zeichneVerloren() {
		remove(sp);
		this.add(zeichenPanel, BorderLayout.CENTER);
		
	}

}

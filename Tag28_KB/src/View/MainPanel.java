package View;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private ZeichenPanel zeichenPanel = new ZeichenPanel();
	private RatePanel ratePanel = new RatePanel();
	private ButtonBox bbox = new ButtonBox();

	public MainPanel() {
		init();
	}

	private void init() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(ratePanel);
		this.add(zeichenPanel);
		this.add(bbox);

	}

	@Override
	public String toString() {
		return "MainPanel [zeichenPanel=" + zeichenPanel + ", ratePanel=" + ratePanel + ", bbox=" + bbox + "]";
	}

	public ZeichenPanel getzeichenPanel() {
		return zeichenPanel;
	}

	public RatePanel getratePanel() {
		return ratePanel;
	}


	public ButtonBox getBbox() {
		return bbox;
	}

}

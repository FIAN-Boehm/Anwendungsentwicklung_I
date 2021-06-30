package View;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import Model.Woerter;

public class StrichmannPanel extends JPanel {

	int fehlversuche = 0;

	public StrichmannPanel(int fehlversuche) {
		this.fehlversuche = fehlversuche;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);

		// Galgen linkes Bein
		if (fehlversuche > 0) {
			g.drawLine(225, 200, 200, 255);
		}
		// Galgen rechtes Bein
		if (fehlversuche > 1) {
			g.drawLine(225, 200, 250, 255);
		}
		// Galgen Stamm
		if (fehlversuche > 2) {
			g.drawLine(225, 10, 225, 200);
		}
		// Galgen Oberbalken
		if (fehlversuche > 3) {
			g.drawLine(225, 10, 425, 10);
		}
		// Galgen Stützbalken
		if (fehlversuche > 4) {
			g.drawLine(225, 70, 300, 10);
		}
		// Seil
		if (fehlversuche > 5) {
			g.drawLine(425, 10, 425, 50);
		}
		// Kopf
		if (fehlversuche > 6) {
			g.drawOval(400, 50, 50, 50);
		}
		// Körper
		if (fehlversuche > 7) {
			g.drawLine(425, 100, 425, 200);
		}
		// Linker Arm
		if (fehlversuche > 8) {
			g.drawLine(425, 125, 400, 160);
		}
		// rechter Arm
		if (fehlversuche > 9) {
			g.drawLine(425, 125, 450, 160);
		}
		// lINKES Bein
		if (fehlversuche > 10) {
			g.drawLine(425, 200, 400, 255);
		}
		// rechtes Bein
		if (fehlversuche > 11) {
			g.drawLine(425, 200, 450, 255);
		}
	}

}
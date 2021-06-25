package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import Model.Woerter;

public class ZeichenPanel extends JPanel{
	Font font = new Font(Font.MONOSPACED, Font.BOLD,30);
	JTextPane text;
	
	public void zeichneStartBild() {
		
	}
	
	//view der gezeigt wird wenn gewonnen wurde
	public void zeichneGewonnenBild(Woerter fehlversuche) {
//		this.setLayout(new BorderLayout());
		this.setBackground(Color.GREEN);
		
//		this.add(text= new JTextPane(), BorderLayout.CENTER);
		this.add(text= new JTextPane());
		text.setFont(font);
		
		text.setText(String.format("Du hast das Spiel gewonnen!!!\nFehlversuche: "+fehlversuche.getFehlversuche()));
		text.setLocation(this.getWidth()/2, this.getHeight()/2);
		text.setOpaque(false);
		repaint();
	}
	
	public void zeichneGalgen() {
	//to do	
	//Galgen zeichnen in Schritten switch case zur auswahl der Stufe	
	}
	

	//view der gezeigt wird wenn gewonnen wurde
	public void zeichneVerlorenBild(Woerter fehlversuche) {
this.setBackground(Color.RED);
		
//		this.add(text= new JTextPane(), BorderLayout.CENTER);
		this.add(text= new JTextPane());
		text.setFont(font);
		
		text.setText(String.format("Du hast das Spiel verloren!!!\nFehlversuche: "+fehlversuche.getFehlversuche()));
		text.setLocation(this.getWidth()/2, this.getHeight()/2);
		text.setOpaque(false);
		repaint();
	}
	
}

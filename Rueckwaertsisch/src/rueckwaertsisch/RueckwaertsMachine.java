package rueckwaertsisch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class RueckwaertsMachine {

	JFrame frame;
	JTextArea eingabe, ausgabe;
	JButton rueckwaertsisch;
	JPanel contentPane;
	JLabel header;
	
	public String reverser(String eingabe) {
		char satzZeichen=' ';
		StringBuilder sb= new StringBuilder(eingabe);
		if (eingabe.contains("!")||eingabe.contains(".")||eingabe.contains("?")) {
		satzZeichen = sb.charAt(eingabe.length()-1);
		sb.deleteCharAt(eingabe.length()-1);
		}
		sb.reverse();
		if (eingabe.contains("!")||eingabe.contains(".")||eingabe.contains("?")) {
		sb.append(satzZeichen);
		}
//		sb.setCharAt(satzZeichen, satzZeichen);
		return sb.toString();
	}
	
	public void run() {
		frame = new JFrame();
		frame.setSize(400, 350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(5,5));
		contentPane.setBorder(BorderFactory.createBevelBorder(5));
		contentPane.setSize(400, 300);
		
		header = new JLabel("Die unglaubliche Rückwärtsisch-Maschine");
		header.setBackground(Color.gray);
		
		contentPane.add(header, BorderLayout.NORTH);
		
		eingabe = new JTextArea("Gib hier deinen Satz ein...");
		Font font = new Font("Comic Sans MS", Font.BOLD, 20);
		
		eingabe.setBounds(50, 50, 400, 300);
		eingabe.setVisible(true);
		eingabe.setEditable(true);
		eingabe.setBackground(Color.white);
		eingabe.setLineWrap(true);
		eingabe.setWrapStyleWord(true);
		eingabe.setFont(font);
		
		rueckwaertsisch= new JButton("Rückwärtsisch");
		rueckwaertsisch.addActionListener(new RButtonListener());
		
		contentPane.add(eingabe, BorderLayout.CENTER);
		contentPane.add(rueckwaertsisch, BorderLayout.SOUTH);
		frame.setContentPane(contentPane);
//		frame.pack();
		
	}
	
	class RButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String tmpString=eingabe.getText();
			eingabe.setText(reverser(tmpString));
			
		}

		
		
	}
	
}

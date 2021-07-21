package org.boehm.taschenrechner;

import java.io.IOException;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class PrimaryController {

	@FXML
	Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_c, btn_ce, btn_durch, btn_mal,
			btn_plus, btn_minus, btn_enter, btn_dot, btn_vorzeichen;

	@FXML
	TextArea ausgabe;

	@FXML
	private void operationKeyListener(ActionEvent e) {
		String eingabe = null;
		if (ausgabe != null) {
			String monitor = ausgabe.getText();
			Button btn = (Button) e.getSource();
			eingabe = (btn.getText());
			if (!eingabe.equals(monitor.substring(monitor.length() - 1))) {

				if (monitor.substring(monitor.length() - 1).equals("+")
						|| monitor.substring(monitor.length() - 1).equals("-")
						|| monitor.substring(monitor.length() - 1).equals("*")
						|| monitor.substring(monitor.length() - 1).equals("/")) {
					monitor = monitor.substring(0, monitor.length() - 1) + eingabe;
					ausgabe.setText(monitor);
				} else {
						if (monitor.contains("=")) {
						ausgabe.setText(monitor.substring(monitor.indexOf("=") + 1));
					}
					ausgabe.appendText(btn.getText());
				}
			}
		}
	}

	@FXML
	private void listenToKeys(ActionEvent e) {
		Button btn = (Button) e.getSource();
		ausgabe.appendText(btn.getText());
	}

	@FXML
	private void enterListener(ActionEvent e) {
		ausgabe.appendText(String.format("\n"));
		ausgabe.appendText("=" + ALU.ausrechnen(ausgabe.getText()));
		if(ausgabe.getText().contains("=42.0")) {
			try {
				Desktop.getDesktop().browse(new URI("https://youtu.be/Rq1kBWzn5-s?t=97"));
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@FXML
	private void cListener(ActionEvent e) {
		ausgabe.setText("");
	}

	@FXML
	private void delListener(ActionEvent e) {
		String tmp = ausgabe.getText().substring(0, ausgabe.getText().length() - 1);
		ausgabe.setText(tmp);
	}
}

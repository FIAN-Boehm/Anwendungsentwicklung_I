package org.boehm.taschenrechner;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class PrimaryController {

	@FXML
	Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_c, btn_durch, btn_mal, btn_plus,
			btn_minus, btn_enter, btn_dot, btn_vorzeichen;

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
				} else
					ausgabe.appendText(btn.getText());
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
		ausgabe.appendText(ALU.ausrechnen(ausgabe.getText()));
	}
	
	@FXML
	private void cListener(ActionEvent e) {
		ausgabe.setText("");
	}
}

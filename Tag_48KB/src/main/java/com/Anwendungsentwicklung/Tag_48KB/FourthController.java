package com.Anwendungsentwicklung.Tag_48KB;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FourthController {
	@FXML
	Button btn_eins;
	@FXML
	Label lbl_eins;
	@FXML
	private void switchText(ActionEvent e) {
		Button source =(Button) e.getSource();
		lbl_eins.setText(source.getText());
	}
	
}
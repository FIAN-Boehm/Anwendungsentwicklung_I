package org.boehm.Test;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class PrimaryController {

	@FXML
	Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_c, btn_mal, btn_durch, btn_minus, btn_plus, btn_enter, btn_dot, btn_vorzeichen;
	
	@FXML
	TextArea ausgabe;
	
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}

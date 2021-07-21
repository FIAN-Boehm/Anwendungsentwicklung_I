package com.Anwendungsentwicklung.Tag_48KB;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ThirdController {

	@FXML 
	Label lblThird;
	
	
	Image image = new Image(App.class.getResourceAsStream("icons/world.png"));
	

	
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void initialize() {
    	lblThird.setGraphic(new ImageView(image));
    }
}
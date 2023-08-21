package pl.example.weatherapp_v1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label LButtonLabel;

    @FXML
    void LButtonAction() {
        LButtonLabel.setText("button clicked");
    }

}
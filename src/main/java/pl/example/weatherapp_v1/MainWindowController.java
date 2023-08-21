package pl.example.weatherapp_v1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainWindowController {

    @FXML
    private Label LButtonLabel;

    @FXML
    void LButtonAction() {
        LButtonLabel.setText("button clicked");
        System.out.println("Hello from the Launcher");
    }
}

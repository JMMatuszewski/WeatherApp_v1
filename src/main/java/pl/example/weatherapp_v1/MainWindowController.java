package pl.example.weatherapp_v1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class MainWindowController {


    @FXML
    private Label LButtonLabel;

    @FXML
    private ImageView LCityImage;

    @FXML
    private Label RButtonLabel;

    @FXML
    private ImageView RCityImage;

    @FXML
    void LButtonAction() {
        LButtonLabel.setText("button clicked");
        System.out.println("Hello from the Launcher");
    }

    @FXML
    void RButtonAction() {
        RButtonLabel.setText("button clicked");
        System.out.println("Hello from the Launcher");
    }



}

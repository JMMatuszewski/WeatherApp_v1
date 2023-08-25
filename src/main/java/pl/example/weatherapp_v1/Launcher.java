package pl.example.weatherapp_v1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Parent parent = FXMLLoader.load(Launcher.class.getResource("MainWindow.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("MainWindow.fxml"));//getClass().getResource("/MainWindow.fxml"
        //Scene scene = new Scene(fxmlLoader.load(), 600, 300);

        Scene scene = new Scene(parent, 600, 300);
        stage.setTitle("Main Window");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
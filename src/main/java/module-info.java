module pl.example.weatherapp_v1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens pl.example.weatherapp_v1 to javafx.fxml;
    exports pl.example.weatherapp_v1;
}
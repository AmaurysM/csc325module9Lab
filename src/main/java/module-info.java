module com.example.csc325module9lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc325module9lab to javafx.fxml;
    exports com.example.csc325module9lab;
}
module com.example.csc325module9lab {
    requires javafx.controls;
    requires javafx.fxml;

    requires firebase.admin;
    requires com.google.auth.oauth2;
    requires com.google.auth;
    requires google.cloud.firestore;
    requires com.google.api.apicommon;
    requires google.cloud.core;

    opens amaurys.csc325module9lab to javafx.fxml;
    exports amaurys.csc325module9lab;

}
module com.example.imt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.imt to javafx.fxml;
    exports com.example.imt;
}
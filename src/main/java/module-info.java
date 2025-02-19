module org.example.labwork_02_19 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.labwork_02_19 to javafx.fxml;
    exports org.example.labwork_02_19;
}
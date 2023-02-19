module com.awesomeconfigurator {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.awesomeconfigurator to javafx.fxml;
    exports com.awesomeconfigurator;
}

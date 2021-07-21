module org.boehm.taschenrechner {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    opens org.boehm.taschenrechner to javafx.fxml;
    exports org.boehm.taschenrechner;
}

module org.boehm.Test {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.boehm.Test to javafx.fxml;
    exports org.boehm.Test;
}

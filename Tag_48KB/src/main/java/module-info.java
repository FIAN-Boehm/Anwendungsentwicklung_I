module com.Anwendungsentwicklung.Tag_48KB {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;

    opens com.Anwendungsentwicklung.Tag_48KB to javafx.fxml;
    exports com.Anwendungsentwicklung.Tag_48KB;
}

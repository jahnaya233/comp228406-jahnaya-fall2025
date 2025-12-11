module com.java.program.jahnaya_comp228testfall2025 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.java.program.jahnaya_comp228testfall2025 to javafx.fxml;
    exports com.java.program.jahnaya_comp228testfall2025;
}
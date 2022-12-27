module r.masud.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens r.masud.javafx to javafx.fxml;
    exports r.masud.javafx;
}
module com.masanz.gdr.gestionderecursos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.masanz.gdr to javafx.fxml;
    exports com.masanz.gdr;

    opens com.masanz.gdr.controladores to javafx.fxml;
    exports com.masanz.gdr.controladores;
}
package com.masanz.gdr.controladores;

import com.masanz.gdr.gestores.GestorUsuarios;
import com.masanz.gdr.modelo.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GdrUsuariosController {

    private GestorUsuarios gestorUsuarios;

    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtDni;
    @FXML
    private TextField txtTelefono;

    @FXML
    private Button btnNuevo;
    @FXML
    private Button btnGrabar;
    @FXML
    private Button btnBorrar;
    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnLimpiar;

    @FXML
    private TextArea txaUsuarios;

    @FXML
    private void initialize() {
    }

    public void injectGdrController(GdrController gdrController) {
        this.gestorUsuarios = gdrController.getGestorUsuarios();
    }

    @FXML
    void nuevoUsuario(ActionEvent event) {

    }

    @FXML
    void grabarUsuario(ActionEvent event) {
        escribir("\n--------------------------------------------------\n");

        escribir("\n--------------------------------------------------\n");
    }

    @FXML
    void buscarUsuario(ActionEvent event) {
        escribir("\n--------------------------------------------------\n");

        escribir("--------------------------------------------------\n");
    }

    @FXML
    void borrarUsuario(ActionEvent event) {
        escribir("\n--------------------------------------------------\n");

        escribir("--------------------------------------------------\n");
    }

    @FXML
    void limpiarUsuario(ActionEvent event) {

    }

    private void limpiarCampos() {

    }

    private Usuario leerDatosUsuario() {
        return new Usuario();
    }

    private void fijarCampos(Usuario u) {

    }

    private void escribir(String texto){

    }

}
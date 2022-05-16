package com.masanz.gdr.controladores;

import com.masanz.gdr.Main;
import com.masanz.gdr.config.Ctes;
import com.masanz.gdr.gestores.GestorRecursos;
import com.masanz.gdr.gestores.GestorReservas;
import com.masanz.gdr.gestores.GestorUsuarios;
import com.masanz.gdr.gestores.IDelImpExpLen;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.Optional;

public class GdrController {

    //El modelo
    private GestorReservas gestorReservas;

    @FXML
    private TabPane tabPane;

    @FXML
    private GdrUsuariosController gdrUsuariosController;


    public GdrController() {
        gestorReservas = new GestorReservas();
        cargaInicialDatos();
    }

    private void cargaInicialDatos(){

    }

    @FXML
    private void initialize() {
        gdrUsuariosController.injectGdrController(this);
    }

    public GestorReservas getGestorReservas() {
        return gestorReservas;
    }

    public GestorRecursos getGestorRecursos() {
        return gestorReservas.getGestorRecursos();
    }

    public GestorUsuarios getGestorUsuarios() {
        return gestorReservas.getGestorUsuarios();
    }

    @FXML
    protected void cerrarAplicacion(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    protected void limpiarResultados(ActionEvent event) {
    }

    @FXML
    public void usuarios(ActionEvent actionEvent) {
        tabPane.getSelectionModel().select(0);
    }

    @FXML
    public void consultas(ActionEvent actionEvent) {
    }

    @FXML
    public void reservaPorRecurso(ActionEvent actionEvent) {
    }

    @FXML
    public void reservaPorFecha(ActionEvent actionEvent) {
    }

    @FXML
    public void anularReserva(ActionEvent actionEvent) {tabPane.getSelectionModel().select(4);
    }

    @FXML
    public void importarBdUsuarios(ActionEvent actionEvent) {
    }

    @FXML
    public void importarBdReservas(ActionEvent actionEvent) {
    }

    private void importarBd(String tipo, IDelImpExpLen gestor) {
    }

    public void exportarBdUsuarios(ActionEvent actionEvent) {
    }

    @FXML
    public void exportarBdReservas(ActionEvent actionEvent) {
    }

    private void exportarBd(String tipo, IDelImpExpLen gestor) {
    }

    @FXML
    public void borrarBdUsuarios(ActionEvent actionEvent) {
    }

    @FXML
    public void borrarBdReservas(ActionEvent actionEvent) {
    }

    private void borrarBd(String tipo, IDelImpExpLen gestor) {
    }

    @FXML
    public void info(ActionEvent actionEvent) {
    }

    private void alerta(String titulo, String texto){
    }

    private String dialogoEntrada(String titulo, String texto) {
        return null;
    }

    private boolean alertaConfirmacion(String texto) {
        return false;
    }

}
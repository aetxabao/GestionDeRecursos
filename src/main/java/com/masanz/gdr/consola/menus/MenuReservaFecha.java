package com.masanz.gdr.consola.menus;

import com.masanz.gdr.consola.enums.EMenuReservaFecha;
import com.masanz.gdr.consola.io.Entrada;
import com.masanz.gdr.consola.io.Salida;
import com.masanz.gdr.gestores.GestorRecursos;
import com.masanz.gdr.gestores.GestorReservas;
import com.masanz.gdr.modelo.Reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MenuReservaFecha implements IMenu {

    private GestorReservas gestorReservas;
    private GestorRecursos gestorRecursos;

    public MenuReservaFecha(GestorReservas gestorReservas) {
        //TODO: MenuReservaFecha
    }

    public void run() {
        //TODO: run
    }

    private void consultarRecursosFecha() {
        System.out.println("-----------------------------------------------------------");
        //TODO: consultarRecursosFecha
        System.out.println("-----------------------------------------------------------");
    }

    private void realizarReservaF() {
        System.out.println("-----------------------------------------------------------");
        //TODO: realizarReservaF
        System.out.println("-----------------------------------------------------------");
    }

    public static void main(String[] args) {
        MenuConsultas menu = new MenuConsultas(new GestorReservas());
        menu.run();
    }

}
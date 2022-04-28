package com.masanz.gdr.consola.menus;

import com.masanz.gdr.consola.enums.EMenuAnularReserva;
import com.masanz.gdr.consola.io.Entrada;
import com.masanz.gdr.consola.io.Salida;
import com.masanz.gdr.gestores.GestorReservas;
import com.masanz.gdr.modelo.Reserva;
import com.masanz.gdr.modelo.ReservaRecurso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MenuAnularReserva implements IMenu {

    private GestorReservas gestorReservas;

    public MenuAnularReserva(GestorReservas gestorReservas) {
        //TODO: MenuAnularReserva
    }

    public void run() {
        //TODO: run
    }

    private void consultarReservasUsuarioDia() {
        System.out.println("-----------------------------------------------------------");
        //TODO: consultarReservasUsuarioDia
        System.out.println("-----------------------------------------------------------");
    }

    private void anularReserva() {
        System.out.println("-----------------------------------------------------------");
        //TODO: anularReserva
        System.out.println("-----------------------------------------------------------");
    }

    public static void main(String[] args) {
        MenuConsultas menu = new MenuConsultas(new GestorReservas());
        menu.run();
    }

}
package com.masanz.gdr.consola.menus;

import com.masanz.gdr.consola.enums.EMenuReservaRecurso;
import com.masanz.gdr.consola.io.Entrada;
import com.masanz.gdr.consola.io.Salida;
import com.masanz.gdr.gestores.GestorRecursos;
import com.masanz.gdr.gestores.GestorReservas;
import com.masanz.gdr.modelo.Reserva;
import com.masanz.gdr.utils.Fechas;

import java.time.LocalDate;
import java.util.List;

public class MenuReservaRecurso implements IMenu {

    private GestorReservas gestorReservas;
    private GestorRecursos gestorRecursos;

    public MenuReservaRecurso(GestorReservas gestorReservas) {
        //TODO: MenuReservaRecurso
    }

    public void run() {
        //TODO: run
    }

    private void consultarRecursoPeriodoDias() {
        System.out.println("-----------------------------------------------------------");
        //TODO: consultarRecursoPeriodoDias
        System.out.println("-----------------------------------------------------------");
    }

    private void realizarReservaR() {
        System.out.println("-----------------------------------------------------------");
        //TODO: realizarReservaR
        System.out.println("-----------------------------------------------------------");
    }

    public static void main(String[] args) {
        MenuConsultas menu = new MenuConsultas(new GestorReservas());
        menu.run();
    }

}
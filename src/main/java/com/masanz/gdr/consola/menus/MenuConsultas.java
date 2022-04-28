package com.masanz.gdr.consola.menus;

import com.masanz.gdr.consola.enums.EMenuConsultas;
import com.masanz.gdr.consola.io.Entrada;
import com.masanz.gdr.consola.io.Salida;
import com.masanz.gdr.gestores.GestorRecursos;
import com.masanz.gdr.gestores.GestorReservas;
import com.masanz.gdr.gestores.GestorUsuarios;
import com.masanz.gdr.modelo.ReservaRecurso;
import com.masanz.gdr.modelo.ReservaUsuario;

import java.time.LocalDate;
import java.util.List;

public class MenuConsultas implements IMenu {

    private GestorReservas gestorReservas;
    private GestorUsuarios gestorUsuarios;
    private GestorRecursos gestorRecursos;

    public MenuConsultas(GestorReservas gestorReservas) {
        this.gestorReservas = gestorReservas;
        this.gestorUsuarios = gestorReservas.getGestorUsuarios();
        this.gestorRecursos = gestorReservas.getGestorRecursos();
    }

    public void run() {
        Salida.menuConsultas();
        int x = Entrada.leerEntero("Opción", 0, EMenuConsultas.tamano()-1);
        EMenuConsultas opc =  EMenuConsultas.desdeEntero(x);
        while (opc != EMenuConsultas.M_CO_TERMINAR) {
            switch (opc) {
                case M_CO_USUARIO:
                    consultarPorUsuario();
                    break;
                case M_CO_RECURSO_DIA:
                    consultarPorRecursoDia();
                    break;
                default:
            }
            Salida.menuConsultas();
            x = Entrada.leerEntero("Opción", 0, EMenuConsultas.tamano()-1);
            opc =  EMenuConsultas.desdeEntero(x);
        }
    }

    private void consultarPorUsuario() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Reservas Por Usuario");
        String[] ids = gestorUsuarios.getIds();
        Salida.imprimirOpciones(ids);
        int numero = Entrada.leerEnteroPositivo("Número");
        List<ReservaRecurso> lista = gestorReservas.reservasPorUsuario(numero);
        for (ReservaRecurso rr : lista) {
            System.out.println(rr);
        }
        System.out.println("-----------------------------------------------------");
    }

    private void consultarPorRecursoDia() {
        System.out.println("-----------------------------------------------------");
        //TODO: consultarPorRecursoDia
        System.out.println("-----------------------------------------------------");
    }

    public static void main(String[] args) {
        MenuConsultas menu = new MenuConsultas(new GestorReservas());
        menu.run();
    }

}
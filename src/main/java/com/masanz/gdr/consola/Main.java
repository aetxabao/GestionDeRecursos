package com.masanz.gdr.consola;

import com.masanz.gdr.consola.menus.MenuPrincipal;
import com.masanz.gdr.gestores.GestorReservas;

public class Main {

    public static void main(String[] args) {
        new MenuPrincipal(new GestorReservas()).run();
    }

}
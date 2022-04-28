package com.masanz.gdr.consola.enums;

public enum EMenuAnularReserva {

    M_AR_TERMINAR, //0
    M_AR_RESERVAS, M_AR_ANULAR; //1-2

    public static EMenuAnularReserva desdeEntero(int x) {
        return values()[x];
    }

    public static int tamano(){
        return values().length;
    }
}

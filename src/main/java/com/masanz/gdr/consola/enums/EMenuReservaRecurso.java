package com.masanz.gdr.consola.enums;

public enum EMenuReservaRecurso {

    M_RR_TERMINAR, //0
    M_RR_RECURSO, M_RR_RESERVA; //1-2

    public static EMenuReservaRecurso desdeEntero(int x) {
        return values()[x];
    }

    public static int tamano(){
        return values().length;
    }
}

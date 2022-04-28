package com.masanz.gdr.consola.enums;

public enum EMenuReservaFecha {

    M_RF_TERMINAR, //0
    M_RF_FECHA, M_RF_RESERVA; //1-2

    public static EMenuReservaFecha desdeEntero(int x) {
        return values()[x];
    }

    public static int tamano(){
        return values().length;
    }
}

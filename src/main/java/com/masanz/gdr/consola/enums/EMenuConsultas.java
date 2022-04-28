package com.masanz.gdr.consola.enums;

public enum EMenuConsultas {

    M_CO_TERMINAR, //0
    M_CO_USUARIO, M_CO_RECURSO_DIA; //1-2

    public static EMenuConsultas desdeEntero(int x) {
        return values()[x];
    }

    public static int tamano(){
        return values().length;
    }

}

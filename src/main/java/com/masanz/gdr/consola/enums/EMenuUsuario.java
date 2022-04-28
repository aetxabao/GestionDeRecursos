package com.masanz.gdr.consola.enums;

public enum EMenuUsuario {

    M_US_TERMINAR, //0
    M_US_CREAR, M_US_BUSCAR, //1-2
    M_US_ACTUALIZAR, M_US_BORRAR; //3-4

    public static EMenuUsuario desdeEntero(int x) {
        return values()[x];
    }

    public static int tamano(){
        return values().length;
    }

}
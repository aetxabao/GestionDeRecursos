package com.masanz.gdr.consola.enums;

public enum EMenuPrincipal {

    M_PR_TERMINAR,//0
    M_PR_GESTIONAR_USUARIOS, M_PR_CONSULTAR_RESERVAS,//1-2
    M_PR_RESERVAR_X_RECURSO, M_PR_RESERVAR_X_FECHA,//3-4
    M_PR_ANULAR_RESERVA,//5
    M_PR_GESTIONAR_BD;//6

    public static EMenuPrincipal desdeEntero(int x) {
        return values()[x];
    }

    public static int tamano(){
        return values().length;
    }

}
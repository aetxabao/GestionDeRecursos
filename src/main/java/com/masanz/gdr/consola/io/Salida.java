package com.masanz.gdr.consola.io;

import com.masanz.gdr.config.Ctes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Salida {

    public static void menuPrincipal() {
        System.out.println("===========================================================");
        System.out.println("=          G e s t i ó n   d e   R e c u r s o s          =");
        System.out.println("===========================================================");
        System.out.println("\t1. Gestión de usuarios");             //M_PR_GESTIONAR_USUARIOS
        System.out.println("\t2. Consultar reservas");              //M_PR_CONSULTAR_RESERVAS
        System.out.println("\t3. Reservar por recurso");            //M_PR_RESERVAR_X_RECURSO
        System.out.println("\t4. Reservar por fecha");              //M_PR_RESERVAR_X_FECHA
        System.out.println("\t5. Anular reserva");                  //M_PR_ANULAR_RESERVA
        System.out.println("\t6. Gestionar base de datos");         //M_PR_GESTIONAR_BD
        System.out.println("\t0. Terminar");                        //M_PR_TERMINAR
        System.out.println("===========================================================");
    }

    public static void menuUsuario() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("-          G e s t i ó n   d e   U s u a r i o s          -");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\t\t1. Crear usuario");               //M_US_CREAR
        System.out.println("\t\t\t2. Buscar usuario");              //M_US_BUSCAR
        System.out.println("\t\t\t3. Actualizar usuario");          //M_US_ACTUALIZAR
        System.out.println("\t\t\t4. Borrar usuario");              //M_US_BORRAR
        System.out.println("\t\t\t0. Terminar");                    //M_US_TERMINAR
        System.out.println("-----------------------------------------------------------");
    }

    public static void menuConsultas() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("-                    C o n s u l t a s                    -");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\t\t1. Reservas por usuario");        //M_CO_USUARIO
        System.out.println("\t\t\t2. Buscar por recurso y día");    //M_CO_RECURSO_DIA
        System.out.println("\t\t\t0. Terminar");                    //M_CO_TERMINAR
        System.out.println("-----------------------------------------------------------");
    }

    public static void menuResRecurso() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("-        R e s e r v a s   p o r   R e c u r s o          -");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\t\t1. Consultar recurso");           //M_RR_RECURSO
        System.out.println("\t\t\t2. Realizar reserva");            //M_RR_RESERVA
        System.out.println("\t\t\t0. Terminar");                    //M_RR_TERMINAR
        System.out.println("-----------------------------------------------------------");
    }

    public static void menuResFecha() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("-          R e s e r v a s   p o r   F e c h a            -");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\t\t1. Consultar fecha");             //M_RF_FECHA
        System.out.println("\t\t\t2. Realizar reserva");            //M_RF_RESERVA
        System.out.println("\t\t\t0. Terminar");                    //M_RF_TERMINAR
        System.out.println("-----------------------------------------------------------");
    }

    public static void menuAnularRes() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("-             A n u l a r   R e s e r v a s               -");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\t\t1. Reservas usuario día");        //M_AR_RESERVAS
        System.out.println("\t\t\t2. Anular reserva");              //M_AR_ANULAR
        System.out.println("\t\t\t0. Terminar");                    //M_AR_TERMINAR
        System.out.println("-----------------------------------------------------------");
    }

    public static void menuBD() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("-        G e s t i ó n   B a s e   d e   D a t o s        -");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\t\t1. Limpiar BD usuarios");         //M_BD_LIMPIAR_USUARIOS
        System.out.println("\t\t\t2. Importar BD usuarios");        //M_BD_IMPORTAR_USUARIOS
        System.out.println("\t\t\t3. Exportar BD usuarios");        //M_BD_EXPORTAR_USUARIOS
        System.out.println("\t\t\t4. Limpiar BD reservas");         //M_BD_LIMPIAR_RESERVAS
        System.out.println("\t\t\t5. Importar BD reservas");        //M_BD_IMPORTAR_RESERVAS
        System.out.println("\t\t\t6. Exportar BD reservas");        //M_BD_EXPORTAR_RESERVAS
        System.out.println("\t\t\t0. Terminar");                    //M_BD_TERMINAR
        System.out.println("-----------------------------------------------------------");
    }

    public static void imprimirOpciones(String[] opciones) {
        for (String opcion : opciones) {
            System.out.print(opcion + " ");
        }
        System.out.println();
    }

    public static void tablaFechasHoras(int[][] t, LocalDate f) {
        //TODO: tablaFechasHoras
    }

    public static void tablaHorasRecursos(int[][] t, String[] nombres) {
        //TODO: tablaHorasRecursos
    }
}
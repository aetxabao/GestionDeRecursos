package com.masanz.gdr.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Fechas {

    public static String hoy() {
        //Para que se puedan utilizar los datos de prueba
        return "2022-04-01";
    }

    public static String formatoLargoDiaSemana(LocalDate fecha) {
        DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("EEEE, d MMMM",new Locale("es", "ES"));//"yyyy-MM-dd");
        String s = fecha.format(dtfDate);
        s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
        return s;
    }
}

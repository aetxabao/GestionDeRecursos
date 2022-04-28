package com.masanz.gdr.config;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ctes {

    public static final int NUM_DIAS = 10;
    public static final int NUM_HORAS = 12;
    public static final LocalTime HORA_INICIO = LocalTime.parse("08:00", DateTimeFormatter.ofPattern("HH:mm"));
    public static final String[] HORAS_ETIQUETAS = {" 8am", " 9am", "10am", "11am", "12pm",
            " 1pm", " 2pm", " 3pm", " 4pm", " 5pm", " 6pm", " 7pm", " 8pm" };
    public static final int TIPO_ESPACIO = 0;
    public static final int TIPO_HARDWARE = 1;

}



package com.masanz.gdr.modelo;

import com.masanz.gdr.modelo.recursos.Recurso;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ReservaRecurso {

    private Reserva reserva;
    private Recurso recurso;

    public ReservaRecurso(Reserva reserva, Recurso recurso) {
        this.reserva = reserva;
        this.recurso = recurso;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    @Override
    public String toString() {
        //TODO: toString
        return reserva.toString();
    }

    public String getTiempoRecursoHash() {
        //TODO: getTiempoRecursoHash
        return "TRH";
    }

    public String getCodigoHash() {
        return reserva.getCodigoHash();
    }

}

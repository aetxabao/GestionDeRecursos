package com.masanz.gdr.modelo;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ReservaUsuario {

    private Reserva reserva;
    private Usuario usuario;

    public ReservaUsuario(Reserva reserva, Usuario usuario) {
        //TODO: ReservaUsuario
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        //TODO: toString
        return "RU";
    }

}

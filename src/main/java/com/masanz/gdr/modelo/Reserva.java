package com.masanz.gdr.modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

public class Reserva {

    private int idUsuario;
    private String idRecurso;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Reserva() {
        this.idUsuario = 0;
        this.idRecurso = "";
        this.fecha = null;
        this.horaInicio = null;
        this.horaFin = null;
    }

    public Reserva(int idUsuario, String idRecurso,
                   LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
        //TODO: Reserva
        this.idUsuario = idUsuario;
        this.idRecurso = idRecurso;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Reserva(int idUsuario, String idRecurso,
                   String fecha, String horaInicio, String horaFin) {
        DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hInicio = LocalTime.parse(horaInicio,dtfTime);
        LocalTime hFin = LocalTime.parse(horaFin,dtfTime);
        LocalDate f = LocalDate.parse(fecha, dtfDate);
        //TODO: Reserva
        this.idUsuario = idUsuario;
        this.idRecurso = idRecurso;
        this.fecha = f;
        this.horaInicio = hInicio;
        this.horaFin = hFin;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(String idRecurso) {
        this.idRecurso = idRecurso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva r = (Reserva) o;
        if (idRecurso.equals(r.idRecurso) && fecha.equals(r.fecha)) {
            // Dos reservas son iguales si se solapan en el tiempo (mismo recurso y fecha)
            boolean overlaps = (  horaInicio.isBefore( r.horaFin )  &&
                                  horaFin.isAfter( r.horaInicio )       ) ;
            return overlaps;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRecurso, fecha, horaInicio);
    }

    public String getCodigoHash() {
        return Integer.toHexString(hashCode());
    }

    @Override
    public String toString() {
        //TODO: toString
        return "Reserva{" +
                "idUsuario=" + idUsuario +
                ", idRecurso='" + idRecurso + '\'' +
                ", fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                '}';
    }

}

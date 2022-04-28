package com.masanz.gdr.gestores;

import com.masanz.gdr.config.Ctes;
import com.masanz.gdr.modelo.*;
import com.masanz.gdr.modelo.recursos.Recurso;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class GestorReservas implements ICrud<Reserva,String>{

    private GestorUsuarios gestorUsuarios;
    private GestorRecursos gestorRecursos;
    private Map<String, Reserva> reservas;

    public GestorReservas() {
        this.reservas = new HashMap<>();
        this.gestorUsuarios = new GestorUsuarios();
        this.gestorRecursos = new GestorRecursos();
    }

    public GestorUsuarios getGestorUsuarios() {
        return gestorUsuarios;
    }

    public GestorRecursos getGestorRecursos() {
        return gestorRecursos;
    }

    public List<ReservaRecurso> reservasPorUsuario(int idUsuario) {
        List<ReservaRecurso> lista = new ArrayList<>();
        //TODO: reservasPorUsuario
        for (Reserva reserva : reservas.values()) {
            if (reserva.getIdUsuario() == idUsuario){
                Recurso recurso = null;
                lista.add(new ReservaRecurso(reserva, recurso));
            }
        }
        return lista;
    }

    public List<ReservaRecurso> reservasPorUsuarioDia(int idUsuario, LocalDate fecha) {
        List<ReservaRecurso> lista = new ArrayList<>();
        //TODO: reservasPorUsuarioDia
        return lista;
    }

    public List<ReservaUsuario> reservasPorRecursoDia(String idRecurso, LocalDate fecha) {
        List<ReservaUsuario> lista = new ArrayList<>();
        //TODO: reservasPorRecursoDia
        return lista;
    }

    public int[][] reservasPorRecursoPeriodo(String idRecurso, LocalDate fechaInicio) {
        int[][] t = new int[Ctes.NUM_DIAS][Ctes.NUM_HORAS];
        //TODO: reservasPorRecursoPeriodo
        return t;
    }

    public int[][] reservasPorTipoFecha(int tipo, LocalDate fecha) {
        ArrayList<String> listaIds = gestorRecursos.getIdsTipo(tipo);
        int num = listaIds.size();
        int[][] t = new int[Ctes.NUM_HORAS][num];
        //TODO: reservasPorTipoFecha
        return t;
    }


    @Override
    public boolean crear(Reserva o) {
        // Si se solapa con alguno será equals y no se agregará
        if (reservas.values().contains(o)) {
            return false;
        }
        reservas.put(o.getCodigoHash(), o);
        return true;
    }

    @Override
    public Reserva buscar(String codigoHash) {
        return reservas.get(codigoHash);
    }

    @Override
    public boolean actualizar(Reserva o) {
        // No se permite actualizar
        return false;
    }

    @Override
    public boolean borrar(Reserva o) {
        reservas.remove(o.getCodigoHash());
        return true;
    }

}

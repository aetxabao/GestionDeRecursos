package com.masanz.gdr.modelo.recursos;

import java.util.Objects;

public abstract class Recurso {

    private String id;
    private String alias;
    private String nombre;

    public Recurso(String id, String alias, String nombre) {
        this.id = id;
        this.alias = alias;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recurso recurso = (Recurso) o;
        return id.equals(recurso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

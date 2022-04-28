package com.masanz.gdr.modelo;

import java.util.Objects;

public class Usuario {

    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private int telefono;

    public Usuario() {
        this.id = 0;
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.telefono = 0;
    }

    public Usuario(int numero, String nombre, String apellidos, String dni, int telefono) {
        this.id = numero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos, dni, telefono);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-12s","Número:")).append(id).append("\n");
        sb.append(String.format("%-12s","Nombre:")).append(nombre).append("\n");
        sb.append(String.format("%-12s","Apellidos:")).append(apellidos).append("\n");
        sb.append(String.format("%-12s","DNI:")).append(dni).append("\n");
        sb.append(String.format("%-12s","Teléfono:")).append(telefono).append("\n");
        return sb.toString();
    }

}

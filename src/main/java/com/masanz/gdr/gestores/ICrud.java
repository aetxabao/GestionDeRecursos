package com.masanz.gdr.gestores;

public interface ICrud <T,E>{
    public boolean crear(T o);
    public T buscar(E id);
    public boolean actualizar(T o);
    public boolean borrar(T o);
}
package com.masanz.gdr.gestores;

import com.masanz.gdr.modelo.Usuario;

import java.util.Map;
import java.util.TreeMap;

public class GestorUsuarios implements ICrud<Usuario,String> {

    private Map<Integer, Usuario> usuarios;

    private static int mayorId = 0;

    public GestorUsuarios() {
        usuarios = new TreeMap<>();
    }

    @Override
    public boolean crear(Usuario o) {
        if (usuarios.containsKey(o.getId())) {
            return false;
        }
        if (o.getId()>mayorId){
            mayorId = o.getId();
        }
        usuarios.put(o.getId(),o);
        return true;
    }

    @Override
    public Usuario buscar(String id) {
        return usuarios.get(Integer.parseInt(id));
    }

    @Override
    public boolean actualizar(Usuario o) {
        // No se debe permitir modificar id
        if (o.getId()>mayorId){
            mayorId = o.getId();
        }
        usuarios.put(o.getId(),o);
        return true;
    }

    @Override
    public boolean borrar(Usuario o) {
        usuarios.remove(o.getId());
        return true;
    }

    public String[] getIds() {
        int i = 0;
        String[] ids = new String[usuarios.size()];
        for (Integer id : usuarios.keySet()) {
            ids[i++] = Integer.toString(id);
        }
        return ids;
    }

    public int getMayorId() {
        return mayorId;
    }

}

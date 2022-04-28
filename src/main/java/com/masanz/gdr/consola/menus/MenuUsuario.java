package com.masanz.gdr.consola.menus;

import com.masanz.gdr.consola.enums.EMenuUsuario;
import com.masanz.gdr.consola.io.Entrada;
import com.masanz.gdr.consola.io.Salida;
import com.masanz.gdr.gestores.GestorUsuarios;
import com.masanz.gdr.gestores.ICrud;
import com.masanz.gdr.modelo.Usuario;

public class MenuUsuario implements IMenu {

    private ICrud<Usuario,String> gestor;

    public MenuUsuario(ICrud<Usuario, String> gestor) {
        this.gestor = gestor;
    }

    public void run() {
        Salida.menuUsuario();
        int x = Entrada.leerEntero("Opción", 0, EMenuUsuario.tamano()-1);
        EMenuUsuario opc =  EMenuUsuario.desdeEntero(x);
        while (opc != EMenuUsuario.M_US_TERMINAR) {
            switch (opc) {
                case M_US_CREAR:
                    crearUsuario();
                    break;
                case M_US_BUSCAR:
                    buscarUsuario();
                    break;
                case M_US_ACTUALIZAR:
                    actualizarUsuario();
                    break;
                case M_US_BORRAR:
                    borrarUsuario();
                    break;
                default:
            }
            Salida.menuUsuario();
            x = Entrada.leerEntero("Opción", 0, EMenuUsuario.tamano()-1);
            opc =  EMenuUsuario.desdeEntero(x);
        }
    }

    private void borrarUsuario() {
        System.out.println("---------------------------------------------------");
        System.out.println("Borrar Usuario");
        int numero = Entrada.leerEnteroPositivo("Número");
        Usuario u = gestor.buscar(String.valueOf(numero));
        if (u==null){
            System.out.printf("No se ha encontrado el usuario %d.\n",numero);
        }else{
            if (gestor.borrar(u)) {
                System.out.printf("Se ha borrado el usuario %d.\n",numero);
            }else{
                System.out.printf("No se ha podido borrar el usuario %d.\n",numero);
            }
        }
        System.out.println("---------------------------------------------------");
    }

    private void actualizarUsuario() {
        System.out.println("---------------------------------------------------");
        System.out.println("Actualizar Usuario");
        int numero = Entrada.leerEnteroPositivo("Número");
        Usuario u = gestor.buscar(String.valueOf(numero));
        if (u==null){
            System.out.printf("No se ha encontrado el usuario %d.\n",numero);
        }else{
            Usuario o = leerDatosUsuario(numero);
            if (gestor.actualizar(o)) {
                System.out.printf("Se ha actualizado el usuario %d.\n",numero);
            }else{
                System.out.printf("No se ha podido actualizar el usuario %d.\n",numero);
            }
        }
        System.out.println("---------------------------------------------------");
    }

    private void buscarUsuario() {
        System.out.println("---------------------------------------------------");
        System.out.println("Buscar Usuario");
        int numero = Entrada.leerEnteroPositivo("Número");
        Usuario u = gestor.buscar(String.valueOf(numero));
        if (u==null){
            System.out.printf("No se ha encontrado el usuario %d.\n",numero);
        }else{
            System.out.println("Usuario encontrado:");
            System.out.println(u.toString());
        }
        System.out.println("---------------------------------------------------");
    }

    private void crearUsuario() {
        System.out.println("---------------------------------------------------");
        System.out.println("Crear Usuario");
        Usuario u = leerDatosUsuario(0);
        if (gestor.crear(u)){
            System.out.printf("Usuario %d creado.\n",u.getId());
        }else{
            System.out.printf("No se ha podido crear.\nCompruebe que %d no existe.\n",u.getId());
        }
        System.out.println("---------------------------------------------------");
    }

    public static Usuario leerDatosUsuario(int numero) {
        if (numero == 0) {
            numero = Entrada.leerEnteroPositivo("Número");
        }
        String nombre = Entrada.leerString("Nombre");
        String apellidos = Entrada.leerString("Apellidos");
        String dni = Entrada.leerString("DNI");
        int telefono = Entrada.leerEnteroPositivo("Teléfono");
        return new Usuario(numero,nombre,apellidos,dni,telefono);
    }



    public static void main(String[] args) {
        MenuUsuario menu = new MenuUsuario(new GestorUsuarios());
        menu.run();
    }

}
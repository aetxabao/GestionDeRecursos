package com.masanz.gdr.consola.menus;

import com.masanz.gdr.consola.enums.EMenuPrincipal;
import com.masanz.gdr.consola.io.Entrada;
import com.masanz.gdr.consola.io.Salida;
import com.masanz.gdr.gestores.GestorReservas;
import com.masanz.gdr.gestores.GestorUsuarios;
import com.masanz.gdr.modelo.Reserva;
import com.masanz.gdr.modelo.Usuario;

public class MenuPrincipal implements IMenu {

    private GestorUsuarios gestorUsuarios;
    private GestorReservas gestorReservas;

    public MenuPrincipal(GestorReservas gestorReservas) {
        this.gestorReservas = gestorReservas;
        this.gestorUsuarios = gestorReservas.getGestorUsuarios();
        cargaInicialDatos();
    }

    private void cargaInicialDatos(){
        gestorUsuarios.crear(new Usuario(1001,"Aitor","E.","12345678A",987654321));
        gestorUsuarios.crear(new Usuario(1002,"Montse","V.","44556677M",999888777));
        gestorUsuarios.crear(new Usuario(1003,"Mikel","S.","34534534K",987789987));
        gestorUsuarios.crear(new Usuario(1004,"Silvia","A.","56565656S",923945967));
        gestorUsuarios.crear(new Usuario(1005,"Laura","L.","78238992X",666777888));
        gestorReservas.crear(new Reserva(1004,"S-V-DOS","2022-04-01","09:00","11:00"));
        gestorReservas.crear(new Reserva(1002,"S-V-UNO","2022-04-01","09:00","11:00"));
        gestorReservas.crear(new Reserva(1003,"H-L-A02","2022-04-01","11:00","13:00"));
        gestorReservas.crear(new Reserva(1003,"S-V-UNO","2022-04-05","09:00","11:00"));
        gestorReservas.crear(new Reserva(1004,"S-V-UNO","2022-04-05","15:00","17:00"));
        gestorReservas.crear(new Reserva(1001,"S-V-UNO","2022-04-04","11:00","13:00"));
        gestorReservas.crear(new Reserva(1004,"S-V-UNO","2022-04-08","13:00","14:00"));
        gestorReservas.crear(new Reserva(1003,"S-R-ADM","2022-04-01","11:00","13:00"));
        gestorReservas.crear(new Reserva(1002,"S-V-UNO","2022-04-08","11:00","13:00"));
        gestorReservas.crear(new Reserva(1005,"H-L-A02","2022-04-01","09:00","11:00"));
        gestorReservas.crear(new Reserva(1004,"S-V-UNO","2022-04-11","16:00","18:00"));
        gestorReservas.crear(new Reserva(1001,"H-R-E01","2022-04-01","16:00","20:00"));
        gestorReservas.crear(new Reserva(1005,"H-L-A01","2022-04-01","09:00","11:00"));
        gestorReservas.crear(new Reserva(1001,"S-R-ING","2022-04-01","09:00","11:00"));
        gestorReservas.crear(new Reserva(1001,"S-R-PRI","2022-04-01","16:00","20:00"));
        gestorReservas.crear(new Reserva(1005,"H-R-E01","2022-04-01","09:00","11:00"));
    }

    public void run() {
        Salida.menuPrincipal();
        int x = Entrada.leerEntero("Opción", 0, EMenuPrincipal.tamano()-1);
        EMenuPrincipal opc =  EMenuPrincipal.desdeEntero(x);
        while (opc != EMenuPrincipal.M_PR_TERMINAR) {
            switch (opc) {
                case M_PR_GESTIONAR_USUARIOS:
                    gestionarUsuarios();
                    break;
                case M_PR_CONSULTAR_RESERVAS:
                    consultarReservas();
                    break;
                case M_PR_RESERVAR_X_RECURSO:
                    reservarPorRecurso();
                    break;
                case M_PR_RESERVAR_X_FECHA:
                    reservarPorFecha();
                    break;
                case M_PR_ANULAR_RESERVA:
                    anularReserva();
                    break;
                case M_PR_GESTIONAR_BD:
                    gestionarDatos();
                    break;
                default:
            }
            Salida.menuPrincipal();
            x = Entrada.leerEntero("Opción", 0, EMenuPrincipal.tamano()-1);
            opc =  EMenuPrincipal.desdeEntero(x);
        }
    }

    private void gestionarDatos() {
        //TODO: gestionarDatos
    }

    private void gestionarUsuarios() {
        MenuUsuario menuUsuario = new MenuUsuario(gestorUsuarios);
        menuUsuario.run();
    }

    private void consultarReservas() {
        MenuConsultas menuConsultas = new MenuConsultas(gestorReservas);
        menuConsultas.run();
    }

    private void reservarPorRecurso() {
        MenuReservaRecurso menuResPorRec = new MenuReservaRecurso(gestorReservas);
        menuResPorRec.run();
    }

    private void reservarPorFecha() {
        MenuReservaFecha menuResFecha = new MenuReservaFecha(gestorReservas);
        menuResFecha.run();
    }

    private void anularReserva() {
        MenuAnularReserva menuAnularRes = new MenuAnularReserva(gestorReservas);
        menuAnularRes.run();
    }


    public static void main(String[] args) {
        new MenuPrincipal(new GestorReservas()).run();
    }

}
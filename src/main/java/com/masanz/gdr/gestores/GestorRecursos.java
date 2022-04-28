package com.masanz.gdr.gestores;

import com.masanz.gdr.config.Ctes;
import com.masanz.gdr.modelo.recursos.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GestorRecursos {

    private Map<String, Recurso> recursos;

    public GestorRecursos() {
        recursos = new HashMap<>();
        cargaInicialDatos();
    }

    private void cargaInicialDatos() {
//        recursos = Stream.of(new Object[][]{
//            {"S-R-PRI",
//            new SalaReunion("S-R-PRI", "S.Princ.",
//                    "Sala Principal",
//                    200, 150)},
//            {"S-R-ING",
//            new SalaReunion("S-R-ING", "S.Ingen.",
//                    "Sala de Ingeniería",
//                    40, 20)},
//            {"S-R-ADM",
//            new SalaReunion("S-R-ADM", "S.Admin.",
//                    "Sala de Administración",
//                    20, 12)},
//            {"S-R-MUL",
//            new SalaReunion("S-R-MUL", "S.Multi.",
//                    "Sala Multiuso",
//                    15, 8)},
//            {"S-V-UNO",
//            new SalaVideoConferencia("S-V-UNO", "Sala VC1",
//                    "Sala de vídeo conferencia 1",
//                    10)},
//            {"S-V-DOS",
//            new SalaVideoConferencia("S-V-DOS", "Sala VC2",
//                    "Sala de vídeo conferencia 2",
//                    10)},
//            {"H-L-A01",
//            new Portatil("H-L-A01", "MacBook1",
//                    "MacBook Air 13 2020, M1, 8GB, 256GB (1)", "HA2678")},
//            {"H-L-A02",
//            new Portatil("H-L-A02", "MacBook2",
//                    "MacBook Air 13 2020, M1, 8GB, 256GB (2)", "HA2679")},
//            {"H-L-C01",
//            new Portatil("H-L-C01", "Conver.1",
//                    "Convertible HP Pavilion 14, i5, 8GB, 512GB (1)", "HH2514")},
//            {"H-L-C02",
//            new Portatil("H-L-C02", "Conver.2",
//                    "Convertible HP Pavilion 14, i5, 8GB, 512GB (2)", "HH2515")},
//            {"H-L-W01",
//            new Portatil("H-L-W01", "HP nor.1",
//                    "HP Pavilion 14, i5, 8GB, 512GB (1)", "HH2422")},
//            {"H-L-W02",
//            new Portatil("H-L-W02", "HP nor.2",
//                    "HP Pavilion 14, i5, 8GB, 512GB (2)", "HH2423")},
//            {"H-R-E01",
//            new Proyector("H-R-E01", "Proyec.1",
//                    "Proyector Epson Full HD (1)", "HE1932")},
//            {"H-R-E02",
//            new Proyector("H-R-E02", "Proyec.2",
//                    "Proyector Epson Full HD (2)", "HE1933")}
//        } ).collect(Collectors.toMap(data -> (String) data[0], data -> (Recurso) data[1]));
    }

    public ArrayList<String> getIdsTipo(int tipo) {
        //TODO: getIdsTipo
        return new ArrayList<>(Arrays.asList("ID1","ID2","ID3","ID4"));
    }

    public String[] getNombresTipo(int tipo) {
        //TODO: getNombresTipo
        return new String[]{"NOMBRE1", "NOMBRE2", "NOMBRE3","NOMBRE4"};
    }

    public int getTipo(String idRecurso) {
        //TODO
        return 0;
    }

    public Recurso buscar(String id) {
        return recursos.get(id);
    }

}

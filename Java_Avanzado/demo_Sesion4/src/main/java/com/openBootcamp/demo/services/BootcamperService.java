package com.openBootcamp.demo.services;

import com.openBootcamp.demo.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class BootcamperService {
    private final List<Bootcamper> bootcampers = new ArrayList();

    public List<Bootcamper> getAll() {
        return bootcampers;
    }

    public void add (Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }
    public Bootcamper get (String nombre) {
        for (Bootcamper bootcamper : bootcampers) {
            if(bootcamper.getNombre().equalsIgnoreCase(nombre)) {
                return bootcamper;
            }
        }
        return null;
    }
}

//la funcion del servicio es tener una lista de bootcampers en memoria. luego devolverlos o añadir uno nuevo
//le digo que es Service, y creo un array list con lista de bootcampers
//implemento funcion que devuelva la lista

//aca le agrego el metodo para recorrer la lista de bootcamper para que encuentre y devuelva lo agregado

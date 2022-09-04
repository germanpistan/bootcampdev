package com.openBootcamp.demo.controllers;

import com.openBootcamp.demo.models.Bootcamper;
import com.openBootcamp.demo.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")

public class BootcampersController {
    private final BootcamperService bootcamperService;

    public BootcampersController (BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("uno",Math.random()));
        this.bootcamperService.add(new Bootcamper("dos",Math.random()));
        this.bootcamperService.add(new Bootcamper("tres",Math.random()));
        this.bootcamperService.add(new Bootcamper("cuatro",Math.random()));
        this.bootcamperService.add(new Bootcamper("cinco",Math.random()));
    }
    @GET
    @Path("/bootcampers")
    @Produces ("application/json")  //por debajo la vista la convierte en json
    public List<Bootcamper> listarTodos () {
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcamper/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre) {
        return bootcamperService.get(nombre);

    }

    @POST
    @Path("/bootcampers")
    @Produces ("application/json")  //indica en que formato produce los datos
    @Consumes("application/json")     //indica en que formato recibe los datos
    public Response meterBootcamper (Bootcamper bootcamper) {
        bootcamperService.add(bootcamper);

        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre())
        ).build();
    }

}

//creo la variable de bootcamperservice para que del controlador se comunique
//creo luego el constructor
//al constructor debe tener como parametro el servicio. tengo que poner dentro del constructor los servicios que vaya a usar

//quiero que cuando alguien se meta en mi /bootcamper, la app haga algo.
//armar peticion get y luego el metodo que me devuelva la lista pero de bootcamperservice

//tengo que agregar tambien el decorador produce, para que me de salida y no internal server error



//implemento metodos de http en controlador para que me devuelva algo la app
//creo el metodo para que devuelva eso que le pido, indico que es componente y el path de donde lo saco


//luego creo el POST, con el mismo URL de path, y con la funcion meterBootcamper
//le tengo que decir a la app que tipo de medio va a soportar en la aplicacion para q me acepte los adds, para que reciba
//y luego en que formato la voy a producir en el post.


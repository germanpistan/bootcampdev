package com.openBootcamp.demo.config;
//esto es para crear la configuracion del controlador para poder hacerle pedidos a mi app desde la web

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        this.packages("com.openBootcamp.demo.controllers");
    }
}
//configuracion basica
//hay que crear la clase jersey config, que hereda de resource config. y luego indicar en constructor donde van a estar los controladores

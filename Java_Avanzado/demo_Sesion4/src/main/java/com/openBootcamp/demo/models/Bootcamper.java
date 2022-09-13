package com.openBootcamp.demo.models;

//POJO: Plain old Java Object
//creo la clase dentro del paquete modelo para meter los datos
public class Bootcamper {
    private String nombre;
    private double valor;
    public Bootcamper() {}
    public Bootcamper(String nombre, double valor) {this.nombre = nombre; this.valor = valor;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public double getValor() {return valor;}
    public void setValor(double valor) {this.valor = valor;}
}

//tengo que crear el constructor con parametro y el vacio, con el set y el get.

//tengo que crear algo que comunique el controlador con nuestro modelo, eso es servicio

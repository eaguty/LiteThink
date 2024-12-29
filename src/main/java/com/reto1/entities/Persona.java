package com.reto1.entities;


public class Persona {
    private String nombre;
    private String numeroCelular;
    private String correoElectronico;

    public Persona(String nombre, String numeroCelular, String correoElectronico) {
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String comprarPaseEstacionamiento(){
        return "pase comprado";
    }

    public Persona(){}
}
